import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	char[] c;
	int id;

	String cip() {
		String res = str();
		while (id < c.length && c[id] != ']') {
			res += str();
		}
		return res;
	}

	String str() {
		String res = "";
		if (c[id] == '[') {
			id++;
			StringBuilder tmp = new StringBuilder(cip());
			res += tmp.reverse();
			id++;
		} else {
			res += let();
		}
		return res;
	}

	char let() {
		if (c[id] == '+') {
			id++;
			char res = let();
			if (res == '?') return res;
			res += 1;
			if ('Z' < res)
				res = 'A';
			return res;
		}
		if (c[id] == '-') {
			id++;
			char res = let();
			if (res == '?') return res;
			res -= 1;
			if (res < 'A')
				res = 'Z';
			return res;
		}
		if (c[id] == '?') {
			id++;
			return '?';
		}
		return c[id++];
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			c = sc.next().toCharArray();
			if (c[0] == '.') {
				break;
			}
			id = 0;
			char[] ans = cip().toCharArray();
			int n = ans.length;
			for (int i = 0; i < n; i++) {
				if (ans[i] == '?') {
					System.out.print("A");
				} else {
					System.out.print(ans[i]);
				}
			}
			System.out.println();
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