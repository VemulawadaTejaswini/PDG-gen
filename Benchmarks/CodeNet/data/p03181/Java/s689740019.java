import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
	
	public static LinkedList<Integer>[] adj;
	public static long mod;
	public static class node{
		ArrayList<Long> childs;
		long[] multi;
		int index = 0;
		HashMap<Integer, Integer> indicies;
		long ans;
		public node() {
			childs = new ArrayList<Long>();
			indicies = new HashMap<>();
		}
		public void CreateDp() {
			int n = childs.size();
			if(n == 0) return;
			multi = new long[n];
			multi[0] = childs.get(0);
			for(int i = 1; i < n; i++) {
				multi[i] = multi[i - 1] * childs.get(i);
				multi[i] %= mod;
			}
			long suffix = 1;
			for(int i = n - 1; i >= 1; i--) {
				multi[i] = suffix * multi[i - 1];
				multi[i] %= mod;
				suffix *= childs.get(i);
				suffix %= mod;
			}
			multi[0] = suffix%mod;
		}
		public void CreateAns() {
			ans = 1;
			int n = childs.size();
			for(int i = 0; i < n; i++) {
				ans *= (long)(childs.get(i));
				ans %= mod;
			}
		}
	}

	public static node[] dp;
	
	public static void dfs(int curr, int pr) {
		dp[curr] = new node();
		for(Integer x : adj[curr]) {
			if(x != pr) {
				dfs(x, curr);
				dp[curr].childs.add((dp[x].ans + 1L)%mod);
				dp[curr].indicies.put(x, dp[curr].index);
				dp[curr].index++;
			}
		}
		dp[curr].CreateDp();
		dp[curr].CreateAns();
	}
	
	public static long finalAns;
	
	public static void dfs2(int curr, int pr) {
		long child = (dp[pr].multi[dp[pr].indicies.get(curr)] + 1L)%mod;
		long ans = dp[curr].ans * child;
		ans %= mod;
		finalAns = Long.max(finalAns, ans);
		dp[curr].childs.add(child);
		dp[curr].CreateDp();
		dp[curr].ans = ans;
		for(Integer x: adj[curr]) {
			if(x != pr) {
				dfs2(x, curr);
			}
		}
	}
	
	public static void solve() {
		int n = s.nextInt(); 
		adj = new LinkedList[n];
		for(int i = 0; i < n; i++) adj[i] = new LinkedList<Integer>();
		mod = s.nextLong();
		for(int i = 0; i < n - 1; i++) {
			int x = s.nextInt() - 1;
			int y = s.nextInt() - 1;
			adj[x].add(y);
			adj[y].add(x);
		}
		dp = new node[n];
		dfs(0, 0);
		finalAns = dp[0].ans;
		
		for(Integer x: adj[0]) {
			dfs2(x, 0);
		}
		for(int i = 0; i < n; i++) {
			out.println(dp[i].ans);
		}
	}

	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

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
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
