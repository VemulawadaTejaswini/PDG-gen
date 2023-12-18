import java.util.*;
import java.io.*;

public class Main {

	static ArrayList<Integer>[] adjList;
	static char[] clr;
	static boolean[] valid;
	static int[] rank;
	static int[] w;

	public static void removeblackleaves() {
		valid = new boolean[N];
		Arrays.fill(valid, true);
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < N; i++) {
			if (rank[i] == 1 && clr[i] == 'B')
				q.add(i);
		}
		while (!q.isEmpty()) {
			int cur = q.poll();
			valid[cur] = false;
			for (int x : adjList[cur]) {
				rank[x]--;
				rank[cur]--;
				if (rank[x] == 1 && clr[x] == 'B')
					q.add(x);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		N = sc.nextInt();
		adjList = new ArrayList[N];
		for (int i = 0; i < adjList.length; i++) {
			adjList[i] = new ArrayList<Integer>();
		}
		rank = new int[N];
		for (int i = 0; i < N - 1; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			adjList[u].add(v);
			adjList[v].add(u);
			rank[v]++;
			rank[u]++;
		}
		int whites = 0;
		clr = sc.next().toCharArray();
		for (int i = 0; i < clr.length; i++) {
			if (clr[i] == 'W')
				whites++;
		}
		if (whites == 0) {
			pw.println(0);
			pw.close();
			return;
		} else if (whites == 1) {
			pw.println(1);
			pw.close();
			return;
		}
		removeblackleaves();
		int sumw = 0;
		w = new int[N];
		for (int i = 0; i < w.length; i++) {
			if (rank[i] >= 1 && valid[i] && (clr[i] == 'W' && rank[i] % 2 == 0) || (clr[i] == 'B' && rank[i] % 2 == 1))
				w[i] = 1;
			sumw += w[i];
		}
		go();

		int leaves = 0;
		int sub = -(int) 1e9;
		for (int i = 0; i < N; i++) {

			if (rank[i] == 1) {
				leaves++;
				sub = Math.max(sub, 2 * dp_up[i] + 1);
			}
		}
		int nodes = 0;
		for (int i = 0; i < N; i++) {
			if (valid[i])
				nodes++;
		}
//		pw.println(nodes);
//		pw.println(leaves);
//		pw.println(whites);
//		pw.println(sub);
//		pw.println(Arrays.toString(dp_up));
		pw.println(2 * (nodes - 1) + sumw + 1 - sub);
		pw.close();
	}

	static int N, dp_down[][], dp_up[];
	static boolean[] visited;

	// Part 1
	static void dfs1(int u) {
		visited[u] = true;
		for (int i = 0; i < adjList[u].size(); ++i) {
			int v = adjList[u].get(i);
			if (!visited[v] && valid[v]) {
				dfs1(v);
				int newval = w[v] + dp_down[v][0];
				if (newval > dp_down[u][1])
					dp_down[u][1] = newval;
				if (dp_down[u][1] > dp_down[u][0])
					swap(u);
			}
		}
	}

	static void dfs2(int u, int h) {
		visited[u] = true;
		dp_up[u] = h;
		for (int v : adjList[u]) {
			if (!visited[v] && valid[v]) {
				int h_nxt;
				if (dp_down[v][0] + w[v] == dp_down[u][0])
					h_nxt = dp_down[u][1] + w[u];
				else
					h_nxt = dp_down[u][0] + w[u];
				dfs2(v, Math.max(h + w[u], h_nxt));
			}
		}
	}

	static void swap(int u) {
		int x = dp_down[u][0], y = dp_down[u][1];
		dp_down[u][0] = y;
		dp_down[u][1] = x;
	}

	static void go() {
		dp_down = new int[N][2];
		dp_up = new int[N];
		visited = new boolean[N];
		for (int i = 0; i < N; i++) {
			if (rank[i] != 1 && valid[i]) {
//				System.err.println(i);
				dfs1(i);
				visited = new boolean[N];
				dfs2(i, 0);
				break;
			}
		}
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

	}

}
