
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

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
			//			solveD3();
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

		//		double time = 0;
		//		while ((time += a) <= (t + 0.5)) {
		//			res += b;
		//		}

		res = t / a * b;
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

	/*
	 * 想定漏れパターン
	 * 4
	 * 1 3 6 9
	 * -> 3(1->3)
	 *
	 * 3
	 * 7 6 8
	 * -> 2(7->6 or 8)
	 */
	private void solveC() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		long[] forward = new long[numN];
		long[] backward = new long[numN];

		int forGcd = 0;
		int backGcd = 0;
		for (int i = 0; i < numN; i++) {
			forward[i] = getGcd(forGcd, wk[i]);
			//			backward[numN - 1 - i] = getGcd(backGcd, wk[numN - 1 - i]);
		}
		for (int i = numN - 1; i >= 0; i--) {
			backward[i] = getGcd(backGcd, wk[i]);
		}
		long max = 1;

		for (int i = 0; i < numN; i++) {
			long a = i == 0 ? 0 : forward[i - 1];
			long b = i == numN - 1 ? 0 : backward[i + 1];
			long current = getGcd(a, b);
			max = Math.max(max, current);
			//			if (i == 0) {
			//				max = Long.max(max, backward[i + 1]);
			//			} else if (i == numN - 1) {
			//				max = Long.max(max, forward[i - 1]);
			//			} else {
			//				max = Long.max(max, getGcd(forward[i - 1], backward[i + 1]));
			//			}
		}
		out.println(max);
	}

	private long getGcd(long num1, long num2) {
		long max = Long.max(num1, num2);
		long min = Long.min(num1, num2);
		if (min == 0) {
			return max;
		}
		long amari = max % min;

		while (amari != 0) {
			max = min;
			min = amari;
			amari = max % min;
		}
		return min;

	}

	/*
	 * 処理をマージ
	 */
	private void solveD() {
		int numN = nextInt();
		int[] wk = new int[numN];

		int mCnt = 0;
		long res = 0;
		int zeroCnt = 0;
		for (int i = 0; i < numN; i++) {
			int val = nextInt();
			if (val < 0) {
				mCnt++;
			}
			if (val == 0) {
				zeroCnt++;
			}
			wk[i] = Math.abs(val);
			res += wk[i];
		}
		Arrays.sort(wk);
		if (mCnt % 2 == 0 || zeroCnt > 0) {
			out.println(res);
		} else {
			out.println(res - Math.abs(wk[0]) * 2);
		}

	}

	/*
	 * 値を取得したり、カウントしたりのforはマージ可能
	 */
	private void solveD2() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		int mCnt = 0;
		long res = 0;
		int zeroCnt = 0;
		for (int i = 0; i < numN; i++) {
			/*
			 * 0よりちいさいものをカウントしておく
			 */
			if (wk[i] < 0) {
				mCnt++;
			}
			/*
			 * 総合計を取得しておく（abs）
			 */
			res += Math.abs(wk[i]);
			/*
			 * 0をカウントしておく
			 */
			if (wk[i] == 0) {
				zeroCnt++;
			}
		}
		/*
		 * -が偶数または0が一つでもある場合、
		 * 全ての値を+に変換することが可能
		 * その場合、単純に合計を出せばよい
		 */
		if (mCnt % 2 == 0 || zeroCnt > 0) {
			out.println(res);
			return;
		} else {
			/*
			 * -が奇数個で0が一つもない
			 * その場合、|wk[i]|　で一番小さい値を-にすれば最大化できる
			 * 一旦、absで全部書き換え
			 */
			for (int i = 0; i < wk.length; i++) {
				wk[i] = Math.abs(wk[i]);
			}
			//ソート
			Arrays.sort(wk);
			for (int i = 0; i < wk.length; i++) {
				/*
				 * ×2しているのは、
				 * ・本来合計に含まれていてはいけない　総合計 - wk[i]
				 * ・この値を抜いた総合計からさらに-する　総合計 - wk[i] - wk[i]
				 */
				if (wk[i] > 0) {
					out.println(res - Math.abs(wk[i]) * 2);
					return;
				}
			}
		}

	}

	private void solveD3() {
		int numN = nextInt();
		long[] wk = LongStream.range(0, numN).map(i -> nextInt()).toArray();

		long[][] dp = new long[numN + 1][2];
		dp[0][0] = 0;
		dp[0][1] = Integer.MIN_VALUE;

		for (int i = 0; i < numN; i++) {
			dp[i + 1][0] = Long.max(dp[i][0] + wk[i], dp[i][1] - wk[i]);
			dp[i + 1][1] = Long.max(dp[i][0] - wk[i], dp[i][1] + wk[i]);
			out.println("i:" + i + " / dp[i][0] : " + dp[i][0] + " / dp[i][1] : " + dp[i][1]);
		}
		out.println("i:" + numN + " / dp[i][0] : " + dp[numN][0] + " / dp[i][1] : " + dp[numN][1]);
		out.println(dp[numN][0]);
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