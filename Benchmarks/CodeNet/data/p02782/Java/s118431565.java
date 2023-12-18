
import java.util.Scanner;

public class Main {

	public static int MAX = 2000001;
	public static int MOD = 1000000007;

	public static long[] f = new long[MAX];
	public static long[] finv = new long[MAX];
	public static long[] inv = new long[MAX];

	public static void ComInit() {
		f[0] = f[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			f[i] = f[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public static long Com(int n, int k) {
		if(n < k)
			return 0;
		if(n < 0 || k < 0)
			return 0;
		return f[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		ComInit();
		long ans = 0;
		for(int i = r1; i < r2 + 1; i++) {
			for(int j = c1; j < c2 + 1; j++) {
				ans += Com(i + j, Math.min(i, j));
				ans %= MOD;
			}
		}

		System.out.println(ans);
	}

}
