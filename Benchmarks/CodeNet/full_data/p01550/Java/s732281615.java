import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	static long MOD = 1000_000_000 + 7;

	void run() {
		solver();
	}

	long calc(int[] len) {
		long[][][] dp = new long[4][800][200];

		for (int idx = 0; idx < 4; idx++) {
			if (len[idx] > 0)
				len[idx]--;
			else
				continue;
			dp[idx][0][0] = 1;
			for (int length = 1; length <= 4; length++) {
				for (int k = 0; k < len[length - 1]; k++) {
					for (int i = 799; i >= length; i--) {
						for (int j = 199; j >= 1; j--) {
							if (dp[idx][i - length][j - 1] > 0) {
								dp[idx][i][j] += dp[idx][i - length][j - 1] * j;
								dp[idx][i][j] %= MOD;
							}
						}
					}
				}
			}
			len[idx]++;
		}
		long ans = 0;

		// dp[i][j][k] ??????i+1?????????????????????????????????k????????????????????£?????¨???????????????j?????????????????????????????°
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 800; j++) {
				for (int k = 0; k < 200 && n - 1 - k >= 0; k++) {
					if (dp[i][j][k] > 0) {
						tr(i, j, k, dp[i][j][k], (n - 1 - k), perm[n - 1 - k]);
						// System.out.println(dp[i][j][k] * sum[i] * pow10[j]);
						// ans += dp[i][j][k] * sum[i] * pow10[j];
						ans = (ans + dp[i][j][k] * pow10[j] * sum[i] * perm[(n - 1) - k]) % MOD;
					}
				}
			}
		}
		return ans;
	}

	int n;

	void solver() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];
		int[] len = new int[4];
		sum = new long[4];
		int zero_idx = -1;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 0)
				zero_idx = i;
			len[(a[i] + "").length() - 1]++;
			sum[(a[i] + "").length() - 1] += a[i];
		}

		pow10[0] = 1;
		for (int i = 1; i < pow10.length; i++) {
			pow10[i] = (pow10[i - 1] * 10) % MOD;
		}
		for (int i = 0; i < 200; i++) {
			long factorial = 1;
			perm[i] = 1;
			for (int j = i; j >= 1; j--) {
				factorial = (factorial * j) % MOD;
				perm[i] = (perm[i] + factorial) % MOD;
			}
		}

		// leading 0 ????????????
		long ans = calc(len);
		if (zero_idx != -1) {
			len[0]--;
			ans = (ans - calc(len) + MOD) % MOD;
		}
		System.out.println(ans);
	}

	long[] pow10 = new long[810];
	long[] sum;
	long[] perm = new long[200];

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}