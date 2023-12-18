import java.util.*;
public class Main {
	static int n;
	static long mod;
	static long[] dp=new long[112345];
	static long[] res=new long[112345];
	static ArrayList<Integer>[] G=new ArrayList[112345];
	static void dfs(int u,int fa) {
		dp[u]=1;
		for (int i=0;i<G[u].size();++i) {
			int v=G[u].get(i);
			if (v==fa) continue;
			dfs(v,u);
			dp[u]=dp[u]*(dp[v]+1)%mod;
		}
	}
	static void DP(int u,int fa,long now) {
		long[] pre=new long[G[u].size()];
		long[] suf=new long[G[u].size()];
		for (int i=0;i<G[u].size();++i) {
			if (G[u].get(i)==fa) pre[i]=now;
			else pre[i]=dp[G[u].get(i)]+1;
			if (i>0) pre[i]*=pre[i-1];
			if (pre[i]>=mod) pre[i]%=mod;
		}
		for (int i=G[u].size()-1;i>=0;--i) {
			if (G[u].get(i)==fa) suf[i]=now;
			else suf[i]=dp[G[u].get(i)]+1;
			if (i+1<G[u].size()) suf[i]*=suf[i+1];
			if (suf[i]>=mod) suf[i]%=mod;
		}
		long ans=now;
		for (int i=0;i<G[u].size();++i) {
			int v=G[u].get(i);
			if (v==fa) continue;
			long tmp=1;
			if (i>0) tmp=tmp*pre[i-1]%mod;
			if (i+1<G[u].size()) tmp=tmp*suf[i+1]%mod;
			DP(v,u,tmp+1);
			ans=ans*(dp[v]+1)%mod;
		}
		res[u]=ans;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		mod=in.nextLong();
		for (int i=1;i<=n;++i) G[i]=new ArrayList();
		for (int i=0;i<n-1;++i) {
			int x=in.nextInt();
			int y=in.nextInt();
			G[x].add(y);
			G[y].add(x);
		}
		dfs(1,0);
		DP(1,0,1);
		for (int i=1;i<=n;++i) System.out.printf("%d\n",res[i]);
	}
}