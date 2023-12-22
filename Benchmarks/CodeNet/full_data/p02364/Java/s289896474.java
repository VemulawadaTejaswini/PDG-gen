
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	@SuppressWarnings("unchecked")
	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		boolean[] s = new boolean[n];
		boolean[] g = new boolean[n];
		List<Edge>[] lists = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			lists[i] = new ArrayList<Edge>();
		}
		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			g[a] = true;
			s[b] = true;
			lists[a].add(new Edge(b, c));
		}
		int[] costs = new int[n];
		Arrays.fill(costs, 1 << 25);
		int ss = -1;
		int gg = -1;
		for (int i = 0; i < n; i++) {
			if (!s[i])
				ss = i;
			if (!g[i])
				gg = i;
		}
		costs[ss] = 0;
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		pq.offer(new Edge(ss, 0, 1));
		while (!pq.isEmpty()) {
			Edge edge = pq.poll();
			if (costs[edge.a] < edge.cost)
				continue;
			if(edge.a==gg){
				System.out.println(edge.count);
				break;
			}
			for (Edge e : lists[edge.a]) {
				if (costs[e.a] > edge.cost + e.cost) {
					costs[e.a] = edge.cost + e.cost;
					pq.offer(new Edge(e.a, costs[e.a], edge.count + 1));
				}
			}
		}
	}

	class Edge implements Comparable<Edge> {
		int a, cost;
		int count;

		public Edge(int a, int cost, int count) {
			super();
			this.a = a;
			this.cost = cost;
			this.count = count;
		}

		public Edge(int a, int cost) {
			super();
			this.a = a;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Edge [a=" + a + ", cost=" + cost + ", count=" + count + "]";
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}

	}
}