import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	private static void solve() {
		int h = nei();
		int w = nei();
		int n = nei();
		int[] as = new int[n];
		for (int i = 0; i < n; i++) {
			as[i] = nei();
		}
		int[][] cs = new int[h][w];
		int px = 0;
		int py = 0;
		int dir = 0;
		int[][] ds = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int c = 0;
		for (int i = 0; i < w * h; i++) {
			if (as[c] == 0) {
				c++;
			}
			as[c]--;
			cs[py][px] = c + 1;
			int px2 = px + ds[dir][0];
			int py2 = py + ds[dir][1];
			if (px2 < 0 || py2 < 0 || px2 >= w || py2 >= h || cs[py2][px2] != 0) {
				dir = ++dir % 4;
			}
			px += ds[dir][0];
			py += ds[dir][1];
		}
		for (int i = 0; i < h; i++) {
			String s = "";
			for (int j = 0; j < w; j++) {
				s += (j > 0 ? " " : "") + cs[i][j];
			}
			out(s);
		}
	}

	private static boolean po(int n, int[] aa, int last) {
		boolean ok = true;
		for (int i = 1; i < n && ok; i++) {
			switch (last) {
			case 0:
				if (aa[2] == 0) {
					ok = false;
				} else {
					aa[2]--;
					last = 2;
				}
				break;
			case 1:
				if (aa[1] == 0) {
					if (aa[2] == 0) {
						ok = false;
					} else {
						aa[2]--;
						last = 2;
					}
				} else {
					aa[1]--;
					last = 1;
				}
				break;
			case 2:
				if (aa[0] == 0) {
					if (aa[1] == 0) {
						if (aa[2] == 0) {
							ok = false;
						} else {
							aa[2]--;
							last = 2;
						}
					} else {
						aa[1]--;
						last = 1;
					}
				} else {
					aa[0]--;
					last = 0;
				}
				break;
			}
		}
		return ok;
	}

	static int abs(int x) {
		return x < 0 ? -x : x;
	}

	static long abs(long x) {
		return x < 0 ? -x : x;
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static long min(long a, long b) {
		return a < b ? a : b;
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static long max(long a, long b) {
		return a > b ? a : b;
	}

	static int clamp(int a, int min, int max) {
		return a < min ? min : a > max ? max : a;
	}

	static long clamp(long a, long min, long max) {
		return a < min ? min : a > max ? max : a;
	}

	static void out(String val) {
		IO.out(val);
	}

	static void out(Object val) {
		IO.out(String.valueOf(val));
	}

	static void out(int val) {
		IO.out(String.valueOf(val));
	}

	static void out(long val) {
		IO.out(String.valueOf(val));
	}

	static void out(char val) {
		IO.out(String.valueOf(val));
	}

	static void out(float val) {
		IO.out(String.valueOf(val));
	}

	static void out(double val) {
		IO.out(String.valueOf(val));
	}

	static void out(boolean val) {
		IO.out(String.valueOf(val));
	}

	static String nes() {
		return IO.next();
	}

	static int nei() {
		return IO.nextInt();
	}

	static long nel() {
		return IO.nextLong();
	}

	static int parseInt(String val) {
		return Integer.parseInt(val);
	}

	static int parseInt(char val) {
		return Integer.parseInt(String.valueOf(val));
	}

	static long parseLong(String val) {
		return Long.parseLong(val);
	}

	public static void main(String[] args) {
		solve();
		IO.flush();
	}
}

final class IO {
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out, false);
	private static final byte[] buffer = new byte[1024];
	private static int ptr = 0;
	private static int len = 0;

	private static boolean hasNextByte() {
		if (ptr < len)
			return true;
		ptr = 0;
		try {
			len = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return len > 0;
	}

	private static int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	static boolean hasNext() {
		byte c;
		while (hasNextByte() && ((c = buffer[ptr]) < '!' || c > '~'))
			ptr++;
		return hasNextByte();
	}

	static String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (b >= '!' && b <= '~') {
			sb.append((char) b);
			b = readByte();
		}
		return sb.toString();
	}

	static long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static int nextInt() {
		if (!hasNext())
			throw new NoSuchElementException();
		int n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static void out(String val) {
		out.println(val);
	}

	static void flush() {
		out.flush();
	}
}