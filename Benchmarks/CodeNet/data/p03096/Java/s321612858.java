import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n+1];
		int[] last=new int[200000];
		for(int i=1;i<=n;++i)
			a[i]=s.nextInt();
		Arrays.fill(last,Integer.MAX_VALUE);

		long[]dp=new long[n+1];
		dp[0]=1;
		for(int i=1;i<=n;++i) {
			if(last[a[i]]<i-1) {
				dp[i]+=dp[last[a[i]]];
			}
			dp[i]+=dp[i-1];
			dp[i]%=mod;
			last[a[i]]=i;
		}
		System.out.println(dp[n]);
		System.err.println();
	}
	static int mod=1000000007;
}