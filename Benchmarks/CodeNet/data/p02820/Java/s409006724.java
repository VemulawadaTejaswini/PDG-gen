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
	static int mod = (int) (1e9+7),n;
	static long cf = 998244353;
    static final int MAX = (int) 1e6;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 20;
    public static long[] Bit;
    public static long[] fact,inv;
    public  static int[] prime; 
    public static long[] dp;
	public static FastReader sc = new FastReader();
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		char[] str = sc.next().toCharArray();
		long sum = 0;
		dp = new long[n];
		for(int i=0;i<k;++i) {
			sum+=get(str[i],r,p,s);
			dp[i] = sum;
		}
		
		for(int i=k;i<n;++i) {
			if(str[i] == str[i-k]) {
				dp[i] = Math.max(dp[i-k], dp[i-1]);
				str[i] = '$';
			}else dp[i] = dp[i-1] + get(str[i],r,p,s);
		}
		out.print(dp[n-1]);
		
		
		out.close();
	}
	private static long get(char c, int r, int p, int s) {
		if(c=='r')return p;
		else if(c=='p') return s;
		else return r;
		
	}
	 
	
}