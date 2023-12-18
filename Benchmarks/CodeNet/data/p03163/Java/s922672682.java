import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int W = scan.nextInt();

		long v[] = new long[n + 1];
		int w[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			w[i] = scan.nextInt();
			v[i] = scan.nextInt();
		}

		long dp[][] = new long[n + 1][W + 1];
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=W;j++) {
				if(i==0 || j ==0) {
					dp[i][j] = 0;
				} else if(w[i] > j) {
					dp[i][j] = dp[i-1][j];
				} else if((v[i] + dp[i-1][j-w[i]]) > dp[i-1][j]) {
					dp[i][j] =v[i] + dp[i-1][j-w[i]];
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		//System.out.println(Arrays.deepToString(dp));
		System.out.println(dp[n][W]);

	}

	public static long find(int cw, int ci, long[] v, int[] w, long dp[][]) {
		if (cw == 0) {
			return 0;
		}

		if (ci >= v.length) {
			return 0;
		}
		if (cw < w[ci]) {
			return 0;
		}

		if (dp[ci][cw] != 0) {
			return dp[ci][cw];
		}
		long with = v[ci] + find(cw - w[ci], ci + 1, v, w, dp);
		long without = find(cw, ci + 1, v, w, dp);

		dp[ci][cw] = Math.max(with, without);
		return dp[ci][cw];

	}
}
