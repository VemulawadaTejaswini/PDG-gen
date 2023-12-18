import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int x = sc.nextInt();

		List<Integer> ret = solve2(N, x);

		if (ret != null) {
			StringBuilder sb = new StringBuilder();
			sb.append("Yes\n");
			for (int v : ret) {
				sb.append(v);
				sb.append("\n");
			}
			System.out.println(sb);
			// System.out.println(run(ret));
		} else {
			System.out.println("No");
		}
	}

	private static List<Integer> solve2(int N, int x) {
		if (x == 1 || x == 2 * N - 1) {
			return null;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 2 * N - 1; i++) {
			if (i == N) {
				list.add(x);
			} else if (i == N - 1) {
				list.add(1);
			} else if (i == N + 1) {
				list.add(2 * N - 1);
			} else if (i == x) {
				list.add(N);
			} else if (i == 1) {
				list.add(N - 1);
			} else if (i == 2 * N - 1) {
				list.add(N + 1);
			} else {
				list.add(i);
			}
		}
		return list;
	}

	private static List<Integer> solve(int N, int x) {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 2 * N - 1; i++) {
			list.add(i);
		}

		for (int i = 0; i < 1000; i++) {
			Collections.shuffle(list);
			int ret = run(list);
			if (x == ret)
				return list;
		}
		return null;
	}

	private static int run(List<Integer> list) {
		int N = list.size() / 2;
		for (int i = 0; i < N; i++) {
			List<Integer> next = new ArrayList<>();
			for (int j = 0; j < list.size() - 2; j++) {
				int v1 = list.get(j);
				int v2 = list.get(j + 1);
				int v3 = list.get(j + 2);
				int v;
				if ((v2 - v1) * (v3 - v1) <= 0) {
					v = v1;
				} else if ((v1 - v2) * (v3 - v2) <= 0) {
					v = v2;
				} else {
					v = v3;
				}
				next.add(v);
			}
			list = next;
		}
		return list.get(0);
	}
}

class FastScanner {
	public static String debug = null;

	private final InputStream in = System.in;
	private int ptr = 0;
	private int buflen = 0;
	private byte[] buffer = new byte[1024];
	private boolean eos = false;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				if (debug != null) {
					buflen = debug.length();
					buffer = debug.getBytes();
					debug = "";
					eos = true;
				} else {
					buflen = in.read(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen < 0) {
				eos = true;
				return false;
			} else if (buflen == 0) {
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

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean isEOS() {
		return this.eos;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		return (int) nextLong();
	}

	public long[] nextLongList(int n) {
		return nextLongTable(1, n)[0];
	}

	public int[] nextIntList(int n) {
		return nextIntTable(1, n)[0];
	}

	public long[][] nextLongTable(int n, int m) {
		long[][] ret = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ret[i][j] = nextLong();
			}
		}
		return ret;
	}

	public int[][] nextIntTable(int n, int m) {
		int[][] ret = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ret[i][j] = nextInt();
			}
		}
		return ret;
	}
}