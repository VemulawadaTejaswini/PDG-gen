import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static PrintWriter out;

	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		out = new PrintWriter(System.out);
		int A = 0, B = 1;
		sum(A, B, ONE);
		positive(ONE);

		int fromA = 5;
		int fromB = SIZE + fromA;
		getBin(fromA, SIZE, A);
		getBin(fromB, SIZE, B);
		int fromRes = fromB + SIZE;
		int tmp = fromRes + 2 * SIZE;
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				and(fromA + i, fromB + j, tmp);
				sum(fromRes + i + j, tmp, fromRes + i + j);
			}
		}
		for (int i = 0; i < 2 * SIZE - 1; i++) {
			makePot(fromRes + i, i);
			sum(fromRes + i, TARGET, TARGET);
		}

		out.flush();
	}

	static int SIZE = 30;
	static int ZERO = 3;
	static int ONE = 4;
	static int TARGET = 2;

	static void getBin(int from, int size, int val) {
		sum(from, ONE, from);
		for (int i = 1; i < size; i++) {
			sum(from + i - 1, from + i - 1, from + i);
		}
		for (int i = size - 1; i >= 0; i--) {
			compEquals(from + i, val, from + i);
			makePot(from + i, i);
			for (int j = 0; j < i; j++) {
				sum(from + i, from + j, from + j);
			}
		}
		for (int i = 0; i < size; i++) {
			positive(from + i);
		}
	}
	static void positive(int val) {
		cmp(ZERO, val, val);
	}

	static void compEquals(int i, int j, int to) {
		cmp(j, i, to);
		cmp(to, ONE, to);
	}

	static void makePot(int val, int exp) {
		for (int i = 0; i < exp; i++) {
			sum(val, val, val);
		}
	}

	static void and(int i, int j, int to) {
		sum(i, j, to);
		cmp(ONE, to, to);
	}

	static void sum(int i, int j, int to) {
		out.println("+ " + i + " " + j + " " + to);
	}
	
	static void cmp(int i, int j, int to) {
		out.println("< " + i + " " + j + " " + to);
	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
