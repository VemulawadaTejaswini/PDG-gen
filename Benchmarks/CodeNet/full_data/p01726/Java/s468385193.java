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

	void solver(char[] s, char[] t) {
		int[] z1 = Zalgo(s, t);
		int[] z2 = Zalgo(rev(s), rev(t));
		int ret = 0;
		for (int i = 0; i < s.length - t.length + 1; i++) {
			// [i] i+t.length-1
			if (z1[i] + z2[s.length - i - t.length] == t.length - 1) {
				ret++;
			}
		}
		out.println(ret);
	}

	char[] rev(char[] c) {
		char[] d = new char[c.length];
		for (int i = 0; i < d.length; i++) {
			d[i] = c[c.length - 1 - i];
		}
		return d;
	}

	int[] Zalgo(char[] main, char[] sub) {
		char[] s = new char[main.length + sub.length];
		int n = s.length;
		for (int i = 0; i < sub.length; i++) {
			s[i] = sub[i];
		}
		for (int i = 0; i < main.length; i++) {
			s[i + sub.length] = main[i];
		}
		int[] ret = new int[n];
		ret[0] = n;
		int i = 1, j = 0;
		while (i < n) {
			while (i + j < n && s[j] == s[i + j])
				j++;
			ret[i] = j;
			if (j == 0) {
				i++;
				continue;
			}
			int k = 1;
			while (i + k < n && k + ret[k] < j) {
				ret[i + k] = ret[k];
				k++;
			}
			i += k;
			j -= k;
		}
		ret = Arrays.copyOfRange(ret, sub.length, s.length);
		return ret;
	}

	void run() {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solver(ns().toCharArray(), ns().toCharArray());
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