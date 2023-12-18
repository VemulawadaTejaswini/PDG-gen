import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static class Edge {
		int from, to, cost;
		public Edge(int from, int to, int cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	static int V = 10;
	static int E = 100;
	static Edge[] edges = new Edge[E];
	static int[] d;
	static int INF = Integer.MAX_VALUE / 2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int k = 0;
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				edges[k++] = new Edge(i, j, Integer.parseInt(sc.next()));
		int[] ans = new int[10];
		for (int i = 0; i < 10; i++) {
			bellman_ford(i);
			ans[i] = d[1];
		}
		int sum = 0;
		for (int i = 0; i < h * w; i++) {
			int t = Integer.parseInt(sc.next());
			if (t != -1)
				sum += ans[t];
		}
		System.out.println(sum);
	}
	static void bellman_ford(int sv) {
		d = new int[V];
		Arrays.fill(d, INF);
		d[sv] = 0;
		while (true) {
			boolean update = false;
			for (int i = 0; i < E; i++) {
				int u = edges[i].from;
				int v = edges[i].to;
				int c = edges[i].cost;
				if (d[u] + c < d[v]) {
					d[v] = d[u] + c;
					update = true;
				}
			}
			if (!update) {
				break;
			}
		}
	}
}