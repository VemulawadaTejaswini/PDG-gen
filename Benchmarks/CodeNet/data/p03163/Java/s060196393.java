import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] w = new int[n+1];
		int[] v = new int[n+1];
		for(int i=1;i<=n;i++) {
			w[i] = in.nextInt();
			v[i] = in.nextInt();
		}
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=w[j]) {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-w[j]][j-1]+v[j]);
				}else {
					dp[i][j] = dp[i][j-1];
				}
				//System.out.print(dp[i][j]+" ");
			}
			//System.out.println();
		}
		System.out.println(dp[m][n]);
	}
}