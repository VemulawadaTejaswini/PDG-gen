import java.util.Scanner;

public class Main {

	static final int MAX = 10000000;
	static final int MOD = 1000000007;
	static final long[] fac = new long[MAX];
	static final long[] finv = new long[MAX];
	static final long[] inv = new long[MAX];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		COMinit();

		long score = 0;

		for (int i = 0; i < N; i++) {
			if (i != A && i != B) {
				score += COM(N, i);
			}
		}

		System.out.println(score);

		sc.close();
	}

	public static void COMinit() {
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;

		for (int i = 2; i < MAX; i++) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public static long COM(int n, int k) {
		if (n < k)
			return 0;
		if (n < 0 || k < 0)
			return 0;
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

}
