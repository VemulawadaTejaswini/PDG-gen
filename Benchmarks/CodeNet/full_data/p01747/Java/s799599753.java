
import java.awt.geom.Line2D;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void solver() {
		int n = ni();
		double[] x = new double[n];
		double[] y = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = nd();
			y[i] = nd();
		}
		boolean f = (checker(x, y, n)) && (checker(reverse(x), reverse(y), n));
		out.println(f ? "Possible" : "Impossible");
	}

	double[] reverse(double[] a) {
		double[] ret = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			ret[i] = a[a.length - 1 - i];
		}
		return ret;
	}

	boolean checker(double[] x, double[] y, int n) {
		boolean f = true;
		for (int i = 1; i < n; i++) {
			double r = Math.PI, l = Math.PI;
			for (int j = i + 1; j < n; j++) {
				double theta = angle(new double[] { x[i - 1] - x[i], y[i - 1] - y[i] },
						new double[] { x[j] - x[i], y[j] - y[i] });
				int t = Line2D.relativeCCW(x[i], y[i], x[i - 1], y[i - 1], x[j], y[j]);
				if (t == -1) {
					r = Math.min(r, theta);
				} else if (t == 1) {
					l = Math.min(l, theta);
				}
			}
			if (r + l <= Math.PI) {
				f = false;
			}
		}
		return f;
	}

	double angle(double[] v, double[] u) {
		double dot = 0;
		for (int i = 0; i < v.length; i++)
			dot = v[i] * u[i];
		int d1 = 0, d2 = 0;
		for (int i = 0; i < v.length; i++) {
			d1 += v[i] * v[i];
			d2 += u[i] * u[i];
		}
		return Math.acos(dot / (Math.sqrt(d1) * Math.sqrt(d2)));
	}

	void run() {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solver();
		out.flush();

	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static char nc() {
		try {
			int b = skip();
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

	static double nd() {
		try {
			return Double.parseDouble(ns());
		} catch (Exception e) {
		}
		return 0;
	}

	static String ns() {
		try {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			if (b == -1)
				return "";
			sb.append((char) b);
			while (true) {
				b = is.read();
				if (b == -1)
					return sb.toString();
				if (b <= ' ')
					return sb.toString();
				sb.append((char) b);
			}
		} catch (IOException e) {
		}
		return "";
	}

	public static char[] ns(int n) {
		char[] buf = new char[n];
		try {
			int b = skip(), p = 0;
			if (b == -1)
				return null;
			buf[p++] = (char) b;
			while (p < n) {
				b = is.read();
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
		} catch (IOException e) {
		}
		return null;
	}

	public static byte[] nse(int n) {
		byte[] buf = new byte[n];
		try {
			int b = skip();
			if (b == -1)
				return null;
			is.read(buf);
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
			int b = skip();
			is.reset();
			return b == -1;
		} catch (IOException e) {
			return true;
		}
	}

	static int ni() {
		try {
			int num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}