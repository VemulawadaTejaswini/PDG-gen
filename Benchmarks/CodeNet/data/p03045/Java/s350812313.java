
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	List<Integer>[] g;
	boolean[] seen;

	void dfs(int u) {
		seen[u] = true;
		for (int v : g[u]) {
			if (seen[v])
				continue;
			dfs(v);
		}
	}

	void solve(Scanner in, PrintWriter out) {
		int n = in.nextInt(), m = in.nextInt();
		g = new ArrayList[n + 1];
		seen = new boolean[n + 1];
		for (int i = 0; i <= n; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; ++i) {
			int u = in.nextInt(), v = in.nextInt(), c = in.nextInt();
			g[u].add(v);
			g[v].add(u);
		}
		int ans = 0;
		for (int i = 1; i <= n; ++i) {
			if (!seen[i]) {
				dfs(i);
				++ans;
			}
		}
		out.println(ans);
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			new Main().solve(in, out);
		}
	}
}
