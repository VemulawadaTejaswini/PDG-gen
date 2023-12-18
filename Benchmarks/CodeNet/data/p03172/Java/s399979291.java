
import java.util.Scanner;
import java.util.Vector;

public class Main {
	static long dp[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		dp = new long [n][k+1];
		for (int i=0;i<n;i++) {
			int a=sc.nextInt();
			for (int j=0;j<=k;j++) {
				dp[i][j] = 0;
				if (i==0) {
					if (a>=j) dp[i][j] = 1;
				} else {
					if (j==0) dp[i][j] = 1;
					else {
						dp[i][j] = (dp[i][j-1] + dp[i-1][j])%1000000007;
						if (j>=a+1) dp[i][j] = (dp[i][j] - dp[i-1][j-a-1])%1000000007;
					}
				}
			}
		}
		System.out.println(dp[n-1][k]);
	}
}
