

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();

		while(true) {
			if(c==0) { break; }
			if(a>0) { a = eatCookie(a); }
			else if(b>0) { b = eatCookie(b);}
			c--;
		}
		System.out.println("a:"+a+" b:"+b);
	}
	private static long eatCookie(long d) {
		return d-1;
	}
}
