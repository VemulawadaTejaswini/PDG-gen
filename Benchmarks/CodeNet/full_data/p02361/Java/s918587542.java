import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main{
	public static void main(String[] args){
		solve();
	}
	private static void solve() {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int r = sc.nextInt();
		int[][] cost = new int[V][V];
		for(int i=0;i<E;i++){
			cost[sc.nextInt()][sc.nextInt()] = sc.nextInt();
		}
		int n = cost.length;
		@SuppressWarnings("unchecked")
		List<Edge>[] edges = Stream.generate(ArrayList::new).limit(n).toArray(List[]::new);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (cost[i][j] != 0) {
					edges[i].add(new Edge(j, cost[i][j]));
				}
			}
		}
		int[] dist = new int[n];
		int[] pred = new int[n];
		shortestPaths(edges, r, dist, pred);
		for(int i=0;i<V;i++){
			if(dist[i]==Integer.MAX_VALUE){
				System.out.println("INF");
				continue;
			}
			System.out.println(dist[i]);
		}
	}
	public static void shortestPaths(List<Edge>[] edges, int s, int[] prio, int[] pred) {
		Arrays.fill(pred, -1);
		Arrays.fill(prio, Integer.MAX_VALUE);
		prio[s] = 0;
		PriorityQueue<Long> q = new PriorityQueue<>();
		q.add((long) s);
		while (!q.isEmpty()) {
			long cur = q.remove();
			int curu = (int) cur;
			if (cur >>> 32 != prio[curu])
				continue;
			for (Edge e : edges[curu]) {
				int v = e.t;
				int nprio = prio[curu] + e.cost;
				if (prio[v] > nprio) {
					prio[v] = nprio;
					pred[v] = curu;
					q.add(((long) nprio << 32) + v);
				}
			}
		}
	}

	static class Edge {
		int t;
		int cost;

		public Edge(int t, int cost) {
			this.t = t;
			this.cost = cost;
		}
	}

}