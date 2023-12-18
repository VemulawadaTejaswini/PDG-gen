import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

final class SegTree {
	int[] dat;
	int h;
	int n;

	SegTree(int num) {
		h = 0;
		while ((1 << h) < num)
			h++;
		n = 1 << h;
		int size = 2 * n - 1;
		dat = new int[size];
		for (int i = 0; i < size; i++) {
			dat[i] = 0;
		}
	}

	void update(int i, int x) {
		i += n - 1;
		dat[i] = x;
		while (i > 0) {
			i = i - 1 >> 1;
			dat[i] = max(dat[i * 2 + 1], dat[i * 2 + 2]);
		}
	}

	void update(int[] xs, int offset) {
		int i = n - 1 + offset;
		int num = xs.length;
		for (int j = 0; j < num; j++) {
			dat[i + j] = xs[j];
		}
		for (int j = n - 2; j >= 0; j--) {
			dat[j] = max(dat[j * 2 + 1], dat[j * 2 + 2]);
		}
	}

	int query(int from, int until) {
		return _query(from, until, 0, 0, n);
	}

	private int _query(int a, int b, int k, int l, int r) {
		if (r <= a || b <= l)
			return 0;
		if (a <= l && r <= b)
			return dat[k];
		int vl = _query(a, b, k * 2 + 1, l, l + r >> 1);
		int vr = _query(a, b, k * 2 + 2, l + r >> 1, r);
		return max(vl, vr);
	}

	final int max(int x, int y) {
		return x > y ? x : y;
	}
}

public class Main {
	private static void solve() {
		int n = nei();
		int[] as = new int[n];
		for (int i = 0; i < n; i++) {
			as[i] = nei();
		}
		String s = nes();
		if (s.charAt(0) == 'm') {
			out(114514);
			return;
		}
		int a = 0;
		while (a < n && s.charAt(a) == 'M')
			a++;
		int b = a;
		while (b < n && s.charAt(b) == 'm')
			b++;
		if (b != n) {
			out(114514);
			return;
		}
		SegTree st = new SegTree(n);
		st.update(as, 0);
		int[] maxs = new int[n - a];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n - a; i++) {
			maxs[i] = st.query(i, i + a + 1);
			min = min(min, maxs[i]);
		}
		out(min);

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