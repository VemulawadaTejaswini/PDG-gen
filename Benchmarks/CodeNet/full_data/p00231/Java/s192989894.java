
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			PriorityQueue<P> pq = new PriorityQueue<P>();
			for (int i = 0; i < n; i++) {
				int m = scanner.nextInt();
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				pq.offer(new P(m, a, b));
			}
			String ans = "OK";
			Deque<P> deque = new ArrayDeque<Main.P>();
			while (!pq.isEmpty()) {
				P p = pq.poll();
				int size = deque.size();
				while (size-- > 0) {
					P oldP = deque.poll();
					if (p.a < oldP.b)
						deque.offer(oldP);
				}
				deque.push(p);
				int sum = 0;
				for (P newp : deque) {
					sum += newp.m;
				}
				if (sum > 150) {
					ans = "NG";
					break;
				}
			}
			System.out.println(ans);
		}
	}

	class P implements Comparable<P> {
		int m, a, b;

		public P(int m, int a, int b) {
			super();
			this.m = m;
			this.a = a;
			this.b = b;
		}

		@Override
		public String toString() {
			return "P [m=" + m + ", a=" + a + ", b=" + b + "]";
		}

		@Override
		public int compareTo(P o) {
			return this.a - o.a;
		}

	}
}