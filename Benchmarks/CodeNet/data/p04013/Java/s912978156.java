import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a = scan.nextInt();
		int ma = 0;
		int[] x = new int[n+1];
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
			ma = Math.max(a, x[i]);
			x[i] = x[i] - a;
		}
		long[][] dp = new long[n+1][2*n*ma+1];
		dp[0][n*ma] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*n*ma; j++) {
				dp[i+1][j] += dp[i][j];
				if (0 <= (j-x[i]) && (j-x[i]) <= 2*n*a) dp[i+1][j] = dp[i][j] + dp[i][j-x[i]];
			}
		}
		System.out.println(dp[n][n*ma]-1);
	}
}
