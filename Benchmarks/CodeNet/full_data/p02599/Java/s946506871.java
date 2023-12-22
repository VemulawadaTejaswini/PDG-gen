// package beginner174;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {

	private static PrintWriter out;

	public static void solve() {
		In in = new In();
		int n = in.ni();
		int Q = in.ni();
		int[] nums = in.nia(n);
		int[][] queries = new int[Q][];
		for (int i = 0; i < Q; i++)
			queries[i] = new int[] { in.ni() - 1, in.ni() - 1, i };

		int[] last = new int[500001];
		Arrays.fill(last, -1);

		Arrays.sort(queries, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[1] - b[1];
			}
		});

		int[] ans = new int[Q];
		BinaryIndexedTree bit = new BinaryIndexedTree(n);

		int counter = 0; // next query position to process
		for (int i = 0; i < n; i++) {

			if (last[nums[i]] != -1) bit.add(last[nums[i]], -1);
			bit.add(i, 1);
			last[nums[i]] = i;
 

			// If i is equal to r of any query store answer
			// for that query in ans[]
			while (counter < Q && queries[counter][1] == i) {
				ans[queries[counter][2]] = bit.sum(queries[counter][0], queries[counter][1]);
				counter++;
			}
		}

		for (int x : ans)
			System.out.println(x);

	}

	static class BinaryIndexedTree {

		private final int[] vals; // array for which the prefix sum is evaluated
		private final int[] tree; // represents the BIT
		private final int size; // the size of the input array

		public BinaryIndexedTree(int n) {
			size = n;
			vals = new int[size];
			tree = new int[size + 1];
		}

		public BinaryIndexedTree(int[] nums) {
			size = nums.length;
			vals = Arrays.copyOf(nums, size);
			tree = new int[size + 1];
			for (int i = 0; i < size; i++)
				this.update(i, vals[i]);
		}

		public void update(int index, int value) {
			validate(index);
			final int diff = value - vals[index];
			add(index, diff);
		}

		public void add(int index, int value) {
			validate(index);
			vals[index] += value;
			for (int i = index + 1; i <= size; i += i & -i)
				tree[i] += value;
		}

		public int sum(int index) {
			validate(index);
			int sum = 0;
			for (int i = index + 1; i > 0; i -= i & -i)
				sum += tree[i];
			return sum;
		}

		public int sum(int start, int end) {
			validate(start);
			validate(end);
			if (start > end)
				throw new IllegalArgumentException(
						"start:" + start + " should not be greater than end:" + end);
			return start == 0 ? sum(end) : sum(end) - sum(start - 1);
		}

		public int size() {
			return size;
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder();
			for (int i = 0; i < size; i++) {
				sb.append("index: ");
				sb.append(i);
				sb.append(" value: ");
				sb.append(vals[i]);
				sb.append(" sum: ");
				sb.append(sum(i));
				sb.append("\n");
			}
			return sb.toString();
		}

		private void validate(int index) {
			if (index < 0 || index >= size)
				throw new IllegalArgumentException(
						"start: " + index + " should be between 0 and " + (size - 1));
		}
	}

	public static void main(String[] args) throws IOException {
		// long start = System.nanoTime();
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		// System.out.println("Elapsed: " + (System.nanoTime() - start) / 1000000 +
		// "ns");
	}

	@SuppressWarnings("unused")
	private static class In {
		final private static int BUFFER_SIZE = 1024;
		private byte[] buf;
		private InputStream is;
		private int buflen;
		private int bufptr;

		public In() {
			is = System.in;
			buf = new byte[BUFFER_SIZE];
			buflen = bufptr = 0;
		}

		public In(String input) {
			is = new ByteArrayInputStream(input.getBytes());
			buf = new byte[BUFFER_SIZE];
			buflen = bufptr = 0;
		}

		public int readByte() {
			if (bufptr >= buflen) {
				try {
					buflen = is.read(buf);
				} catch (IOException ioe) {
					throw new InputMismatchException();
				}
				bufptr = 0;
			}
			if (buflen <= 0)
				return -1;
			return buf[bufptr++];
		}

		public boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		public int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b))
				;
			return b;
		}

		/* Next character */
		public char nc() {
			return (char) skip();
		}

		/* Next double */
		public double nd() {
			return Double.parseDouble(ns());
		}

		/* Next string */
		public String ns() {
			final StringBuilder sb = new StringBuilder();
			int b = skip();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		/* Next integer */
		public int ni() {
			boolean minus = false;
			int num = 0;
			int b;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
				b = readByte();
			}
			return minus ? -num : num;
		}

		/* Next long */
		public long nl() {
			boolean minus = false;
			long num = 0;
			int b;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
				;
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
				b = readByte();
			}
			return minus ? -num : num;
		}

		/* Next integer 1D array */
		public int[] nia(int n) {
			final int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = ni();
			return arr;
		}

		/* Next long 1D array */
		public long[] nla(int n) {
			final long[] arr = new long[n];
			for (int i = 0; i < n; i++)
				arr[i] = nl();
			return arr;
		}

		/* Next string 1D array */
		public String[] nsa(int n) {
			final String[] arr = new String[n];
			for (int i = 0; i < n; i++)
				arr[i] = ns();
			return arr;
		}

		/* Next char 1D array */
		public char[] nca(int n) {
			final char[] arr = new char[n];
			for (int i = 0; i < n; i++)
				arr[i] = nc();
			return arr;
		}

		/* Next double 1D array */
		public double[] nda(int n) {
			final double[] arr = new double[n];
			for (int i = 0; i < n; i++)
				arr[i] = nc();
			return arr;
		}

		/* Next integer matrix */
		public int[][] nim(int n, int m) {
			final int[][] arr = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = ni();
			return arr;
		}

		/* Next long matrix */
		public long[][] nlm(int n, int m) {
			final long[][] arr = new long[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nl();
			return arr;
		}

		/* Next string matrix */
		public String[][] nsm(int n, int m) {
			final String[][] arr = new String[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = ns();
			return arr;
		}

		/* Next char matrix */
		public char[][] ncm(int n, int m) {
			final char[][] arr = new char[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nc();
			return arr;
		}

		/* Next double matrix */
		public double[][] ndm(int n, int m) {
			final double[][] arr = new double[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					arr[i][j] = nd();
			return arr;
		}

		public static void log(Object... o) {
			System.out.println(Arrays.deepToString(o));
		}
	}

}
