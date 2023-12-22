import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<ArrayList<Integer>> g;
	static int ans;

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			g = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < 100; ++i) {
				g.add(new ArrayList<Integer>());
			}
			ans = 0;
			for (int i = 0; i < N; ++i) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				g.get(a).add(b);
				g.get(b).add(a);
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
		for (int n : g.get(pos)) {
			if (!visited[n]) {
				visited[n] = true;
				dfs(n, visited, len + 1);
				visited[n] = false;
			}
		}
		ans = Math.max(ans, len);
	}

}