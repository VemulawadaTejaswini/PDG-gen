
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
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
			//			solveB2();
			//			solveC();
			solveD();
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
		long a = nextLong();
		long b = nextLong();
		if (Math.abs(a - b) == Math.abs(b - a) && Math.abs(a - b) % 2 == 0) {
			long wk = Math.abs(a - b) / 2;
			//			if (a > wk)
			//				out.println(a - wk);
			//			else
			//				out.println(a + wk);
			long wk2 = Math.max(a, b) - wk;
			out.println(wk2);
			//			out.println((a + b) / 2);
		} else {
			out.println("IMPOSSIBLE");
		}
	}

	private void solveB() {
		int n = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();
		int cnt = 0;
		for (int i = 0; i < wk.length; i++) {
			if (wk[i] != i + 1)
				cnt++;
		}
		if (cnt <= 2)
			out.println("YES");
		else
			out.println("NO");
	}

	private void solveB2() {
		int n = nextInt();
		int[] wk = IntStream.range(0, n).map(i -> nextInt()).toArray();
		boolean d = false;
		int b = 0;
		int bI = 0;
		int sI = 0;
		for (int i = 1; i < wk.length; i++) {
			if (!d && wk[i - 1] > wk[i]) {
				d = true;
				b = wk[i];
				bI = i;
				sI = i - 1;
			}
			if (d && b > wk[i]) {
				b = wk[i];
				bI = i;
			}
		}
		int wkT = wk[sI];
		wk[sI] = wk[bI];
		wk[bI] = wkT;

		for (int i = 1; i < wk.length; i++) {
			if (wk[i - 1] > wk[i]) {
				out.println("NO");
				return;
			}
		}
		out.println("YES");
	}

	private void solveC() {
		int n = nextInt();
		long[] a = LongStream.range(0, n + 1).map(i -> nextLong()).toArray();
		long[] b = LongStream.range(0, n).map(i -> nextLong()).toArray();

		long total = Arrays.stream(a).sum();
		for (int i = 0; i < n; i++) {
			if (b[i] >= a[i]) {
				b[i] -= a[i];
				a[i] = 0;
			} else {
				a[i] -= b[i];
				b[i] = 0;
			}
			if (b[i] > 0) {
				if (a[i + 1] >= b[i]) {
					a[i + 1] -= b[i];
					b[i] = 0;
				} else {
					a[i + 1] = 0;
					b[i] = 0;
				}
			}
		}
		long fix = Arrays.stream(a).sum();
		out.println(total - fix);
	}

	/**
	 * ??2??5 を上位桁から確定した時の 13 で割った余りの遷移
	 * mod		0	1	2	3	4	5	6	7	8	9	10	11	12
	 * 0		1	0	0	0	0	0	0	0	0	0	0	0	0
	 * ?		1	1	1	1	1	1	1	1	1	1	0	0	0
	 * ??		8	8	8	8	8	8	8	8	8	7	7	7	7
	 * ??2		8	7	8	8	8	7	8	8	7	8	8	7	8
	 * ??2?		77	77	76	77	77	77	76	77	78	78	77	76	77
	 * ??2??	768	768	769	770	771	772	771	770	769	768	768	768	768
	 * ??2??5	771	768	768	772	768	768	771	769	768	770	770	768	769
	 *
	 * 例:15 → 153
	 * 15%13 = 2
	 * 153%13 = 10
	 * 15に3をくっつけた数は、[15×10 + 3]と表すことができる。合同式的な考え方をすると、
	 * 15≡2(mod13)]なので、[15×10 + 3≡2×10 + 3]のようになり、いろいろすると10が計算できる。
	 * 次の場所は、
	 * （前回の余り2×10+（0から12）)%13
	 */
	private void solveD() {
		final long CONST_MAX = (long) (Math.pow(10, 9) + 7);
		char[] s = next().toCharArray();

		int n = s.length;
		final int DIGIT = 13;
		long[][] dp = new long[n + 1][13];

		dp[0][0] = 1;
		for (int i = 0; i < n; i++) {
			int c = s[i] == '?' ? -1 : s[i] - '0';

			if (c != -1) {
				/*
				 * 値が決まっている
				 * 現在のmodの値を、下の桁へ配っていく
				 */
				for (int k = 0; k < DIGIT; k++) {
					dp[i + 1][(k * 10 + c) % 13] += dp[i][k];
				}
			} else {

				/*
				 * 値が決まっていないので、全ての数値を試す
				 * 現在のmodの値を、下の桁へ配っていく
				 */
				for (int k = 0; k < DIGIT; k++) {
					//0-9
					for (int j = 0; j < 10; j++) {
						dp[i + 1][(k * 10 + j) % 13] += dp[i][k];
					}
				}
			}

			//			//0-9
			//			for (int j = 0; j < 10; j++) {
			//				//?ではないなら既定の値以外は処理できないので
			//				if (c != -1 && c != j)
			//					continue;
			//				/*
			//				 * 現在のmodの値を、下の桁へ配っていく
			//				 *
			//				 */
			//				for (int k = 0; k < DIGIT; k++) {
			//					dp[i + 1][(k * 10 + j) % 13] += dp[i][k];
			//				}
			//			}

			for (int j = 0; j < DIGIT; j++) {
				dp[i + 1][j] %= CONST_MAX;
			}
		}

		out.println(dp[n][5]);
	}

	private void solveE() {
		int n = nextInt();

		out.println("");
	}

	private void solveF() {
		int n = nextInt();

		out.println("");
	}

	/*
	 * 階乗計算の最大値
	 * もっと大きいのが必要ならここを修正
	 */
	private final int FACTORIAL_NUM = 111111;
	/*
	 * 階乗の事前計算（mod 済）
	 */
	private long[] factorial = new long[FACTORIAL_NUM];
	/*
	 * 逆数の事前計算（mod 済）
	 */
	private long[] reverseFactorial = new long[FACTORIAL_NUM];
	private boolean isInitFactorial = false;

	/**
	 * 階乗計算の事前累積和
	 * [1, 1, 2, 3, 4, 5, … FACTORIAL_NUM]
	 * mod済
	 */
	private void initFactorial(long mod) {
		factorial[0] = 1;
		for (int i = 1; i < FACTORIAL_NUM; i++) {
			factorial[i] = (factorial[i - 1] * i) % mod;
		}
	}

	/**
	 * 逆数の事前計算
	 * もっと速い方法があったので修正
	 */
	private void initReverseFactorial(long mod) {

		reverseFactorial[FACTORIAL_NUM - 1] = modInverse(factorial[FACTORIAL_NUM - 1], mod);
		for (int i = FACTORIAL_NUM - 2; i >= 0; i++) {
			/*
			 * 以下を利用する。
			 * これにより毎回modInverseしなくてよくなる
			 * (N!)^(-1) * N -> ((N - 1)!)^(-1)
			 * (N-1!)^(-1) * N -> ((N - 2)!)^(-1)
			 */
			reverseFactorial[i] = (reverseFactorial[i + 1] * (i + 1)) % mod;
		}
		//		reverseFactorial[0] = 1;
		//		for (int i = 0; i < FACTORIAL_NUM; i++) {
		//			reverseFactorial[i] = modInverse(factorial[i], mod);
		//		}
	}

	/**
	 * フェルマーの小定理を用いて逆元を求める。
	 * ある数xのmod p（pは素数）の逆数x'はx' = x^(p-2)
	 * 繰り返し二乗法を用いて計算する。
	 * http://satanic0258.hatenablog.com/entry/2016/04/29/004730
	 * {@link BigInteger#modInverse(BigInteger)}とどちらが速いか？
	 * @param x
	 * @return
	 */
	private long modInverse(long x, long mod) {
		long res = 1L;
		long k = mod - 2L;
		long y = x;
		while (k != 0) {
			if (k % 2 != 0) {
				res = (res * y) % mod;
			}
			y = (y * y) % mod;
			k /= 2;
		}
		return res;
	}

	private void initFactorialCalc(long mod) {
		if (isInitFactorial) {
			//初期化済みならreturn
			return;
		}
		//階乗の事前計算
		initFactorial(mod);
		//逆数の計算もしておく
		initReverseFactorial(mod);
		isInitFactorial = true;
	}

	/**
	 * 組み合わせ
	 * nCk -> n! / k!・(n-k)!
	 * @param n
	 * @param k
	 * @param mod
	 * @return
	 */
	private long combination(int n, int k, long mod) {
		initFactorialCalc(mod);
		if (k < 0 || n < k) {
			return 0;
		}

		//分子の計算
		long calResN = factorial[n];

		//分母の計算
		long calResNK = reverseFactorial[n - k];
		long calcResK = reverseFactorial[k];
		long denominator = (calResNK * calcResK) % mod;

		return (calResN * denominator) % mod;

	}

	/**
	 * 順列
	 * nPk -> n! / (n-k)!
	 * @param n
	 * @param k
	 * @return
	 */
	private long permutation(int n, int k, long mod) {
		initFactorialCalc(mod);
		if (k < 0 || n < k) {
			return 0;
		}
		long calResN = factorial[n];
		long calResNK = reverseFactorial[n - k];
		return (calResN * calResNK) % mod;
	}

	/**
	 * 多項係数
	 * 文字aをp個,bをq個,cをr個, dをs個 あわせてn個を1列に並べるときの並べ方
	 * n! / p!・q!・r!・s!
	 * @param n
	 * @param strNum
	 * @param mod
	 * @return
	 */
	private long multinominalCoefficient(int n, List<Integer> strNum, int mod) {
		initFactorialCalc(mod);

		long calResN = factorial[n];
		long calResDenomi = 1;
		for (Integer num : strNum) {
			calResDenomi *= reverseFactorial[num];
		}
		return (calResN * calResDenomi) % mod;
	}

	/**
	 * 重複組合せ nHr （同次積）
	 * nHr = (n+r-1)Cr
	 * 異なるn個のものから重複を許してr個取る組合せの総数
	 * 例：
	 * リンゴ，ミカン，牛肉の3種類の果物があります．これらの中から6個の食材を買って帰ります．
	 * このとき，何通りの買い方がありますか？ただし，含まれない食材があってもよいものとします
	 * @param n
	 * @param r
	 * @param mod
	 * @return
	 */
	private long homogeneousProduct(int n, int r, long mod) {
		if (n == 0 && r == 0) {
			return 1;
		}
		return combination(n + r - 1, r, mod);
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
