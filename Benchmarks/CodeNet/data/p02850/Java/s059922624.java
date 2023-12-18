import java.util.*;

public class Main {

	private static boolean[] visited;
	private static List<int[]>[] g;
	private static int[] answer;
	private static int k;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		k = 0;
		answer = new int[n - 1];

		g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g[a].add(new int[]{b, i});
			g[b].add(new int[]{a, i});
		}

		visited = new boolean[n];
		Arrays.fill(visited, false);

		for (int i = 0; i < n; i++) {
			if (!visited[i]) dfs(i, -1, 0);
		}

		System.out.println(k);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	private static void dfs(int x, int p, int c) {
		if (visited[x]) return;
		visited[x] = true;

		int n = g[x].size();
		k = Math.max(k, n);

		int color = 1;

		for (int i = 0; i < n; i++) {
			if (visited[g[x].get(i)[0]]) continue;
			if (color == c) color++;
			answer[g[x].get(i)[1]] = color;
			dfs(g[x].get(i)[0], x, color);
			color++;
		}
	}
}
