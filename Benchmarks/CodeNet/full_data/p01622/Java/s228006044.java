
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;	
	}

	void sortByAsc(int[] array, int[] array2) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(array, i, j);
					swap(array2, i, j);
				}
			}
		}
	}
	
	int calc(int[] write, int t) {
		boolean[] dp = new boolean[t+1];
		
		dp[0] = true;
		for (int i = 0; i < write.length - 1; i++) {
			for (int j = t; j - write[i] >= 0; j--) {
				if (dp[j-write[i]]) {
					dp[j] = true;
				}
			}
		}
		
		for (int i = t; i >= 0; i--) {
			if (dp[i]) return i;
		}
		
		return 0;
	}
	
	public void run() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			int[] readTime = new int[n], writeTime = new int[n];
			for (int i = 0; i < writeTime.length; i++) {
				readTime[i] = in.nextInt();
				writeTime[i] = in.nextInt();
			}
			
			sortByAsc(readTime, writeTime);
			
			int sumR = 0, sumW = 0;
			for (int i = 0; i < writeTime.length; i++) {
				sumR += readTime[i];
				sumW += writeTime[i];
			}
			
			int maxR = readTime[n-1];
			
			if (2 * maxR > sumR) {
				int preWrite = calc(writeTime, 2 * maxR - sumR);
				System.out.println(Math.max(sumR + sumW, maxR * 2 + sumW - preWrite));
			} else {
				System.out.println((sumR + sumW));
			}
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