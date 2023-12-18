

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;




public class Main{
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
				} catch (Exception r) {
					r.printStackTrace();
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
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static int mod = (int) (1e9+7);
	static long cf = 998244353;
    static final int N = (int) 1e3+10;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 20;
    public static int[] Bit;
    public static long[] fact,inv;
    public  static int[] prime; 
	public static Map<Integer, Integer> map; 
	static char ch = 'z';
	static FastReader sc = new FastReader();
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		for(int i=1;i<=n;++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		long[] dp = new long[h+1];
		Arrays.fill(dp,Integer.MAX_VALUE);
		
		 dp[0] = 0;
		for(int i=1;i<=h;++i) {
			for(int j=1;j<=n;++j) {
				if(i-a[j] >= 0) {
					dp[i] = Math.min(dp[i],dp[i-a[j]] + b[j]);
				}else {
					dp[i] = Math.min(dp[i],b[j]);
				}
			}
		}
		out.print(dp[h]);
	out.close();
	}
	
}
