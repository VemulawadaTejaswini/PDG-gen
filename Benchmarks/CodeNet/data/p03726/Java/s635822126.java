import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N - 1];
		int[] b = new int[N - 1];
		ArrayList<Integer>[] g = new ArrayList[N];
		for (int i = 0; i < N; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < N - 1; ++i) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			--a[i];
			--b[i];
			g[a[i]].add(b[i]);
			g[b[i]].add(a[i]);
		}
		solve(N, a, b, g);
	}

	void solve(int N, int[] a, int[] b, ArrayList<Integer>[] g) {
		dfs(0, -1, g);
		System.out.println("Second");
	}

	boolean[] dfs(int cur, int par, ArrayList<Integer>[] g) {
		boolean[] ret = new boolean[2];
		if (g[cur].size() == 1) {
			ret[0] = true;
		}
		for (int dst : g[cur]) {
			if (dst == par)
				continue;
			boolean[] tmp = dfs(dst, cur, g);
			for (int i = 0; i < 2; ++i) {
				if (g[cur].size() <= 2 && ret[i] && tmp[(i + 1) % 2]) {
					System.out.println("First");
					System.exit(0);
				}
			}
			for (int i = 0; i < 2; ++i) {
				ret[(i + 1) % 2] |= tmp[i];
			}
		}
		return ret;
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
