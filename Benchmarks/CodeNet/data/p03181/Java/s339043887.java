import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	//static int mod = (int) (1e9+7),MAX=(int) (2e5+100);
    static List<Integer>[] edges;
    static long[] ans,dp;
    static int n,m;

	public static void main(String[] args) {
	    n = sc.nextInt();
	    m = sc.nextInt();
	    edges = new ArrayList[n+1];
	    ans = new long[n+1];
	    dp = new long[n+1];
	    
	    for(int i=0;i<edges.length;++i) edges[i] = new ArrayList<>();
	    for(int i=1;i<n;++i) {
	    	int u = sc.nextInt();
	    	int v = sc.nextInt();
	    	edges[u].add(v);
	    	edges[v].add(u);
	    }
	    
	    dfs(1,0);
	    reroot(1,0,1);
	    for(int i=1;i<=n;++i) out.println(ans[i]);
		out.close();
   }

	private static void reroot(int v, int par, long pans) {
		long[] pre=new long[edges[v].size()];
		long[] suf=new long[edges[v].size()];
		
		for (int i=0;i<edges[v].size();++i) {
			int child = edges[v].get(i);
			if (child == par) pre[i] = pans;
			else pre[i] = dp[child]+1;
			if (i > 0) pre[i]*=pre[i-1];
			if (pre[i] >= m) pre[i] %= m;
		}
		for (int i=edges[v].size()-1;i>=0;--i) {
			int child = edges[v].get(i);
			if (child == par) suf[i] = pans;
			else suf[i] = dp[child]+1;
			if (i+1 < edges[v].size()) suf[i]*=suf[i+1];
			if (suf[i] >= m) suf[i]%=m;
		}
		long res = pans;
		for (int i=0;i<edges[v].size();++i) {
			int child = edges[v].get(i);
			if (child == par) continue;
			long tmp = 1;
			if (i>0) tmp = tmp*pre[i-1]%m;
			if (i+1<edges[v].size()) tmp = tmp*suf[i+1]%m;
			reroot(child,v,tmp+1);
			res = res*(dp[child]+1)%m;
		}
		ans[v]= res%m;
		
	}

	private static void dfs(int v, int par) {
		dp[v] = 1;
		for(int child : edges[v]) {
			if(child != par) {
				dfs(child,v);
				dp[v] = mul(dp[v],dp[child]+1);
			}
		}
	}

	private static long mul(long a, long b) {
		return ((a%m) * (b%m))%m;
	}

	
}

