import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		UnionFind uf = new UnionFind(n);
		int m = sc.nextInt();
		for (int i = 0; i < m; ++i) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			uf.unite(a, b);
		}

		HashSet<Integer> roots = new HashSet<Integer>();
		for (int i = 0; i < n; ++i) {
			int root = uf.getRootOf(i);
			roots.add(root);
		}

		System.out.println(roots.size() - 1);

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
		}

		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return buflen > 0;
	}

	private int readByte() {
		return hasNextByte() ? buffer[ptr++] : -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public String nextLine() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}

		while (b != '\n') {
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

class UnionFind {

	private int[] root;
	private int[] size;

	public UnionFind(int N) {
		root = new int[N];
		for (int i = 0; i < N; ++i) {
			root[i] = i;
		}

		size = new int[N];
		Arrays.fill(size, 1);
	}

	public int getRootOf(int x) {
		if (x == root[x]) {
			return x;
		}

		return root[x] = getRootOf(root[x]);
	}

	public int getSizeOf(int x) {
		return size[getRootOf(x)];
	}

	public boolean areConnected(int x, int y) {
		return getRootOf(x) == getRootOf(y);
	}

	public void unite(int x, int y) {
		int xRoot = getRootOf(x);
		int yRoot = getRootOf(y);
		if (xRoot == yRoot) {
			return;
		}

		if (size[xRoot] > size[yRoot]) {
			int t = yRoot;
			yRoot = xRoot;
			xRoot = t;
		}

		root[xRoot] = yRoot;
		size[yRoot] += size[xRoot];
	}
}