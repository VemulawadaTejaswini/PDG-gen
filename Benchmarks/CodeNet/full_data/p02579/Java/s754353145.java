import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Main {

	static int H;
	static int W;
	static int Ch;
	static int Cw;
	static int Dh;
	static int Dw;
	static char[][] maze;
	static boolean[][] find;
	static int[] X = new int[] { 0, 1, 0, -1 };
	static int[] Y = new int[] { 1, 0, -1, 0 };
	static int ans = Integer.MAX_VALUE;
	static boolean findAns = false;

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		H = sc.nextInt();
		W = sc.nextInt();
		Ch = sc.nextInt() - 1;
		Cw = sc.nextInt() - 1;
		Dh = sc.nextInt() - 1;
		Dw = sc.nextInt() - 1;
		maze = new char[H][W];
		find = new boolean[H][W];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			maze[i] = s.toCharArray();
		}
		LinkedList<int[]> queue = new LinkedList<>();
		dfs(Ch, Cw, queue, 0);
		int count = 1;
		while (!queue.isEmpty() && ans == Integer.MAX_VALUE) {
			int size = queue.size();
			for (int z = 0; z < size; z++) {
				int[] pop = queue.pollFirst();
				if (inMaze(pop[0], pop[1])) {
					int newX = pop[0] - 2;
					int newY = pop[1] - 2;
					for (int i = newX; i < newX + 5; i++) {
						for (int j = newY; j < newY + 5; j++) {
							if (inMaze(i, j)) {
								if (!find[i][j] && maze[i][j] != '#') {
									dfs(i, j, queue, count);
								}
							}
						}
					}
				}
			}
			count++;
		}
		System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
	}

	public static void dfs(int h, int w, LinkedList<int[]> queue, int count) {
		if (!inMaze(h, w)) {
			return;
		}
		if (find[h][w] || maze[h][w] == '#')
			return;
		find[h][w] = true;
		if (h == Dh && w == Dw) {
			ans = Math.min(count, ans);
			findAns = true;
		}
		queue.addLast(new int[] {h, w});
		for (int i = 0; i < 4; i++) {
			int newX = h + X[i];
			int newY = w + Y[i];
			dfs(newX, newY, queue, count);
		}
	}

	public static boolean inMaze(int x, int y) {
		return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length;
	}

}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}