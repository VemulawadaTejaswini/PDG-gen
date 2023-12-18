import java.util.Scanner;
2.import java.util.Random;
3.import java.util.Arrays;
4. 
5.class Main {
6.	
7.	public static void main(String[] args) {
8.		Scanner sc = new Scanner(System.in);
9.		String a = sc.next();
10.		String b = sc.next();
11.		String c = sc.next();
12.		
13.		String str = a.substring(0,1) + b.substring(0,1) + c.substring(0,1);
14.    	System.out.println(str.toUpperCase());
15.}
16.}
