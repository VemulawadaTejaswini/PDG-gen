import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N;
		N = sc.nextLong();
		long K;
		K = sc.nextLong();
		solve(N, K);
	}

	static void solve(long N, long K) {
		long n = N / K;
		if (K % 2 == 1) {
			System.out.println(n * n * n);
		} else {
			long a = n * n * n;
			long b = (N - K / 2) / K + 1;
			a += b * b * b;
			System.out.println(a);
		}
	}
}
