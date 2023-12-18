

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
    public static long[] fac,inv;
    public  static int[] prime; 
    public static long[] dp;
	public static FastReader sc = new FastReader();
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		fac = new long[10];
		fac[0] = 1;
		for(int i=1;i<fac.length;++i) fac[i] = i*fac[i-1];
		
		long a = 0;
		boolean[] used = new boolean[n+1];
		for(int i=1;i<=n;++i) {
			int x = sc.nextInt();
			long rank = 0;
			for(int j=1;j<=n;++j) {
				if(x == j) {
					used[x] = true;
					break;
				}else if(used[j]) continue;
				else ++rank;
			}
			a+=rank*fac[n-i];
		}
		
		long b = 0;
	    used = new boolean[n+1];
		for(int i=1;i<=n;++i) {
			int x = sc.nextInt();
			long rank = 0;
			for(int j=1;j<=n;++j) {
				if(x == j) {
					used[x] = true;
					break;
				}else if(used[j]) continue;
				else ++rank;
			}
			b+=rank*fac[n-i];
		}
		
		out.print(Math.abs(a-b));
		
		out.close();
	}
	
	
}