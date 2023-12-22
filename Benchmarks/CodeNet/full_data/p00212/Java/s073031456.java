import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	static final int INF = 1001001001;

	void solve() {
		int c = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = sc.nextInt() - 1;
		int goal = sc.nextInt() - 1;
		if (c == 0) return;
		dp = new int[n][c+1];
		for (int i = 0; i < n; i++) Arrays.fill(dp[i], INF);

		int[][] g = new int[n][n];
		for (int i = 0; i < n; i++) Arrays.fill(g[i], INF);
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int d = sc.nextInt();
			if (g[a][b] > d) {
				g[a][b] = g[b][a] = d;
			}
		}
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.add(new State(start, 0, 0));
		dp[start][0] = 0;

		int ans = INF;
		while (!pq.isEmpty()) {
			State cur = pq.poll();
			if (cur.pos == goal) {
				ans = cur.cost;
				break;
			}
			for (int next = 0; next < n; next++) if (g[cur.pos][next] < INF) {
				{
					int ncost = cur.cost + g[cur.pos][next];
					if (dp[next][cur.ticket] > ncost) {
						dp[next][cur.ticket] = ncost;
						pq.add(new State(next, cur.ticket, ncost));
					}
				}
				if (cur.ticket + 1 <= c) {
					int ncost = cur.cost + g[cur.pos][next] / 2;
					if (dp[next][cur.ticket + 1] > ncost) {
						dp[next][cur.ticket + 1] = ncost;
						pq.add(new State(next, cur.ticket + 1, ncost));
					}
				}
			}
		}
		System.out.println(ans);

	}
	class State implements Comparable<State> {
		int pos;
		int ticket;
		int cost;
		public State(int pos, int ticket, int cost) {
			this.pos = pos;
			this.ticket = ticket;
			this.cost = cost;
		}
		@Override
		public int compareTo(State o) {
			return cost - o.cost;
		}
	}

	int[][] dp;

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}