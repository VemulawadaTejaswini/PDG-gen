import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	static class Event implements Comparable<Event> {
		int x, type, id;

		@Override
		public int compareTo(Event o) {
			return Integer.compare(x, o.x);
		}

		public Event(int x, int type, int id) {
			this.x = x;
			this.type = type;
			this.id = id;
		}
	}
	
	long go(int[] a, int[] b) {
		int n = a.length;
		
		Event[] c = new Event[2 * n];
		for (int i = 0; i < n; i++) {
			c[2 * i] = new Event(a[i], 0, i);
			c[2 * i + 1] = new Event(b[i], 1, i);
		}
		
		Arrays.sort(c);
		
		int p = BigInteger.probablePrime(10, rng).intValue();
		long P = BigInteger.probablePrime(29, rng).longValue();
		int[] pow = new int[n];
		pow[0] = 1;
		for (int i = 1; i < pow.length; i++) {
			pow[i] = (int)((long)pow[i - 1] * p % P);
		}
		
		int leftA = 0, leftB = 0;
		
		long setLeftA = 0, setRightB = 0;
		
		for (int i = 0; i < n; i++) {
			setRightB += pow[i];
			if (setRightB >= P) {
				setRightB -= P;
			}
		}
		
		long ret = 0;
		
		for (int i = 0; i < c.length - 1; i++) {
			Event ev = c[i];
			if (ev.type == 0) {
				leftA++;
				setLeftA += pow[ev.id];
				if (setLeftA >= P) {
					setLeftA -= P;
				}
			} else {
				leftB++;
				setRightB -= pow[ev.id];
				if (setRightB < 0) {
					setRightB += P;
				}
			}
			
			long len = c[i + 1].x - c[i].x;
			long cnt = Math.min(leftA, n - leftB) + Math.min(n - leftA, leftB);
			if (leftA != 0 && leftA != n && setLeftA == setRightB) {
				cnt -= 2;
			}
			
//			System.err.println(cnt);
			
			ret += cnt * len;
		}
		return ret;
	}
	
	void submit() {
		int n = nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
			b[i] = nextInt();
		}
		
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i] + b[i];
		}
		
		out.println((sum - go(a, b)) / 2);
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
