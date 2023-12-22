import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static boolean[][] g;
	static int ans;

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			g = new boolean[100][100];
			ans = 0;
			for (int i = 0; i < N; ++i) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				g[a][b] = g[b][a] = true;
			}
			boolean[] visited = new boolean[100];
			for (int i = 0; i < N; ++i) {
				visited[i] = true;
				dfs(i, visited, 1);
				visited[i] = false;
			}
			System.out.println(ans);
		}
	}

	static void dfs(int pos, boolean[] visited, int len) {
		for (int i = 0; i < 100; ++i) {
			if (g[pos][i] && !visited[i]) {
				visited[i] = true;
				dfs(i, visited, len + 1);
				visited[i] = false;
			}
		}
		ans = Math.max(ans, len);
	}

}