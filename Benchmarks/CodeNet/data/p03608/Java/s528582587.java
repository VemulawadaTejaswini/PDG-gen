import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static long dist[][];
	static int R;
	static boolean used[];
	static int r[];
	static long ans = Integer.MAX_VALUE;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		R = Integer.parseInt(str[2]);

		long edge[][] = new long[N][N];
		used = new boolean[N];

		r = new int[R];
		str = br.readLine().split(" ");
		for (int i = 0; i < R; i++) {
			r[i] = Integer.parseInt(str[i]) - 1;
		}

		for (int i = 0; i < M; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			int c = Integer.parseInt(str[2]);

			edge[a][b] = c;
			edge[b][a] = c;
		}
		dist = wf(edge, N);
		for (int i : r) {
			used[i] = true;
			dfs(i, 0, 1);
			used[i] = false;
		}
		System.out.println(ans);
	}

	static long[][] wf(long edge[][], int n) {
		long dp[][] = edge;

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
				}
			}
		}
		return dp;
	}

	static void dfs(int now, long cost, int depth) {
		if (depth == R) {
			ans = Math.min(ans, cost);
		} else {
			for (int i : r) {
				if (!used[i]) {
					used[i] = true;
					dfs(i, cost + dist[now][i], depth + 1);
					used[i] = false;
				}
			}
		}
	}
}

class Edge implements Comparable<Edge> {
	int to;
	int cost;

	public Edge(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}

	public int compareTo(Edge e) {
		return this.cost - e.cost;
	}
}