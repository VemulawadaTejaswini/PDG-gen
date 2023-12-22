
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
		int s = scanner.nextInt();
		List<Pair>[] lists = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			lists[i] = new ArrayList<Pair>();
		}
		for (int i = 0; i < m; i++) {
			int v = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			lists[v].add(new Pair(a, b));
		}
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		pq.add(new Pair(s, 0));
		int[] cost = new int[n];
		Arrays.fill(cost, Integer.MAX_VALUE);
		cost[s] = 0;
		while (!pq.isEmpty()) {
			Pair pair = pq.poll();
			if (cost[pair.a] < pair.b)
				continue;
			for (Pair p : lists[pair.a]) {
				if (cost[p.a] > pair.b + p.b) {
					cost[p.a] = pair.b + p.b;
					pq.offer(new Pair(p.a, cost[p.a]));
				}
			}

		}
		for (int a : cost) {
			if (a == Integer.MAX_VALUE )
				System.out.println("INF");
			else
				System.out.println(a);
		}

	}

	class Pair implements Comparable<Pair> {
		int a, b;

		public Pair(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}

		@Override
		public String toString() {
			return "Pair [a=" + a + ", b=" + b + "]";
		}

		@Override
		public int compareTo(Pair o) {
			return this.b - o.b;
		}

	}
}