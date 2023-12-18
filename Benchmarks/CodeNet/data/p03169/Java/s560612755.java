import java.util.Scanner;

public class Main {
	static int n;
	static int[] c;
	static double[][][] dp;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = new int[4];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			c[a]++;
		}
		sc.close();

		dp = new double[n + 1][n + 1][n + 1];
		dp[1][0][0] = n;
		System.out.println(dfs(c[1], c[2], c[3]));
	}

	static double dfs(int i, int j, int k) {
		if (dp[i][j][k] > 0) {
			return dp[i][j][k];
		}
		int s = i + j + k;
		double ret = 0;
		if (i > 0) {
			double val = dfs(i - 1, j, k) + (double) n / s;
			val = val * i / s;
			ret += val;
		}
		if (j > 0) {
			double val = dfs(i + 1, j - 1, k) + (double) n / s;
			val = val * j / s;
			ret += val;
		}
		if (k > 0) {
			double val = dfs(i, j + 1, k - 1) + (double) n / s;
			val = val * k / s;
			ret += val;
		}
		return dp[i][j][k] = ret;
	}
}
