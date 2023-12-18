package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int ans = 0;
		int min = x < y ? x : y;
		int minac = a < c*2 ? a : c*2;
		int minbc = b < c*2 ? b : c*2;
		
		if(a+b <= c*2) {
			ans = a*x + b*y;
		}else {
			ans = c*2*min + x*(x-min) + y*(y-min); 
		}
		System.out.println(ans);
	}
}