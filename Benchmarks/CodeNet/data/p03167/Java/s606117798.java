import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		boolean[][] a = new boolean[n][m];
		long[][] dp = new long[n][m];
		for(int i=0;i<n;i++) {
			char[] x = in.next().toCharArray();
			for(int j=0;j<m;j++) {
				if(x[j]=='.') {
					a[i][j]=true;
				}else {
					a[i][j]=false;
				}
			}
		}
		dp[0][0] = 1;
		for(int i=1;i<n;i++) {
			if(a[i][0])dp[i][0] = dp[i-1][0]; 
		}
		for(int i=1;i<m;i++) {
			if(a[0][i])dp[0][i] = dp[0][i-1];
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				if(a[i][j]) {
					dp[i][j] = (dp[i-1][j]+dp[i][j-1])%1000000007;
				}
			}
		}
		System.out.println(dp[n-1][m-1]);
	}
}
