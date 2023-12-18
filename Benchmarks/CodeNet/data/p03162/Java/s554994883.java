import java.util.Scanner;

public class Main {
	
	private static void solve(int n, int[][] happy) {
		
		int[][] dp = new int[n][3];
		
		// recording day 0 happiness
		for (int i=0; i<3; i++) {
			dp[0][i] = happy[0][i];
		}
		
		for (int i=0; i<n-1; i++) {
				dp[i+1][0] = happy[i+1][0] + Math.max(dp[i][1], dp[i][2]);
				dp[i+1][1] = happy[i+1][1] + Math.max(dp[i][0], dp[i][2]);
				dp[i+1][2] = happy[i+1][2] + Math.max(dp[i][0], dp[i][1]);
		}
		
		int max = Math.max(dp[n-1][0], dp[n-1][1]);
		System.out.println(Math.max(max, dp[n-1][2]));
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[][] happy = new int[n][3];
		for (int i=0; i<n; i++) {
			for (int j=0; j<3; j++) {
				happy[i][j] = scanner.nextInt();
			}
		}
			
		solve(n, happy);
		
		scanner.close();
	}

}
