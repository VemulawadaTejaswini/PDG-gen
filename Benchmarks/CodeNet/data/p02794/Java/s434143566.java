

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
    static final int MAX = (int) 1e16;
    public static List<Edge>[] edges;
    public static int[][] parent;
    public static int col = 20;
    public static long[] Bit;
    public static long[] fact,inv;
    public  static int[] prime; 
    public static long[] seg,lazy;
	public static FastReader sc = new FastReader();
	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		edges = new ArrayList[n];
		for(int i=0;i<n;++i) edges[i] = new ArrayList<>();
		for(int i=1;i<n;++i) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			edges[u].add(new Edge(v,i));
			edges[v].add(new Edge(u,i));
		}
		int m = sc.nextInt();
		long[] white = new long[m];
		long ans = 0;
		for(int i=0;i<m;++i) {
			int u = sc.nextInt()-1;
			int v = sc.nextInt()-1;
			cnt = 0;
			dfs(u,v,-1);
			white[i] = cnt;
		}
		for(int i=0;i<1L<<m;++i) {
			long temp = 0;
			for(int j=0;j<m;++j) {
				if((i&(1L<<j))!=0)
					temp|=white[j];
			}
			long C = Long.bitCount(temp);
			if((Integer.bitCount(i)&1) == 0) ans+=1L<<(n-1-C);
			else ans-=1L<<(n-1-C);
		
		
	}
		out.println(ans);
		out.close();
	}
	static long cnt;
	private static boolean dfs(int u, int v, int p) {
		if(u == v) return true;
		for(Edge e : edges[u]) {
			if(e.to != p) {
				if(dfs(e.to,v,u)) {
					cnt|=1L<<e.id;
					return true;
				}
			}
		}
		return false;
	}
	static class Edge{
		int to;
		int id;
		Edge(int to,int id){
			this.to = to;
			this.id = id;
		}
	}
}