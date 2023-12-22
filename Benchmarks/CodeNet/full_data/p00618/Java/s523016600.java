
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			n = scanner.nextInt();
			u = scanner.nextInt();
			if ((n | u) == 0)
				break;
			need = new int[n];
			int all = 0;
			unit = new int[n];
			for (int i = 0; i < n; i++) {
				unit[i] = scanner.nextInt();
				all += unit[i];
				int k = scanner.nextInt();
				for (int j = 0; j < k; j++) {
					int x = scanner.nextInt();
					need[i] |= (1 << x);
				}
			}
			if (all == u) {
				System.out.println(n);
				continue;
			}
			v = new boolean[1 << n];
			PriorityQueue<Point> deque = new PriorityQueue<Point>();
			deque.offer(new Point(0, 0, 0));

			while (!deque.isEmpty()) {
				Point p = deque.poll();
				if (p.have >= u) {
					System.out.println(p.one);
					break;
				}
				for (int i = 0; i < n; i++) {
					int a = p.bit | (1 << i);
					if (v[a] || (a | need[i]) != a)
						continue;
					v[a] = true;
					deque.offer(new Point(a, p.one + 1, p.have + unit[i]));
				}
			}
		}
	}

	class Point implements Comparable<Point> {
		int bit, one, have;

		public Point(int bit, int one, int have) {
			super();
			this.bit = bit;
			this.one = one;
			this.have = have;
		}

		@Override
		public String toString() {
			return "Point [bit=" + bit + ", one=" + one + ", have=" + have
					+ "]";
		}

		@Override
		public int compareTo(Point o) {
			if (one == o.one)
				return o.have - have;
			return one - o.one;
		}

	}

	int n, u;
	int[] need, unit;
	int ans;
	boolean[] v;
}