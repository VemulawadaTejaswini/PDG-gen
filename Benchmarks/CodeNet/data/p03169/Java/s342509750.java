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
    static List<Integer>[] edges;
    static int n;
    static double[] p;
    static Double[][][] dp;
    
    
	public static void main(String[] args) {
		n = sc.nextInt();
		p = new double[n+1];
		int[] map = new int[4];
		for(int i=1;i<=n;++i)	map[sc.nextInt()]++;
		
		dp = new Double[n+1][n+1][n+1];
		out.print(f(map[1],map[2],map[3]));
		out.close();
   }
	 
    private static double f(int i, int j, int k) {
    	if(i == 0 && j == 0 && k == 0) return 0;
    	if(dp[i][j][k] != null) return dp[i][j][k];
		double ans = n;
		if(i > 0) ans+=i*f(i-1,j,k);
		if(j > 0) ans+=j*f(i+1,j-1,k);
		if(k > 0) ans+=k*f(i,j+1,k-1);
		ans/=i+j+k;
		return dp[i][j][k] = ans;
	}

}