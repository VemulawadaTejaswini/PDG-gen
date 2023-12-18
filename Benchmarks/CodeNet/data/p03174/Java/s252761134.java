import java.io.*;
import java.util.*;


public class Solution {

	
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
 
	static int mod = (int) (1e9+7),MAX=(int) (1e4);
	static List<Integer>[] edges;
    static Long[] dp;
    static int[][] a;
    static int n;
	
	public static void main(String[] args) throws IOException {
		
	n = sc.nextInt();
	a = new int[n][n];

	for(int i=0;i<n;++i) {
		for(int j=0;j<n;++j)
			a[i][j] = sc.nextInt();
	}
	
    dp = new Long[1<<n];
    out.println(f(0));    

out.close();
}
private static long f(int mask) {
	int row = Integer.bitCount(mask);
	if(row == n) return 1;
	
	if(dp[mask] != null) return dp[mask];
  
    long ans = 0;
	for(int col=0;col<n;++col)
         if(((mask>>col)&1) == 0 && a[row][col] == 1)
        	 ans=(ans + f(mask|1<<col))%mod;
	
	return dp[mask] = ans;
}
	
	}


