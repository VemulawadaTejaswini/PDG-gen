
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] sum = new int[n + 1];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum[a[i]]++;
		}
		Combination com = new Combination();
		long ans = 0;
		for(int i = 1; i < n + 1; i++) {
			if(sum[i] >= 2) {
				ans += com.Com(sum[i], 2);
			}
		}
		for(int i = 0; i < n; i++) {
			long tmp = ans;
			if(sum[a[i]] >= 2) {
				tmp -= com.Com(sum[a[i]], 2);
			}
			if(sum[a[i]] - 1 >= 2) {
				tmp += com.Com(sum[a[i]] - 1, 2);
			}
			System.out.println(tmp);
		}
	}

}

class Combination {
	public static int MAX = 510000;
	public static int MOD = 1000000007;

	public static long[] f = new long[MAX];
	public static long[] finv = new long[MAX];
	public static long[] inv = new long[MAX];

	public Combination() {
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

	public static long Inverse(int n) {
		return inv[n];
	}
}
