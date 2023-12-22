import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	char[][] f;
	boolean[][] visit;
	int H, W;

	void run() {
		for (;;) {
			H = sc.nextInt();
			W = sc.nextInt();
			if ((H | W) == 0) {
				return;
			}
			f = new char[H][W];
			visit = new boolean[H][W];
			for (int i = 0; i < H; i++) {
				String in = sc.next();
				for (int j = 0; j < W; j++) {
					f[i][j] = in.charAt(j);

				}
			}
			boolean one = true;
			char pre;
			pre = f[0][0];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (pre != f[i][j]) {
						one = false;
					}
					pre = f[i][j];
				}
			}
			if (one) {
				System.out.println(1);
				continue;
			}

			int cnt = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (!visit[i][j]) {
						dfs(i, j, f[i][j]);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	void dfs(int h, int w, char ob) {
		visit[h][w] = true;
		for (int i = 0; i < 4; i++) {
			int nextH = h + dy[i];
			int nextW = w + dx[i];
			if (inner(nextH, nextW, H, W)) {
				if (!visit[nextH][nextW] && f[nextH][nextW] == ob) {
					dfs(nextH, nextW, ob);
				}
			}
		}
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
	}
}