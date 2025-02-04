
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			/*
			 * Combinatorial - 0-1 Knapsack Problem
			 */
			solveKnapsackProblem();
			//			 solveB();
			//			 solveC();
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

	/**
	 * Knapsack DP Version
	 */
	private void solveKnapsackProblem() {
		int numN = nextInt();
		int numW = nextInt();
		int[] vA = new int[numN];
		int[] wA = new int[numN];

		for (int i = 0; i < numN; i++) {
			vA[i] = nextInt();
			wA[i] = nextInt();
		}

		/*
		 * vAをbaseにして、wAを添える
		 */
		int[][] dp = new int[numN + 1][numW + 1];
		for (int i = 0; i < numN; i++) {
			for (int w = 0; w <= numW; w++) {
				/*
				 * vAiを選択した際のwを埋めていく
				 * wがwA[i]より大きい場合 -> dp[i][w - wA[i]] + vA[i]　と
				 *                           dp[i][w]　の比較
				 *             小さい場合 -> vA[i]を選択することができない
				 */
				if (w >= wA[i]) {
					dp[i + 1][w] = Integer.max(dp[i][w - wA[i]] + vA[i], dp[i][w]);
				} else {
					dp[i + 1][w] = dp[i][w];
				}

			}
		}

		out.println(dp[numN][numW]);
	}

	private void solveB() {
		int numN = nextInt();

		out.println("");
	}

	private void solveC() {
		int numN = nextInt();

		out.println("");
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
