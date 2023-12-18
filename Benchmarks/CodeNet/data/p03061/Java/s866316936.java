
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.stream.IntStream;
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
		int n = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();

		long[] rui = new long[n + 1];
		rui[1] = wk[0];
		for (int i = 1; i < rui.length; i++) {
			rui[i] = rui[i - 1] + wk[i - 1];
		}
		for (int i = 1; i <= n; i++) {
			long res = 0;
			for (int j = 0; j < rui.length - i; j++) {
				res = Math.max(res, rui[j + i] - rui[j]);
			}
			out.println(res);
		}

	}

	private void solveB() {
		int n = nextInt();
		int[][] wk = Stream.generate(() -> new int[] { nextInt(), nextInt() }).limit(n).toArray(int[][]::new);
		int[] imos = new int[1_000_000 + 1];
		for (int[] val : wk) {
			imos[val[0]]++;
			if (val[1] + 1 < 1_000_000 + 1) {
				imos[val[1] + 1]--;
			}
		}
		for (int i = 1; i < imos.length; i++) {
			imos[i] = imos[i] + imos[i - 1];
		}
		OptionalInt max = Arrays.stream(imos).max();

		out.println(max.getAsInt());
	}

	private void solveC() {
		int n = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();

		int[] rui = new int[n];
		int[] rui2 = new int[n];
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				rui[i] = wk[i];
			} else {
				rui[i] = getGcd(wk[i], rui[i - 1]);
			}
		}
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				rui2[n - 1 - i] = wk[n - 1 - i];
			} else {
				rui2[n - 1 - i] = getGcd(wk[n - 1 - i], rui2[n - 1 - i + 1]);
			}
		}

		int res = 0;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				res = Math.max(res, rui2[i + 1]);
			} else if (i == n - 1) {
				res = Math.max(res, rui[i - 1]);
			} else {
				res = Math.max(res, getGcd(rui[i - 1], rui2[i + 1]));
			}
		}
		out.println(res);
	}

	private int getGcd(int a, int b) {
		int wkA = Math.max(a, b);
		int wkB = Math.min(a, b);
		int amari = wkA % wkB;
		while (amari != 0) {
			wkA = wkB;
			wkB = amari;
			amari = wkA % wkB;
		}
		return wkB;
	}

	private void solveD() {
		int n = nextInt();

		out.println("");
	}

	private void solveE() {
		int n = nextInt();

		out.println("");
	}

	private void solveF() {
		int n = nextInt();

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