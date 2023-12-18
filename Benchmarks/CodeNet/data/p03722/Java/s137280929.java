import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		V = n;
		E = m;
		edges = new Edge[E];
		for(int i = 0; i < E; i++) {
			edges[i] = new Edge();
			edges[i].from = sc.nextInt()-1;
			edges[i].to = sc.nextInt()-1;
			edges[i].cost = -sc.nextInt();
		}
		if(!BF(0)) {
			System.out.println("inf");
		} else {
			System.out.println(-d[V-1]);
		}
	}
	static int V; // 頂点の数=n
	static int E; // 辺の数=m
	static Edge[] edges;
	static long[] d;
	static long INF = Long.MAX_VALUE / 2;
	static class Edge {
		int from;
		int to;
		long cost;
	}
	static boolean BF(int sv) {
		d = new long[V];
		Arrays.fill(d, INF);
		d[sv] = 0;

		for(int count = 0; count < V; count++) {
			for(int i = 0; i < edges.length; i++) {
				int u = edges[i].from;
				int v = edges[i].to;
				long c = edges[i].cost;
				if(d[u] + c < d[v]) {
					d[v] = d[u] + c;
					if(count==V-1) {
						return false;
					}
				}
			}
		}
		return true;
	}
}