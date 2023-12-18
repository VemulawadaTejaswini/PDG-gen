import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		sc.close();

		MAX = Math.max(N - K + 1, K - 1);
		COMinit();

		for(int i = 1;i <= K;i++) {
			long output = COM(N - K + 1, i) * COM(K - 1, i - 1) % MOD;
			System.out.println(output);
		}


	}

	private static int MAX;
	private static int MOD = 1000000007;

	private static long[] fac;
	private static long[] finv;
	private static long[] inv;

	static void COMinit() {
		fac = new long[MAX + 1];
		finv = new long[MAX + 1];
		inv = new long[MAX + 1];

		fac[0] = 1;
		fac[1] = 1;
		finv[0] = 1;
		finv[1] = 1;
		inv[1] = 1;

		for(int i = 2;i <= MAX;i++) {
			fac[i] = fac[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	static long COM(int n, int k) {
		if(n < k) return 0;
		if(n < 0 || k < 0) return 0;
		return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

}