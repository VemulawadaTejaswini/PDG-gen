package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int d,r;
		double f;
		d = a / b;
		r = a % b;
		f = (double)a / (double)b;
		String g = String.format("%.8f", f);
		System.out.println(d+" "+r+" "+g);
		
	}

}