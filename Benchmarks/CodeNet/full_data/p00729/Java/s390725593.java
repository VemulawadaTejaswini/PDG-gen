import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	class Data {
		int student;
		int index;
		int[] in, out;
		int cnt;

		Data(int id, int pc, int r) {
			this.student = id;
			this.index = 0;
			this.in = new int[r];
			this.out = new int[r];
		}

		void login(int time) {
			if (cnt == 0) {
				this.in[this.index] = time;
			}
			cnt++;
		}

		void logout(int time) {
			cnt--;
			if (cnt == 0) {
				this.out[this.index] = time;
				this.index++;
			}
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0)
				break;
			int r = sc.nextInt();

			Data[] s = new Data[m];
			for (int i = 0; i < m; i++) {
				s[i] = new Data(i, n, r);
			}

			for (int i = 0; i < r; i++) {
				int time = sc.nextInt();
				int pc = sc.nextInt() - 1;
				int std = sc.nextInt() - 1;
				int flg = sc.nextInt();

				if (flg == 1) {
					s[std].login(time);
				} else {
					s[std].logout(time);
				}
			}

			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int k = sc.nextInt() - 1;

				int sum = 0;
				for (int j = 0; j < s[k].index; j++) {
					if (a <= s[k].out[j] && s[k].in[j] <= b) {
						sum += Math.max(0, Math.min(b, s[k].out[j]) - Math.max(a, s[k].in[j]));
					}
				}
				System.out.println(sum);
			}
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