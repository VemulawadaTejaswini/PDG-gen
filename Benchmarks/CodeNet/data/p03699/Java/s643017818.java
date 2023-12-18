
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveC();
			//			solveC2();
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
		int numB = nextInt();

		if (numA + numB >= 10) {
			out.println("error");
		} else {
			out.println(numA + numB);
		}

	}

	private void solveB() {
		char[] wkC = next().toCharArray();
		int[] wk = new int[26];

		for (int i = 0; i < wkC.length; i++) {
			int index = wkC[i] - (char) 'a';
			wk[index] += 1;
		}
		Arrays.sort(wk);
		out.println(wk[25] > 1 ? "no" : "yes");
	}

	private void solveC2() {
		int numN = nextInt();
		int[] wkC = new int[numN];

		int cnt = 0;
		for (int i = 0; i < numN; i++) {
			wkC[i] = nextInt();
			cnt += wkC[i];
		}

		if (cnt % 10 != 0) {
			out.println(cnt);
			return;
		}

		Arrays.sort(wkC);

		for (int i = 0; i < wkC.length; i++) {
			int wkCnt = cnt - wkC[i];
			if (wkCnt % 10 != 0) {
				out.println(wkCnt);
				return;
			}
		}
		out.println(0);

		//		out.println(chkC(wkC, 0, 0, numN));
	}

	private void solveC() {
		int numN = nextInt();
		//		int[] wkC = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		//		int sum = Arrays.stream(wkC).sum();
		int[] wkC = new int[numN];
		int cnt = 0;
		for (int i = 0; i < numN; i++) {
			wkC[i] = nextInt();
			cnt += wkC[i];
		}

		if (cnt % 10 != 0) {
			out.println(cnt);
			return;
		}

		Arrays.sort(wkC);
		/*
		 * 150
		 * 10,20,33 ---100
		 *
		 *
		 */
		for (int i = 0; i < wkC.length; i++) {
			int wkCnt = cnt - wkC[i];
			if (wkCnt % 10 != 0) {
				out.println(wkCnt);
				return;
			}
		}
		out.println(0);

		//		out.println(chkC(wkC, 0, 0, numN));
	}

	private long chkC(int[] wkC, int currentI, long total, int max) {

		if (currentI >= max) {
			if (total % 10 == 0) {
				return 0;
			} else {
				return total;
			}
		}
		long res = 0;

		long val1 = chkC(wkC, currentI + 1, total + wkC[currentI], max);
		long val2 = chkC(wkC, currentI + 1, total, max);

		res = Math.max(val1, val2);
		//		out.println(currentI + " : " + total);
		return res;
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