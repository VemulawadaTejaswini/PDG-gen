import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			int m = 1000;
			long[][] dp = new long[n + 1][m + 1];
			dp[0][0] = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= m; j++) {
					long val = 0;
					val += dp[i][j];
					if (j - a[i] >= 0) val += dp[i+1][j-a[i]];
					if (j - (1 + b[i]) * a[i] >= 0) val -= dp[i][j - (1 + b[i]) * a[i]];
					dp[i+1][j] = val;
				}
			}
			int g = sc.nextInt();
			for (int iii = 0; iii < g; iii++) {
				int mi = sc.nextInt();
				System.out.println(dp[n][mi]);
			}
		}
	}
}