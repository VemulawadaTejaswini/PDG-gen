import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	static int[] w;
	static int[] v;
	static int n;
	static int w_max;
	static int[][] dpv;
	static int[][] dpw;
	static boolean[][] flag;

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sn = new Scanner();
		int count = 0;
		while (true) {
			count += 1;
			w_max = sn.nextInt();
			if (w_max == 0) {
				break;
			}
			n = sn.nextInt();
			w = new int[n];
			v = new int[n];
			dpv = new int[1000][10000];
			dpw = new int[1000][10000];
			flag = new boolean[1000][10000];
			for (int i = 0; i < n; i++) {
				v[i] = sn.nextInt();
				w[i] = sn.nextInt();
			}
			int[] ans = rec(0, w_max);
			System.out.println("Case " + count + ":");
			System.out.println(ans[0]);
			System.out.println(ans[1]);
		}
	}

	public static int[] rec(int i, int j) {
		int[] res = new int[2];
		if (flag[i][j]) {
			res[0] = dpv[i][j];
			res[1] = dpw[i][j];
			return res;
		}
		if (i == n) {
			// ????????????????????£??????????????¨?????????????????????????????§??????0??§?¢????
			res[0] = 0;
			res[1] = 0;
		} else if (j < w[i]) {
			res = rec(i + 1, j);
		} else {
			int[] a = rec(i + 1, j);
			int[] b = rec(i + 1, j - w[i]);

			// res[0] = Math.max(a[0], b[0] + v[i]);
			if (a[0] > b[0] + v[i]) {
				res = a;
			} else if (a[0] < b[0] + v[i]) {
				res = b;
				res[0] += v[i];
				res[1] += w[i];
			} else if (a[0] == b[0] + v[i]) {
				if (a[1] < b[1] + w[i]) {
					res = a;
				} else {
					res = b;
					res[0] += v[i];
					res[1] += w[i];
				}
			}
		}
		flag[i][j] = true;
		dpv[i][j] = res[0];
		dpw[i][j] = res[1];
		return res;
	}
}

class Scanner {
	int read() {
		try {
			return System.in.read();
		} catch (IOException e) {
			throw new InputMismatchException();
		}
	}

	boolean space(int c) {
		if (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == ',') {
			return true;
		}
		return false;
	}

	String next() {
		int c = read();
		while (space(c)) {
			c = read();
		}
		StringBuilder s = new StringBuilder();
		while (!space(c)) {
			s.appendCodePoint(c);
			c = read();
		}
		return s.toString();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

}