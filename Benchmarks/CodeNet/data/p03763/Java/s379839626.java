import java.io.*;
import java.math.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {
		new Main().solve();
	}
	void solve() throws Exception {
		FastScanner in = new FastScanner(System.in);

		int N = in.nextInt();
		int[] cnt = new int[256];
		int[] c = new int[256];
		Arrays.fill(cnt, Integer.MAX_VALUE / 10);
		for (int i = 0; i < N; i++) {
			String s = in.next();
			Arrays.fill(c, 0);
			for (int jj = 0; jj < s.length(); jj++) {
				c[s.charAt(jj)]++;
			}
			for (int jj = 0; jj < c.length; jj++) {
				cnt[jj] = Math.min(cnt[jj], c[jj]);
			}
		}

		String ret = "";
		for (int i = 0; i < cnt.length; i++) {
			for (int jj = 0; jj < cnt[i]; jj++) {
				ret += (char) i;
			}
		}
		System.out.println(ret);

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
