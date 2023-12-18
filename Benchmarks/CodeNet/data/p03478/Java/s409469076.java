// Main.java

import java.util.Scanner;

public class Main {
	public static int func(int n) {
		int f = 0;
		while(n > 0) {
			f += n%10;
			n = n/10;
		}
		return f;
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		int sum = 0;
		for(int n = 1; n <= N; n++) {
			final int f = func(n);
			if(A <= f && f <= B)
				sum += n;
		}
		System.out.println(sum);
	}
}