/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;


public class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
int b = sc.nextInt();
int c= (int)(a/.08);
if(((int)(c/10))==b)
System.out.println(c);
else{
c= (int)(b/.1);
if(((int)(c/8))==a)
System.out.println(c);
else
System.out.println(-1);

    
}
	}
}