import java.util.*;
import java.io.*;

public class Main {

	List<Integer>[] graph;
	boolean[] mark;
	int ans = 0;
	
	void dfs(int u, int p) {
		for (int t = 0; t < graph[u].size(); t++) {
			int to = graph[u].get(t);
			if (to != p) {
				dfs(to, u);
			}
		}
		
		boolean first = true;
		for (int t = 0; t < graph[u].size(); t++) {
			int to = graph[u].get(t);
			if (to != p && !mark[to]) {
				if (first) {
					first = false;
					continue;
				} else {
					mark[to] = true;
					ans++;
				}
			}
		}
		
		for (int t = 0; t < graph[u].size(); t++) {
			int to = graph[u].get(t);
			if (to != p) {
				mark[u] |= mark[to];
			}
		}
		
	}
	
	void solve() {
		int n = in.nextInt();
		graph=  new List[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			int from = in.nextInt();
			int to = in.nextInt();
			graph[from].add(to);
			graph[to].add(from);
		}
		int root = 0;
		for (int i = 1; i < n; i++) {
			if (graph[i].size() > graph[root].size()) {
				root = i;
			}
		}
		if (graph[root].size() < 3) {
			out.println(1);
			return;
		}
		mark = new boolean[n];
		dfs(root, -1);
		out.println(ans);
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
