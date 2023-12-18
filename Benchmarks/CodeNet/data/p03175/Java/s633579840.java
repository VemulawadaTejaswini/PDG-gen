import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
	private static final long MOD = 1000000007;
	InputStream is;
	PrintWriter out;
	String INPUT = "";

	int n;
	int a[][];
	long dp[][];

	List<Integer> g[];

	void solve() {
		n = ni();
		g = new List[n + 1];
		for (int i = 0; i <= n; i++)
			g[i] = new ArrayList<Integer>();
		for (int i = 0; i < n - 1; i++) {
			int u = ni();
			int v = ni();
			g[u].add(v);
			g[v].add(u);
		}

		long[] ret = dfs(1, 0);

		out.println(ret[0] + ret[1]);
	}

	// 0: black
	// 1: white
	private long[] dfs(int r, int p) {
		long[] ret = new long[] { 1, 1 };
		for (Integer c : g[r]) {
			if (c != p) {
				long[] tmp = dfs(c, r);
				ret[0] *= tmp[1];
				ret[1] *= (tmp[0] + tmp[1]);
				ret[0] %= MOD;
				ret[1] %= MOD;
			}
		}
		return ret;
	}

	private long solve(int i, int f) {
		if (i >= n)
			return 1;
		if (dp[i][f] == -1) {
			dp[i][f] = 0;
			for (int j = 0; j < n; j++) {
				if ((f & (1 << j)) != 0 && a[i][j] == 1) {
					dp[i][f] += solve(i + 1, f & (~(1 << j)));
					dp[i][f] %= MOD;
				}
			}
		}
		return dp[i][f];
	}

	StringBuffer sb = new StringBuffer();

	void run() throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		Thread t = new Thread(null, null, "~", Runtime.getRuntime().maxMemory()) {
			@Override
			public void run() {
				long s = System.currentTimeMillis();
				solve();
				out.flush();
				if (!INPUT.isEmpty())
					tr(System.currentTimeMillis() - s + "ms");
			}
		};
		t.start();
		t.join();

		// long s = System.currentTimeMillis();
		// solve();
		// out.flush();
		// if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
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
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
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

	private int max(int[] a) {
		int ret = Integer.MIN_VALUE;
		for (int i : a)
			ret = Math.max(ret, i);
		return ret;
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}