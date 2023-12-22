package com.example.mynavi.math;
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int h = in.nextInt();
		int m = in.nextInt();
		double h_ang = (h*30) + (m*0.5);
		double m_ang = m*6;
		double tmp = 0;
		if(h>m){
			tmp = h_ang - m_ang;
		}else{
			tmp = m_ang - h_ang;
		}
		if(tmp>180){
			tmp-=360;
		}
		double cos = Math.cos(Math.toRadians(tmp));
		double result = (a*a) + (b*b) - (2*a*b*cos);
		System.out.println(Math.sqrt(result));
	}
}