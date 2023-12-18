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
 
	static int mod = (int) (1e9+7),MAX=(int) (3e5);
	static Set<Integer>[] edges;
    static int n,m;
    static long[][] dp;
    
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] tab = new char[n+1][m+1];
		for(int i=1;i<=n;++i) {
			char[] s = sc.next().toCharArray();
			for(int j=1;j<=m;++j)
				tab[i][j] = s[j-1];
		}
		dp = new long[n+1][m+1];
		for(int i=1;i<=n;++i) {
			if(tab[i][1] == '#') break;
			dp[i][1] = 1;
		}
		for(int i=1;i<=m;++i) {
			if(tab[1][i] == '#') break;
			dp[1][i] = 1;
		}
		
		for(int i=2;i<=n;++i) {
			for(int j=2;j<=m;++j) {
				if(tab[i][j] != '#') {
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
					if(dp[i][j] >= mod) dp[i][j]-=mod;
				}
			}
		}
		out.println(dp[n][m]);
	  out.close();
	 }
	
}
