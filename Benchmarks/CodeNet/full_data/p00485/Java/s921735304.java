
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		List<Pair>[] list = new List[n];
		for (int i = 0; i < n; i++)
			list[i] = new ArrayList<Pair>();
		while (m-- > 0) {
			int a = scanner.nextInt() - 1;
			int b = scanner.nextInt() - 1;
			int l = scanner.nextInt();
			list[a].add(new Pair(b, l));
			list[b].add(new Pair(a, l));
		}
		int[] dp = new int[n];
		Arrays.fill(dp, 1 << 25);
		PriorityQueue<Pair> pq = new PriorityQueue<Main.Pair>();
		for (int i = 0; i < k; i++) {
			int s = scanner.nextInt() - 1;
			dp[s] = 0;
			pq.offer(new Pair(0, s));
		}
		while (!pq.isEmpty()) {
			Pair pair = pq.poll();
			int f = pair.f;
			int s = pair.s;
			for (Pair p : list[s]) {
				if (dp[p.f] <= f + p.s)
					continue;
				dp[p.f] = f + p.s;
				pq.offer(new Pair(f + p.s, p.f));
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++)
			for (Pair p : list[i])
				ans = Math.max(
						ans,
						Math.max(dp[i], dp[p.f])
								+ (p.s - Math.abs(dp[i] - dp[p.f]) + 1) / 2);
		System.out.println(ans);
	}

	class Pair implements Comparable<Pair> {
		int f, s;

		public Pair(int f, int s) {
			super();
			this.f = f;
			this.s = s;
		}

		@Override
		public String toString() {
			return "Pair [f=" + f + ", s=" + s + "]";
		}

		@Override
		public int compareTo(Pair o) {
			return f - o.f;
		}

	}
}