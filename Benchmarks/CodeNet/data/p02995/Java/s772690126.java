

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		scan.close();
		
		int numC = b/c - (a - 1)/c;
		int numD = b/d - (a - 1)/d;
		int lcmCD = lcm(c, d);
		int numCD = b/lcmCD - (a - 1)/lcmCD;
		
		System.out.println(numC + " " + numD + " " + numCD);
		System.out.println(b - a + 1 - numC - numD + numCD);
		
	}
	
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	
	public static int gcd(int a, int b) {
		if(a < b) {
			return gcd(b, a);
		}
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}

}
