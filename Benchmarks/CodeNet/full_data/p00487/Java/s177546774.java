
import java.io.IOException;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Pair[] pairs = new Pair[n];
		for (int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			pairs[i] = new Pair(a, b);
		}
		Arrays.sort(pairs);
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		long sum = 0;
		long ret = 0;
		for (int i = 0; i < n; i++) {
			pq.offer(new Pair(pairs[i].s, pairs[i].f));
			sum += pairs[i].f;
			while (!pq.isEmpty()) {
				Pair p = pq.peek();
				long a = p.f * pq.size();
				if (a >= sum)
					break;
				sum -= pq.poll().s;
			}
			ret = Math.max(ret, pq.size());
		}
		System.out.println(ret);

	}

	class Pair implements Comparable<Pair> {
		int f, s;

		@Override
		public String toString() {
			return "Pair [f=" + f + ", s=" + s + "]";
		}

		public Pair(int f, int s) {
			super();
			this.f = f;
			this.s = s;
		}

		@Override
		public int compareTo(Pair o) {
			return f - o.f;
		}

	}
}