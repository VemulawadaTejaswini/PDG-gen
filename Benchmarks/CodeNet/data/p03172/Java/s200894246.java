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
 
	static int mod = (int) (1e9+7),MAX=(int) (2e5);
    static List<Integer>[] edges;
    static long[][] dp;
    static int k,n;
    static int[] a;
	public static void main(String[] args) {
	    n = sc.nextInt();
	    k = sc.nextInt();
	    dp = new long[n+1][k+1];
	    a = new int[n+1];
	    for(int i=1;i<=n;++i) a[i] = sc.nextInt();
	    for(int j=0;j<=k;++j) dp[1][j] = (j > a[1])?0:1;
	    
	    for(int i=2;i<=n;++i) {
	    	for(int j=0;j<=k;++j) {
	    	    if(j == 0) dp[i][j] = dp[i-1][j];
	    	    else {
	    	    	dp[i][j] = (dp[i-1][j] + dp[i][j-1])%mod;
	    	    	if(j-1-a[i] >= 0) dp[i][j] = (dp[i][j] - dp[i-1][j-1-a[i]] + mod)%mod;
	    	    }
	    	}
	    }
	    out.print(dp[n][k]);
		out.close();
   }
	
	
}

