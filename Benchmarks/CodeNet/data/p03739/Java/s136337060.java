import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	static long countEvenPlus(int[] a) {
		long count = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i += 1) {
			sum += a[i];
			if (i % 2 == 0 && sum <= 0) {
				count += Math.abs(sum) + 1;
				sum = 1;
			} else if (i % 2 == 1 && sum >= 0) {
				count += Math.abs(sum) + 1;
				sum = -1;
			}
		}
		return count;
	}

	static long countEvenMinus(int[] a) {
		long count = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i += 1) {
			sum += a[i];
			if (i % 2 == 0 && sum >= 0) {
				count += Math.abs(sum) + 1;
				sum = -1;
			} else if (i % 2 == 1 && sum <= 0) {
				count += Math.abs(sum) + 1;
				sum = 1;
			}
		}
		return count;
	}

	static void exec(MyScanner in, PrintWriter out) {
		int N = in.nextInt();
		int[] a = IntStream.range(0, N).map(i -> in.nextInt()).toArray();
		out.println(Math.min(countEvenPlus(a), countEvenMinus(a)));
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
