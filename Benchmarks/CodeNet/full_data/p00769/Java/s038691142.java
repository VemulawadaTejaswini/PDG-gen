import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Main {
	char[] c;
	int id;

	int exp() {
		if ('0' <= c[id] && c[id] <= '9') {
			return num();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		id++;
		while (c[id] != ']') {
			if (c[id] == '[') {
				list.add(exp());
			} else {
				list.add(num());
			}
		}
		id++;
		int count = list.size() + 1;
		count /= 2;
		Collections.sort(list);
		int res = 0;
		for (Integer I: list) {
			res += I;
			count--;
			if (count == 0) {
				break;
			}
		}
		return res;
	}

	int num() {
		int res = 0;
		while ('0' <= c[id] && c[id] <= '9') {
			res *= 10;
			res += c[id] - '0';
			id++;
		}
		res += 1;
		res /= 2;
//		System.out.println(res);
		return res;
	}

	void run() {
		MyScanner sc = new MyScanner();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			c = sc.next().toCharArray();
			id = 0;
			System.out.println(exp());
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