import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int maxW = scan.nextInt();
		int[] v = new int[n];
		int[] w = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = scan.nextInt();
			w[i] = scan.nextInt();
		}
		scan.close();
		
		int[][] dp = new int[n+1][maxW+1];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < maxW+1; j++)
				if(j >= w[i]) {
					dp[i+1][j] = Math.max(dp[i][j], dp[i+1][j-w[i]] + v[i]);
				}else {
					dp[i+1][j] = dp[i][j];
				}

		
		System.out.println(dp[n][maxW]);
	}
}
