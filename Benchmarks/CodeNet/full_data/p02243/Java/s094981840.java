import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	private static class Edge implements Comparable<Edge> {
		int cost = Integer.MAX_VALUE;
		int from;

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[][] G = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				G[i][j] = Integer.MAX_VALUE;
			}
			G[i][i] = 0;
		}
		for (int i = 0; i < n; i++) {
			String line = br.readLine().trim();
			String[] nums = line.split(" ");
			int k = Integer.parseInt(nums[1]);
			for (int j = 0; j < k; j++) {
				int adj = Integer.parseInt(nums[2 + j * 2]);
				int cost = Integer.parseInt(nums[2 + j * 2 + 1]);
				G[i][adj] = cost;
			}
		}

		PriorityQueue<Edge> q = new PriorityQueue<Edge>();
		long[] cost = new long[n];
		cost[0] = 0;
		for (int i = 1; i < n; i++) {
			cost[i] = Integer.MAX_VALUE;
		}
		Edge s = new Edge();
		s.cost = 0;
		s.from = 0;
		q.offer(s);

		while (!q.isEmpty()) {
			Edge e = q.poll();
			int v = e.from;
			if (cost[v] < e.cost) {
				continue;
			}

			for (int i = 0; i < n; i++) {
				if (cost[i] > cost[v] + G[v][i]) {
					cost[i] = cost[v] + G[v][i];
					Edge to = new Edge();
					to.cost = (int) cost[i];
					to.from = i;
					q.offer(to);
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(i + " " + cost[i]);
		}

		if (br != null) {
			br.close();
			br = null;
		}
	}
}