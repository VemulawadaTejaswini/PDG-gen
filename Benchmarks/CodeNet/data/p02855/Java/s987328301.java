import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {

	void run() {
		FastScanner sc = new FastScanner();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		char[][] cs = new char[H][W];
		int[][] col = new int[H][W];
		for (int i = 0; i < H; ++i)
			cs[i] = sc.next().toCharArray();
		int p = 1;
		int num = Integer.MAX_VALUE / 3;
		for (int i = 0; i < H; ++i)
			for (int j = 0; j < W; ++j)
				if (cs[i][j] == '#') {
					col[i][j] = p++;
					num = Math.min(num, i);
				}

		if (num != 0) {
			for (int i = 0; i < W; ++i) {
				cs[0][i] ^= cs[num][i];
				cs[num][i] ^= cs[0][i];
				cs[0][i] ^= cs[num][i];
				col[0][i] ^= col[num][i];
				col[num][i] ^= col[0][i];
				col[0][i] ^= col[num][i];
			}
		}

		for (int i = 0; i < H; ++i) {
			boolean find = false;
			for (int j = 0; j < W; ++j) {
				find |= cs[i][j] == '#';
			}
			if (find) {
				for (int j = 0; j < W; ++j) {
					if (cs[i][j] != '#')
						continue;
					int nj = j + 1;
					while (nj < W && cs[i][nj] == '.') {
						col[i][nj] = col[i][j];
						++nj;
					}
					j = nj - 1;
				}
				for (int j = W - 1; j >= 0; --j) {
					if (cs[i][j] != '#')
						continue;
					int nj = j - 1;
					while (nj >= 0 && cs[i][nj] == '.') {
						col[i][nj] = col[i][j];
						--nj;
					}
					j = nj + 1;
				}
			} else {
				for (int j = 0; j < W; ++j) {
					col[i][j] = col[i - 1][j];
				}
			}
		}

		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				System.out.print(col[i][j] + (j == W - 1 ? "\n" : " "));
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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