
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
			//			solveC();
			solveC2();
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
		int numK = nextInt();
		int numX = nextInt();
		int numY = nextInt();

		long res = 0;
		if (numN < numK) {
			res += numN * numX;
		} else {
			res += numK * numX + (numN - numK) * numY;
		}

		out.println(res);
	}

	private void solveA2() {
		int numN = nextInt();
		int numK = nextInt();
		int numX = nextInt();
		int numY = nextInt();

		long res = 0;
		for (int i = 1; i <= Math.min(numN, numK); i++) {
			res += numX;
		}
		for (int i = numK + 1; i <= numN; i++) {
			res += numY;
		}

		out.println(res);
	}

	private void solveB() {
		String[] wk = next().split("");
		Map<String, Integer> res = Arrays.stream(wk).collect(() -> new HashMap<String, Integer>(),
				(t, i) -> {
					t.merge(i, 1, (oldV, newV) -> oldV + newV);
				},
				(t, u) -> {
					t.putAll(u);
				});

		boolean isJudge = true;
		for (Integer resV : res.values()) {
			if (resV % 2 != 0) {
				isJudge = false;
			}
		}

		out.println(isJudge ? "Yes" : "No");
	}

	/*
	 * 部分解法バージョン
	 */
	private void solveC2() {
		int numN = nextInt();
		int numA = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();
		out.println(chkC2(wk, numA, numN));
	}

	private long chkC2(final int[] wk, final int numA, final int numN) {

		long res = 0;
		int max = (int) Math.pow(2, numN);

		for (int i = 1; i < max; i++) {
			int[] mask = new int[numN];
			int bit = i;
			int cnt = 0;
			while (bit != 0) {
				mask[cnt] = bit % 2;
				bit /= 2;
				cnt++;
			}
			long temp = 0;
			int maskCnt = 0;
			for (int j = 0; j < numN; j++) {
				if (mask[j] == 1) {
					maskCnt++;
					temp += wk[j];
				}
			}
			//			if (((temp * 10) / maskCnt) % 10 == 0 && (temp * 10) / (maskCnt * 10) == numA) {
			if (temp == numA * maskCnt) {
				//				System.out.println("temp : " + temp + " / maskCnt : " + maskCnt);
				//				System.out.println(Arrays.toString(mask));
				res++;
			}
		}
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