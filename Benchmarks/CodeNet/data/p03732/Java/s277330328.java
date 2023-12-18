import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		Task solver = new Task();
		solver.solve(1, in, out);
		out.close();
	}
}

class Task {
	private int[][] dp;
	private int[] ws;
	private int[] vs;
	private int n;
	private int w;

	public void solve(int testNumber, InputReader in, OutputWriter out) {
		n = in.nextInt();
		w = in.nextInt();
		dp = new int[n + 1][w + 1];
		ws = new int[n + 1];
		vs = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			ws[i] = in.nextInt();
			vs[i] = in.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= w; j++) {
				if (ws[i] > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = max(vs[i] + dp[i - 1][j - ws[i]], dp[i - 1][j]);
				}
			}
		}
		out.print(dp[n][w]);
	}

	private int max(int a, int b) {
		return a > b ? a : b;
	}
}

class InputReader {
	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;

	public InputReader(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1) {
			throw new InputMismatchException();
		} else {
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException var2) {
					throw new InputMismatchException();
				}
				if (numChars <= 0) {
					return -1;
				}
			}
			return buf[curChar++];
		}
	}

	public boolean isSpace(int c) {
		return c == 10 || c == 13 || c == -1 || c == 9 || c == 32;
	}

	private boolean isEnd(int c) {
		return c == 10 || c == 13 || c == -1;
	}

	public String next() {
		int c = this.read();
		while (isSpace(c)) {
			c = this.read();
		}
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
		} while (!isSpace(c = this.read()));
		return res.toString();
	}

	public char nextChar() {
		int c = this.read();
		while (isSpace(c)) {
			c = this.read();
		}
		return (char) c;
	}

	public int nextInt() {
		int c = this.read();
		while (isSpace(c)) {
			c = this.read();
		}
		byte sgn = 1;
		if (c == 45) {
			sgn = -1;
			c = this.read();
		}
		int res = 0;
		while (c >= 48 && c <= 57) {
			res *= 10;
			res += c - 48;
			c = this.read();
			if (isSpace(c)) {
				return res * sgn;
			}
		}
		throw new InputMismatchException();
	}

	public long nextLong() {
		int c = this.read();
		while (isSpace(c)) {
			c = this.read();
		}
		byte sgn = 1;
		if (c == 45) {
			sgn = -1;
			c = this.read();
		}
		long res = 0;
		while (c >= 48 && c <= 57) {
			res *= 10;
			res += c - 48;
			c = this.read();
			if (isSpace(c)) {
				return res * sgn;
			}
		}
		throw new InputMismatchException();
	}

	public String nextLine() {
		int c = read();
		while (isEnd(c)) {
			c = this.read();
		}
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
		} while (!isEnd(c = this.read()));
		return res.toString();
	}

}

class OutputWriter {
	private final PrintWriter writer;

	public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	}

	public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
	}

	public void print(char c) {
		writer.print(c);
	}

	public void print(int i) {
		writer.print(i);
	}

	public void print(long l) {
		writer.print(l);
	}

	public void print(double d) {
		writer.print(d);
	}

	public void print(Object... objects) {
		int len = objects.length;
		for (int i = 0; i < len; i++) {
			writer.print(objects[i]);
		}
	}

	public void println() {
		writer.println();
	}

	public void close() {
		writer.close();
	}
}