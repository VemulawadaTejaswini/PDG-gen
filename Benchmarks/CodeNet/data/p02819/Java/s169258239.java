

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a+1;
		boolean boo = false;
		while(true) {
			boo = isPrime(b);
			if(boo) {
				break;
			}
			b++;
		}
		System.out.println(b);
	}

	private static boolean isPrime(int b) {
		if(b%2 == 0) { return false; }
		for(int c=3;c<b;c+=2) {
			if(b%c==0) {
				return false;
			}
		}
		return true;
	}
}
