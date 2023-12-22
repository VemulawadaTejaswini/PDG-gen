 
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int x = scanner.nextInt();
			int n = scanner.nextInt();
			int e = scanner.nextInt();
			if ((x | n | e) == 0)
				break;
			int[] v = new int[x];
			for (int i = 0; i < x; i++) {
				v[i] = scanner.nextInt();
			}
			int[][] ev = new int[n + 1][2];
			while (e-- > 0) {
				int p = scanner.nextInt();
				int k = scanner.nextInt();
				int val = scanner.nextInt();
				ev[p][0] = k;
				ev[p][1] = val;
			}
			Deque<Pair> deque = new ArrayDeque<Main.Pair>();
			deque.add(new Pair(1.0, 0, 0, 0));
			double ans = 0;
			while (!deque.isEmpty()) {
				Pair pair = deque.poll();
				if (pair.masu == n) {
					ans += pair.c * pair.p ;
					continue;
				}
				for (int i = 0; i < x; i++) {
					int nm = Math.min(n, v[i] + pair.masu);
					int c = pair.c;
					if (ev[nm][0] == 1)
						nm = Math.min(n, nm + ev[nm][1]);
					else if (ev[nm][0] == 2)
						c += ev[nm][1];
					else if (ev[nm][0] == 3)
						c = Math.max(0, c - ev[nm][1]);
					deque.offer(new Pair(pair.p / x, c, nm, 0));
				}
			}
			System.out.println((int) ans);
		}
	}

	class Pair {
		double p;
		int c;
		int masu;
		int count;

		public Pair(double p, int c, int masu, int count) {
			super();
			this.p = p;
			this.c = c;
			this.masu = masu;
			this.count = count;
		}

		@Override
		public String toString() {
			return "Pair [p=" + p + ", c=" + c + ", masu=" + masu + ", count="
					+ count + "]";
		}

	}
}