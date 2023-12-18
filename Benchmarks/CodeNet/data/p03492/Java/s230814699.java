import java.util.*;
import java.io.*;

public class Main {

	List<Integer>[] graph;
	int[] size;

	void dfsSize(int u, int p) {
		size[u] = 1;
		for (int v : graph[u]) {
			if (v == p) {
				continue;
			}
			dfsSize(v, u);
			size[u] += size[v];
		}
	}

	void solve() {
		int n = in.nextInt();
		graph = new List[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();
		}
		for (int i = 0; i < n - 1; i++) {
			int x = in.nextInt() - 1, y=  in.nextInt() - 1;
			graph[x].add(y);
			graph[y].add(x);
		}
		size = new int[n];
		dfsSize(0, -1);
		int prev = -1;
		int centroid = 0;
		while (true) {
			int child = -1;
			for (int t : graph[centroid]) {
				if (t == prev) {
					continue;
				}
				if (size[t] * 2 >= n) {
					child = t;
				}
			}
			if (child != -1) {
				prev = centroid;
				centroid = child;
			} else {
				break;
			}
		}
		
		dfsSize(centroid, -1);
		int[] t = new int[graph[centroid].size()];
		for (int i = 0; i < t.length; i++) {
			t[i] = size[graph[centroid].get(i)];
		}
		
		int mod = 1000000007;
		int[][] choose = new int[n + 1][n + 1];
		int[] fact = new int[n + 1];
		fact[0] = 1;
		for (int i = 0; i < n; i++) {
			fact[i + 1] = (int) (1L * fact[i] * (i + 1) % mod);
		}
		for (int i = 0; i <= n; i++) {
			choose[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				choose[i][j] = choose[i - 1][j - 1] + choose[i - 1][j];
				if (choose[i][j] >= mod) {
					choose[i][j] -= mod;
				}
			}
		}
		int[] dp = new int[n + 1];
		int[] newDp = new int[n + 1];
		dp[0] = dp[1] = 1;
		for (int size : t) {
			for (int i = 0; i <= n; i++) {
					if (dp[i] == 0) {
						continue;
					}
					long val = dp[i];
					for (int endHere = 0; endHere <= i && endHere <= size; endHere++) {
						for (int endBefore = 0; endBefore <= i && endBefore <= size; endBefore++) {
							newDp[i - endHere + (size - endBefore)] +=
									(val * choose[i][endHere] % mod * choose[size][endHere] % mod * fact[endHere] % mod * 
										   choose[i][endBefore] % mod * choose[size][endBefore] % mod * fact[endBefore] % mod);
							if (newDp[i - endHere + (size - endBefore)] >= mod) {
								newDp[i - endHere + (size - endBefore)] -= mod;
							}
						}
				}
			}
			for (int i = 0; i <= n; i++) {
					dp[i] = newDp[i];
					newDp[i] = 0;
			}
		}
		out.println(dp[0]);
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
