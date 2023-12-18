import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int mod=1000000007;
		String s=in.next();
		int[][] dp=new int[n][n];
		int[] sum=new int[n];
		dp[0][0]=1;
		for (int i=1;i<n;++i) if (s.charAt(i-1)=='<') {
			for (int j=0;j<=i;++j) {
				sum[j]=dp[i-1][j];
				if (j>0) sum[j]+=sum[j-1];
				if (sum[j]>=mod) sum[j]-=mod;
			}
			for (int j=1;j<=i;++j) dp[i][j]=sum[j-1];
		} else {
			for (int j=i;j>=0;--j) {
				sum[j]=dp[i-1][j];
				if (j+1<n) sum[j]+=sum[j+1];
				if (sum[j]>=mod) sum[j]-=mod;
			}
			for (int j=0;j<=i;++j) dp[i][j]=sum[j];
		}
		int res=0;
		for (int i=0;i<n;++i) {
			res+=dp[n-1][i];
			if (res>=mod) res-=mod;
		}
		System.out.println(res);
	}
}