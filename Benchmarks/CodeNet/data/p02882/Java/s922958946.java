import java.io.*;
import java.util.*;

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
	static long mod = (long) (1e9+7);
	static long cf = 998244353;
    static final long MAX = (long) 1e15;
   // public static List<Integer>[] edges;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		double y=(2.0*x)/(a*b);
		double ans;
		if(y<=a)
			ans=Math.atan(a*b*b/(2.0*x))*180/Math.PI;
		else
			ans=Math.atan((b-((double)x/(a*a)))/(a/2.0))*180/Math.PI;
		out.print(ans);
		out.close();
	}
}
