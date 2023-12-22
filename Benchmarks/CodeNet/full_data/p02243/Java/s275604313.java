import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
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

		long[] cost = new long[n];
		cost[0] = 0;
		for (int i = 1; i < n; i++) {
			cost[i] = Integer.MAX_VALUE;
		}
		boolean[] visited = new boolean[n];
		while (true) {
			int u = -1;
			for (int i = 0; i < n; i++) {
				if (!visited[i] && (u == -1 || cost[i] < cost[u])) {
					u = i;
				}
			}
			if (u == -1) {
				break;
			}
			visited[u] = true;

			for (int i = 0; i < n; i++) {
				cost[i] = Math.min(cost[i], cost[u] + G[u][i]);
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