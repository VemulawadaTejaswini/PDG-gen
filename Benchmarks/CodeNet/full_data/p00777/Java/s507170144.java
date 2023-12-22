import java.util.*;

public class Main {
	static int n;
	static ArrayList<Edge>[] g;
	static int[] depth;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			g = new ArrayList[n];
			depth = new int[n];
			for (int i = 0; i < n; ++i)
				g[i] = new ArrayList<>();
			int[] p = new int[n - 1];
			int[] d = new int[n - 1];
			for (int i = 0; i < n - 1; ++i) {
				p[i] = sc.nextInt();
			}
			for (int i = 0; i < n - 1; ++i) {
				d[i] = sc.nextInt();
			}
			for (int i = 0; i < n - 1; ++i) {
				int a = i + 1;
				int b = p[i] - 1;
				int w = d[i];
				g[a].add(new Edge(a, b, w));
				g[b].add(new Edge(b, a, w));
			}

			long ans = 0;
			for (int i = 0; i < n; ++i) {
				for (Edge e : g[i]) {
					if (e.src > e.dst)
						ans += e.weight * 3;
				}
			}

			for (int i = 0; i < n; ++i) {
				if (g[i].size() == 1)
					ans -= g[i].get(0).weight * 2;
			}
			
			dfs(0, -1);

			int max = -1;
			int v = -1;

			for (int i = 0; i < n; ++i) {
				if (max < depth[i]) {
					max = depth[i];
					v = i;
				}
			}
			Arrays.fill(depth, 0);
			dfs(v, -1);

			max = -1;

			for (int i = 0; i < n; ++i) {
				max = Math.max(max, depth[i]);
			}
			ans -= max;
			System.out.println(ans);
		}
	}

	static void dfs(int cur, int pre) {
		for (Edge e : g[cur]) {
			if (g[e.dst].size() == 1)
				continue;
			if (e.dst == pre)
				continue;
			depth[e.dst] = depth[cur] + e.weight;
			dfs(e.dst, cur);

		}
	}

	static class Edge {
		int src;
		int dst;
		int weight;

		public Edge(int src, int dst, int weight) {
			this.src = src;
			this.dst = dst;
			this.weight = weight;
		}
	}
}