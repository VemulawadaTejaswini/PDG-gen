import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;

public class Main{
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void solver() {
		int V = ni();
		char[][] a = new char[V][V];
		for (int i = 0; i < V; i++) {
			a[i] = ns().toCharArray();
		}

		int now = -1;
		int[] color = new int[V];
		Arrays.fill(color, -1);
		for (int i = 0; i < V; i++) {
			if (color[i] == -1) {
				for (int j = 0; j < V; j++) {
					if (a[i][j] == 'Y' && color[j] != -1) {
						color[i] = color[j];
						break;
					}
				}
				if (color[i] == -1)
					color[i] = (++now);
			}
		}
		int[] res = new int[now + 1];
		int[] vs = new int[now + 1];
		int[] edgenumber = new int[now + 1];

		for (int i = 0; i < V; i++) {
			vs[color[i]]++;
			for (int j = i + 1; j < V; j++) {
				if (a[i][j] == 'Y') {
					edgenumber[color[i]]++;
				}
			}
		}
		for (int i = 0; i < now + 1; i++) {
			res[i] = vs[i] * (vs[i] - 1) / 2 - edgenumber[i];
		}

		res = Arrays.copyOf(res, now + 1);
		vs = Arrays.copyOf(vs, now + 1);
		int[] state = new int[4];
		for (int i = 0; i < now + 1; i++) {
			res[i] %= 2;
			vs[i] %= 2;
			state[(vs[i] << 1) | res[i]]++;
		}
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				for (int k = 0; k < 30; k++) {
					for (int l = 0; l < 30; l++) {
						dp[i][j][k][l] = -1;
					}
				}
			}
		}
		tr(state);
		// 0?????????????????????
		out.println(dfs(state) != 0 ? "Taro" : "Hanako");
	}

	int[][][][] dp = new int[30][30][30][30];

	int dfs(int[] state) {
		if (dp[state[0]][state[1]][state[2]][state[3]] != -1) {
			return dp[state[0]][state[1]][state[2]][state[3]];
		} else {
			if (state[0] == 1 && state[1] == 0 && state[2] == 1 && state[3] == 0) {
				return 0;
			} else if (state[0] == 2 && state[1] == 0 && state[2] == 0 && state[3] == 0) {
				return 0;
			} else if (state[0] == 0 && state[1] == 0 && state[2] == 2 && state[3] == 0) {
				return 0;
			} else {
				HashSet<Integer> set = new HashSet<>();
				for (int i = 0; i < 4; i++) {
					for (int j = i; j < 4; j++) {
						if (state[i] > 0 && state[j] > 0) {
							if (i == j && state[i] == 1)
								continue;
							int v = ((i >> 1) + (j >> 1)) % 2;
							int res = (i + j + (i >> 1) * (j >> 1) + 1) % 2;
							int[] next = Arrays.copyOf(state, state.length);
							next[i]--;
							next[j]--;
							next[(v << 1) | res]++;
							set.add(dfs(next));
						}
					}
				}
				if (state[1] == 1) {
					int[] tmp = Arrays.copyOf(state, state.length);
					tmp[1]--;
					tmp[0]++;
					set.add(dfs(tmp));
				}
				if (state[3] == 1) {
					int[] tmp = Arrays.copyOf(state, state.length);
					tmp[3]--;
					tmp[2]++;
					set.add(dfs(tmp));
				}
				int g = 0;
				for (int i = 0; i < 18; i++) {
					if (set.contains(i)) {
						g = i + 1;
					} else
						break;
				}
				dp[state[0]][state[1]][state[2]][state[3]] = g;
				return g;
			}
		}
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