import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	long start = System.currentTimeMillis();
	long fin = System.currentTimeMillis();
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	int N, M;
	int[] indeg;
	ArrayList<Integer>[] G;
	ArrayList<Integer> res;
	boolean[] V;
	boolean multi;

	@SuppressWarnings("unchecked")
	void run() {
		N = sc.nextInt();
		M = sc.nextInt();
		indeg = new int[N];
		G = new ArrayList[N];
		res = new ArrayList<Integer>();
		V = new boolean[N];
		multi = false;
		for (int i = 0; i < N; i++) G[i] = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			int v = sc.nextInt() - 1;
			int u = sc.nextInt() - 1;
			G[u].add(v);
			indeg[v]++;
		}
		int cnt = 0;
		for (int i = 0; i < N; i++) if (indeg[i] == 0) cnt++;
		if (cnt > 1) multi = true;
		topologicalSort();
		StringBuilder o = new StringBuilder();
		for (int i = N - 1; i >= 0; i--) o.append(res.get(i) + "\n");
		System.out.print(o);
		System.out.println(multi ? 1 : 0);
	}

	void topologicalSort() {
		for (int u = 0; u < N; u++) {
			if (indeg[u] == 0 && !V[u]) {
				bfs(u);
			}
		}
	}

	void bfs(int s) {
		V[s] = true;
		LinkedList<Integer> que = new LinkedList<Integer>();
		que.add(s);
		while (!que.isEmpty()) {
			int u = que.poll();
			res.add(u + 1);
			int cnt = 0;
			for (int i = 0; i < G[u].size(); i++) {
				int v = G[u].get(i);
				indeg[v]--;
				if (indeg[v] == 0 && !V[v]) {
					cnt++;
					que.add(v);
					V[v] = true;
				}
			}
			if (cnt > 1) multi = true;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(long[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int limH, int limW) {
		return 0 <= h && h < limH && 0 <= w && w < limW;
	}

	void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

	// find minimum i (a[i] >= border)
	int lower_bound(int a[], int border) {
		int l = -1;
		int r = a.length;
		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (border <= a[mid]) {
				r = mid;
			} else {
				l = mid;
			}
		}
		// r = l + 1
		return r;
	}

	boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}

		int[] nextIntArray(int n) {
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextInt();
			}
			return in;
		}

		int[][] nextInt2dArray(int n, int m) {
			int[][] in = new int[n][m];
			for (int i = 0; i < n; i++) {
				in[i] = nextIntArray(m);
			}
			return in;
		}

		double[] nextDoubleArray(int n) {
			double[] in = new double[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextDouble();
			}
			return in;
		}

		long[] nextLongArray(int n) {
			long[] in = new long[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextLong();
			}
			return in;
		}

		char[][] nextCharField(int n, int m) {
			char[][] in = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					in[i][j] = s.charAt(j);
				}
			}
			return in;
		}
	}
}