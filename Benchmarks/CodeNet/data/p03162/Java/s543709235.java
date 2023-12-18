import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[][] data = new int[N][3];
		int[][] dp = new int[N][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = input.nextInt();
			}
		}
		dp[0][0] = data[0][0]; dp[0][1] = data[0][1]; dp[0][2] = data[0][2];
		//System.out.println(dp[0][0]+" "+dp[0][1]+" "+dp[0][2]);
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				//dp[i][j] = dp[i-1][j];
				if (j==0) {
					int max = Math.max(dp[i-1][1], dp[i-1][2])+data[i][j];
					/*if (max==data[i][1]) dp[i][1]=Math.max(max,dp[i][1]);
					else dp[i][2]=Math.max(max,dp[i][2]);*/
					dp[i][j]=Math.max(max, dp[i][j]);
				}
				if (j==1) {
					int max = Math.max(dp[i-1][0], dp[i-1][2])+data[i][j];
					/*if (max==data[i][0]) dp[i][0]=Math.max(max,dp[i][0]);
					else dp[i][2]=Math.max(max,dp[i][2]);*/
					dp[i][j]=Math.max(max, dp[i][j]);
				}
				if (j==2) {
					int max = Math.max(dp[i-1][1], dp[i-1][0])+data[i][j];
					/*if (max==data[i][1]) dp[i][1]=Math.max(max,dp[i][1]);
					else dp[i][0]=Math.max(max,dp[i][0]);*/
					dp[i][j]=Math.max(max, dp[i][j]);
				} 
			}
			//System.out.println(dp[i][0]+" "+dp[i][1]+" "+dp[i][2]);
		}
		long answer = Math.max(Math.max(dp[N-1][0], dp[N-1][1]), dp[N-1][2]);
		System.out.println(answer);
	}
}