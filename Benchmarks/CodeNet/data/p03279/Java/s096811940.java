import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	
	static class Pair implements Comparable<Pair> {
		int x;
		int y;

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Pair o) {
			if (x != o.x) {
				return x < o.x ? -1 : 1;
			}
			return Integer.compare(y, o.y);
		}

		@Override
		public String toString() {
			return "(" + x + ", " + y + ")";
		}
	}

	void submit() {
		int n = nextInt();
		int m = nextInt();
		
		Pair[] a = new Pair[n + m];
		for (int i = 0; i < n + m; i++) {
			a[i] = new Pair(nextInt(), i < n ? 0 : 1);
		}
		Arrays.sort(a);
		
		int last = -1;
		
		int[] ls = new int[n];
		int[] rs = new int[n];
		
		int ptr = 0;
		for (Pair p : a) {
			if (p.y == 0) {
				ls[ptr++] = last == -1 ? -1 : p.x - last; 
			} else {
				last = p.x;
			}
		}
		
		last = -1;
		for (int i = a.length - 1; i >= 0; i--) {
			Pair p = a[i];
			if (p.y == 0) {
				rs[--ptr] = last == -1 ? -1 : last - p.x;
			} else {
				last = p.x;
			}
		}
		
		ArrayList<Pair> b = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			if (ls[i] != -1 && rs[i] != -1) {
				b.add(new Pair(ls[i], -rs[i]));
			}
		}
		
		out.println(go(b));
	}
	
	int go(ArrayList<Pair> a) {
		Collections.sort(a);
		
		int[] b = new int[a.size()];
		int sz = 0;
		for (int i = 0; i < a.size(); i++) {
			if (i == 0 || a.get(i - 1).compareTo(a.get(i)) != 0) {
				b[sz++] = a.get(i).y;
			}
		}
		
		b = Arrays.copyOf(b, sz);
		
		int[] u = unique(b);
		int n = b.length;
		int m = u.length + 1;
		for (int i = 0; i < n; i++) {
			b[i] = Arrays.binarySearch(u, b[i]) + 1;
		}
		
		int[] fen = new int[m];
		
		add(fen, 0, 1);
		
		for (int i = n - 1; i >= 0; i--) {
			int x = b[i];
			
			add(fen, x, get(fen, x - 1));
		}
		
		return get(fen, m - 1);
	}
	
	static final int P = 1_000_000_007;
	
	void add(int[] fen, int idx, int delta) {
		for (int i = idx; i < fen.length; i |= i + 1) {
			fen[i] += delta;
			if (fen[i] >= P) {
				fen[i] -= P;
			}
		}
	}
	
	int get(int[] fen, int idx) {
		int ret = 0;
		for (int i = idx; i >= 0; i = (i & (i + 1)) - 1) {
			ret += fen[i];
			if (ret >= P) {
				ret -= P;
			}
		}
		return ret;
	}
	
	int[] unique(int[] a) {
		a = a.clone();
		int sz = 0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (sz == 0 || a[i] != a[sz - 1]) {
				a[sz++] = a[i];
			}
		}
		return Arrays.copyOf(a, sz);
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
