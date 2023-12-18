import java.io.*;
import java.util.*;

public class Main implements Runnable {
	FastReader scn;
	PrintWriter out;
	String INPUT = "";

	void solve() {
		int n = scn.nextInt();
		int[] arr = new int[n + 2];
		for (int i = 1; i <= n; i++) {
			arr[i] = scn.nextInt();
		}
		arr[n + 1] = (int) 1e6;

		n++;
		int[] st = new int[n + 1], left = new int[n + 1], right = new int[n + 1];

		int top = -1;
		for (int i = 1; i <= n; i++) {
			while (top != -1 && arr[st[top]] < arr[i]) {
				top--;
			}
			left[i] = top == -1 ? 0 : st[top];
			st[++top] = i;
		}

		top = -1;
		for (int i = n; i > 0; i--) {
			while (top != -1 && arr[st[top]] < arr[i]) {
				top--;
			}
			right[i] = top == -1 ? n + 1 : st[top];
			st[++top] = i;
		}

		seg = new int[4 * n];
		build(1, 1, n, arr);

		long ans = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] == n - 1) {
				continue;
			}
			int lf = left[i], rt = right[i];

			long sub = 0;

			// right part
			if (rt != n) {
				int x = i - lf, y;

				int rv = queryRight(1, 1, n, rt + 1, right[rt], arr[i]);
				y = Math.max(1, rv - rt);

				sub += x * 1L * y;
			}

			// left part
			if (lf != 0) {
				int x = rt - i, y;

				int rv = queryLeft(1, 1, n, left[lf], lf - 1, arr[i]);
				y = Math.max(1, lf - rv);

				sub += x * 1L * y;
			}

			ans += sub * arr[i];
		}

		out.println(ans);
	}

	int[] seg;

	int queryLeft(int ind, int l, int r, int si, int li, int val) {
		if (l > li || r < si || l > r) {
			return (int) 0;
		}

		if (l == r) {
			if (seg[ind] > val)
				return l;
			return 0;
		}

		int m = (l + r) >> 1;
		if (l >= si && r <= li) {
			if (seg[2 * ind + 1] > val) {
				return queryLeft(2 * ind + 1, m + 1, r, si, li, val);
			} else {
				return queryLeft(2 * ind, l, m, si, li, val);				
			}
		}

		int a = queryLeft(2 * ind, l, m, si, li, val);
		int b = queryLeft(2 * ind + 1, m + 1, r, si, li, val);

		return Math.max(a, b);
	}

	int queryRight(int ind, int l, int r, int si, int li, int val) {
		if (l > li || r < si || l > r) {
			return (int) 1e6;
		}

		if (l == r) {
			if (seg[ind] > val)
				return l;
			return (int) 1e6;
		}

		int m = (l + r) >> 1;
		if (l >= si && r <= li) {
			if (seg[2 * ind] > val) {
				return queryRight(2 * ind, l, m, si, li, val);
			} else {
				return queryRight(2 * ind + 1, m + 1, r, si, li, val);
			}
		}

		int a = queryRight(2 * ind, l, m, si, li, val);
		int b = queryRight(2 * ind + 1, m + 1, r, si, li, val);

		return Math.min(a, b);
	}

	void build(int ind, int l, int r, int[] arr) {
		if (l == r) {
			seg[ind] = arr[l];
			return;
		}
		int m = (l + r) >> 1;
		build(2 * ind, l, m, arr);
		build(2 * ind + 1, m + 1, r, arr);
		seg[ind] = Math.max(seg[2 * ind], seg[2 * ind + 1]);
	}

	public void run() {
		long time = System.currentTimeMillis();
		boolean oj = true;
		out = new PrintWriter(System.out);
		scn = new FastReader(oj);
		solve();
		out.flush();
		if (!oj) {
			System.out.println(Arrays.deepToString(new Object[] { System.currentTimeMillis() - time + " ms" }));
		}
	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "Main", 1 << 26).start();
	}

	class FastReader {
		InputStream is;

		public FastReader(boolean onlineJudge) {
			is = onlineJudge ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		}

		public FastReader() {
			is = System.in;
		}

		byte[] inbuf = new byte[1024];
		public int lenbuf = 0, ptrbuf = 0;

		int readByte() {
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

		boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b))
				;
			return b;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		char nextChar() {
			return (char) skip();
		}

		String next() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		String nextLine() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while ((!isSpaceChar(b) || b == ' ')) { // when nextLine, (isSpaceChar(b) && b != ' ')
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		char[] next(int n) {
			char[] buf = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buf[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buf : Arrays.copyOf(buf, p);
		}

		int nextInt() {
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

		long nextLong() {
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

		char[][] nextMatrix(int n, int m) {
			char[][] map = new char[n][];
			for (int i = 0; i < n; i++)
				map[i] = next(m);
			return map;
		}

		int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		int[][] IndIntArray(int n) {
			int[][] a = new int[n][];
			for (int i = 0; i < n; i++)
				a[i] = new int[] { nextInt(), i };
			return a;
		}

		long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		int[][] next2DInt(int n, int m) {
			int[][] arr = new int[n][];
			for (int i = 0; i < n; i++) {
				arr[i] = nextIntArray(m);
			}
			return arr;
		}

		long[][] next2DLong(int n, int m) {
			long[][] arr = new long[n][];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLongArray(m);
			}
			return arr;
		}

		int[] shuffle(int[] arr) {
			Random r = new Random();
			for (int i = 1, j; i < arr.length; i++) {
				j = r.nextInt(i);
				int c = arr[i];
				arr[i] = arr[j];
				arr[j] = c;
			}
			return arr;
		}

		long[] shuffle(long[] arr) {
			Random r = new Random();
			for (int i = 1, j; i < arr.length; i++) {
				j = r.nextInt(i);
				long c = arr[i];
				arr[i] = arr[j];
				arr[j] = c;
			}
			return arr;
		}

		int[] uniq(int[] arr) {
			arr = scn.shuffle(arr);
			Arrays.sort(arr);
			int[] rv = new int[arr.length];
			int pos = 0;
			rv[pos++] = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] != arr[i - 1]) {
					rv[pos++] = arr[i];
				}
			}
			return Arrays.copyOf(rv, pos);
		}

		long[] uniq(long[] arr) {
			arr = scn.shuffle(arr);
			Arrays.sort(arr);
			long[] rv = new long[arr.length];
			int pos = 0;
			rv[pos++] = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] != arr[i - 1]) {
					rv[pos++] = arr[i];
				}
			}
			return Arrays.copyOf(rv, pos);
		}

		int[] reverse(int[] arr) {
			int l = 0, r = arr.length - 1;
			while (l < r) {
				arr[l] = arr[l] ^ arr[r];
				arr[r] = arr[l] ^ arr[r];
				arr[l] = arr[l] ^ arr[r];
				l++;
				r--;
			}
			return arr;
		}

		long[] reverse(long[] arr) {
			int l = 0, r = arr.length - 1;
			while (l < r) {
				arr[l] = arr[l] ^ arr[r];
				arr[r] = arr[l] ^ arr[r];
				arr[l] = arr[l] ^ arr[r];
				l++;
				r--;
			}
			return arr;
		}

		int[] compress(int[] arr) {
			int n = arr.length;
			int[] rv = Arrays.copyOf(arr, n);
			rv = uniq(rv);
			for (int i = 0; i < n; i++) {
				arr[i] = Arrays.binarySearch(rv, arr[i]);
			}
			return arr;
		}

		long[] compress(long[] arr) {
			int n = arr.length;
			long[] rv = Arrays.copyOf(arr, n);
			rv = uniq(rv);
			for (int i = 0; i < n; i++) {
				arr[i] = Arrays.binarySearch(rv, arr[i]);
			}
			return arr;
		}
	}
}