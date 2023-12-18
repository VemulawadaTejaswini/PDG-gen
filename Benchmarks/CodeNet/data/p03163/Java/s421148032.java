import java.util.Scanner;

public class DKnapscak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] weights = new int[n];
		int[] values = new int[n];
		int[][] dp = new int[n+1][w+1];
		
		for (int i = 0; i < n; i++) {
			weights[i] = sc.nextInt();
			values[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= w; j++) {
				if (j >= weights[i-1]) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - weights[i-1]] + values[i-1]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[n][w]);
		
		sc.close();
	}

}
