//package com.company;
import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {

    public static void main(String[] args) {
	// write your code here

      //  System.out.println("Hello World");
        // System.out.println("This is my first package ");
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        long b=s.nextLong();
        long c=s.nextLong();
        long d=s.nextLong();

        long res=0,max=0;
      /*  res=Integer.MIN_VALUE;
        max=Integer.MIN_VALUE;
        for(long i=a;i<=b;i++)
        {
            for(long j=c;j<=d;j++)
            {
                max=i*j;
                res=Math.max(max,res);
            }
        }*/
      long p=a*c;
      long q=b*d;
      res=Math.max(p,q);
        System.out.println(res);



    }
}
