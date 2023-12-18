import java.io.*;
import java.util.*;

import com.sun.org.apache.bcel.internal.generic.LSTORE;

public class Main {

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
	boolean eof;

	int[] head;
	int[] to;
	int[] next;

	void solve() throws IOException {
		int n = nextInt();
		int m = nextInt();

		head = new int[n];
		to = new int[2 * m];
		next = new int[2 * m];

		Arrays.fill(head, -1);

		int[] deg = new int[n];

		for (int i = 0; i < m; i++) {
			int v = nextInt() - 1;
			int u = nextInt() - 1;
			deg[v]++;
			deg[u]++;
			to[2 * i] = u;
			next[2 * i] = head[v];
			head[v] = 2 * i;

			to[2 * i + 1] = v;
			next[2 * i + 1] = head[u];
			head[u] = 2 * i + 1;
		}

		int q = nextInt();
		int[] froms = new int[q];
		int[] ds = new int[q];
		int[] cols = new int[q];
		
		for (int i = 0; i < q; i++) {
			froms[i] = nextInt() - 1;
			ds[i] = nextInt();
			cols[i] = nextInt();
		}

		int[][] lastQ = new int[n][11];
		for (int i = 0; i < n; i++) {
			Arrays.fill(lastQ[i], -1);
		}

		PriorityQueue<Query> pq = new PriorityQueue<>();
		for (int i = 0; i < q; i++) {
			lastQ[froms[i]][ds[i]] = i;
		}

		for (int i = 0; i < n; i++) {
			for (int d = 0; d <= 10; d++) {
				if (lastQ[i][d] != -1) {
					pq.add(new Query(i, lastQ[i][d], d));
				}
			}
		}
		
		int[] ans = new int[n];
		Arrays.fill(ans, -1);
		
		while (!pq.isEmpty()) {
			Query qq = pq.poll();
			
//			System.err.println(qq.node + " " + qq.query + " " + qq.dist);
			
			if (lastQ[qq.node][qq.dist] != qq.query) {
				continue;
			}
			ans[qq.node] = Math.max(ans[qq.node], qq.query);
			if (qq.dist > 0) {
				for (int i = head[qq.node]; i >= 0; i = next[i]) {
					int u = to[i];
					if (lastQ[u][qq.dist - 1] < qq.query) {
						lastQ[u][qq.dist - 1] = qq.query;
						pq.add(new Query(u, qq.query, qq.dist - 1));
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (ans[i] == -1) {
				out.println(0);
			} else {
				out.println(cols[ans[i]]);
			}
		}
	}

	static class Query implements Comparable<Query> {
		int node;
		int query;
		int dist;

		@Override
		public int compareTo(Query o) {
			return -Integer.compare(query, o.query);
		}

		public Query(int node, int query, int dist) {
			this.node = node;
			this.query = query;
			this.dist = dist;
		}
		
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				eof = true;
				return null;
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			eof = true;
			return null;
		}
	}

	int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}