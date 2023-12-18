import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class Edge {
		int from;
		int to;
		long cost;
		public Edge(int from, int to, long cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
	}
	static int V;
	static int E;
	static Edge[] edges;
	static long[] d;
	static long INF = Long.MAX_VALUE / 2;
	static void bellman_ford(int sv) {
		d = new long[V];
		Arrays.fill(d, INF);
		d[sv] = 0;
		while (true) {
			boolean update = false;
			for (int i = 0; i < E; i++) {
				int u = edges[i].from;
				int v = edges[i].to;
				long c = edges[i].cost;
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		V = Integer.parseInt(sc.next());
		E = (V - 1) * 2;
		edges = new Edge[E];
		for (int i = 0; i < V - 1; i++) {
			int a = Integer.parseInt(sc.next()) - 1;
			int b = Integer.parseInt(sc.next()) - 1;
			long c = Long.parseLong(sc.next());
			edges[i * 2] = new Edge(a, b, c);
			edges[i * 2 + 1] = new Edge(b, a, c);
		}
		int q = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next()) - 1;
		bellman_ford(k);
		for (int i = 0; i < q; i++)
			out.println(d[Integer.parseInt(sc.next()) - 1] + d[Integer.parseInt(sc.next()) - 1]);
		out.flush();
	}
}