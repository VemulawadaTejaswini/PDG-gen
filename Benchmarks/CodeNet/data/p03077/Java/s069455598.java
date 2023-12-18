import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static long divCeil(long a, long b) {
		return (long) Math.ceil((double) a / b);
	}

	static void exec(MyScanner in, PrintWriter out) {
		long N = in.nextLong();
		long A = in.nextLong();
		long B = in.nextLong();
		long C = in.nextLong();
		long D = in.nextLong();
		long E = in.nextLong();
		long m = divCeil(N, A);
		m += (A <= B) ? 1 : 1 + divCeil(N, B) - m;
		m += (A <= C || B <= C) ? 1 : 2 + divCeil(N, C) - m;
		m += (A <= D || B <= D || C <= D) ? 1 : 3 + divCeil(N, D) - m;
		m += (A <= E || B <= E || C <= E || D <= E) ? 1 : 4 + divCeil(N, E) - m;
		out.println(m);
	}

	public static void main(String[] args) {
		PrintWriter w = new PrintWriter(System.out);
		exec(new MyScanner(System.in), w);
		w.flush();
	}

	static class MyScanner {
		static final int BUFFER_SIZE = 1024;
		private final InputStream in;
		private final byte[] buffer = new byte[BUFFER_SIZE];
		private int point;
		private int readLength;
		MyScanner(InputStream in) {
			this.in = in;
		}
		private int readByte() {
			if (point < readLength) {
				int result = buffer[point];
				point += 1;
				return result;
			}
			try {
				readLength = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (readLength == -1) {
				return -1;
			}
			point = 1;
			return buffer[0];
		}
		static boolean isPrintableCharExceptSpace(int c) {
			return 33 <= c && c <= 126;
		}
		String next() {
			StringBuilder b = new StringBuilder();
			int c = readByte();
			while (!(c == -1 || isPrintableCharExceptSpace(c))) {
				c = readByte();
			}
			if (c == -1) {
				throw new NoSuchElementException();
			}
			do {
				b.appendCodePoint(c);
				c = readByte();
			} while (c != -1 && isPrintableCharExceptSpace(c));
			return b.toString();
		}
		long nextLong() {
			int c = readByte();
			while (!(c == -1 || isPrintableCharExceptSpace(c))) {
				c = readByte();
			}
			if (c == -1) {
				throw new NoSuchElementException();
			}
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long result = 0L;
			do {
				if (!('0' <= c && c <= '9')) {
					throw new InputMismatchException();
				}
				result = result * 10L + (c - '0');
				c = readByte();
			} while (c != -1 && isPrintableCharExceptSpace(c));
			return minus ? -result : result;
		}
		int nextInt() {
			long n = nextLong();
			if (Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE) {
				return (int) n;
			}
			throw new InputMismatchException();
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}
