
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	int at = 0;
	String next = null;
	boolean ok = true;
	
	long readMol() {
		String molStr = "";
		molStr += next.charAt(at);
		at++;
		
		if (at < next.length() && Character.isLowerCase(next.charAt(at))) {
			molStr += next.charAt(at);
		} else {
			at--;
		}
		
		if (map.containsKey(molStr))
			return map.get(molStr);
		else {
			ok = false;
			return -1;
		}
			
	}
	
	long readNumber() {
		long res = 0;
		while (at < next.length()) {
			char c = next.charAt(at);

			if (Character.isDigit(c)) {
				res = (res * 10) + (c - '0');
			} else {
				at--;
				break;
			}
			at++;
		}
		return res;
	}
	
	long parse() {
		long res = 0, prev = -1;
		while (at < next.length()) {
			char c = next.charAt(at);

			if (c == '(') {
				at++;
				if (prev != -1) res += prev;
				prev = parse();
			} else if (c == ')') {
				break;
			} else if (Character.isUpperCase(c)) {
				if (prev != -1) res += prev;
				prev = readMol();
			} else if (Character.isDigit(c)) {
				res += prev * readNumber();
				prev = -1;
			}
			at++;
		}
		if (prev != -1) res += prev;
		return res;
	}
	
	public void run() {
		while (true) {
			String mol = in.next();
			if (mol.matches("END_OF_FIRST_PART")) break;
			int number = in.nextInt();
			map.put(mol, number);
		}
		
		while (true) {
			next = in.next();
			if (next.matches("0")) break;
			
			at = 0;
			ok = true;
			long res = parse();
			out.println(!ok ? "UNKNOWN" : res);
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

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
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

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
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

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
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