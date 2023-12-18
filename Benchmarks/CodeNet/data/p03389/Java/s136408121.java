import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main implements Runnable {
	public static void main(String[] args) {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
	}

	public void run() {
		Scanner sc = new Scanner();
		int[] a = new int[3];
		for (int i = 0; i < 3; ++i)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		for (int i = 0; i < memo.length; ++i)
			for (int j = 0; j < memo[i].length; ++j)
				for (int k = 0; k < memo[i][j].length; ++k)
					memo[i][j][k] = -1;
		System.out.println(f(a[0], a[1], a[2]));
	}

	long[][][] memo = new long[100][100][100];

	long f(int a, int b, int c) {
		if (a == b && b == c && c == a)
			return 0;
		if (a >= 100 || b >= 100 || c >= 100)
			return 1L << 30;
		if (memo[a][b][c] >= 0)
			return memo[a][b][c];
		memo[a][b][c] = 1L << 30;
		memo[a][b][c] = Math.min(memo[a][b][c], f(a + 2, b, c) + 1);
		memo[a][b][c] = Math.min(memo[a][b][c], f(a, b + 2, c) + 1);
		memo[a][b][c] = Math.min(memo[a][b][c], f(a, b, c + 2) + 1);
		memo[a][b][c] = Math.min(memo[a][b][c], f(a + 1, b + 1, c) + 1);
		memo[a][b][c] = Math.min(memo[a][b][c], f(a + 1, b, c + 1) + 1);
		memo[a][b][c] = Math.min(memo[a][b][c], f(a, b + 1, c + 1) + 1);
		return memo[a][b][c];
	}

	class Scanner {
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

		private boolean isPrintableChar(int c) {
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

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
