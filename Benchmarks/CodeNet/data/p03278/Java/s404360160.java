import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	static final int P = 1_000_000_007;
	static final long P2 = (long)P * P;
	
	int[] f;
	
	void submit() {
		int n = nextInt();
		
		f = new int[n / 2 + 1];
		f[1] = 1;
		for (int i = 2; i <= n / 2; i++) {
			f[i] = (int)((long)f[i - 1] * (2 * i - 1) % P);
		}
		
		ArrayList<Integer>[] g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}
		
		for (int i = 0; i < n - 1; i++) {
			int v = nextInt() - 1;
			int u = nextInt() - 1;
			g[v].add(u);
			g[u].add(v);
		}
		
		sz = new int[n];
		dfs(0, 0, g);
		
		p = IntStream.range(0, n).toArray();
		
		for (int v = 0; v < n; v++) {
			for (int u : g[v]) {
				if (sz[v] > sz[u] && sz[u] % 2 == 1) {
					p[get(v)] = get(u);
				}
			}
		}
		
		int[] id = new int[n];
		
		int newN = 0;
		for (int i = 0; i < n; i++) {
			if (get(i) == i) {
				id[i] = newN++;
			}
		}
		
		int[] w = new int[newN];
		
		ArrayList<Integer>[] gg = new ArrayList[newN];
		for (int i = 0; i < newN; i++) {
			gg[i] = new ArrayList<>();
		}
		for (int i = 0; i < n; i++) {
			for (int j : g[i]) {
				if (get(i) != get(j)) {
					gg[id[get(i)]].add(id[get(j)]);
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			w[id[get(i)]]++;
		}
		
		for (int i = 0; i < newN; i++) {
			w[i] /= 2;
		}
		
		out.println(go(gg, w));
	}
	
	int go(ArrayList<Integer>[] g, int[] ws) {
		int[] a = dfs2(0, 0, g, ws);
		return a[0] == 0 ? 0 : P - a[0];
	}
	
	int[] dfs2(int v, int p, ArrayList<Integer>[] g, int[] ws) {
		int[] ret = new int[ws[v] + 1];
		ret[ws[v]] = 1;
		
		for (int u : g[v]) {
			if (u == p) {
				continue;
			}
			int[] tmp = dfs2(u, v, g, ws);
			ret = mult(ret, tmp);
		}
		
		for (int i = 1; i < ret.length; i++) {
			int delta = (int)((long)ret[i] * f[i] % P);
			ret[0] -= delta;
			if (ret[0] < 0) {
				ret[0] += P;
			}
		}
		
		return ret;
	}
	
	int[] mult(int[] a, int[] b) {
		long[] c = new long[a.length + b.length - 1];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i + j] += (long)a[i] * b[j];
				if (c[i + j] >= P2) {
					c[i + j] -= P2;
				}
			}
		}
		int[] ic = new int[c.length];
		for (int i = 0; i < ic.length; i++) {
			ic[i] = (int) (c[i] % P);
		}
		
		return ic;
	}
	
	int[] sz;
	
	int[] p;
	
	int get(int v) {
		return p[v] == v ? v : (p[v] = get(p[v]));
	}
	
	void dfs(int v, int p, ArrayList<Integer>[] g) {
		sz[v] = 1;
		for (int u : g[v]) {
			if (u == p) {
				continue;
			}
			dfs(u, v, g);
			sz[v] += sz[u];
		}
	}

	void test() {

	}

	void stress() {
		for (int tst = 0;; tst++) {
			if (false) {
				throw new AssertionError();
			}
			System.err.println(tst);
		}
	}

	Main() throws IOException {
		is = System.in;
		out = new PrintWriter(System.out);
		submit();
		// stress();
		// test();
		out.close();
	}

	static final Random rng = new Random();
	static final int C = 5;

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	private InputStream is;
	PrintWriter out;

	private byte[] buf = new byte[1 << 14];
	private int bufSz = 0, bufPtr = 0;

	private int readByte() {
		if (bufSz == -1)
			throw new RuntimeException("Reading past EOF");
		if (bufPtr >= bufSz) {
			bufPtr = 0;
			try {
				bufSz = is.read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			if (bufSz <= 0)
				return -1;
		}
		return buf[bufPtr++];
	}

	private boolean isTrash(int c) {
		return c < 33 || c > 126;
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isTrash(b))
			;
		return b;
	}

	String nextToken() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	String nextString() {
		int b = readByte();
		StringBuilder sb = new StringBuilder();
		while (!isTrash(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}

	char nextChar() {
		return (char) skip();
	}

	int nextInt() {
		int ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}

	long nextLong() {
		long ret = 0;
		int b = skip();
		if (b != '-' && (b < '0' || b > '9')) {
			throw new InputMismatchException();
		}
		boolean neg = false;
		if (b == '-') {
			neg = true;
			b = readByte();
		}
		while (true) {
			if (b >= '0' && b <= '9') {
				ret = ret * 10 + (b - '0');
			} else {
				if (b != -1 && !isTrash(b)) {
					throw new InputMismatchException();
				}
				return neg ? -ret : ret;
			}
			b = readByte();
		}
	}
}
