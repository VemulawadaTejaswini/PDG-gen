import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long[][] dp=new long[n+1][n+1];
		int[][] s=new int[n+1][n+1];
		long[] a=new long[n+1];
		for (int i=1;i<=n;++i)
			for (int j=i;j<=n;++j)
				dp[i][j]=Long.MAX_VALUE;
		for (int i=1;i<=n;++i) {
			a[i]=in.nextLong()+a[i-1];
			dp[i][i]=0;
			s[i][i]=i;
		}
		for (int l=1;l<n;++l)
			for (int i=1;i+l<=n;++i) {
				int j=i+l;
				for (int k=Math.max(i,s[i][j-1]);k<=Math.min(j-1,s[i+1][j]);++k)
					if (dp[i][j]>dp[i][k]+dp[k+1][j]+a[j]-a[i-1]) {
						s[i][j]=k;
						dp[i][j]=dp[i][k]+dp[k+1][j]+a[j]-a[i-1];
					}
				}
		System.out.println(dp[1][n]);
	}
}