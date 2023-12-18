import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] sum = new long[N+1];
		sum[0] = 0;
		Map<Long, Integer> count = new HashMap<>();
		count.put(0L, 1);
		for(int i=1; i<=N; i++) {
			sum[i] = sum[i-1] + sc.nextLong();

			if(count.containsKey(sum[i]))
				count.put(sum[i], count.get(sum[i])+1);
			else
				count.put(sum[i], 1);
		}

		long ans = 0;
		ComInit();
		for(int value : count.values()) {
			ans += Com(value, 2);
		}

		System.out.println(ans);
	}

	//modを指定するパターン
	public static final int MOD = 1000000007;
	public static final int MAX = 510000;

	public static long[] fac;
	public static long[] finv;
	public static long[] inv;

	//MODのnCr計算の前処理(nCrを計算するとき必ず前に入れる)
	public static void ComInit() {
		fac = new long[MAX];
		finv = new long[MAX];
		inv = new long[MAX];

		fac[0] = 1;
		fac[1] = 1;
		finv[0] = 1;
		finv[1] = 1;
		inv[1] = 1;

		for(int i=2; i<MAX; i++) {
			fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	//MODのnCr計算(r,n <= 10^7)
	public static long Com(int n, int r) {
		if(n < r)
			return 0;

		if(n < 0 || r < 0)
			return 0;

		return fac[n] * (finv[r] * finv[n - r] % MOD) % MOD;
	}
}
