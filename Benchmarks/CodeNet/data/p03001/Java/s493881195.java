package at_coder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		float area = H*W/2;
		System.out.print(area+" ");
		
		if (x==W/2 && y==H/2)
			System.out.println(1);
		else
			System.out.println(0);
	}

}