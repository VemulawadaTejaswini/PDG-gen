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
 
	static int mod = (int) (1e9+7),MAX=(int) (3e5),n,m;
	static List<Integer>[] edges;
    static int[] dp,in;
    static List<Integer> list;
    
	public static void main(String[] args) {
		  n = sc.nextInt();
		  m = sc.nextInt();
		  edges = new ArrayList[n+1];
		  for(int i=0;i<edges.length;++i) edges[i] = new ArrayList<>();
		  in = new int[n+1];
		  for(int i=1;i<=m;++i) {
			  int u = sc.nextInt();
			  int v = sc.nextInt();
			  edges[u].add(v);
			  in[v]++;
		  }
		  tsort();
		  dp = new int[n+1];
		  Arrays.fill(dp, -1);
		  int ans = 1;
		  for(int i=list.size()-1;i>=0;--i) {
			  int v = list.get(i);
			  dp[v] = 1;
			  for(int node : edges[v]) {
				  dp[v] = Math.max(dp[v],dp[node] + 1);
			  }
			  ans = Math.max(ans, dp[v]);
		  }
		--ans;
	   out.print(ans);
	  out.close();
	 }
	 private static boolean tsort() {
			int n = in.length-1;
			// at any point it will contain only source vertex
			Queue<Integer> q = new LinkedList<>(); 
			for(int i=1;i<=n;++i)
				if(in[i] == 0) q.add(i); // adding all the source node with indegree 0.
			
			list = new ArrayList<>();
			while(q.size() > 0) {
				int x = q.poll();
				list.add(x);
				for(int node : edges[x]) {
					if(--in[node] == 0)
						q.add(node); // adding only when it becomes source
				}
			}
			if(list.size() == n) return true;
			else return false;
			
		}
}
