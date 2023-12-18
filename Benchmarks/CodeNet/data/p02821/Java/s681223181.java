
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
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
        String s = next();
        String t = next();
        out.println(t + s);
    }

    private void solveB() {
        long a = nextLong();
        long b = nextLong();
        long k = nextLong();

        if (k <= a) {
            out.println(a - k + " " + b);
        } else if (k <= a + b) {
            out.println(0 + " " + (b - (k - a)));
        } else {
            out.println(0 + " " + 0);
        }

    }

    private void solveC() {
        int x = nextInt();
        //2は素数
        if (x == 2) {
            out.println(2);
            return;
        }
        //２ではない偶数は素数になれないので奇数へ
        if (x % 2 == 0) {
            x++;
        }
        while (true) {
            boolean sosu = true;
            //奇数しか見ていないので偶数で割れるかの判定は不要
            for (int i = 3; i < x; i += 2) {
                if (x % i == 0) {
                    sosu = false;
                    break;
                }
            }
            if (sosu) {
                break;
            }
            //この時点では、素数の可能性は奇数のみ（２はすでに除外）
            x += 2;
        }
        out.println(x);
    }

    private void solveD() {
        int n = nextInt();
        int k = nextInt();
        int r = nextInt();
        int s = nextInt();
        int p = nextInt();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('r', r);
        map.put('s', s);
        map.put('p', p);

        char[] t = next().toCharArray();
        char[] hand = new char[n];
        long res = 0;

        for (int i = 0; i < t.length; i++) {
            char tmp = win(t[i]);
            if (i - k < 0) {
                res += map.get(tmp);
            } else {
                if (hand[i - k] != tmp) {
                    res += map.get(tmp);
                } else {
                    if (i + k < t.length) {
                        tmp = canSelect(hand[i - k], win(t[i + k]), map);
                    } else {
                        tmp = ' ';
                    }
                }
            }
            hand[i] = tmp;
        }

        out.println(res);
    }

    private char win(char aite) {
        switch (aite) {
            case 'r':
                return 'p';
            case 's':
                return 'r';
            case 'p':
                return 's';
        }
        return ' ';
    }

    private char canSelect(char pre, char next, Map<Character, Integer> map) {
        for (Entry<Character, Integer> e : map.entrySet()) {
            if (e.getKey() != pre && e.getKey() != next)
                return e.getKey();
        }
        return ' ';
    }

    /**
     * 		10	14	19	33	34
     * 10	20	24	29	43	44
     * 14	24	28	33	47	48
     * 19	29	33	38	52	53
     * 33	43	47	52	66	67
     * 34	44	48	53	67	68
     * =67+67+68
     * <p>
     * 		1	3	3	5	5	21	24	34	110
     * 1	2	4	4	6	6	22	25	35	111
     * 3	4	6	6	8	8	24	27	37	113
     * 3	4	6	6	8	8	24	27	37	113
     * 5	6	8	8	10	10	26	29	39	115
     * 5	6	8	8	10	10	26	29	39	115
     * 21	22	24	24	26	26	42	45	55	131
     * 24	25	27	27	29	29	45	48	58	134
     * 34	35	37	37	39	39	55	58	68	144
     * 110	111	113	113	115	115	131	134	144	220
     * = 113以上の数の合計 - mを超えた分の113
     */
    private void solveE() {
        int n = nextInt();
        long m = nextLong();
        long[] wk = LongStream.range(0, n).map(i -> nextLong()).toArray();

        Arrays.sort(wk);
        long left = -1;
        long right = wk[wk.length - 1] + wk[wk.length - 1] + 1;
		/*
		-1 から wk[max]*2+1　の間で、wk[i]+wk[i]の組数がmより小さい時の最大値を探す
		m以上の時の最小値(right)のばあい、mに満たない可能性がある。
		そのため、targetは組合せのショートを考慮してleftを採用
		これにより組合せ個数がオーバーの可能性があるがそこは後で合わせる。
		 */
        while (right - left > 1) {
            long mid = left + (right - left) / 2;
            boolean c = chkHandShakeNum(wk, mid, n, m);
            /*
            組合せがm個以上いるmidということは、midがちょっと小さい可能性がある
            そのため、leftをずらす。逆ならrightをずらす
             */
            if (!c) {
                right = mid;
            } else {
                left = mid;
            }
        }

        //この値以上となる組み合わせを合計する
        long target = right;
        long[] rui = new long[n + 1];
        for (int i = 0; i < n; i++) {
            rui[i + 1] = rui[i] + wk[i];
        }

        long res = 0;

        for (int i = 0; i < n; i++) {
        	/*
        	targetからwk[i]を引いた残りがどこのindexにいるのかの確認
        	 */
            int pos = lowerBound(wk, target - wk[i]);
            long cnt = n - pos;//累積和のためのポジション計算
            if (cnt == 0)
                continue;
            res += cnt * wk[i] + (rui[n] - rui[pos]);//累積
            m -= cnt;//帳尻合わせのためにmの残数を確認
        }
        /*
        mが-まで行く可能性がある（重複選択）ため、-分targetを引いておく
        ここの段階で最初のにぶたんじにrightを採用すると、mに足りていない。
        かといって、*mを実施すると本来なら113なのに114を採用することになる。
         */
        res += m * left;
        out.println(res);
    }

    /**
     * val以上の個数の合計がM個以上かどうか
     * m個以上であれば一旦採用
     */
    private boolean chkHandShakeNum(long[] nums, long val, long n, long m) {
        long cnt = 0;
        for (int i = 0; i < n; i++) {
			/*
			val-nums[i]の残りの値がどこのindexにいるのか確認する。
			これがnを超えるのならnums[i]を採用した場合には相手がいないことになる。
			 */
            long pos = lowerBound(nums, val - nums[i]);
            cnt += (n - pos);
        }
        return cnt >= m;
    }

    /*
    LowerBound実装
     */
    private int lowerBound(long[] nums, long val) {
        int left = -1;
        int right = nums.length;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= val) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
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
     *
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
     *
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
     *
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
     *
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
     *
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