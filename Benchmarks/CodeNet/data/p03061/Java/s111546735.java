
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
		int a = nextInt();
		int b = nextInt();
		int t = nextInt();

		int res = 0;

		double time = 0;
		while (time <= t + 0.5) {
			time += a;
			if (time <= t + 0.5) {
				res += b;
			}
		}

		out.println(res);
	}

	private void solveB() {
		int numN = nextInt();
		int[] v = IntStream.range(0, numN).map(i -> nextInt()).toArray();
		int[] x = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		long res = 0;
		for (int i = 0; i < numN; i++) {
			if (v[i] > x[i]) {
				res += (v[i] - x[i]);
			}
		}

		out.println(res);
	}

	private void solveC() {
		int numN = nextInt();
		Map<Integer, Integer> judge = new HashMap<Integer, Integer>();
		int[] wk = new int[numN];
		for (int i = 0; i < numN; i++) {
			wk[i] = nextInt();
			judge.merge(wk[i] % 2, 1, (oldV, newV) -> oldV + newV);
		}
		Arrays.sort(wk);

		if (judge.size() == 1) {
			out.println(wk[0]);
			return;
		}

		boolean isEq = judge.get(1) < judge.get(0);

		long num1 = wk[0];
		long num2 = wk[wk.length - 1];
		if (num1 % 2 == 0 && !isEq) {
			num1 = wk[1];
		}
		if (num2 % 2 == 0 && !isEq) {
			num1 = wk[wk.length - 2];
		}

		out.println(maximumKouyaku2Args(num1, num2));
	}

	private long maximumKouyaku2Args(long num1, long num2) {
		long max = Long.max(num1, num2);
		long min = Long.min(num1, num2);
		long amari = max % min;

		while (amari != 0) {
			max = min;
			min = amari;
			amari = max % min;
		}
		return min;

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