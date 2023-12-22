
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	@SuppressWarnings("unchecked")
	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] c = new int[n];
		int[] r = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = scanner.nextInt();
			r[i] = scanner.nextInt();
		}
		List<Integer>[] lists = new List[n];
		for (int i = 0; i < n; i++)
			lists[i] = new ArrayList<Integer>();
		for (int i = 0; i < k; i++) {
			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt() - 1;
			lists[a].add(b);
			lists[b].add(a);
		}
		PriorityQueue<Point> pq = new PriorityQueue<Point>();
		pq.offer(new Point(0, 0, 0));
		boolean[][] v = new boolean[n][n];
		while (!pq.isEmpty()) {
			Point p = pq.poll();
			if (p.b == n - 1) {
				System.out.println(p.cost);
				return;
			}
			if (v[p.a][p.b])
				continue;
			v[p.a][p.b] = true;

			pq.offer(new Point(p.cost + c[p.b], r[p.b], p.b));
			if (p.a > 0)
				for (int x : lists[p.b]) {
					pq.offer(new Point(p.cost, p.a - 1, x));

				}

		}
	}

	class Point implements Comparable<Point> {
		int cost, a, b;

		@Override
		public String toString() {
			return "Point [cost=" + cost + ", a=" + a + ", b=" + b + "]";
		}

		public Point(int cost, int a, int b) {
			super();
			this.cost = cost;
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Point o) {
			return cost - o.cost;
		}

	}
}