
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;

public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
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
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
   
  // static Scanner sc = new Scanner(System.in);
  
    private final static int mod = (int) (1e9 + 7);
    private final static int N = (int) (1e6);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
	 int n = sc.nextInt();
	 int W = sc.nextInt();
	 int[] wt = new int[n];
	 int[] v = new int[n];
	 for(int i=0;i<n;++i) {
		 wt[i] = sc.nextInt();
		 v[i] = sc.nextInt();
	 }
	 long[][] dp = new long[n+1][W+1];
	 for(int i=1;i<=n;++i) {
		 for(int w = 1;w<=W;++w) {
			 if(wt[i-1] <= w) {
				 dp[i][w] = Math.max(dp[i-1][w], v[i-1] + dp[i-1][w-wt[i-1]]);
			 }else dp[i][w] = dp[i-1][w];
			 
		 }
	 }
	 
	 out.print(dp[n][W]);
	 out.close();
    
	}

	
}