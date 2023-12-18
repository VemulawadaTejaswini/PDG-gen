import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	static int[][] memo;

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int[] ptr = new int[n];
		int left = 0, right = 0;
		for (int i = 0; i <= n; i++) {
			a[i] = sc.nextInt() - 1;
			if (ptr[a[i]] == 0) ptr[a[i]] = i + 1;
			else {
				left = ptr[a[i]] - 1;
				right = i;
				break;
			}
		}

		memo = new int[20000][];
		for (int i = 0; i < memo.length; i++) {
			memo[i] = new int[(i + 1) / 2 + 1];
			for (int j = 0; j <= (i + 1) / 2; j++) {
				memo[i][j] = -1;
			}
		}

		for (int i = 0; i <= n; i++) {
			out.println(combi(n + 1, i + 1) - combi(n - (right - left), i));
		}

		out.flush();
	}

	static int combi(int n, int m) {
		if (n < m) return 0;
		m = (n - m < m ? n - m : m);
		if (memo.length <= n || memo[n].length <= m) return mod(combi(n - 1, m - 1) + combi(n - 1, m));
		if (memo[n][m] >= 0) return memo[n][m];
		else if (m == 0 || m == n) return memo[n][m] = 1;
		else if (m == 1) return memo[n][m] = n;
		return memo[n][m] = mod(combi(n - 1, m - 1) + combi(n - 1, m));
	}

	static int mod(int n) {
		return (n < 0) ? mod(n + 1000000007) : n % 1000000007;
	}

}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) return true;
		else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) return false;
		}
		return true;
	}

	private byte readByte() {
		if (hasNextByte()) return buffer[ptr++];
		return -1;
	}

	private boolean isPrintableChar(byte c) {
		return '!' <= c && c <= '~';
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		byte b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public int nextInt() {
		if (!hasNext()) throw new NoSuchElementException();
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) throw new NumberFormatException();
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

	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) throw new NumberFormatException();
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
}