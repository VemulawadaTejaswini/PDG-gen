import java.util.*;

public class Main {
	static final int MOD = 998244353;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			a[i] = x;
			sum += x;
		}

		long all_pattern = 1;
		for (int i = 0; i < N; i++) {
			all_pattern *= 3;
			all_pattern %= MOD;
		}
		long[] dp = new long[] { 1 };
		for (int i = 0; i < N; i++) {
			long[] next = new long[dp.length + a[i]];
			for (int j = 0; j < dp.length; j++) {
				next[j] += 2 * dp[j];
				next[j] %= MOD;

				next[j + a[i]] += dp[j];
				next[j + a[i]] %= MOD;
			}
			dp = next;
		}
		long[] dp2 = new long[] { 1 };
		for (int i = 0; i < N; i++) {
			long[] next = new long[dp2.length + a[i]];
			for (int j = 0; j < dp2.length; j++) {
				next[j] += dp2[j];
				next[j] %= MOD;

				next[j + a[i]] += dp2[j];
				next[j + a[i]] %= MOD;
			}
			dp2 = next;
		}
		for (int i = (sum+1)/2; i < dp.length; i++) {
			all_pattern += 3 * (MOD - dp[i]);
			all_pattern %= MOD;
		}
		if (sum % 2 == 0) {
			all_pattern += 3 * dp2[sum/2];
			all_pattern %= MOD;
		}
		System.out.println(all_pattern);
	}
}
