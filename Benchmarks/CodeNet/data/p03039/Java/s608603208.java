import java.io.*;
import java.util.*;

class Main {
	static final int MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int M = sc.nextInt();
		int K = sc.nextInt();

		long x = 0;
		Combination c = new Combination(N * M, MOD);

		for (int dx = 0; dx < M; dx++) {
			x += dx * N * N * (M - dx);
			x %= MOD;
		}

		long y = 0;
		for (int dy = 0; dy < N; dy++) {
			y += dy * M * M * (N - dy);
			y %= MOD;
		}

		System.out.println((((x + y) % MOD) * c.choose(N * M - 2, K - 2)) % MOD);
	}

	private static class Combination {
		private final int M;
		private long[] fact;
		private long[] ifact;
		private long[] inv;

		public Combination(int n, int M) {
			this.M = M;
			fact = new long[n + 1];
			ifact = new long[n + 1];
			inv = new long[n + 1];

			fact[0] = fact[1] = 1;
			ifact[0] = ifact[1] = 1;
			inv[1] = 1;

			for (int i = 2; i <= n; i++) {
				fact[i] = fact[i - 1] * i % M;
				// p = (p / a * a) + (p % a)
				// 0 ≡ (p / a * a) + (p % a)          (mod p)
				// a^(-1) ≡ - (p % a)^(-1) * (p / a)  (mod p)
				inv[i] = M - inv[M % i] * (M / i) % M;
				ifact[i] = ifact[i - 1] * inv[i] % M;
			}
		}

		public long choose(int n, int k) {
			if (n < k) return 0;
			if (n < 0 || k < 0) return 0;
			return fact[n] * (ifact[k] * ifact[n - k] % M) % M;
		}
	}
}
