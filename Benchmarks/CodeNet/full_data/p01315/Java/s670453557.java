
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	void swap(String[] array, int i, int j) {
		String temp = array[i].toString();
		array[i] = array[j].toString();
		array[j] = temp.toString();	
	}
	
	void swap(double[] array, int i, int j) {
		double temp = array[i];
		array[i] = array[j];
		array[j] = temp;	
	}
	
	void sortByDesc(double[] array, String[] array2) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] < array[j] || (array[i] == array[j] && array2[i].compareTo(array2[j]) > 0)) {
					swap(array, i, j);
					swap(array2, i, j);
				}
			}
		}
	}
	
	public void run() {
		while (true) {
			int N = in.nextInt();
			if (N == 0) break;
			
			String[] L = new String[N];
			int[] P = new int[N];
			int[] ABC = new int[N];
			int[] DE = new int[N];
			int[] F = new int[N];
			int[] S = new int[N];
			int[] M = new int[N];
			
			double[] price = new double[N];
			
			for (int i = 0; i < N; i++) {
				L[i] = in.next();
				P[i] = in.nextInt();
				ABC[i] = in.nextInt() + in.nextInt() + in.nextInt();
				DE[i] = in.nextInt() + in.nextInt();
				F[i] = in.nextInt();
				S[i] = in.nextInt();
				M[i] = in.nextInt();
				
				int time = ABC[i] + DE[i] * M[i];
				price[i] = S[i] * F[i] * M[i] - P[i];
				price[i] /= time;
			}
			
			sortByDesc(price, L);
			for (int i = 0; i < N; i++) {
				System.out.println(L[i]);
			}
			System.out.println("#");
		}
		out.close();
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

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
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

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
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