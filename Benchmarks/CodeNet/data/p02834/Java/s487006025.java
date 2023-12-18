import java.io.*;
import java.math.BigInteger;
import java.util.*;

 
public class Main{
	/*
	 * use Integer for sorting
	 * avoid object comparison
	 * NEVER APPEND A STRING -> APPEND char by char
	 * Always use TreeSet instead of HashSet
	 * 
	 */
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
    static final long MAX = (long) 1e8;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static long[] fac;
    public static int N = 400000+200;
    public static int x = 0;
    public static boolean[] visited;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		edges = new ArrayList[n+1];
		for(int i=0;i<=n;++i) edges[i] = new ArrayList<>();
		for(int i=1;i<n;++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			edges[u].add(v);
			edges[v].add(u);
		}
		
		int[] tak = new int[n+1]; tak[0] = -1;
		int[] aok = new int[n+1]; aok[0] = -1;
		dfs(t,0,tak);
		dfs(a,0,aok);
		long ans = 0;
		for(int i=1;i<=n;++i) {
			if(tak[i] < aok[i]) {
				ans = Math.max(ans,aok[i]);
			}
		}
		out.print(ans-1);
		out.close();
	}
	private static void dfs(int v, int parent, int[] level) {
		level[v] = level[parent] + 1;
		for(int child : edges[v]) {
			if(child != parent) dfs(child,v,level);
		}
	}
	
	
	
}