
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			//			solveC();
			solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int a = nextInt();
		int b = nextInt();

		if (a <= 5) {
			out.println(0);
		} else if (a <= 12) {
			out.println(b / 2);
		} else {
			out.println(b);
		}
	}

	private void solveB() {
		int r = nextInt();
		int d = nextInt();
		int x2000 = nextInt();

		int pre = x2000;
		for (int i = 1; i <= 10; i++) {
			out.println(r * pre - d);
			pre = r * pre - d;
		}

	}

	private void solveC() {
		int n = nextInt();
		int m = nextInt();

		int[] l = new int[m];
		int[] r = new int[m];
		int[] wk = new int[n];
		for (int i = 0; i < m; i++) {
			l[i] = nextInt() - 1;
			r[i] = nextInt() - 1;
			wk[l[i]] += 1;
			if (r[i] + 1 < n) {
				wk[r[i] + 1] -= 1;
			}
		}

		for (int i = 1; i < n; i++) {
			wk[i] += wk[i - 1];
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (wk[i] == m) {
				cnt++;
			}
		}

		out.println(cnt);
	}

	private void solveD() {
		int n = nextInt();
		int m = nextInt();
		long[] a = LongStream.range(0, n).map(i -> nextLong()).toArray();

		Arrays.sort(a);

		int[][] bc = IntStream.range(0, m).collect(() -> new int[m][2],
				(t, i) -> {
					t[i][0] = nextInt();
					t[i][1] = nextInt();
				},
				(t, u) -> {
					Stream.concat(Arrays.stream(t), Arrays.stream(u));
				});

		Arrays.sort(bc, (x, y) -> -Integer.compare(x[1], y[1]));
		int start = 0;
		boolean isContinue = true;
		for (int j = 0; j < m && isContinue; j++) {
			int max = bc[j][0];
			int wk = 0;
			for (int k = start; k < Integer.min((start + max), n); k++) {
				if (k == start && bc[j][1] > a[k]) {
					isContinue = false;
					break;
				}
				if (bc[j][1] > a[k]) {
					a[k] = bc[j][1];
					wk = k;
				} else {
					break;
				}
			}
			start = wk + 1;
		}
		long res = Arrays.stream(a).sum();

		out.println(res);
	}

	private int[] getRuiseki(int n, int[] a) {
		int[] wk = new int[n];
		wk[0] = a[0];
		for (int j = 1; j < wk.length; j++) {
			wk[j] = wk[j - 1] + a[j];
		}
		return wk;
	}

	private void solveE() {
		int n = nextInt();

		out.println("");
	}

	private void solveF() {
		int n = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
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

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
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
}