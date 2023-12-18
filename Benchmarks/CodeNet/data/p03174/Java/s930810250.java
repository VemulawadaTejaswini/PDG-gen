import java.util.*;
public class Main {
	public static int cnt(int x) {
		int ret=0;
		while (x>0) {
			++ret;
			x-=x&-x;
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] dp=new int[1<<n];
		int[][] a=new int[n][n];
		int mod=1000000007;
		for (int i=0;i<n;++i)
			for (int j=0;j<n;++j)
				a[i][j]=in.nextInt();
		dp[0]=1;
		for (int i=0,v=0;i<(1<<n)-1;++i,v=cnt(i)) if (dp[i]>0)
			for (int u=0;u<n;++u) if ((i>>u&1)==0&&a[u][v]>0)
				dp[i^(1<<u)]=(dp[i^(1<<u)]+dp[i])%mod;
		System.out.println(dp[(1<<n)-1]);
	}
}