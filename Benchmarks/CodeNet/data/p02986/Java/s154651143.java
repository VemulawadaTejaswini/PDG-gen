import java.io.*;
import java.util.*;

public class Main {

	static int n;
	static int log = 20;

	static long getDist(int u, int x, int y) {
		long ans = dist[u];
		int count = 0;
		long total = 0;
		while (level[u] % blockSize > 0) {
			if (col[u] == x) {
				count++;
				total += dist[u] - dist[up[u][0]];
			}
			u = up[u][0];

		}
		int blockNum = mapped[u];
		count += cntBlock[blockNum][x];
		total += sumBlock[blockNum][x];
		ans -= total;
		ans += count * 1L * y;
		return ans;
	}

	static ArrayList<Edge>[] adj;
	static int[] cnt, level, col, mapped, up[];
	static long[] sum, dist;
	static int[][] cntBlock;
	static long[][] sumBlock;
	static int blockSize, last;

	static void dfsPre(int u, int p) {
		if (level[u] % blockSize == 0) {
			int blockNum = last++;
			mapped[u] = blockNum;
			for (int col = 1; col < n; col++) {
				cntBlock[blockNum][col] = cnt[col];
				sumBlock[blockNum][col] = sum[col];
			}

		}
		up[u][0] = p;
		for (int i = 1; i < log; i++)
			up[u][i] = up[up[u][i - 1]][i - 1];

		for (Edge nxt : adj[u]) {
			int v = nxt.v;
			if (v == p)
				continue;
			dist[v] = dist[u] + nxt.d;
			level[v] = level[u] + 1;
			cnt[nxt.c]++;
			sum[nxt.c] += nxt.d;
			col[v] = nxt.c;
			dfsPre(v, u);
			cnt[nxt.c]--;
			sum[nxt.c] -= nxt.d;
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		n = sc.nextInt();
		int q = sc.nextInt();

		adj = new ArrayList[n];
		for (int i = 0; i < n; i++)
			adj[i] = new ArrayList();
		for (int i = 1; i < n; i++) {
			int u = sc.nextInt() - 1, v = sc.nextInt() - 1, c = sc.nextInt(), d = sc.nextInt();
			adj[u].add(new Edge(v, c, d));
			adj[v].add(new Edge(u, c, d));
		}
		up = new int[n][log];
		dist = new long[n];
		mapped = new int[n];
		level = new int[n];
		cnt = new int[n];
		col = new int[n];
		sum = new long[n];
		blockSize = (int) Math.sqrt(n);
		int numBlocks = n / blockSize + 1;
		cntBlock = new int[numBlocks][n];
		sumBlock = new long[numBlocks][n];
		dfsPre(0, 0);
		while (q-- > 0) {
			int x = sc.nextInt(), y = sc.nextInt(), u = sc.nextInt() - 1, v = sc.nextInt() - 1;
			int lca = lca(u, v);
			long ans = getDist(u, x, y) + getDist(v, x, y) - 2 * getDist(lca, x, y);
			out.println(ans);
		}

		out.close();

	}

	static int lca(int u, int v) {

		if (level[u] < level[v])
			return lca(v, u);
		for (int i = log - 1; i >= 0; i--) {
			int u2 = up[u][i];
			if (level[u2] >= level[v])
				u = u2;
		}
		if (u == v)
			return u;
		for (int i = log - 1; i >= 0; i--) {
			int u2 = up[u][i], v2 = up[v][i];
			if (u2 != v2) {
				u = u2;
				v = v2;
			}
		}
		return up[u][0];
	}

	static class Edge {
		int v, c, d;

		Edge(int V, int C, int D) {
			v = V;
			c = C;
			d = D;
		}
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		Scanner(String fileName) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(fileName));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		String nextLine() throws IOException {
			return br.readLine();
		}

		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		boolean ready() throws IOException {
			return br.ready();
		}

	}

}