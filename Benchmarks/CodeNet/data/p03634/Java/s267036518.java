import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);

		long edge[][] = new long[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(edge[i], Long.MAX_VALUE);
		}

		for (int i = 0; i < n - 1; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) - 1;
			int b = Integer.parseInt(str[1]) - 1;
			int c = Integer.parseInt(str[2]);

			edge[a][b] = c;
			edge[b][a] = c;
		}

		str = br.readLine().split(" ");
		int q = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]) - 1;

		long dp[][] = wf(edge, n);

		for (int i = 0; i < q; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]) - 1;
			int y = Integer.parseInt(str[1]) - 1;

			System.out.println(dp[x][k] + dp[k][y]);
		}
	}

	static long[][] wf(long edge[][], int n) {
		long dp[][] = edge;

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				if (dp[i][k] == Long.MAX_VALUE)
					continue;
				for (int j = 0; j < n; j++) {
					if (dp[k][j] == Long.MAX_VALUE)
						continue;
					dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
				}
			}
		}
		return dp;
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