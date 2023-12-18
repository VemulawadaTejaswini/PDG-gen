import java.io.*;
import java.util.*;

class Main {

	private static int[] color;
	private static int b = 0, w = 0;
	private static List<Integer>[] g;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		color = new int[N];
		g = new List[N];
		for (int i = 0; i < N; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			g[a].add(b);
			g[b].add(a);
		}

		if (dfs(0, 1)) {
			System.out.println((long) N * (N - 1) / 2 - M);
		} else {
			System.out.println((long) b * w - M);
		}
	}

	static private boolean dfs(int v, int c) {
		if (color[v] != 0) {
			if (color[v] != c) return true;
			return false;
		}
		color[v] = c;
		int nc = 0;
		if (c == 1) {
			nc = 2;
			w++;
		} else {
			nc = 1;
			b++;
		}
		for (int next : g[v]) {
			if (dfs(next, nc)) return true;
		}
		return false;
	}
}
