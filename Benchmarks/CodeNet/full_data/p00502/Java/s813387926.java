import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n, d;
	int[] t, a, b, c;
	int[][] dp;

	int dp(int k, int l) {
		if (0 <= dp[k][l]) {
			return dp[k][l];
		}
		if (k == 0) {
			return 0;
		}

		int res = 0;
		for (int i = 0; i < n; i++) {
			if (t[k - 1] < a[i] || b[i] < t[k - 1]) continue;
			res = Math.max(res, dp(k - 1, i) + Math.abs(c[l] - c[i]));
		}
		return dp[k][l] = res;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		d = sc.nextInt();
		n = sc.nextInt();
		t = new int[d];
		for (int i = 0; i < d; i++) {
			t[i] = sc.nextInt();
		}
		a = new int[n];
		b = new int[n];
		c = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		dp = new int[d][n];
		for (int i = 0; i < d; i++) {
			Arrays.fill(dp[i], -1);
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (t[d - 1] < a[i] || b[i] < t[d - 1]) continue;
			max = Math.max(max, dp(d - 1, i));
		}
		
		System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}