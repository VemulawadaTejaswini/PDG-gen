import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	public static long ans1 = 0;
	public static long ans2 = 0;
	
	public static void main(String[] args) {
		IO io = new IO();
		int h = io.nextInt();
		int w = io.nextInt();
		char[][] m1 = io.nextCharMap(h, w);
		int h2 = h + w + 1;
		int w2 = h + w + 1;
		int[][] m2 = new int[h2][w2];
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if (m1[i][j] == '#') {
					m2[i+j+1][i-j+w] = 1;
				}
			}
		}
		solveHalf(h2,w2,m2);
		int[][] m3 = new int[w2][h2];
		for(int i=0;i<h2;i++) {
			for(int j=0;j<w2;j++) {
				m3[j][i] = m2[i][j];
			}
		}
		solveHalf(w2,h2,m3);
//		System.err.println(ans1 + " " + ans2);
		System.out.println(ans1 + ans2 / 2);
	}
	
	public static void solveHalf(int h, int w, int[][] m) {
		int[][] sumC = new int[h][w];
		for(int i=0;i<h;i++) {
			for(int j=1;j<w;j++) {
				sumC[i][j] = sumC[i][j-1] + m[i][j];
			}
		}
		for(int r1=0;r1<h;r1++) {
			for(int r2=0;r2<h;r2++) {
				if (r1 == r2) continue;
				int d = Math.abs(r1-r2);
				for(int j=1;j+d<w;j++) {
					if (m[r1][j] == 0 || m[r1][j+d] == 0) continue;
					if (m[r2][j] == 1) ans2++;
					if (m[r2][j+d] == 1) ans2++;
					ans1 += sumC[r2][j+d-1] - sumC[r2][j];
				}
			}
		}
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
