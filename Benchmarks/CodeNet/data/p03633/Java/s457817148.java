import java.io.*;
import java.util.*;

class Main {

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
		long[] T = new long[N];
		for (int i = 0; i < N; i++) {
			T[i] = sc.nextLong();
		}

		long answer = 1;
		for (int i = 0; i < N; i++) {
			answer = lcm(answer, T[i]);
		}

		System.out.println(answer);
	}
}
