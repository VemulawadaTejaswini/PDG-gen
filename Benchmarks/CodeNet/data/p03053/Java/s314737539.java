

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.stream.IntStream;

public class Main {

	static final int INF = 9999999;
	static int h;
	static int w;
	static int[][] table;
	static Queue<int[]> sq;

	public static void main(String... args) {

		FastScanner sc = new FastScanner();
		String[] tmp = sc.next().split(" ");
		h = Integer.parseInt(tmp[0]);
		w = Integer.parseInt(tmp[1]);

		table = new int[h][w];

		IntStream.range(0, h).forEach(y -> {
			String s = sc.next();
			IntStream.range(0, w).forEach(x -> {
				table[y][x] = s.charAt(x) == '#' ? 0 : INF;
			});
		});

		sq = new ArrayDeque<>(h * w);

		IntStream.range(0, h).forEach(y -> {
			IntStream.range(0, w).forEach(x -> {
				if (table[y][x] == 0) {
					sq.add(new int[] { y, x, 0 });
				}
			});
		});

		while (!sq.isEmpty()) {
			int[] b = sq.remove();
			erosion(b[0], b[1], b[2]);
		}

		int maxDis = Arrays.stream(table).map(row -> Arrays.stream(row))
				.mapToInt(rs -> rs.reduce(0, (a, b) -> Math.max(a, b))).reduce(0, (a, b) -> Math.max(a, b));

		System.out.println(maxDis);
	}

	static void erosion(int y, int x, int n) {
		if (n < table[y][x] || n == 0) {
			table[y][x] = n;

			if (y < h - 1) {
				sq.add(new int[] { y + 1, x, n + 1 });
			}
			if (y > 0) {
				sq.add(new int[] { y - 1, x, n + 1 });
			}
			if (x < w - 1) {
				sq.add(new int[] { y, x + 1, n + 1 });
			}
			if (x > 0) {
				sq.add(new int[] { y, x - 1, n + 1 });
			}
		}
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