
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveC();
			//			solveD();
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
		int x = nextInt();
		int a = nextInt();

		out.println(x < a ? 0 : 10);
	}

	private void solveB() {
		int n = nextInt();
		int x = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();

		int d = 0;
		int cnt = 0;
		if (d <= x) {
			cnt++;
		}

		for (int i = 0; i < wk.length; i++) {
			d = d + wk[i];
			if (d <= x) {
				cnt++;
			}
		}

		out.println(cnt);
	}

	private void solveC() {
		double w = nextInt();
		double h = nextInt();
		double x = nextInt();
		double y = nextInt();

		double res = (w * h) / 2;
		String ref = String.format("%.10f", res);
		int bF = 0;
		if (w / 2 == x && h / 2 == y || w / 2 == y && h / 2 == x) {
			bF = 0;
		}
		out.println(ref + " " + bF);
	}

	private void solveD() {
		int n = nextInt();
		int k = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();

		long res = 0;
		long total = 0;
		int left = 0;
		int right = 0;
		while (left < n) {
			while (right < n) {
				total += wk[right];
				right++;
			}
			if (total >= k) {
				res += right - left;
			}
			/*
			 * 左を進める
			 */
			left++;
			if (left < n) {
				total -= wk[left];
			}
		}

		out.println(res);
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