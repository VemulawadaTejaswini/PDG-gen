import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	int n;
	int[] top;
	int[] bottom;
	int[][] dp;
	
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			top = new int[n];
			bottom = new int[n];
			for (int i = 0; i < n; i++) {
				top[i] = sc.nextInt();
				bottom[i] = sc.nextInt();
			}
			dp = new int[n+1][n+1];
			int res = dp(0, n);
			System.out.println(res);
		}
	}

	// min cost of [a, b)
	int dp(int a, int b) {
		if (b - a <= 1) return 0;
		if (dp[a][b] != 0) return dp[a][b];
		int res = Integer.MAX_VALUE;
		for (int i = a+1; i < b; i++) {
			int here = dp(a, i) + dp(i, b);
			here += top[a] * bottom[i-1] * top[i] * bottom[b-1];
			res = Math.min(res, here);
		}
		return dp[a][b] = res;
	}
}