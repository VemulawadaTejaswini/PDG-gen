
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
			//			solveC();
			//			solveD();
			solveE();
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
		//必ずD1=0の時に跳ねるので1から
		int cnt = 1;

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
		if (w == 2 * x && h == 2 * y) {
			bF = 1;
		}
		out.println(ref + " " + bF);
	}

	private void solveD() {
		int n = nextInt();
		long k = nextLong();
		//		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();
		long[] wk = new long[n];
		for (int i = 0; i < n; i++) {
			wk[i] = nextLong();
		}

		long res = 0;
		long total = 0;
		int right = 0;
		/*
		 * 「Kを超える組み合わせ」を数えるのが難しそうなので、
		 * 「全体の組み合わせの数から、Kを超えないものの組み合わせを引く」方針で
		 */
		for (int left = 0; left < n; left++) {
			//totalにwk[right]を加えることができるならright++
			while (right < n && total + wk[right] < k) {
				total += wk[right];
				right++;
			}
			//rightは条件を満たす最大となっている
			res += (right - left);

			if (right == left) {
				right++;
			} else {
				total -= wk[left];
			}

		}

		/*
		 * kとかを無視した組み合わせの総数
		 * 部分列なので n * (n+1)
		 * longへのキャストを忘れるとintになってWA
		 */
		long totalCnt = (long) n * ((long) n + 1L) / 2L;
		out.println(totalCnt - res);
	}

	private void solveE() {
		int n = nextInt();
		int m = nextInt();
		int[] s = IntStream.range(0, n).map(i -> nextInt()).toArray();
		int[] t = IntStream.range(0, m).map(i -> nextInt()).toArray();
		final int MOD = 1_000_000_007;
		int[][] dp = new int[n + 1][m + 1];
		int[][] dp2 = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s[i - 1] == t[j - 1]) {
					//					dp[i][j] = dp[i][j - 1] + dp[i - 1][j] + 1;
					//					dp2[i][j] = dp2[i - 1][j - 1] + 1;
					dp2[i][j] = dp2[i][j - 1] + dp2[i - 1][j] + 1;
				} else {
					//					dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1];
					dp2[i][j] = Math.max(dp2[i][j - 1], dp2[i - 1][j]);
				}
				//				dp[i][j] %= MOD;
				dp2[i][j] %= MOD;
			}
		}

		//		out.println(dp[n][m] + 1);
		out.println(dp2[n][m] + 1);
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