import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner input  = new Scanner(System.in);
		int n = input.nextInt();
		int W = input.nextInt();
		long arr[][] = new long[n][3];
		for(int i=0;i<n;i++) {
			long w = input.nextInt();
			long v = input.nextInt();
			arr[i] = new long[]{w,v};
		}
		System.out.println(knap_sack(arr,n-1,W));
	}
	
	static long knap_sack(long arr[][],int n,long W) {
		if(n==-1 || W==0) {
			return 0;
		}
		
		long w = arr[n][0];
		long v = arr[n][1];
		if(W<w) {
			return knap_sack(arr,n-1,W);
		}
		long r_max = v+knap_sack(arr,n-1,W-w);
		long l_max = knap_sack(arr,n-1,W);
		return Math.max(r_max, l_max);
	}
	static long dp(long arr[][],int n,int W) {
		long dp[][] = new long[n][W];
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=W-1;j++) {
				if(i==0 || j==0) {
					dp[i][j] = 0;
				}
				else if(j>=arr[i-1][0]) {
					dp[i][j] = Math.max(dp[i-1][(int)(j-arr[i-1][0])]+arr[i-1][1], dp[i-1][j]);
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		return dp[n][W];
	}
}
