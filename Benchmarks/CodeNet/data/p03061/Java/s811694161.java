
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
			//			solveC();
			//			solveC2();
			solveC3();
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
		int[] c = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		long res = 0;
		for (int i = 0; i < numN; i++) {
			if (v[i] > c[i]) {
				res += (v[i] - c[i]);
			}
		}

		out.println(res);
	}

	/**
	 * 累積和
	 * 解説放送
	 * https://www.youtube.com/watch?v=8lm8o8L9Bmw
	 */
	private void solveC() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		long[] forward = new long[numN];
		long[] backward = new long[numN];

		long forGcd = 0;
		long backGcd = 0;
		for (int i = 0; i < numN; i++) {
			forGcd = forward[i] = getGcd(forGcd, wk[i]);
			backGcd = backward[numN - 1 - i] = getGcd(backGcd, wk[numN - 1 - i]);
		}
		long max = 1;

		for (int i = 0; i < numN; i++) {
			if (i == 0) {
				max = Long.max(max, backward[i + 1]);
			} else if (i == numN - 1) {
				max = Long.max(max, forward[i - 1]);
			} else {
				max = Long.max(max, getGcd(forward[i - 1], backward[i + 1]));
			}
		}
		out.println(max);
	}

	/**
	 * TLE version
	 */
	private void solveC2() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		long maxGcd = 0;

		for (int i = 0; i < numN; i++) {
			long max = 0;
			for (int j = 0; j < numN; j++) {
				if (i == j) {
					continue;
				}
				max = getGcd(max, wk[j]);
			}
			maxGcd = Long.max(maxGcd, max);
		}
		out.println(maxGcd);
	}

	/**
	 * GCD
	 * @param num1
	 * @param num2
	 * @return
	 */
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

	/**
	 * segment tree version
	 * http://drken1215.hatenablog.com/entry/2019/04/27/224100_1
	 * http://tsutaj.hatenablog.com/entry/2017/03/29/204841
	 * https://topcoder.g.hatena.ne.jp/iwiwi/20111205/1323099376
	 * https://www.slideshare.net/iwiwi/ss-3578491
	 *
	 *
	 * 入力値サンプル
	 * 3
	 * 12 15 18
	 *
	 * segment tree構築後のtreeの値
	 * [2147483647, 1, 3, 1, 12, 15, 18, 2147483647]
	 */
	private void solveC3() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		SegTree tree = new SegTree(numN);

		/*
		 * set前
		 * [2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647]
		 */
		for (int i = 0; i < wk.length; i++) {
			tree.set(i, wk[i]);
		}
		/*
		 * set終わった直後
		 * [2147483647, 2147483647, 2147483647, 2147483647, 7, 6, 8, 2147483647]
		 */
		tree.build();
		/*
		 * build終わった直後
		 * [2147483647, 1, 1, 1, 7, 6, 8, 2147483647]
		 *
		 * leaf　は値で、nodeは公約数
		 *  1( k 1)
		 *     |----------------------|
		 *     |                      |
		 *  1(2k 2)               1(2k+1 3)
		 *     |--------|             |----------|
		 *     |        |             |          |
		 *  7(2k 4) 6(2k+1 5)     8(2k 6)   2147483647(2k+1 7)
		 */

		long res = 0;

		for (int i = 0; i < numN; i++) {
			/*
			 * 半開区間(]
			 * 0 - i
			 * のGCD
			 */
			long left = tree.get(0, i);
			/*
			 * 半開区間(]
			 * i+1 - numN
			 * のGCD
			 */
			long right = tree.get(i + 1, numN);
			res = Long.max(res, getGcd(left, right));
		}

		out.println(res);
	}

	/**
	 * segment tree
	 * 完全二分木
	 * @author pc9801bx2
	 *
	 */
	private static class SegTree {

		private long[] dat;
		private int numOfElm;
		private int numOfElmSize;

		private SegTree(int numOfElm) {
			this.numOfElm = numOfElm;

			numOfElmSize = 1;
			/*
			 * サイズの調整
			 * 必要要素数の決定
			 * 例：numOfElm==3 なら numOfElmSize==4
			 */
			while (numOfElmSize < numOfElm) {
				numOfElmSize *= 2;
			}

			/*
			 * 配列の作成
			 * size==8
			 */
			dat = new long[numOfElmSize * 2];
			Arrays.fill(dat, Integer.MAX_VALUE);
		}

		private void set(int a, int val) {
			dat[a + numOfElmSize] = val;
		}

		private void build() {

			/*
			 * 親のノードを作っている
			 */
			for (int k = numOfElmSize - 1; k > 0; --k) {
				dat[k] = getInnerGcd(dat[k * 2], dat[k * 2 + 1]);
			}
		}

		/**
		 * k番目の値(0-indexd)をvalにupdate
		 * @param k
		 * @param val
		 */
		private void update(int k, int val) {
			k = k + numOfElmSize;
			dat[k] = val;
			while (k > 0) {
				dat[k] = getInnerGcd(k * 2, k * 2 + 1);
			}
		}

		/* get [a, b), a and b are 0-indexed */
		private long get(int a, int b) {
			long vleft = 0;
			long vright = 0;
			int left = a + numOfElmSize;
			int right = b + numOfElmSize;
			/*
			 * 親が違う間
			 * つまり、一番上の親までたどって最大公約数を探す
			 */
			while (left < right) {
				if ((left & 1) > 0) {
					//				if (left % 2 == 1) {
					vleft = getInnerGcd(vleft, dat[left + 1]);
				}
				if ((right & 1) > 0) {
					//				if (right % 2 == 1) {
					vright = getInnerGcd(dat[right + 1], vright);
				}
				//親ノードを選択
				//left >>=1;
				left = left / 2;
				//right >>=1;
				right = right / 2;
			}
			return getInnerGcd(vleft, vright);
		}

		/**
		 * SegTree用のGCD
		 * @param num1
		 * @param num2
		 * @return
		 */
		private long getInnerGcd(long num1, long num2) {
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