import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	public static int MAXA = 100000;
	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		io.nextIntArrays(x,y);
		int parity0 = (x[0] + y[0]) & 1;
		for(int i=0;i<n;i++) {
			if (parity0 != (x[i] + y[i] & 1)) {
				System.out.println(-1);
				return;
			}
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = x[i] + y[i];
			b[i] = -x[i] + y[i];
		}
		/*
		 *   A B
		 * L - +
		 * R + -
		 * D - -
		 * U + +
		 */
		ArrayList<Long> d = new ArrayList<>();
		for(int i=0;i<32;i++) {
			d.add(1L << (long) i);
		}
		if (parity0 == 0) {
			d.add(1L);
		}
		d.sort(Collections.reverseOrder());
		int m = d.size();
		io.println(m);
		for(int i=0;i<m;i++) {
			if (m > 0) {
				io.print(' ');
			}
			io.print(d.get(i));
		}
		io.println();
		for(int i=0;i<n;i++) {
			long ca = 0;
			long cb = 0;
			for(int j=0;j<m;j++) {
				if (ca < a[i]) {
					if (cb < b[i]) {
						io.print('U');
						ca += d.get(j);
						cb += d.get(j);
					}else {
						io.print('R');
						ca += d.get(j);
						cb -= d.get(j);
					}
				}else {
					if (cb < b[i]) {
						io.print('L');
						ca -= d.get(j);
						cb += d.get(j);
					}else {
						io.print('D');
						ca -= d.get(j);
						cb -= d.get(j);
					}
				}
			}
			io.println();
		}
		io.flush();
	}
}

class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() {
		this(System.in);
	}

	public IO(InputStream source) {
		super(System.out);
		this.in = source;
	}

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

	private static boolean isNewLine(int c) {
		return c == '\n' || c == '\r';
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public boolean hasNextLine() {
		while (hasNextByte() && isNewLine(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while (isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}

	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}

	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}

	public double[] nextDoubleArray(int n) {
		double[] a = new double[n];
		for (int i = 0; i < n; i++)
			a[i] = nextDouble();
		return a;
	}

	public void nextIntArrays(int[]... a) {
		for (int i = 0; i < a[0].length; i++)
			for (int j = 0; j < a.length; j++)
				a[j][i] = nextInt();
	}

	public int[][] nextIntMatrix(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = nextIntArray(m);
		return a;
	}

	public char[][] nextCharMap(int n, int m) {
		char[][] a = new char[n][];
		for (int i = 0; i < n; i++)
			a[i] = nextCharArray(m);
		return a;
	}

	public void close() {
		super.close();
		try {
			in.close();
		} catch (IOException e) {
		}
	}
}
