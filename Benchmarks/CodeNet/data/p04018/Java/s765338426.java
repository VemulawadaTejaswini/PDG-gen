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

	int[] Zalgo(char[] s) {
		int[] ret = new int[s.length];
		ret[0] = ret.length;
		int i = 1, j = 0;
		while (i < s.length) {
			while (i + j < s.length && s[j] == s[i + j]) {
				j++;
			}
			ret[i] = j;
			if (j == 0) {
				i++;
				continue;
			}
			int k = 1;
			while (i + k < s.length && k + ret[k] < j) {
				ret[i + k] = k;
				k++;
			}
			i += k;
			j -= k;
		}
		return ret;
	}

	char[] reverse(char[] s) {
		char[] ret = new char[s.length];
		for (int i = 0; i < s.length; i++) {
			ret[i] = s[ret.length - 1 - i];
		}
		return ret;
	}

	void solver(char[] w) {
		boolean f = true;
		int n = w.length;
		int[] z1 = Zalgo(w);
		int[] z2 = Zalgo(reverse(w));
		if (n == 1) {
			System.out.println(1 + "\n" + 1);
			return;
		} else {
			if (z1[1] == n - 1) {
				System.out.println(n + "\n" + 1);
				return;
			} else {
				int tmp = 0;
				for (int d = 2; d * d <= n; d++) {
					if (n % d == 0) {
						if (z1[d] == n - d || z1[n / d] == n - n / d) {
							tmp++;
						}
					}
				}
				if (tmp == 0) {
					out.println(1 + "\n" + 1);
					return;
				}
				boolean[] ok1 = new boolean[n];
				boolean[] ok2 = new boolean[n];
				Arrays.fill(ok1, true);
				Arrays.fill(ok2, true);
				for (int p = 1; p < n; p++) {
					for (int k = 2; ok2[p] && (k - 1) * p <= z2[p] && k * p < n; k++) {
						ok2[k * p] = false;
					}
					for (int k = 2; ok1[p] && (k - 1) * p <= z1[p] && k * p < n; k++) {
						ok1[k * p] = false;
					}
				}
				int ret = 0;
				for (int i = 1; i < n; i++) {
					if (ok1[i] && ok2[n - i]) {
						ret++;
					}
				}
				out.println(2 + "\n" + ret);
			}
		}
	}

	void run() {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solver(ns().toCharArray());
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
