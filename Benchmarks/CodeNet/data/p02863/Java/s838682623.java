// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] aa = new int[n];
		int[] bb = new int[n];
		for (int i = 0; i < n; i++) {
			aa[i] = sc.nextInt();
			bb[i] = sc.nextInt();
		}
		int[][] dp = new int[n][t];
		int[][] dq = new int[n][t];
		for (int i = 0; i < n - 1; i++) {
			int a = aa[i];
			int b = bb[i];
			for (int x = t - 1; x >= 0; x--) {
				dp[i + 1][x] = dp[i][x];
				if (x + a < t)
					dp[i + 1][x + a] = Math.max(dp[i + 1][x + a], dp[i][x] + b);
			}
		}
		for (int i = 0; i < n - 1; i++) {
			int a = aa[n - 1 - i];
			int b = bb[n - 1 - i];
			for (int x = t - 1; x >= 0; x--) {
				dq[i + 1][x] = dq[i][x];
				if (x + a < t)
					dq[i + 1][x + a] = Math.max(dq[i + 1][x + a], dq[i][x] + b);
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int p = i, q = n - 1 - i;
			for (int x = t - 1, y = 0, z = 0; x >= 0; x--, y++)
				ans = Math.max(ans, dp[p][x] + bb[i] + (z = Math.max(z, dq[q][y])));
		}
		println(ans);
	}
}
