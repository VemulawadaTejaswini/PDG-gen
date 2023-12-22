import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int M = sc.nextInt();
		UnionFindTree uf = new UnionFindTree(N);
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			uf.union(a, b);
		}
		int ans = 1;
		for (int i = 0; i < N; i++) {
			if (ans < uf.size(i)) {
				ans = uf.size(i);
			}
		}
		System.out.println(ans);
	}

}

class UnionFindTree {

	private int[] parent;

	public UnionFindTree(int size) {
		this.parent = new int[size];
		for (int i = 0; i < size; i++) {
			this.parent[i] = -1;
		}
	}

	public boolean union(int x, int y) {
		int xRoot = root(x);
		int yRoot = root(y);

		if (xRoot == yRoot) {
			return false;
		}
		if (this.parent[xRoot] > this.parent[yRoot]) {
			int tmp = yRoot;
			yRoot = xRoot;
			xRoot = tmp;
		}
		this.parent[xRoot] += this.parent[yRoot];
		this.parent[yRoot] = xRoot;
		return true;
	}

	public int root(int i) {
		if (this.parent[i] >= 0) {
			return this.parent[i] = root(this.parent[i]);
		}
		return i;
	}

	public boolean same(int x, int y) {
		return root(x) == root(y);
	}

	public int size(int x) {
		return - this.parent[root(x)];
	}
}

class FastScanner {
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

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
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
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}