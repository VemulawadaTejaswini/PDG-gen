import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Main {
	
	MyScanner sc;
	PrintWriter writer;

	public void solve() {
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			Map<Character, Character> map = new HashMap<Character, Character>(n);
			for (int i = 0; i < n; i++) {
				map.put(sc.nextChar(), sc.nextChar());
			}
			StringBuilder sb = new StringBuilder();
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				char c = sc.nextChar();
				if (map.containsKey(c)) {
					sb.append(map.get(c));
				} else {
					sb.append(c);
				}
			}
			writer.println(sb);
		}
	}

	public Main() {
		sc = new MyScanner(System.in);
		writer = new PrintWriter(System.out);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.solve();
		m.writer.flush();
	}

	class MyScanner {
		InputStream is;
		private byte[] buffer = new byte[1024];
		private int bufferPointer = 0;
		private int bufferLength = 0;

		MyScanner(InputStream is) {
			this.is = is;
		}

		private int readByte() {
			if (bufferLength == -1) {
				throw new InputMismatchException();
			}
			if (bufferPointer >= bufferLength) {
				bufferPointer = 0;
				try {
					bufferLength = is.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (bufferLength <= -1) {
					return -1;
				}
			}
			return buffer[bufferPointer++];
		}

		String next() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while (isChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		
		char nextChar() {
			int b = skip();
			return (char) b;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			int num = 0;
			int b;
			boolean negative = false;
			while ((b = readByte()) != -1 && !isDigit(b) && b != '-')
				;
			if (b == '-') {
				negative = true;
				b = readByte();
			}
			while (true) {
				if (isDigit(b)) {
					num = num * 10 + (b - '0');
				} else {
					return negative ? -num : num;
				}
				b = readByte();
			}
		}

		int[] nextIntArray(int length) {
			int[] array = new int[length];
			for (int i = 0; i < length; i++) {
				array[i] = sc.nextInt();
			}
			return array;
		}

		long nextLong() {
			long num = 0;
			int b;
			boolean negative = false;
			while ((b = readByte()) != -1 && !isDigit(b) && b != '-')
				;
			if (b == '-') {
				negative = true;
				b = readByte();
			}
			while (true) {
				if (isDigit(b)) {
					num = num * 10 + (b - '0');
				} else {
					return negative ? -num : num;
				}
				b = readByte();
			}
		}

		// from '!' to '~'
		private boolean isChar(int b) {
			return b >= 33 && b <= 126;
		}

		private boolean isDigit(int b) {
			return b >= '0' && b <= '9';
		}

		private int skip() {
			int b;
			while ((b = readByte()) != -1 && !isChar(b))
				;
			return b;
		}

	}
}