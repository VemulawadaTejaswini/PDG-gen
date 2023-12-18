
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
		int numN = nextInt();
		int numA = nextInt();

		out.println(numN * numN - numA);
	}

	private void solveB() {
		int numN = nextInt();
		int numK = nextInt();

		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		int res = Arrays.stream(wk).reduce(0, (sum, num) -> {
			return sum += Math.min(num * 2, (numK - num) * 2);
		});

		out.println(res);

	}

	private void chkC(int numA, int numB, int numC, int numD, int numE, int numF, int currentW,
			int currentS, int[][] memoC) {

		int index = getNoudo(currentW, currentS);

		if (currentW + currentS > numF) {
			return;
		}

		if (currentS > numE * (currentW / 100)) {
			return;
		}

		if (currentW != 0 && currentS != 0) {
			memoC[index][0] = currentW;
			memoC[index][1] = currentS;
		}

		chkC(numA, numB, numC, numD, numE, numF, currentW + numA * 100, currentS, memoC);
		chkC(numA, numB, numC, numD, numE, numF, currentW + numB * 100, currentS, memoC);
		chkC(numA, numB, numC, numD, numE, numF, currentW, currentS + numC, memoC);
		chkC(numA, numB, numC, numD, numE, numF, currentW, currentS + numD, memoC);

	}

	private int getNoudo(int w, int s) {
		if (s + w == 0) {
			return 0;
		}
		return (100 * s) / (s + w);
	}

	private void solveC() {
		int numA = nextInt();
		int numB = nextInt();
		int numC = nextInt();
		int numD = nextInt();
		int numE = nextInt();
		int numF = nextInt();

		int[][] memoC = new int[101][2];

		double noudoMax = 0;
		int water = 0;
		int sugar = 0;
		for (int i = 0; (numA * 100) * i < numF; i++) {
			int wA = (numA * 100) * i;
			if (wA > numF) {
				break;
			}
			for (int j = 0; wA + ((numB * 100) * j) < numF; j++) {
				int wB = (numB * 100) * j;
				if (wA + wB > numF) {
					break;
				}
				if (wA + wB == 0) {
					continue;
				}
				for (int k = 0; wA + wB + (numC * k) < numF; k++) {
					int sC = numC * k;
					if (numE < 100 * k / (wA + wB)) {
						break;
					}
					for (int l = 0; wA + wB + sC + (numD * l) < numF; l++) {
						int sD = numD * l;
						if (wA + wB + sC + sD == 0) {
							continue;
						}
						if (wA + wB + sC + sD > numF) {
							break;
						}
						if (numE < 100 * (sC + sD) / (wA + wB)) {
							break;
						}
						double noudo = 100 * (sC + sD) / (wA + wB + sC + sD);
						if (noudoMax < noudo) {
							noudoMax = noudo;
							water = wA + wB;
							sugar = sC + sD;
						}
					}
				}
			}
		}

		out.println(water + sugar + " " + sugar);

	}

	private void solveC2() {
		int numA = nextInt();
		int numB = nextInt();
		int numC = nextInt();
		int numD = nextInt();
		int numE = nextInt();
		int numF = nextInt();

		int[][] memoC = new int[101][2];

		chkC(numA, numB, numC, numD, numE, numF, 0, 0, memoC);

		Arrays.sort(memoC, (x, y) -> Integer.compare(x[0], y[0]));
		int p1w = memoC[100][0];
		int p1s = memoC[100][1];
		int p1n = getNoudo(p1w, p1s);
		out.println(p1w + p1s + " " + p1s);
		//		memoC = new int[101][2];
		//		chkC(numA, numB, numC, numD, numE, numF, numB * 100, 0);
		//		Arrays.sort(memoC, (x, y) -> Integer.compare(x[0], y[0]));
		//		int p2w = memoC[100][0];
		//		int p2s = memoC[100][1];
		//		int p2n = getNoudo(p2w, p2s);
		//		memoC = new int[101][2];
		//
		//		if (p1n > p2n) {
		//			out.println(p1w + p1s + " " + p1s);
		//		} else {
		//			out.println(p2w + p2s + " " + p2s);
		//		}
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