import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	static class Spell {
		final char t;
		final char d;
		Spell(char t, char d) {
			this.t = t;
			this.d = d;
		}
	}

	static int lastPos(String s, Spell[] spells, int golemPos) {
		if (golemPos < 0 || golemPos >= s.length()) {
			throw new IndexOutOfBoundsException(String.valueOf(golemPos));
		}
		int p = golemPos;
		for (Spell spell : spells) {
			if (s.charAt(p) == spell.t) {
				p += spell.d == 'L' ? -1 : 1;
			}
			if (p < 0 || p >= s.length()) {
				break;
			}
		}
		return p;
	}

	static int mostLeft(String s, Spell[] spells) {
		int left = 0;
		int right = s.length();
		while (left < right) {
			int mid = (left + right) / 2;
			if (lastPos(s, spells, mid) < 0) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return left;
	}

	static int mostRight(String s, Spell[] spells) {
		int left = 0;
		int right = s.length();
		while (left < right) {
			int mid = (left + right) / 2;
			if (lastPos(s, spells, mid) >= s.length()) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return right;
	}

	static void exec(MyScanner in, PrintWriter out) {
		in.nextInt();
		int Q = in.nextInt();
		String s = in.next();
		Spell[] spells = IntStream.range(0, Q).mapToObj(i -> {
			char t = in.next().charAt(0);
			char d = in.next().charAt(0);
			return new Spell(t, d);
		}).toArray(Spell[]::new);
		out.println(mostRight(s, spells) - mostLeft(s, spells));
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
