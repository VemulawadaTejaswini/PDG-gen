import java.io.*;
import java.util.*;

class Main {
	static final int M = 1000000007;

	private static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	private static long lcm(long a, long b) {
		return a / gcd(a, b) * b;
	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}

		long lcm = 1;
		for (int i = 0; i < N; i++) {
			lcm = lcm(lcm, A[i]);
		}

		long answer = 0;
		for (int i = 0; i < N; i++) {
			answer = (answer + lcm / A[i]) % M;
		}

		System.out.println(answer);
	}
}
