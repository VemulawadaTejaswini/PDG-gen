import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
	static PrintWriter out;
	static InputReader ir;
	static final long INF = Long.MAX_VALUE;

	static void solve() {
		int n = ir.nextInt();
		int m = ir.nextInt();
		long[][] a = new long[n][];
		long[][] b = new long[m][];
		for (int i = 0; i < n; i++)
			a[i] = ir.nextLongArray(3);
		for (int i = 0; i < m; i++) {
			b[i] = ir.nextLongArray(3);
			long x = b[i][0];
			long y = b[i][1];
			long z = b[i][2];
			b[i][0] = y;
			b[i][1] = z;
			b[i][2] = x;
		}
		Arrays.sort(a, new Comparator<long[]>() {
			public int compare(long[] A, long[] B) {
				return Long.compare(A[2], B[2]);
			}
		});
		ArrayList<Long> ax = new ArrayList<>();
		ax.add(a[0][2]);
		for (int i = 0; i < n - 1; i++) {
			if (a[i][2] != a[i + 1][2])
				ax.add(a[i + 1][2]);
		}
		Arrays.sort(b, new Comparator<long[]>() {
			public int compare(long[] A, long[] B) {
				return Long.compare(A[2], B[2]);
			}
		});
		ArrayList<Long> by = new ArrayList<>();
		by.add(b[0][2]);
		for (int i = 0; i < m - 1; i++) {
			if (b[i][2] != b[i + 1][2])
				by.add(b[i + 1][2]);
		}
		int nn = ax.size() + 1;
		int mm = by.size() + 1;
		long[] area = new long[nn * mm + 1];
		for (int i = 0; i <= nn * mm; i++) {
			if (i <= mm - 1 || i % mm == mm - 1 || i % mm == 0 || i >= mm * (nn - 1))
				area[i] = INF;
			else {
				int x = i / mm;
				int y = i % mm;
				x--;
				y--;
				area[i] = (ax.get(x + 1) - ax.get(x)) * (by.get(y + 1) - by.get(y));
			}
		}
		int cur = 0;
		UnionFindTree uf = new UnionFindTree(nn * mm, area);
		nn--;
		mm--;
		for (int i = 0; i < nn; i++) {
			int[] imos = new int[mm + 1];
			while (cur < n && a[cur][2] == ax.get(i)) {
				int bidx = lower_bound(by, 0, mm - 1, a[cur][0]);
				int eidx = upper_bound(by, 0, mm - 1, a[cur][1]) - 1;
				if (eidx > bidx) {
					imos[bidx]++;
					imos[eidx]--;
				}
				cur++;
			}
			for (int j = 0; j < mm - 1; j++) {
				imos[j + 1] += imos[j];
			}
			for (int j = 0; j < mm - 1; j++) {
				if (imos[j] == 0) {
					uf.unite((mm + 1) * i + j + 1, (mm + 1) * (i + 1) + j + 1);
				}
			}
		}
		// tr(area);
		cur = 0;
		for (int i = 0; i < mm; i++) {
			int[] imos = new int[nn + 1];
			while (cur < m && b[cur][2] == by.get(i)) {
				int bidx = lower_bound(ax, 0, nn - 1, b[cur][0]);
				int eidx = upper_bound(ax, 0, nn - 1, b[cur][1]) - 1;
				if (eidx > bidx) {
					imos[bidx]++;
					imos[eidx]--;
				}
				cur++;
			}
			for (int j = 0; j < nn - 1; j++) {
				imos[j + 1] += imos[j];
			}
			for (int j = 0; j < nn - 1; j++) {
				if (imos[j] == 0) {
					uf.unite((mm + 1) * (j + 1) + i, (mm + 1) * (j + 1) + i + 1);
					// tr(j, i);
				}
			}
		}
		int p = lower_bound(ax, 0, nn - 1, 0);
		int q = lower_bound(by, 0, mm - 1, 0);
		long res = uf.size(p * (mm + 1) + q);
		out.println(res == INF ? "INF" : res);
	}

	public static int upper_bound(ArrayList<Long> a, int fromIndex, int toIndex, long val) {
		if (val >= a.get(toIndex))
			return toIndex + 1;
		if (val < a.get(fromIndex))
			return fromIndex;
		int lb = fromIndex - 1, ub = toIndex;
		while (ub - lb > 1) {
			int mid = (ub - lb) / 2 + lb;
			if (a.get(mid) > val) {
				ub = mid;
			} else {
				lb = mid;
			}
		}
		return ub;
	}

	public static int lower_bound(ArrayList<Long> a, int fromIndex, int toIndex, long val) {
		if (val > a.get(toIndex))
			return toIndex + 1;
		if (val <= a.get(fromIndex))
			return fromIndex;
		int lb = fromIndex - 1, ub = toIndex;
		while (ub - lb > 1) {
			int mid = (ub - lb) / 2 + lb;
			if (a.get(mid) >= val) {
				ub = mid;
			} else {
				lb = mid;
			}
		}
		return ub;
	}

	static class UnionFindTree {

		private long[] par;
		private int[] rank;
		private int g;

		public UnionFindTree(int size, long[] area) {
			par = new long[size];
			rank = new int[size];
			g = size;
			for (int i = 0; i < size; i++) {
				par[i] = area[i] == INF ? -INF : -area[i];
				rank[i] = 0;
			}
		}

		public long find(long x) {
			if (par[(int) x] < 0)
				return (int) x;
			else
				return par[(int) x] = find(par[(int) x]);
		}

		public void unite(int x, int y) {
			x = (int) find(x);
			y = (int) find(y);
			if (x == y)
				return;
			else if (rank[x] > rank[y]) {
				if (par[x] == -INF || par[y] == -INF)
					par[x] = -INF;
				else
					par[x] += par[y];
				par[y] = x;
			} else {
				if (par[x] == -INF || par[y] == -INF)
					par[y] = -INF;
				else
					par[y] += par[x];
				par[x] = y;
				if (rank[x] == rank[y])
					rank[y]++;
			}
			g--;
		}

		public int groups() {
			return g;
		}

		public long size(int x) {
			return -par[(int) find(x)];
		}

		public boolean same(int x, int y) {
			return find(x) == find(y);
		}
	}

	public static int[] compress(long[] a) {
		int n = a.length;
		long[] r = a.clone();
		Arrays.sort(r);
		int[] ret = new int[n];
		for (int i = 0; i < n; i++)
			ret[i] = lower_bound(r, 0, n - 1, a[i]);
		return ret;
	}

	public static int lower_bound(long[] a, int fromIndex, int toIndex, long val) {
		if (val > a[toIndex])
			return toIndex + 1;
		if (val <= a[fromIndex])
			return fromIndex;
		int lb = fromIndex - 1, ub = toIndex;
		while (ub - lb > 1) {
			int mid = (ub - lb) / 2 + lb;
			if (a[mid] >= val) {
				ub = mid;
			} else {
				lb = mid;
			}
		}
		return ub;
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		System.err.println(Arrays.deepToString(o));
	}
}
