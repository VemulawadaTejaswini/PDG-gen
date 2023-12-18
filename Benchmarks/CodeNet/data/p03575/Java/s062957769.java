import java.util.*;

public class Main {

	private static boolean[][] g;
	private static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		g = new boolean[n][n];
		int[][] es = new int[m][2];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			es[i][0] = a;
			es[i][1] = b;
			g[a][b] = true;
			g[b][a] = true;
		}

		int answer = 0;
		visited = new boolean[n];
		for (int i = 0; i < m; i++) {
			g[es[i][0]][es[i][1]] = false;
			g[es[i][1]][es[i][0]] = false;
			Arrays.fill(visited, false);
			dfs(0);
			boolean isBridge = false;
			for (int v = 0; v < n; v++) {
				if (!visited[v]) {
					isBridge = true;
					break;
				}
			}
			if (isBridge) answer++;
			g[es[i][0]][es[i][1]] = true;
			g[es[i][1]][es[i][0]] = true;
		}

		System.out.println(answer);
	}

	private static void dfs(int v) {
		if (visited[v]) return;
		visited[v] = true;

		for (int i = 0; i < g[v].length; i++) {
			if (g[v][i]) {
				dfs(i);
			}
		}
	}
}
