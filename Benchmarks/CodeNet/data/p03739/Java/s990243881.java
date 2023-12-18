import java.io.*;
import java.math.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {
		new Main().solve();
	}
	@SuppressWarnings("unchecked")
	void solve() throws Exception {
		FastScanner in = new FastScanner(System.in);

		int n = in.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextLong();
		}
		long[] b = a.clone();
		for (int i = 0; i < b.length; i++) {
			b[i] = -b[i];
		}

		System.out.println(Math.min(f(a), f(b)));

	}
	long f(long[] a) {
		int n = a.length;

		long sum = 0;
		long ret = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			if (i % 2 == 0) {
				// +
				long d = Math.max(0, 1 - sum);
				sum += d;
				ret += d;

			} else {
				// -
				long d = Math.max(0, sum + 1);
				sum -= d;
				ret += d;
			}
		}

		return ret;
	}
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	class FastScanner {

		private InputStream _stream;
		private byte[] _buf = new byte[1024];
		private int _curChar;
		private int _numChars;
		private StringBuilder _sb = new StringBuilder();

		FastScanner(InputStream stream) {
			this._stream = stream;
		}

		public int read() {
			if (_numChars == -1) throw new InputMismatchException();
			if (_curChar >= _numChars) {
				_curChar = 0;
				try {
					_numChars = _stream.read(_buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (_numChars <= 0) return -1;
			}
			return _buf[_curChar++];
		}

		public String next() {
			int c = read();
			while (isWhitespace(c)) {
				c = read();
			}
			_sb.setLength(0);
			do {
				_sb.appendCodePoint(c);
				c = read();
			} while (!isWhitespace(c));
			return _sb.toString();
		}

		public int nextInt() {
			return (int) nextLong();
		}
		public long nextLong() {
			int c = read();
			while (isWhitespace(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9') throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isWhitespace(c));
			return res * sgn;
		}

		public boolean isWhitespace(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
	}
}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
