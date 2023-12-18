import java.util.*;

public class Main {
	static double[] arr;
	static double[][] dp;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new double[n + 1];
		dp = new double[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextDouble();
		}
		dp[0][0] = 1;
		double ans = 0;
		for (int i = n / 2 + 1; i <= n; i++) {
			ans += dfs(i, n - i);
		}
		System.out.println(ans);
 	}
	
	static double dfs(int x, int y) {
		if (x < 0 || y < 0) {
			return 0;
		}
		if (dp[x][y] != 0) {
			return dp[x][y];
		}
		int n = x + y;
		dp[x][y] = dfs(x - 1, y) * arr[n] + dfs(x, y - 1) * (1 - arr[n]);
		return dp[x][y];
	}
}
