
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {

	InputStream is;
	PrintWriter out;
	String INPUT = "";

	private static final long M = 1000000007L;

	void solve() {
		int n = ni();
		int m = ni();
		char a[][] = new char[n][];
		for (int i = 0; i < n; i++)
			a[i] = ns().toCharArray();
		int[][][] dp = new int[n + 2][m + 2][4];
		for (int i = 0; i < n; i++)
			for (int c = 0; c < m; c++)
				if (a[i][c] != '#')
					dp[i + 1][c + 1][0] = dp[i + 1][c][0] + 1;
		for (int i = 0; i < n; i++)
			for (int c = 0; c < m; c++)
				if (a[i][m - 1 - c] != '#')
					dp[i + 1][m - c][1] = dp[i + 1][m - c + 1][1] + 1;
//		tr(dp);
		for (int c = 0; c < m; c++)
			for (int i = 0; i < n; i++)
				if (a[i][c] != '#')
					dp[i + 1][c + 1][2] = dp[i][c + 1][2] + 1;
		for (int c = 0; c < m; c++)
			for (int i = 0; i < n; i++)
				if (a[n - 1 - i][c] != '#')
					dp[n - i][c + 1][3] = dp[n - i + 1][c + 1][3] + 1;

		int ans = 0;
		for (int i = 0; i < n; i++)
			for (int c = 0; c < m; c++)
				ans = Math.max(ans,
						dp[i + 1][c + 1][0] + dp[i + 1][c + 1][1] + dp[i + 1][c + 1][2] + dp[i + 1][c + 1][3]);
		if (ans > 0)
			ans -= 3;
		out.println(ans);
	}

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!INPUT.isEmpty())
			tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n) {
			if (!(isSpaceChar(b)))
				buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private int[][] na(int n, int m) {
		int[][] a = new int[n][];
		for (int i = 0; i < n; i++)
			a[i] = na(m);
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}
