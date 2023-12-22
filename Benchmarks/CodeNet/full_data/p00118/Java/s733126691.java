import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main{
	static StringBuilder out = new StringBuilder();
	static final String OK = "OK";
	static final String NG = "NG";
	static final String Possible = "Possible";
	static final String Impossible = "Impossible";
	static FastReader in = new FastReader();
	static int[][] separate;
	static char[][] land;
	static int h;
	static int w;

	public static void main(String[] args) {
		h = in.nextInt();
		w = in.nextInt();
		land = in.nextCharArray2d(h, w);
		int zero = in.nextInt();
		zero = in.nextInt();

		separate = new int[h][w];
		int owner = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (separate[i][j] > 0) continue;
				now();
				dfs(i, j, land[i][j], ++owner);
			}
		}
		now();
		printExit(owner);
	}

	private static void now() {
		System.out.println("======================================");
		for (char[] line : land) {
			for (char chara : line) {
				System.out.print("\t__" + chara);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------");
		for (int[] line : separate) {
			for (int num : line) {
				String numStr = num < 10 ? "__" + num : "" + num;
				System.out.print("\t" + numStr);
			}
			System.out.println();
		}
	}

	private static void dfs(int i, int j, char type, int owner) {
		if (land[i][j] != type) return;
		separate[i][j] = owner;
		if (i > 0) dfs(i - 1, j, type, owner);
		if (j > 0) dfs(i, j - 1, type, owner);
		if (i < h - 1) dfs(i + 1, j, type, owner);
		if (j < w - 1) dfs(i, j + 1, type, owner);
	}

	static void printExit(Object msg) {
		System.out.println(msg);
		System.exit(0);
	}
}

class FastReader{
	private InputStream in = System.in;
	private byte[] buf = new byte[1024];
	private int charNum;
	private int charLen;
	private StringBuilder sb = new StringBuilder();

	public int read() {
		if (charLen == -1) throw new InputMismatchException();
		if (charNum >= charLen) {
			charNum = 0;
			try {
				charLen = in.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (charLen <= 0) return -1;
		}
		return buf[charNum++];
	}

	public String next() {
		int c = read();
		while (isWhitespace(c)) {
			c = read();
		}
		sb.setLength(0);
		do {
			sb.appendCodePoint(c);
			c = read();
		} while (!isWhitespace(c));
		return sb.toString();
	}

	public char[] nextCharArray() {
		return next().toCharArray();
	}

	public char[][] nextCharArray2d(int lines) {
		char[] first = nextCharArray();
		char[][] array = new char[lines][first.length];
		array[0] = first;
		for (int i = 1; i < lines; i++)
			array[i] = nextCharArray();
		return array;
	}

	public char[][] nextCharArray2d(int lines, int rows) {
		char[][] array = new char[lines][rows];
		for (int i = 0; i < lines; i++)
			array[i] = nextCharArray();
		return array;
	}

	public int nextInt() {
		return (int) nextLong();
	}

	public int[] nextIntArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = nextInt();
		return array;
	}

	public List<Integer> nextIntList(int n) {
		Integer[] array = new Integer[n];
		for (int i = 0; i < n; i++)
			array[i] = nextInt();
		return Arrays.asList(array);
	}

	public int[][] nextIntArray2D(int n, int m) {
		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++)
			array[i] = nextIntArray(m);
		return array;
	}

	public List<int[]> nextIntsList(int n, int m) {
		List<int[]> list = new ArrayList<int[]>(n);
		for (int i = 0; i < n; i++)
			list.add(nextIntArray(m));
		return list;
	}

	public long nextLong() {
		int c = read();
		while (isWhitespace(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9') throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isWhitespace(c));
		return res * sgn;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public double[] nextDoubleArray(int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++)
			array[i] = nextDouble();
		return array;
	}

	public boolean isWhitespace(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
}