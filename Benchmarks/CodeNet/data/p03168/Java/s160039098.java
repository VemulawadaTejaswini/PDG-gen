import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double[] arr = new double[n + 1];
		for (int i = 1; i <= n; i++)
			arr[i] = s.nextDouble();
		double res = 0.0;
		double[][] dp=new double[n+1][n+1];
		boolean[][] vis=new boolean[n+1][n+1];
		for (int head = 0; head <= n; head++) {
			int tail = n - head;
			if (head > tail)
				res += solve(arr, n, head,dp,vis);
		}
		System.out.println(res);
	}

	public static double solve(double[] arr, int n, int k,double[][] dp, boolean[][] vis) {
		if (k < 0)
			return 0.0;
		if (n == 0)
			return (k == 0) ? 1.0 : 0.0;
		if(vis[n][k])
			return dp[n][k];
		else {
			vis[n][k]=true;
			dp[n][k]=arr[n] * solve(arr, n - 1, k - 1,dp,vis) + (1.0 - arr[n]) * solve(arr, n - 1, k,dp,vis);
		return dp[n][k];
		}
	}

}