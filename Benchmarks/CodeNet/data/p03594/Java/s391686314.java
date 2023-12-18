

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	static final char[] COLOR = { 'R', 'Y', 'G', 'B' };

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();

		int[][] color = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				color[i][j] = (1 << 3) + (1 << 2) + (1 << 1) + 1;
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				for (int k = 0; k < 4; k++) {
					if (((color[i][j] >> k) & 1) == 1) {
						color[i][j] = 1 << k;
						break;
					}
				}

				int jj = j - d;
				int ii = i;
				for (int k = 0; k < d; k++) {
					ii++;
					jj++;
					if ((0 <= ii && ii < h) && (0 <= jj && jj < w)) {
						color[ii][jj] &= ~color[i][j];
					}
				}
				for (int k = 0; k < d; k++) {
					ii--;
					jj++;
					if ((0 <= ii && ii < h) && (0 <= jj && jj < w)) {
						color[ii][jj] &= ~color[i][j];
					}
				}
			}
		}

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				for (int k = 0; k < 4; k++) {
					if (((color[i][j] >> k) & 1) == 1) {
						out.print(COLOR[k]);
						break;
					}
				}
			}
			out.println();
		}

		out.flush();
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

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		return a;
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

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		return a;
	}
}