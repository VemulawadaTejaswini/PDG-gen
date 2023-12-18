import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final long MOD = 1_000_000_007;

	public static void main(String[] args) {
		int N = sc.nextInt();
		long[] fact = new long[N + 1];
		long[] inv = new long[N + 2];
		fact[0] = 1;
		for (int i = 0; i < N; i++) {
			fact[i + 1] = fact[i] * (i + 1) % MOD;
			inv[i + 1] = inv(i + 1);
		}
		long all = 0;
		for (int i = 2; i <= N; i++) {
			all += fact[N] * inv[i] % MOD;
		}
		all %= MOD;
		long[] A = new long[N];
		long ans = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			ans += A[i] * fact[N];
			ans += A[i] * all;
			ans %= MOD;
			all += MOD - fact[N] * inv[N - i] % MOD;
			all += fact[N] * inv[i + 2];
			all %= MOD;
		}
		System.out.println(ans);
	}

	static long inv(long v) {
		return pow(v, (int) MOD - 2);
	}

	static long pow(long v, int p) {
		if (p == 0) return 1;
		if (p == 1) return v;
		long ret = pow(v, p / 2);
		ret *= ret;
		ret %= MOD;
		if (p % 2 == 1) {
			ret *= v;
			ret %= MOD;
		}
		return ret;
	}

}
