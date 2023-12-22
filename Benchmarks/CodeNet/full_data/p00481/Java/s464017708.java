import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Queue;

public class Main{
	static StringBuilder out = new StringBuilder();
	static final String OK = "OK";
	static final String NG = "NG";
	static final String Possible = "Possible";
	static final String Impossible = "Impossible";
	static FastReader in = new FastReader();
	static final int INF = Integer.MAX_VALUE - 10;

	static final char LAIR = 'S';
	static final char BLOCK = 'X';
	static final char ZERO = '0';
	static char[][] space;
	static int x = 0;
	static int y = 0;
	static final int X = 0;
	static final int Y = 1;
	static final int L = 2;
	static boolean[][] searched;
	static int h;
	static int w;

	public static void main(String[] args) {
		h = in.nextInt();
		w = in.nextInt();
		int n = in.nextInt();
		space = in.nextCharArray2d(h, w);
		searched = new boolean[h][w];

		for (; x < h; x++) {
			for (; y < h; y++)
				if (space[x][y] == LAIR) break;
			if (space[x][y] == LAIR) break;
		}

		int eat = 0;
		int count = 0;
		Queue<int[]> que = new ArrayDeque<int[]>();
		for (; eat < n; eat++) {
			que.add(new int[] { x, y, 0 });
			int[] find = search(eat + 1, que);
			x = find[X];
			y = find[Y];
			count += find[L];
		}
		System.out.println(count);
	}

	private static int[] search(int target, Queue<int[]> que) {
		target += ZERO;
		while (que.size() > 0) {
			int[] point = que.poll();
			if (searched[point[X]][point[Y]]) continue;
			searched[point[X]][point[Y]] = true;
			if (space[point[X]][point[Y]] == target) return point;
			if (space[point[X]][point[Y]] == BLOCK) continue;
			if (point[X] > 0) que.add(new int[] { point[X] - 1, point[Y], point[L] + 1 });
			if (point[X] < h - 1) que.add(new int[] { point[X] + 1, point[Y], point[L] + 1 });
			if (point[Y] > 0) que.add(new int[] { point[X], point[Y] - 1, point[L] + 1 });
			if (point[Y] < w - 1) que.add(new int[] { point[X], point[Y] + 1, point[L] + 1 });
		}
		return new int[] { 0, 0, -1 };

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