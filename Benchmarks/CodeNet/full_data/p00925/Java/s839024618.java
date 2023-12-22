import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		String in = sc.next();
		int ans = sc.nextInt();

		int sum1 = in.charAt(0) - '0';
		for (int i = 1; i < in.length(); i++) {
			char c = in.charAt(i);
			if (Character.isDigit(c)) {
				if (in.charAt(i - 1) == '+') {
					sum1 += c - '0';
				} else {
					sum1 *= c - '0';
				}
			}
		}
		int sum2 = expression(in);
		
		if(ans == sum1 && ans == sum2) {
			System.out.println("U");
		} else if(ans == sum1 && ans != sum2) {
			System.out.println("L");
		} else if(ans != sum1 && ans == sum2) {
			System.out.println("M");
		} else {
			System.out.println("I");
		}
	}

	int index = 0;

	int expression(String sb) {
		int res = term(sb);
		for (; index < sb.length();) {
			if (sb.charAt(index) == '+') {
				index++;
				res += term(sb);
			} else if (sb.charAt(index) == '-') {
				index++;
				res -= term(sb);
			} else {
				break;
			}
		}
		return res;
	}

	int term(String sb) {
		int res = factor(sb);
		for (; index < sb.length();) {
			if (sb.charAt(index) == '*') {
				index++;
				res *= factor(sb);
			} else if (sb.charAt(index) == '/') {
				index++;
				res /= factor(sb);
			} else {
				break;
			}
		}
		return res;
	}

	int factor(String sb) {
		int res = 0;
		if (index < sb.length() && sb.charAt(index) == '(') {
			index++;
			res = expression(sb);
			index++;
		} else {
			res = number(sb);
		}
		return res;
	}

	int number(String sb) {
		int res = 0;
		while (index < sb.length() && Character.isDigit(sb.charAt(index))) {
			res *= 10;
			res += sb.charAt(index) - '0';
			index++;
		}
		return res;
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int lim) {
		return 0 <= h && h < lim && 0 <= w && w < lim;
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
	}
}