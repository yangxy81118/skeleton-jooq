package com.yxy.startup.skelatonJooq.controller;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private DSLContext dsl;
	
	//TODO 需要一个公用的Response
	@GetMapping("/find/{id}")
	public UserDO find(@PathVariable("id") Long id){
		
		
//		dsl.select()
//		.from(table)
		
		return null;
	}
	
	
	
}
