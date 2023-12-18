import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner();
		int N = sc.nextInt();
		int Q = sc.nextInt();
		long[] A = new long[N];
		long[] X = new long[Q];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		for (int i = 0; i < Q; ++i) {
			X[i] = sc.nextLong();
		}
		long[] sum = new long[N];
		long[] even = new long[N];
		long[] odd = new long[N];
		for (int i = 0; i < N; ++i) {
			if (i % 2 == 0) {
				even[i] = A[i] + (i - 2 >= 0 ? even[i - 2] : 0);
			} else {
				odd[i] = A[i] + (i - 2 >= 0 ? odd[i - 2] : 0);
			}
			sum[i] = A[i] + (i > 0 ? sum[i - 1] : 0);
		}
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < Q; ++i) {
			long ng = N;
			long ok = 0;
			while (ng - ok > 1) {
				long m = (ok + ng) / 2;
				int[] get = f(A, m, X[i]);
				int l = get[0];
				int r = get[1];
				if (r - l > N - r)
					ng = m;
				else
					ok = m;
			}
			int[] get = f(A, ok, X[i]);
			int l = get[0];
			int r = get[1];
			while (r - l < N - r - 1) {
				if (l == 0) {
					++r;
					continue;
				}
				if (r == N) {
					--l;
					continue;
				}
				if (Math.abs(A[l - 1] - X[i]) <= Math.abs(A[r] - X[i])) {
					--l;
				} else {
					++r;
				}
			}
			long ans = 0;
			if (N <= r) {
				if ((N - 1) % 2 == 0)
					pw.println(even[N - 1]);
				else
					pw.println(odd[N - 1]);
				continue;
			}
			if (N > r)
				ans += sum[N - 1] - (r > 0 ? sum[r - 1] : 0);
			if (r - l + 1 == N - r) {
				--l;
			}
			if (l - 1 >= 0) {
				if ((l - 1) % 2 == 0) {
					ans += even[l - 1];
				} else {
					ans += odd[l - 1];
				}
			}
			pw.println(ans);
		}
		pw.close();
	}

	int[] f(long[] A, long m, long x) {
		int l = Arrays.binarySearch(A, x - m);
		int r = Arrays.binarySearch(A, x + m);
		if (l < 0)
			l = -l - 1;
		if (r < 0)
			r = -r - 1;
		if (r < A.length && A[r] == x + m)
			++r;
		return new int[] { l, r };

	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

}

class DJSet {

	int n;
	int[] p;

	public DJSet(int n_) {
		n = n_;
		p = new int[n];
		Arrays.fill(p, -1);
	}

	int root(int x) {
		return p[x] < 0 ? x : (p[x] = root(p[x]));
	}

	boolean equiv(int x, int y) {
		return root(x) == root(y);
	}

	void setUnion(int x, int y) {
		x = root(x);
		y = root(y);
		if (x == y)
			return;
		if (p[x] < p[y]) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		p[y] += p[x];
		p[x] = y;
	}

	int sz(int x) {
		return -p[root(x)];
	}

}

class Scanner {
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
}
