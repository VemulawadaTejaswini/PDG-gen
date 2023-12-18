// This file is a "Hello, world!" in Java language by OpenJDK for wandbox.
import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args)
    {
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		String T=sc.next();
		String ans=T+S;
		System.out.println(ans);
	}
	
	void tr(Object...objects){
		System.out.println(Arrays.deepToString(objects));
	}
}

// OpenJDK reference:
//   http://openjdk.java.net/

// Java language references:
//   http://docs.oracle.com/javase
