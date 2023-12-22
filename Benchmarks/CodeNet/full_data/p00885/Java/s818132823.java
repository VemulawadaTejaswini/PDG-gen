import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			n++;
			int p[] = new int[n];
			int t[] = new int[n];

			for (int i = 1; i < n; i++) {
				p[i] = sc.nextInt();
				t[i] = sc.nextInt();
			}

			int[][] dp = new int[n][4];

			for (int i = 0; i < n; i++) {
				Arrays.fill(dp[i], Integer.MAX_VALUE >> 2);
			}

			dp[0][0] = 0;

			int cand = 0;
			int i = 1;
			for (i = 1; i < n; i++) {
				// dp[i][1]
				cand = Integer.MAX_VALUE>> 2;
				for (int j = 1; j < 4; j++) {

					int b = p[i - 1] * (j + 1);
					b += p[i];

					if (b <= t[i] - t[i - 1]) {
						cand = Math.min(cand, dp[i - 1][j] + p[i - 1] + p[i]);
					}
				}
				dp[i][1] = cand;

				for (int j = 0; j < 3; j++) {

					int b = Math.abs(p[i - 1] - p[i]) * (j + 1);

					if (b <= t[i] - t[i - 1]) {
						dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i - 1][j]
								+ Math.abs(p[i - 1] - p[i]));
						cand = Math.min(dp[i][j + 1], cand);
					}
				}
				if (cand == Integer.MAX_VALUE >> 2) {
					break;
				}

			}
			if (cand != Integer.MAX_VALUE >> 2) {
				System.out.println("OK " + (cand + p[n-1]));
			} else {
				System.out.println("NG " + i);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}