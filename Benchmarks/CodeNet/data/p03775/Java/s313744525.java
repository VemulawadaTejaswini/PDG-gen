import java.io.*;
import java.util.*;

class Main {


	private static long f(long a) {
		int count = 0;
		while (a > 0) {
			count++;
			a /= 10;
		}

		return count;
	}

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		long a = f(N);
		for (int i = 1; i * i <= N; i++) {
			if (N % i != 0) continue;
			long x = Math.max(f(i), f(N / i));
			a = Math.min(a, x);
		}

		System.out.println(a);
	}
}
