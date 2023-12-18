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
		if (m != 0) {
			out.println(-1);
			return;
		}
		for (int i = 0; i <= (1 << m); ++i) {
			if (i > 0)
				out.print(" ");
			out.print(i + " " + i);
		}
		out.println();
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
			new Main().solve(in, out);
		}
	}
}
