//package AtCoder;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

class Main {

	public static class Node {
		int low;
		int high;
		Node left, right;
		int[] Aux;
		
		public Node(int low, int high, int start, int end, int[] arr) {
			this.low = Integer.MAX_VALUE;
			this.high = 0;
			if(start == end) {
				this.low = arr[start];
				this.high = arr[start];
			}
			if(low == high || start >= end) {
				return;
			}
			double mid = (low + high)/2D;
			Fill_aux(arr, start, end, mid);
			int pivot = Partition(arr, start, end, mid);
			left = new Node(low, (int)mid, start, pivot, arr);
			right = new Node((int)mid + 1, high, pivot + 1, end, arr);
		}
		
		public void Fill_aux(int[] arr, int start, int end, double mid) {
			Aux = new int[end - start + 2];
			for(int i = start; i <= end; i++){
				Aux[i - start + 1] = Aux[i - start] + (arr[i] <= mid ? 1 : 0);
			}
		}
		
		public int Partition(int[] arr, int start, int end, double mid) {
			ArrayList<Integer> small = new ArrayList<Integer>();
			ArrayList<Integer> big = new ArrayList<Integer>();
			for(int i = start; i <= end; i++) {
				this.low = Integer.min(this.low, arr[i]);
				this.high = Integer.max(this.high, arr[i]);
				if(arr[i] <= mid) {
					small.add(arr[i]);
				}else {
					big.add(arr[i]);
				}
			}
			int ptr = start;
			for(Integer x : small) {
				arr[ptr++] = x;
			}
			int pivot = ptr - 1;
			for(Integer x : big) {
				arr[ptr++] = x;
			}
			return pivot;
		}
		
	}

	public static int Query(Node curr, int start, int end, int val) {
		if(curr.low > val || start > end) return 0;
		if(curr.high <= val) return end - start + 1;
		int ls = curr.Aux[start - 1];
		int le = curr.Aux[end];
		return Query(curr.left, ls + 1, le, val) + Query(curr.right, start - ls, end - le, val);
	}
	
	public static void solve() {
		int n = s.nextInt();
		int q = s.nextInt();
		int[] arr = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = s.nextInt();
		}
		int[] count = new int[n + 1];
		Arrays.fill(count, -1);
		int[] next = new int[n + 1];
		int min = Integer.MAX_VALUE, max = 0;
		for(int i = n; i >= 1; i--) {
			if(count[arr[i]] != -1) {
				next[i] = count[arr[i]];
				count[arr[i]] = i;
			}else {
				next[i] = n + 1;
				count[arr[i]] = i;
			}
			min = Integer.min(next[i], min);
			max = Integer.max(next[i], max);
		}
		Node root = new Node(min, max, 1, n, next);
		while(q-- > 0) {
			int l = s.nextInt();
			int r = s.nextInt();
			int ans = r - l + 1 - Query(root, l, r, r);
			out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Thread(null, null, "Thread", 1 << 27) {
			public void run() {
				try {
					out = new PrintWriter(new BufferedOutputStream(System.out));
					s = new FastReader(System.in);
					solve();
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(1);
				}
			}
		}.start();
	}

	public static PrintWriter out;
	public static FastReader s;

	public static class FastReader {

		private InputStream stream;
		private byte[] buf = new byte[4096];
		private int curChar, snumChars;

		public FastReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (snumChars == -1) {
				throw new InputMismatchException();
			}
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException E) {
					throw new InputMismatchException();
				}
			}
			if (snumChars <= 0) {
				return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int number = 0;
			do {
				number *= 10;
				number += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return number * sgn;
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			long sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long number = 0;
			do {
				number *= 10L;
				number += (long) (c - '0');
				c = read();
			} while (!isSpaceChar(c));
			return number * sgn;
		}

		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = this.nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = this.nextLong();
			}
			return arr;
		}

		public String next() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndofLine(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public boolean isEndofLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

	}

	
}
