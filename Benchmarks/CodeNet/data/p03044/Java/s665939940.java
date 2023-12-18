import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {


	static class Edge{
		int to;
		int dist;
		public Edge(int to, int dist) {
			this.to = to;
			this.dist = dist;
		}
	}

	static void dfs(List<Edge>[] g, int[] color, int dist_from_0, int start) {
		color[start] = dist_from_0 % 2;
		for(Edge next : g[start]) {
			if(color[next.to] != -1) continue;
			dfs(g, color, (dist_from_0 + next.dist) % 2, next.to);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] color = new int[n];
		Arrays.fill(color, -1);
		List<Edge>[] g = new ArrayList[n + 1];
		for(int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}

		for(int i = 0; i < n - 1; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			int w = sc.nextInt();
			g[u].add(new Edge(v, w));
			g[v].add(new Edge(u, w));
		}

		dfs(g, color, 0, 0);
		for(int value : color) {
			System.out.println(value);
		}
		sc.close();
	}
}