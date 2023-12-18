
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
		int numX = nextInt();
		int numA = nextInt();
		int numB = nextInt();

		if (numA >= numB) {
			out.println("delicious");
		} else if (numA + numX >= numB) {
			out.println("safe");
		} else if (numA + numX < numB) {
			out.println("dangerous");
		}

	}

	private void solveB() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		int res = chkB(wk, 1, 0, 0);

		out.println(res);
	}

	private int chkB(int[] wk, int currentI, int total, int buttonCnt) {

		if (buttonCnt > wk.length) {
			return -1;
		}
		int index = wk[currentI - 1];
		if (index == 2) {
			return total + 1;
		} else {
			return chkB(wk, index, total + 1, buttonCnt + 1);
		}

	}

	private void solveC() {
		long numN = nextInt();
		long numM = nextInt();
		long diffNum = Math.abs(numN - numM);
		//犬と猿の差分が2以上の場合は犬犬、猿猿の組み合わせが発生する
		if (diffNum > 1) {
			out.println(0);
			return;
		}

		//両方1なら組み合わせは二通り
		if (numN == 1 && numM == 1) {
			out.println(2);
			return;
		}

		long CONST = (long) (Math.pow(10, 9) + 7);
		long res = 1;
		if (numN == numM) {
			long big = numN;
			long small = numN;
			while (small >= 1) {
				if (small != 1) {
					res *= (big * small) % CONST;
				} else {
					res *= 2;
				}
				res = res % CONST;
				big--;
				small--;
			}
		} else {
			long big = numN > numM ? numN : numM;
			long small = numN > numM ? numM : numN;
			while (small >= 1) {
				res *= (big * small) % CONST;
				res = res % CONST;
				big--;
				small--;
			}
		}

		out.println(res % CONST);
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