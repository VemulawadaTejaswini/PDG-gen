import java.io.*;
import java.util.*;

public class Main implements Runnable {
	boolean oj = true;
	Reader scn;
	PrintWriter out;
	String INPUT = "";

	void solve() {
		int n = scn.nextInt(), m = scn.nextInt(), k = scn.nextInt();

		int x = scn.nextInt(), y = scn.nextInt();
		int dxx = scn.nextInt(), dyy = scn.nextInt();

		boolean[][] arr = new boolean[n + 2][m + 2];
		for (int i = 1; i <= n; i++) {
			String s = scn.next();
			for (int j = 1; j <= m; j++) {
				if (s.charAt(j - 1) == '.') {
					arr[i][j] = true;
				}
			}
		}

		int[][] dp = new int[n + 2][m + 2];
		scn.deepFillInt(dp, Integer.MAX_VALUE);
		dp[x][y] = 0;
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((o1, o2) -> o1[2] - o2[2]);
		pq.add(new int[] { x, y, 0, 0, -1 });

		int[] dx = { 0, 0, 1, -1 };
		int[] dy = { 1, -1, 0, 0 };

		int d = 0, rem = 0;
		while (!pq.isEmpty()) {
			int[] rv = pq.poll();
			x = rv[0];
			y = rv[1];
			d = rv[2];
			rem = rv[3];

			for (int z = 0; z < 4; z++) {
				int i = x + dx[z], j = y + dy[z];
				if (!arr[i][j]) {
					continue;
				}
				int steps = d, rm = rem - 1;
				if(z == rv[4]) {
					if(rem == 0) {
						steps++;
						rm = k - 1;
					}
				} else {
					steps++;
					rm = k - 1;
				}
				if (dp[i][j] > steps) {
					dp[i][j] = steps;
					pq.add(new int[] { i, j, steps, rm, z });
				}
			}
		}
		if(dp[dxx][dyy] == Integer.MAX_VALUE) {
			dp[dxx][dyy] = -1;
		}
		out.println(dp[dxx][dyy]);
	}

	public void run() {
		long time = System.currentTimeMillis();
		boolean judge = System.getProperty("ONLINE_JUDGE") != null || oj;
		out = new PrintWriter(System.out);
		scn = new Reader(judge);
		solve();
		out.flush();
		if (!judge) {
			System.out.println(Arrays.deepToString(new Object[] { System.currentTimeMillis() - time + " ms" }));
		}
	}

	public static void main(String[] args) {
		new Thread(null, new Main(), "Main", 1 << 28).start();
	}

	class Reader {
		InputStream is;

		public Reader(boolean oj) {
			is = oj ? System.in : new ByteArrayInputStream(INPUT.getBytes());
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

		String next() {
			int b = skip();
			StringBuilder stringB = new StringBuilder();
			while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
				stringB.appendCodePoint(b);
				b = readByte();
			}
			return stringB.toString();
		}

		String nextLine() {
			int b = skip();
			StringBuilder stringB = new StringBuilder();
			while ((!isSpaceChar(b) || b == ' ')) { // when nextLine, (isSpaceChar(b) && b != ' ')
				stringB.appendCodePoint(b);
				b = readByte();
			}
			return stringB.toString();
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		char nextChar() {
			return (char) skip();
		}

		char[] next(int n) {
			char[] buff = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buff[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buff : Arrays.copyOf(buff, p);
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

		long[] nextLongArr(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		int[] nextIntArr(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		char[][] nextMat(int n, int m) {
			char[][] map = new char[n][];
			for (int i = 0; i < n; i++)
				map[i] = next(m);
			return map;
		}

		long[][] next2Long(int n, int m) {
			long[][] arr = new long[n][];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLongArr(m);
			}
			return arr;
		}

		int[][] next2Int(int n, int m) {
			int[][] arr = new int[n][];
			for (int i = 0; i < n; i++) {
				arr[i] = nextIntArr(m);
			}
			return arr;
		}

		long[] shuffle(long[] arr) {
			Random r = new Random();
			for (int i = 1, j; i < arr.length; i++) {
				j = r.nextInt(i);
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
			}
			return arr;
		}

		int[] shuffle(int[] arr) {
			Random r = new Random();
			for (int i = 1, j; i < arr.length; i++) {
				j = r.nextInt(i);
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
			}
			return arr;
		}

		long[] uniq(long[] arr) {
			arr = scn.shuffle(arr);
			Arrays.parallelSort(arr);
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

		int[] uniq(int[] arr) {
			arr = scn.shuffle(arr);
			Arrays.parallelSort(arr);
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

		long[] reverse(long[] arr) {
			int i = 0, j = arr.length - 1;
			while (i < j) {
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
				i++;
				j--;
			}
			return arr;
		}

		int[] reverse(int[] arr) {
			int i = 0, j = arr.length - 1;
			while (i < j) {
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
				i++;
				j--;
			}
			return arr;
		}

		long[] compres(long[] arr) {
			int n = arr.length;
			long[] rv = Arrays.copyOf(arr, n);
			rv = uniq(rv);
			for (int i = 0; i < n; i++) {
				arr[i] = Arrays.binarySearch(rv, arr[i]);
			}
			return arr;
		}

		int[] compres(int[] arr) {
			int n = arr.length;
			int[] rv = Arrays.copyOf(arr, n);
			rv = uniq(rv);
			for (int i = 0; i < n; i++) {
				arr[i] = Arrays.binarySearch(rv, arr[i]);
			}
			return arr;
		}

		void deepFillLong(Object array, long val) {
			if (!array.getClass().isArray()) {
				throw new IllegalArgumentException();
			}
			if (array instanceof long[]) {
				long[] intArray = (long[]) array;
				Arrays.fill(intArray, val);
			} else {
				Object[] objArray = (Object[]) array;
				for (Object obj : objArray) {
					deepFillLong(obj, val);
				}
			}
		}

		void deepFillInt(Object array, int val) {
			if (!array.getClass().isArray()) {
				throw new IllegalArgumentException();
			}
			if (array instanceof int[]) {
				int[] intArray = (int[]) array;
				Arrays.fill(intArray, val);
			} else {
				Object[] objArray = (Object[]) array;
				for (Object obj : objArray) {
					deepFillInt(obj, val);
				}
			}
		}

		void tr(Object... o) {
			if (!oj)
				System.out.println(Arrays.deepToString(o));
		}
	}
}