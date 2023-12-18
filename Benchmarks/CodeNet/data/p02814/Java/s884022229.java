import java.io.*;
import java.util.*;

class Main {


	private static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	private static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] a = new long[n];

		boolean ok = true;

		long lcm = 1;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			if (a[i] % 2 == 1) ok = false;
			a[i] /= 2;
			lcm = lcm(lcm, a[i]);
		}

		if (!ok) {
			System.out.println(0);
			return;
		}

		int b = f(a[0]);
		for (int i = 1; i < n; i++) {
			if (f(a[i]) != b) ok = false;
		}

		if (!ok) {
			System.out.println(0);
			return;
		}

		for (int i = 0; i <= b; i++) {
			m /= 2;
		}

		System.out.println((m + (lcm - 1)) / lcm);
	}

	private static int f(long a) {
		int count = 0;
		while (a % 2 == 0) {
			a /= 2;
			count++;
		}

		return count;
	}
}
