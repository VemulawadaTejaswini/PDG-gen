import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	long start = System.currentTimeMillis();
	long fin = System.currentTimeMillis();
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	int[] p;

	void run() {
		int N = sc.nextInt();
		while (N-- > 0) {
			p = sc.nextIntArray(30);
			int cnt = 0;
			LinkedList<int[]> que = new LinkedList<int[]>();
			HashSet<String> set = new HashSet<String>();
			que.add(p);
			set.add(Arrays.toString(p));
			L: while (!que.isEmpty()) {
				int size = que.size();
				for (int i = 0; i < size; i++) {
					int[] now = que.poll();
					if (goal(now)) {
						break L;
					}
					int[] next1 = new int[30];
					int[] next2 = new int[30];
					int[] next3 = new int[30];
					int[] next4 = new int[30];
					for (int j = 0; j < 30; j++) {
						next1[j] = now[j];
						next2[j] = now[j];
						next3[j] = now[j];
						next4[j] = now[j];
					}
					swap(next1, 6, 21);
					swap(next1, 7, 22);
					swap(next1, 8, 23);
					swap(next1, 12, 17);
					swap(next1, 9, 11);
					swap(next2, 0, 27);
					swap(next2, 1, 28);
					swap(next2, 2, 29);
					swap(next2, 14, 15);
					swap(next2, 18, 20);
					swap(next3, 0, 23);
					swap(next3, 3, 26);
					swap(next3, 6, 29);
					swap(next3, 9, 20);
					swap(next3, 15, 17);
					swap(next4, 2, 21);
					swap(next4, 5, 24);
					swap(next4, 8, 27);
					swap(next4, 11, 18);
					swap(next4, 12, 14);
					if (!set.contains(Arrays.toString(next1))) {
						set.add(Arrays.toString(next1));
						que.add(next1);
					}
					if (!set.contains(Arrays.toString(next2))) {
						set.add(Arrays.toString(next2));
						que.add(next2);
					}
					if (!set.contains(Arrays.toString(next3))) {
						set.add(Arrays.toString(next3));
						que.add(next3);

					}
					if (!set.contains(Arrays.toString(next4))) {
						set.add(Arrays.toString(next4));
						que.add(next4);
					}
				}
				cnt++;
			}
			System.out.println(cnt);
		}
	}

	boolean goal(int p[]) {
		for (int i = 0; i < 8; i++) {
			if (p[i] != p[i + 1])
				return false;
		}
		for (int i = 9; i < 11; i++) {
			if (p[i] != p[i + 1])
				return false;
		}
		for (int i = 12; i < 14; i++) {
			if (p[i] != p[i + 1])
				return false;
		}
		for (int i = 15; i < 17; i++) {
			if (p[i] != p[i + 1])
				return false;
		}
		for (int i = 18; i < 20; i++) {
			if (p[i] != p[i + 1])
				return false;
		}
		for (int i = 21; i < 29; i++) {
			if (p[i] != p[i + 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
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