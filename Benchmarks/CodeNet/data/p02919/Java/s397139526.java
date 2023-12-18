import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	class SegMax {
		int n;
		int[] v;

		public SegMax(int n_) {
			n = 1;
			while (n < n_)
				n *= 2;
			v = new int[2 * n - 1];
			Arrays.fill(v, -1);
		}

		void setVal(int k, int val) {
			k += n - 1;
			v[k] = val;
			while (k > 0) {
				k = (k - 1) / 2;
				v[k] = Math.max(v[2 * k + 1], v[2 * k + 2]);
			}
		}

		int query(int a, int b) {
			return query(0, n, a, b, 0);
		}

		int query(int l, int r, int a, int b, int k) {
			if (r <= a || b <= l)
				return -1;
			else if (a <= l && r <= b) {
				return v[k];
			} else {
				return Math.max(query(l, (l + r) / 2, a, b, 2 * k + 1), query((l + r) / 2, r, a, b, 2 * k + 2));
			}
		}
	}

	class SegMin {
		int n;
		int ma;
		int[] v;

		public SegMin(int n_) {
			ma = n_;
			n = 1;
			while (n < n_)
				n *= 2;
			v = new int[2 * n - 1];
			Arrays.fill(v, ma);
		}

		void setVal(int k, int val) {
			k += n - 1;
			v[k] = val;
			while (k > 0) {
				k = (k - 1) / 2;
				v[k] = Math.min(v[2 * k + 1], v[2 * k + 2]);
			}
		}

		int query(int a, int b) {
			return query(0, n, a, b, 0);
		}

		int query(int l, int r, int a, int b, int k) {
			if (r <= a || b <= l)
				return ma;
			else if (a <= l && r <= b) {
				return v[k];
			} else {
				return Math.min(query(l, (l + r) / 2, a, b, 2 * k + 1), query((l + r) / 2, r, a, b, 2 * k + 2));
			}
		}
	}

	void run() {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int[] P = new int[N];
		int[] Q = new int[N];
		int[] ne = new int[N];
		int[] pr = new int[N];
		Arrays.fill(ne, -1);
		Arrays.fill(pr, -1);
		SegMax ma = new SegMax(N);
		SegMin mi = new SegMin(N);
		for (int i = 0; i < N; ++i) {
			P[i] = sc.nextInt();
			--P[i];
			Q[P[i]] = i;
		}
		ma.setVal(Q[N - 1], Q[N - 1]);
		mi.setVal(Q[N - 1], Q[N - 1]);
		long ans = 0;
		for (int i = N - 2; i >= 0; --i) {
			long r1 = mi.query(Q[i], N);
			long r2 = mi.query((int) r1 + 1, N);
			long l1 = ma.query(0, Q[i]);
			long l2 = ma.query(0, (int) l1);
			ans += (r2 - r1) * (Q[i] - l1) * (i + 1);
			ans += (l1 - l2) * (r1 - Q[i]) * (i + 1);
			ma.setVal(Q[i], Q[i]);
			mi.setVal(Q[i], Q[i]);
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
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
