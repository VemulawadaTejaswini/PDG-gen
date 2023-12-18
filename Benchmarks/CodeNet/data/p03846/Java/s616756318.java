
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveC();
			//			 solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int numA = nextInt();
		char operand = next().charAt(0);
		int numB = nextInt();

		int res = operand == '+' ? numA + numB : numA - numB;

		out.println(res);
	}

	private void solveB() {
		int numN = nextInt();
		int[] arrayT = new int[numN];
		long sumT = 0;
		for (int j = 0; j < numN; j++) {
			arrayT[j] = nextInt();
			sumT += arrayT[j];
		}
		int numM = nextInt();
		int[][] arrayPX = IntStream.range(0, numM).collect(() -> new int[numM][2], (t, i) -> {
			t[i][0] = nextInt();
			t[i][1] = nextInt();
		}, (t, u) -> {
			Stream.concat(Arrays.stream(t), Arrays.stream(u)).toArray();
		});

		for (int[] js : arrayPX) {
			long res = (sumT - arrayT[js[0] - 1]) + js[1];
			out.println(res);
		}
	}

	private void solveC() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		int size = numN - 1;
		int min = 0;
		int max = 0;
		int cntVal = 0;
		int totalCount = 0;

		Arrays.sort(wk);

		if (numN % 2 == 0) {
			if (wk[0] != 1) {
				out.println(0);
				return;
			}
			min = 0;
			max = wk.length - 1;
			cntVal = 1;
		} else {
			if (wk[0] != 0) {
				out.println(0);
				return;
			}
			min = 1;
			max = wk.length;
			cntVal = 2;
		}

		for (int i = min; i < max; i = i + 2) {
			if (wk[i] == wk[i + 1] && wk[i] == cntVal) {
				totalCount++;
			} else {
				out.println(0);
				return;
			}
			cntVal += 2;
		}

		final long CONST = (long) Math.pow(10, 9) + 7;

		long res = LongStream.range(0, totalCount).reduce(1, (sum, i) -> {
			sum = (sum * 2) % CONST;
			return sum % CONST;
		});
		out.println(res);

	}

	private void solveD() {
		int numN = nextInt();

		out.println("");
	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
}