import java.util.*;

public class Main {

	private static class Edge {
		int to;
		int c;

		public Edge(int to, int c) {
			this.to = to;
			this.c = c;
		}
	}

	static private List<Edge>[] g;
	static private List<Edge>[] rg;
	static private boolean[] reachable;
	static private boolean[] rreachable;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();

		g = new ArrayList[n];
		rg = new ArrayList[n];

		int[][] es = new int[m][3];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
			rg[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int c = sc.nextInt();
			g[a].add(new Edge(b, -(c - p)));
			rg[b].add(new Edge(a, c - p));
			es[i][0] = a;
			es[i][1] = b;
			es[i][2] = -(c - p);
		}

		reachable = new boolean[n];
		rreachable = new boolean[n];
		dfs(0);
		rdfs(n - 1);
		if (!reachable[n - 1]) {
			System.out.println(-1);
			return;
		}

		long[] score = new long[n];
		Arrays.fill(score, Long.MAX_VALUE);
		score[0] = 0;
		int count = 0;
		while (true) {
			boolean updated = false;
			for (int i = 0; i < es.length; i++) {
				if (score[es[i][0]] == Long.MAX_VALUE) continue;
				if (!rreachable[es[i][0]]) continue;
				if (!rreachable[es[i][1]]) continue;

				if (score[es[i][1]] > score[es[i][0]] + es[i][2]) {
					score[es[i][1]] = score[es[i][0]] + es[i][2];
					updated = true;
				}
			}

			count++;
			if (!updated) break;
			if (count > n) {
				System.out.println("-1");
				return;
			}
		}
		System.out.println(Math.max(0, -score[n - 1]));
	}

	private static void dfs(int v) {
		if (reachable[v]) return;
		reachable[v] = true;
		for (int i = 0; i < g[v].size(); i++) {
			dfs(g[v].get(i).to);
		}
	}

	private static void rdfs(int v) {
		if (rreachable[v]) return;
		rreachable[v] = true;
		for (int i = 0; i < rg[v].size(); i++) {
			rdfs(rg[v].get(i).to);
		}
	}
}
