import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	
	static boolean nextPermutation(int[] a) {
		int n = a.length;
		int ptr = n - 1;
		while (ptr > 0 && a[ptr - 1] >= a[ptr]) {
			ptr--;
		}

		for (int i = ptr, j = n - 1; i < j; i++, j--) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
		
		if (ptr <= 0) {
			return false;
		}

		for (int i = ptr;; i++) {
			if (a[ptr - 1] < a[i]) {
				int tmp = a[ptr - 1];
				a[ptr - 1] = a[i];
				a[i] = tmp;
				return true;
			}
		}
	}

	long slow(int[] ls, int[] rs) {
		int n = ls.length;
		
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = i;
		}
		
		long ret = -1;
		
		do {
			int pos = 0;
			int path = 0;
			
			for (int i : p) {
				if (pos > rs[i]) {
					path += Math.abs(pos - rs[i]);
					pos = rs[i];
				} else if (pos < ls[i]) {
					path += Math.abs(pos - ls[i]);
					pos = ls[i];
				} 
			}
			
			path += Math.abs(pos);
			ret = Math.max(ret, path);
		} while (nextPermutation(p));
		return ret;
	}
	
	long solve(int[] ls, int[] rs) {
		int n = ls.length;
		
		int[] all = new int[2 * n + 1];
		for (int i = 0; i < n; i++) {
			all[2 * i] = ls[i];
			all[2 * i + 1] = rs[i];
		}
		
		all[2 * n] = 0;
		
		all = unique(all);
		
		int[] start = new int[all.length];
		int[] end = new int[all.length];
		
		for (int i = 0; i < n; i++) {
			int p = Arrays.binarySearch(all, ls[i]);
			int q = Arrays.binarySearch(all, rs[i]);
			start[p]++;
			end[q]++;
		}
		
		int zero = Arrays.binarySearch(all, 0);
		start[zero]++;
		end[zero]++;

		int left = 0;
		int right = n + 1;
		
		long ret = 0;
		
		for (int i = 0; i < all.length - 1; i++) {
			right -= start[i];
			left += end[i];
			int len = all[i + 1] - all[i];
			int mult = Math.min(left, right);
			
			ret += (long)len * mult;
		}
		
		return 2L * ret;
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
	
	void submit() {
		int n = nextInt();
		int[] ls = new int[n];
		int[] rs = new int[n];
		
		for (int i = 0; i < n; i++) {
			ls[i] = nextInt();
			rs[i] = nextInt();
		}
		
		out.println(solve(ls, rs));
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
