

import java.util.Scanner;

public class Main {

	static final long limiter = 1000000009;

	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int a[] = new int[n + 1];
		int dp[][] = new int[k + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i <= k; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0) {
					dp[i][j] = 1;
				} else if (j == 0) {
					dp[i][j] = 0;
				} else {
					for (int x = a[j]; x >= 0; x--) {
						if (i - x >= 0) {
							dp[i][j] += (dp[i - x][j - 1] % limiter);
						}
					}
				}
			}
		}

		System.out.println(dp[k][n]);

	}

}
