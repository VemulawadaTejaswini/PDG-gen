import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
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
 
	static int mod = (int) (998244353);
	static List<Integer>[] edges ;
	static long[][] dp;
	
	final static int MAX = Integer.MAX_VALUE/10 ;

	public static void main(String[] args) {
		  
		int n = sc.nextInt();
		int[] a = new int[n+1];
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=1;i<=n;++i) {
			a[i] = sc.nextInt();
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		long ans = 0;
		for(int key : map.keySet()) {
			long x = map.get(key);
			ans+=(x*(x-1))/2;
		}
		//out.println(ans);
		for(int i=1;i<=n;++i) {
			int key = map.get(a[i]);
			long temp = ans;
			temp-=(key*(key-1))/2;
			temp+=((key-1)*(key-2))/2;
			out.println(temp);
		}
	out.close();
}
}
	
