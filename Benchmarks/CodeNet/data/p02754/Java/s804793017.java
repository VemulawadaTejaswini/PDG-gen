/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;



public class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int a= sc.nextInt();
int b= sc.nextInt();
if(a==0 && b==0){
    System.out.println(0);
}
else{
int sum= a+b;
sum=n%sum;
if(sum>a)
sum=a;

int x= n/(a+b);

System.out.println(x*a+sum);
}
	}
}