package com.li.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * ClassName:demoController
 * Description:
 *
 * @author li_youxiu
 * @emial 694001789@qq.com
 * @date 2023/7/11 18:42
 */
@RestController
@RequestMapping("/demo/")
public class demoController {

    @GetMapping("sayHello")
    public String sayHello(){
        return "this is demo sayHello,now time: "+ LocalDateTime.now();
    }
}
