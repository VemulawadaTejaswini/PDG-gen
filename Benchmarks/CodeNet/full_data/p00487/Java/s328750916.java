
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
		for (Pair p : pairs) {
			pq.offer(new Pair(p.s, p.f));
			sum += p.f;
			while (!pq.isEmpty()) {
				Pair pair = pq.peek();
				long a = pair.f * pq.size();
				if (a >= sum)
					break;
				sum -= pq.poll().s;
			}
			ret = Math.max(ret, pq.size());
		}
		System.out.println(ret);

	}

	class Pair implements Comparable<Pair> {
		long f, s;

		@Override
		public String toString() {
			return "Pair [f=" + f + ", s=" + s + "]";
		}

		public Pair(long f, long s) {
			super();
			this.f = f;
			this.s = s;
		}

		@Override
		public int compareTo(Pair o) {
			return (int) (f - o.f);
		}

	}
}