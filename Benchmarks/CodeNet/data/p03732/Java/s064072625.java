import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(),s = scanner.nextInt();
		int[] w = new int[n];
		int[] v = new int[n];
		int max = 0;
		for(int i=0;i<n;i++){
			w[i] = scanner.nextInt();
			v[i] = scanner.nextInt();
		}
		int[][] dp = new int[n+1][s+1];
		int ret = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<s;j++){
				dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j]);
				if(j + w[i] <= s){
					dp[i+1][j+w[i]] = Math.max(dp[i+1][j+w[i]],dp[i][j] + v[i]);
					ret = Math.max(ret, dp[i+1][j+w[i]]);
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		for(int i=0;i<=n;i++){
			for(int j=0;j<=s;j++){
				max = Math.max(max,dp[i][j]);
			}
		}
		System.out.println(max);
	}
}
