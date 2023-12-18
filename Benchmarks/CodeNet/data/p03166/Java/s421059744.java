
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {

	public static LinkedList<Integer>[] adj;
	public static int[] dp;
	public static boolean[] visited;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out=new PrintWriter (new BufferedOutputStream(System.out));
		FastReader s=new FastReader();
		int n=s.nextInt();
		int m=s.nextInt();
		adj=new LinkedList[n];
		for(int i=0;i<n;i++) {
			adj[i]=new LinkedList<Integer>();
		}
		dp=new int[n];
		visited=new boolean[n];
		Arrays.fill(dp, -1);
		while(m-->0) {
			int a=s.nextInt()-1;
			int b=s.nextInt()-1;
			adj[a].add(b);
		}
		int value=dfsUtil();
		out.println(value>=0?value:0);
		out.close();
	}
	
	public static int dfs(int curr) {
		visited[curr]=true;
		if(dp[curr]!=-1) {
			return dp[curr];
		}
		int max=0;
		for(Integer x:adj[curr]) {
			max=Integer.max(dfs(x), max);
		}
		dp[curr]=max+1;
		return max+1;
	}

	
	public static int dfsUtil() {
		int max=0;
		for(int i=0;i<adj.length;i++) {
			if(!visited[i]) {
				max=Integer.max(dfs(i),max);
			}
		}
		return max-1;
	}
	
	public static PrintWriter out;
	
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
				} catch (Exception e) {
					e.printStackTrace();
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
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}
	
}
