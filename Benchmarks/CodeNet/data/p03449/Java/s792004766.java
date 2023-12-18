

import java.util.Scanner;

public class Main{
	static int a[][] = new int[100][100];
	static int dp[][] = new int[100][100];
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (sc.hasNext()) {
			for (int i = 1; i <= 2; i++) {
				for (int j = 1; j <= n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			solve();
			
					System.out.print(dp[2][n]);
			
		}

	}

	private static void solve() {
		dp[1][1]=a[1][1];
		for(int i=1;i<=2;i++){
			for(int j=1;j<=n;j++){
				if( i==1)
					dp[i][j]=dp[i][j-1]+a[i][j];//说明第一步往下走
				else
				    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]+a[i][j]);		
				
			}
		}
		
		
	}
}
