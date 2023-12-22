import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.NoSuchElementException;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int t2i(String s) {
		String[] a = s.split(":");

		return (Integer.parseInt(a[0]) * 60 + Integer.parseInt(a[1])) * 60 + Integer.parseInt(a[2]);
	}

	public void _main(String[] args) {
		FastScanner sc = new FastScanner(in);

		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			int[] t = new int[t2i("24:00:00") + 1];

			for (int i = 0; i < n; i++) {
				String s = sc.next();
				String e = sc.next();

				t[t2i(s)]++;
				t[t2i(e)]--;
			}
			for (int i = 1; i < t.length; i++) {
				t[i] += t[i - 1];
			}

			int ans = Integer.MIN_VALUE;
			for (int i = 0; i < t.length; i++) {
				ans = Math.max(ans, t[i]);
			}

			out.println(ans);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}

class FastScanner {
	private InputStream in;

	public FastScanner(InputStream source) {
		this.in = source;
	}

	public void close() {
	}

	private final int BUF_SIZE = 1024 * 4;
	byte[] buf = new byte[BUF_SIZE];
	int bufPtr = 0;
	int bufLen = 0;

	private int nextByte() {
		if (bufLen == -1) {
			throw new NoSuchElementException();
		}

		if (bufPtr >= bufLen) {
			try {
				bufLen = in.read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			bufPtr = 0;

			if (bufLen <= 0) {
				return -1;
			}
		}
		return buf[bufPtr++];
	}

	private static boolean isPrintableCharacter(int c) {
		return c >= 0x21 && c <= 0x7e;
	}

	public int nextInt() {
		long l = nextLong();
		if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
			throw new NumberFormatException();
		}
		return (int) l;
	}

	public long nextLong() {
		long result = 0;
		int sign = 1;

		int c;
		while (!isPrintableCharacter(c = nextByte())) {
			;
		}

		if (c == '-') {
			sign = -1;
			c = nextByte();
		} else if (c == '+') {
			c = nextByte();
		}
		result = c - '0';

		while ((isPrintableCharacter(c = nextByte()))) {
			result *= 10;
			result += c - '0';
		}

		return sign * result;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public String next() {
		StringBuilder sb = new StringBuilder();
		int b;

		while (!isPrintableCharacter(b = nextByte())) {
			;
		}
		do {
			sb.appendCodePoint(b);
		} while (isPrintableCharacter(b = nextByte()));

		return sb.toString();
	}

	public int[] nextIntArray(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = nextInt();
		}
		return result;
	}

	public int[] nextIntArray1origin(int n) {
		int[] result = new int[n + 1];
		for (int i = 0; i < n; i++) {
			result[i + 1] = nextInt();
		}
		return result;
	}

	public long[] nextLongArray(int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = nextLong();
		}
		return result;
	}

	public long[] nextLongArray1origin(int n) {
		long[] result = new long[n + 1];
		for (int i = 0; i < n; i++) {
			result[i + 1] = nextLong();
		}
		return result;
	}

	public char[] nextCharArray(int n) {
		char[] result = new char[n];
		for (int i = 0; i < n; i++) {
			result[i] = (char) nextByte();
		}
		return result;
	}

	public char[][] nextChar2DArray(int n, int m) {
		char[][] result = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result[i][j] = (char) nextByte();
			}
		}
		return result;
	}

	public char[][] nextChar2DArray1origin(int n, int m) {
		char[][] result = new char[n + 1][m + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result[i + 1][j + 1] = (char) nextByte();
			}
		}
		return result;
	}

}

