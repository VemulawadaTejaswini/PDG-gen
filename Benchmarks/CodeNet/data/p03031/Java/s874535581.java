import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] k = new int[M + 1];
		int[][] s = new int[M + 1][N + 1];
		int[] p = new int[M + 1];
		for (int i = 1; i <= M; i++) {
			k[i] = sc.nextInt();
			for (int j = 1; j <= k[i]; j++)
				s[i][j] = sc.nextInt();
		}
		for (int i = 1; i <= M; i++)
			p[i] = sc.nextInt();
		int count = 0;
		int ans = 0;
		int[] denkyu = new int[M + 1];

		for (int i = 0; i < (1 << N); i++) {
			for (int a = 0; a < N; a++) {
				if (((i >> a) & 1) == 0) {
					for (int g = 1; g <= M; g++) {
						for (int h = 1; h <= k[g]; h++) {
							if (s[g][h] == a + 1)
								denkyu[g]++;
						}
					}
				}
			}
			for (int z = 1; z <= M; z++) {
				if (denkyu[z] % 2 == p[z])
					count++;
			}

			if (count == M) {
				ans++;
				count = 0;
			} else
				count = 0;

			for (int j = 1; j <= M; j++)
				denkyu[j] = 0;
		}

		System.out.println(ans);
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
