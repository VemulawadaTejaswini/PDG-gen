import java.util.*;
 
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][] match=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				match[i][j]=s.nextInt();
			}
		}
		long[][] dp=new long[n][(1<<n)];
		for(int i=0;i<n;i++)
			Arrays.fill(dp[i], -1);;
		System.out.println((int)ways(0,n,match,0,dp));

	}
	public static long ways(int idx,int n, int[][] match,int paired,long[][] dp) {
		if(idx==n)
			return 1;
		if(dp[idx][paired]!=-1)
			return dp[idx][paired];
		long max=0;
		for(int i=0;i<n;i++) {
			if(match[idx][i]==1 && (paired & (1<<i)) !=(1<<i)) {
				max+=ways(idx+1,n,match,paired |(1<<i),dp);
			}
		}
		max=max%1000000007;
		return dp[idx][paired]=max;
	}

}
