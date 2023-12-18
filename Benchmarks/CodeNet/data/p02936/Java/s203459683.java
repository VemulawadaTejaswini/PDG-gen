
import java.io.*;
import java.util.*;


public class Main {
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

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
	static long mod = (long)(1e9+7);
	static FastReader sc = new FastReader();
    static List<Integer>[] edge ;
	// static TreeSet<Integer>[] edge ;
	public static void main(String[] args) throws FileNotFoundException {	
	
		FastReader sc = new FastReader();
		 
		
		 int n = sc.nextInt();
		 int q = sc.nextInt();
		 edge = new ArrayList[n+1];
		   
		for(int i=0;i<=n;++i) {
			edge[i] = new ArrayList<>();
		}
		for(int i=0;i<n-1;++i) {
			int u = sc.nextInt();
			int v = sc.nextInt();
				edge[u].add(v);
				edge[v].add(u);
			
		}
		int[] subtree = new int[n+1];
		counter = 0;
		while(q-->0) {
			int idx = sc.nextInt();
			int val = sc.nextInt();
			subtree[idx] += val;
		}
		int[] node = subtree.clone();
		dfs(1,0,subtree,node);
		for(int i=1;i<=n;++i) out.print(node[i]+" ");
		out.close();
	}
	static int counter;
	
	
	private static void dfs(int v, int parent,int[] subtree,int[] node) {
		counter+=subtree[v];
		for(int child : edge[v]) {
			if(child != parent) { 
				node[child] += counter;
				dfs(child,v,subtree,node);
			}
		}
		counter-=subtree[v];
		
	}
}