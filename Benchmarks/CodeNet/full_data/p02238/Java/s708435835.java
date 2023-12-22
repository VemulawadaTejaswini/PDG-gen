
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	boolean[][] M;
	int n;
	boolean color[];
	int d[];
	int f[];

	private void run() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		M = new boolean[n][n];
		color =new boolean[n];
		d = new int[n];
		f = new int[n];
		for (int i = 0; i < n; i++) {
			int u = scanner.nextInt();
			int k = scanner.nextInt();
			u--;
			for (int j = 0; j < k; j++) {
				int v = scanner.nextInt();
				v--;
				M[u][v] = true;
			}
		}
		dfs();
	}

	private void dfs() {
		for (int u = 0; u < n; u++) {
			if (!color[u])
				dfs_visit(u);
		}
		for (int u = 0; u < n; u++) {
			System.out.printf("%d %d %d\n", u + 1, d[u], f[u]);
		}
	}

	int tt = 1;

	private void dfs_visit(int u) {
		color[u] = true;
		d[u] = tt++;
		for (int v = 0; v < n; v++) {
			if (!M[u][v])
				continue;
			if (!color[v]) {
				dfs_visit(v);
			}
		}
		f[u] = tt++;
	}
}