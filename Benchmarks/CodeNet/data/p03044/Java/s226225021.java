import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static class Edge {
		int to, cost;

		public Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}

	static List<Edge>[] g;
	static int[] color;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 頂点数
		g = new ArrayList[N + 1]; // 辺の情報
		color = new int[N + 1]; // 塗る色

		for (int i = 0; i < N + 1; i++) {
			g[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < N - 1; i++) { // 辺はN-1本
			int u = sc.nextInt();
			int v = sc.nextInt();
			int w = sc.nextInt();
			g[u].add(new Edge(v, w));
			g[v].add(new Edge(u, w));
		}

		dfs(1, 0, 0);

		for (int i = 1; i < N + 1; i++) {
			System.out.println(color[i]);
		}

		sc.close();
	}

	public static void dfs(int u, int parent, long sum) {
		color[u] = (int) (sum % 2l);
		for (Edge e : g[u]) {
			if (e.to == parent) {
				continue;
			}
			dfs(e.to, u, sum + e.cost);
		}
	}

}
