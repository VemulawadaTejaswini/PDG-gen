
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		StringBuilder ret = new StringBuilder();
		while (true) {
			n = scanner.nextInt();
			int m = scanner.nextInt();
			int s = scanner.nextInt();
			int g1 = scanner.nextInt();
			int g2 = scanner.nextInt();
			if ((n | m | s | g1 | g2) == 0)
				break;
			s--;
			g1--;
			g2--;
			int[][] smap = new int[n][n];
			int[][] gmap = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++) {
					smap[i][j] = gmap[i][j] = i == j ? 0 : INF;

				}

			while (m-- > 0) {
				int b1 = scanner.nextInt() - 1;
				int b2 = scanner.nextInt() - 1;
				int c = scanner.nextInt();
				smap[b1][b2] = gmap[b2][b1] = c;
			}
			int[] acost = slove(s, smap);
			int[] bcost = slove(g1, gmap);
			int[] ccost = slove(g2, gmap);

			int ans = INF;
			for (int i = 0; i < n; i++)
				ans = Math.min(ans, acost[i] + bcost[i] + ccost[i]);
			ret.append(ans).append('\n');
		}
		System.out.print(ret);
	}

	private int[] slove(int s, int[][] map) {
		PriorityQueue<Pair> pq = new PriorityQueue<Main.Pair>();
		pq.offer(new Pair(s, 0));
		int[] dp = new int[n];
		Arrays.fill(dp, INF);
		dp[s] = 0;
		while (!pq.isEmpty()) {
			Pair p = pq.poll();
			if (dp[p.d] < p.cost)
				continue;
			for (int i = 0; i < n; i++) {
				int ncost = p.cost + map[p.d][i];
				if (dp[i] <= ncost)
					continue;
				dp[i] = ncost;
				pq.offer(new Pair(i, ncost));
			}
		}
		return dp;
	}

	int INF = 1 << 29;
	int n;

	class Pair implements Comparable<Pair> {
		int d, cost;

		public Pair(int d, int cost) {
			super();
			this.d = d;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return "Pair [d=" + d + ", cost=" + cost + "]";
		}

		@Override
		public int compareTo(Pair o) {
			return cost - o.cost;
		}

	}
}