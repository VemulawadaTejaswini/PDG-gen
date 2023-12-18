// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.

import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args){
		new Main().run();
	}
	
	long sz(long a){
		int r=0;
		while(a>0){a/=2;r++;}
		return r;
	}
	//100
	//10,10
	//1,1,1,1
	//2^0+2^1+2^2=2^3-1
	void run(){
		Scanner sc=new Scanner(System.in);
		long H=sc.nextLong();
		System.out.println((1L<<sz(H))-1);
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
