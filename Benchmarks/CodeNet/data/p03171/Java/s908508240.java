
package TDP;
import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;


public class game{
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
 
	static int mod = (int) (1e9+7);
	static List<Integer>[] edges ;
	static long[][] dp ;
	static int[] a;
	public static void main(String[] args) {

		int n = sc.nextInt();
	    a = new int[n+1];
	    long total = 0;
	    for(int i=1;i<=n;++i) {
	    	a[i] = sc.nextInt();
	    	total+=a[i];
	    }
	    
	    dp = new long[n+1][n+1];
	    for(int i=0;i<dp.length;++i) Arrays.fill(dp[i], -1);
	  
	   // out.println(f(1,n));
	    long x = f(1,n);
	    long y = total - x;
	    long ans = x - y;
	    out.println(ans);
	    

		
	out.close();
}
	private static long f(int i, int j) {
		if(i+1 == j) return Math.max(a[i], a[j]);
		if(i > j) return 0;
		if(dp[i][j] != -1) return dp[i][j];
		/*
		 * case 
		 * 1,2
		 * 1,n
		 * n,1
		 * n-1,n
		 * 
		 */
		long o1 = a[i] + f(i+2,j);
		long o2 = a[i] + f(i+1,j-1);
		long o3 = a[j] + f(i+1,j-1);
		long o4 = a[j] + f(i,j-2);
		return dp[i][j] = Math.max(Math.min(o1, o2),Math.min(o3, o4));
	}
	
	
}

