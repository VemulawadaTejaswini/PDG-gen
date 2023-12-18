
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
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
		int k = nextInt();

		if (k == 1) {
			out.println(0);
			return;
		}
		int tmp = (n - (k - 1)) - 1;
		out.println(tmp);
	}

	private void solveB() {
		int n = nextInt();
		int[][] xy = Stream.generate(() -> new int[] { nextInt(), nextInt() })
				.limit(n).toArray(int[][]::new);

		long res = Long.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			Map<String, Integer> cntX = new HashMap<String, Integer>();
			for (int j = i + 1; j < n; j++) {
				int tmpX = Math.abs(xy[j][0] - xy[i][0]);
				int tmpY = Math.abs(xy[j][1] - xy[i][1]);
				cntX.merge(tmpX + ":" + tmpY, 1, (oldV, newV) -> oldV + newV);
			}
			res = Math.min(res, cntX.size());
		}

		out.println(res);
	}

	private void solveC() {
		int n = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).sorted().toArray();

		long res = wk[0];
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i < n; i++) {
			long l = Math.max(res, wk[i]);
			long r = Math.min(res, wk[i]);
			if (i == 1) {
				builder.append(r + " " + l + System.lineSeparator());
				res = (r - l);
			} else {
				builder.append(l + " " + r + System.lineSeparator());
				res = (l - r);
			}
		}
		out.println(res);
		out.println(builder.toString());
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