import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);

	static void solve() {
		int[] vx = { -1, 0, 1, 0 };
		int[] vy = { 0, 1, 0, -1 };
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				System.exit(0);
			} else {
				int[] x = new int[N];
				int[] y = new int[N];
				for (int i = 1; i < N; i++) {
					int n = sc.nextInt();
					int d = sc.nextInt();
					x[i] = x[n] + vx[d];
					y[i] = y[n] + vy[d];
				}
				int minx = 0, maxx = 0, miny = 0, maxy = 0;
				for (int i = 1; i < N; i++) {
					int xi = x[i];
					minx = min(minx, xi);
					maxx = max(maxx, xi);
					int yi = y[i];
					miny = min(miny, yi);
					maxy = max(maxy, yi);
				}
				int width = maxx - minx + 1;
				int height = maxy - miny + 1;
				out.println(width + " " + height);
			}
			out.flush();
		}
	}

	public static void main(String[] args) {
		solve();
	}

	static int max(int a, int b) {
		return a < b ? b : a;
	}

	static int min(int a, int b) {
		return a < b ? a : b;
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
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private static boolean isPrintableChar(int c) {
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

	public int nextInt() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		int n = 0;
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
}