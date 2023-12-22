import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

public class Main {
	List<Integer>[] e;
	int[][] cost;
	int[] dist;
	int[][] color;
	int s, t;

	void dfs(int root, int pre, int dep) {
		dist[root] = dep;

		for (int to : e[root]) {
			if (to == pre) {
				continue;
			}
			dfs(to, root, dep + cost[root][to]);
		}
	}

	boolean dfs(int root, int pre) {
		if (root == t) {
			return true;
		}
		for (int to : e[root]) {
			if (to == pre) {
				continue;
			}
			color[root][to] = color[to][root] = 1;
			if (dfs(to, root)) {
				return true;
			}
			color[root][to] = color[to][root] = 0;
		}
		return false;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			e = new LinkedList[n];
			for (int i = 0; i < n; i++) {
				e[i] = new LinkedList<Integer>();
			}
			cost = new int[n][n];
			int[] a = sc.nextIntArray(n - 1);
			int[] b = sc.nextIntArray(n - 1);
			for (int i = 0; i < n - 1; i++) {
				int s = i + 1;
				int t = a[i] - 1;
				int c = b[i];
				e[s].add(t);
				e[t].add(s);
				cost[s][t] = cost[t][s] = c;
			}
			s = t = 0;
			dist = new int[n];
			dfs(0, -1, 0);
			for (int i = 0; i < n; i++) {
				if (dist[s] < dist[i]) {
					s = i;
				}
			}
			dist = new int[n];
			dfs(s, -1, 0);
			for (int i = 0; i < n; i++) {
				if (dist[t] < dist[i]) {
					t = i;
				}
			}

			color = new int[n][n];
			dfs(s, -1);
			int sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (cost[i][j] == 0) {
						continue;
					}
					if (e[i].size() == 1 || e[j].size() == 1) {
						sum += cost[i][j];
					} else if (color[i][j] == 1) {
						sum += cost[i][j] * 2;
					} else {
						sum += cost[i][j] * 3;
					}
				}
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}