import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	int N;
	int M;
	int[] a;
	int[] b;
	ArrayList<Integer>[] g;
	boolean[][] go;
	int[][] ref;

	void dfs(int cur, int ori) {
		go[ori][cur] = true;
		for (int dst : g[cur]) {
			if (!go[ori][dst])
				dfs(dst, ori);
		}
	}

	void paint_min(int cur, int ori, int col, int[] min) {
		if (min[cur] > col)
			min[cur] = col;
		else
			return;
		for (int dst : g[cur]) {
			if (dst == ori)
				continue;
			paint_min(dst, ori, col, min);
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		a = new int[M];
		b = new int[M];
		g = new ArrayList[N];
		ref = new int[N][N];
		for (int i = 0; i < N; ++i)
			for (int j = 0; j < N; ++j)
				ref[i][j] = -1;
		for (int i = 0; i < N; ++i)
			g[i] = new ArrayList<>();
		//N<=10^3
		//M<=2*10^5
		for (int i = 0; i < M; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			--a[i];
			--b[i];
			g[a[i]].add(b[i]);
			ref[a[i]][b[i]] = i;
		}
		go = new boolean[N][N];
		for (int i = 0; i < N; ++i)
			dfs(i, i);
		boolean[][] go2 = new boolean[N][N];
		for (int i = 0; i < N; ++i) {
			int[] a = new int[N];
			Arrays.fill(a, g[i].size());
			for (int j = 0; j < g[i].size(); ++j) {
				paint_min(g[i].get(j), i, j, a);
			}
			for (int j = 0; j < g[i].size(); ++j) {
				if (a[g[i].get(j)] != j) {
					go2[i][g[i].get(j)] = true;
				}
			}
			Arrays.fill(a, g[i].size());
			for (int j = g[i].size() - 1; j >= 0; --j) {
				paint_min(g[i].get(j), i, g[i].size() - 1 - j, a);
			}
			for (int j = g[i].size() - 1; j >= 0; --j) {
				if (a[g[i].get(j)] != g[i].size() - 1 - j) {
					go2[i][g[i].get(j)] = true;
				}
			}
		}
		for (int i = 0; i < M; ++i) {
			if (!go[b[i]][a[i]] && !go2[a[i]][b[i]]) {
				System.out.println("same");
			} else if (go[b[i]][a[i]] && go2[a[i]][b[i]]) {
				System.out.println("same");
			} else {
				System.out.println("diff");
			}
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
