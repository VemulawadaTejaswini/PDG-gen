//package ac144;
import java.lang.*;
import java.math.*;
import java.util.Scanner;
import java.io.*;
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = scn.nextInt();
		int b = scn.nextInt();
		if(a>=1&&a<=9&&b>=1&&b<=9) {
			int ans = a*b;
			System.out.println(ans);
		}else {
			System.out.println(-1);
		}
	}

}
