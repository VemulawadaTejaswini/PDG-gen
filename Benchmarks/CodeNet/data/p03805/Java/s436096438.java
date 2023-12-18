import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int N, M;
	List<List<Integer>> g;
	boolean[] visited;

	boolean isEndNode(int n) { // いきどまり
		boolean result = true;
		for (int x : g.get(n)) {
			if (visited[x] == false) {
				result = false;
				break;
			}
		}
		return result;
	}

	boolean allVisited() {
		for (int i = 1; i < visited.length; i++) {
			if (visited[i] == false) {
				return false;
			}
		}
		return true;
	}

	//
	int bfs(int n) {
		if (isEndNode(n)) {
			visited[n] = true;
			try {
				if (allVisited()) {
					return 1;
				} else {
					return 0;
				}
			} finally {
				visited[n] = false;
			}
		}

		visited[n] = true;

		int ans = 0;
		for (int x : g.get(n)) {
			if (!visited[x]) {
				ans += bfs(x);
			}
		}

		visited[n] = false;

		return ans;

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		N = sc.nextInt();
		M = sc.nextInt();

		g = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			g.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			g.get(a).add(b);
			g.get(b).add(a);
		}

		sc.close();

		visited = new boolean[N + 1];

		out.println(bfs(1));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
