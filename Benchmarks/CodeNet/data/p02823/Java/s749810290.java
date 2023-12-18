

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = b-a;
		long d = b-a-1;

		if((a%2==0 && b%2==2) || (a%2!=0 && b%2!=0)) {
//		if(c%2==0) {
			System.out.print(c/2);
		} else {
			System.out.println(Math.min(a-1,n-b)+1+(d/2));
		}

	}
}
