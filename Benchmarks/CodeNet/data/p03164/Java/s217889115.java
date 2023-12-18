import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), W = sc.nextInt();
		long[] w = new long[n], v = new long[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}
		long[][] dp = new long[n][W + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < W + 1; j++) {
				if (i > 0) {
					if (j >= w[i]) {
						dp[i][j] = Math.max(dp[i-1][j], v[i] + dp[i-1][j-(int)w[i]]);
					} else {
						dp[i][j] = dp[i-1][j];
					}
				} else {
					if (j >= w[i]) dp[i][j] = v[i];
					else dp[i][j] = 0;
				}
			}
		}
		System.out.println(dp[n-1][W]);
	}
}
