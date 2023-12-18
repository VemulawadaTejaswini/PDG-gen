import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0 ; i < n ; i++) x[i] = sc.nextInt();
		int[][][] dp = new int[51][51][2501];
		dp[0][0][0] = 1;
		for(int i = 0 ; i <= n ; i++) {
			for(int j = 0 ; j <= n ; j++) {
				for(int k = 0 ; k <= 2500 ; k++) {
					if(i >= 1) dp[i][j][k] = dp[i - 1][j][k];
					if(i >= 1 && j >= 1 && k - x[i - 1] >= 0) dp[i][j][k] = dp[i - 1][j][k] + dp[i - 1][j - 1][k - x[i - 1]];
				}
			}
		}
		long ans = 0;
		for(int i = 1 ; i <= n ; i++) ans += (long)dp[n][i][i * a];
		System.out.println(ans);
	}
}
