import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int K=in.nextInt();
		int mod=1000000007;
		int[] dp=new int[K+1];
		int[] a=new int[n+1];
		for (int i=1;i<=n;++i)
			a[i]=in.nextInt();
		dp[0]=1;
		for (int i=1;i<=n;++i) {
			for (int j=1;j<=K;++j)
				dp[j]=(dp[j]+dp[j-1])%mod;
			for (int j=K;j>=0;--j)
				dp[j]=(dp[j]-((j<a[i]+1)?0:dp[j-a[i]-1]))%mod;
		}
		System.out.println(dp[K]);
	}
}