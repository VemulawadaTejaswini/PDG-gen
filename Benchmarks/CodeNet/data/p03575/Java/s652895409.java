import java.util.Scanner;

public class Main {
	static boolean[][] graph;
	static int n;
	static int[] a, b;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		int m = sc.nextInt();

		graph = new boolean[n][n];
		a = new int[m];
		b = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;
		}

		int ans = 0;

		for (int i = 0; i < m; i++) {
			graph[a[i]][b[i]] = graph[b[i]][a[i]] = false;
			visited = new boolean[n];

			dfs(0);

			boolean bridge = false;
			for (int j = 0; j < n; j++) {
				if (!visited[j]) {
					bridge = true;
					break;
				}
			}
			if (bridge) {
				ans++;
			}
			graph[a[i]][b[i]] = graph[b[i]][a[i]] = true;
		}
		System.out.println(ans);

		sc.close();
	}

	static void dfs(int v) {
		visited[v] = true;
		for (int v2 = 0; v2 < n; v2++) {
			if (!graph[v][v2]) {
				continue;
			}
			if (visited[v2]) {
				continue;
			}
			dfs(v2);
		}
	}

}
