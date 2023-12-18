import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		long answer = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				long b = f(N, i, j);
				long a = f(N, j, i);
				answer += a * b;
			}
		}

		System.out.println(answer);
	}

	private static long f(long N, long first, long last) {
		long a = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 10 != last) continue;
			if (i < 10) {
				if (i != first) continue;
			} else if (i < 100) {
				if (i / 10 != first) continue;
			} else if (i < 1000) {
				if (i / 100 != first) continue;
			} else if (i < 10000) {
				if (i / 1000 != first) continue;
			} else if (i < 100000) {
				if (i / 10000 != first) continue;
			} else if (i < 1000000) {
				if (i / 100000 != first) continue;
			}
			a++;
		}
		return a;
	}

}
