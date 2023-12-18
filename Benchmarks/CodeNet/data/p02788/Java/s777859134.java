
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        try {
//            solveA();
//            solveB();
//            solveC();
//            solveD();
//            solveE();
            solveF();
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
        int h = nextInt();
        int a = nextInt();
        int monster = (h / a) + ((h % a != 0) ? 1 : 0);
        out.println(monster);
    }

    private void solveB() {
        int h = nextInt();
        int n = nextInt();
        int total = IntStream.range(0, n).map(i -> nextInt()).sum();

        out.println(h <= total ? "Yes" : "No");
    }

    private void solveC() {
        int n = nextInt();
        int k = nextInt();
        long[] h = LongStream.range(0, n).map(i -> nextLong()).sorted().toArray();
        long res = 0;
        for (int i = 0; i < n - k; i++) {
            res += h[i];
        }
        out.println(res);
    }

    private void solveD() {
        long h = nextLong();
        int cnt = 0;
        while (h != 0) {
            h /= 2;
            cnt++;
        }
        long res = 1;
        for (int i = 1; i <= cnt; i++) {
            res <<= 1;
        }
        out.println(res - 1);
    }

    private void solveE() {
        int h = nextInt();
        int n = nextInt();
        int[][] wk = Stream.generate(() -> new int[]{nextInt(), nextInt()}).limit(n).toArray(int[][]::new);

        long[][] dp = new long[n + 2][h + 2];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][0] = 0;
        }
        /*
        モンスターの体力が-0の時は魔法消費ゼロ
         */
        dp[0][0] = 0;
//        for (int i = 0; i < n; i++) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= h; j++) {
                //ダメージ量（範囲を超えないように）
                /*
                1個前の魔法とwk[i-1][0]のダメージを与える魔法を使った場合(新規に魔法を使った)
                →ただし、魔法力0の場合があるの
                魔法を使わなかった場合
                wk[i-1]の魔法（同じ魔法）を使った場合(同じ魔法を繰り返した)
                 */
//                int from = Math.max(j - wk[i - 1][0], 0);
//                dp[i][j] = min(dp[i - 1][from] + wk[i - 1][1], dp[i - 1][j], dp[i][from] + wk[i - 1][1]);
                /*
                minの引数を一つ減らせる
                これは、左から順に埋めているので一戸前の値は梅済みだから
                 */
                int from = Math.max(j - wk[i - 1][0], 0);
                dp[i][j] = min(dp[i - 1][j], dp[i][from] + wk[i - 1][1]);
            }
        }
        out.println(dp[n][h]);
    }

    private long getAtckTime(long a, long h) {
        return (h / a) + ((h % a) == 0 ? 0L : 1L);
    }

    private int getLowerIndex(long[][] monsters, long monsD) {
        int left = -1;
        int right = monsters.length;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (monsD < monsters[mid][0]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if (right < 0 || right >= monsters.length)
            return -1;
        else
            return right;
    }

    private void solveF() {
        int n = nextInt();
        int d = nextInt();
        int a = nextInt();
        long[][] monsters = Stream.generate(() -> new long[]{nextLong() - 1, nextLong()}).limit(n).toArray(long[][]::new);
        Arrays.sort(monsters, (x, y) -> Long.compare(x[0], y[0]));

//        StringBuilder buil2 = new StringBuilder();
//        for (long[] item : monsters) {
//            buil2.append(item[1]).append("/");
//        }
//        System.out.println(buil2.toString());

        long[] imos = new long[n];
        long damage = monsters[0][1];
        imos[0] = damage;
        long end = monsters[0][0] + d * 2;
        //endを見つける処理を記述
        int index = getLowerIndex(monsters, end);
        if (index >= 0)
            imos[index] = -damage;
        long res = getAtckTime(a, damage);
        for (int i = 1; i < n; i++) {
            imos[i] += imos[i - 1];
//            StringBuilder buil = new StringBuilder();
//            for (long item : imos) {
//                buil.append(item).append("/");
//            }
//            System.out.println(buil.toString());
            if (monsters[i][1] > imos[i]) {
                long times = monsters[i][1] - imos[i];
                imos[i] += times;
                end = monsters[i][0] + d * 2;
                index = getLowerIndex(monsters, end);

                if (index >= 0)
                    imos[index] = -times;
                res += getAtckTime(a,times);
            }
        }
        out.println(res);
    }

    private void solveF2() {
        int n = nextInt();
        int d = nextInt();
        int a = nextInt();
        int[][] monsters = Stream.generate(() -> new int[]{nextInt() - 1, nextInt()}).limit(n).toArray(int[][]::new);
        Arrays.sort(monsters, (x, y) -> Integer.compare(x[0], y[0]));
        long[] hp = new long[monsters[n - 1][0] + 1];
        long[] atk = new long[monsters[n - 1][0] + 1];
        for (int[] item : monsters) {
            hp[item[0]] = getAtckTime(a, item[1]);
        }
        int maxD = monsters[n - 1][0];
        long baseAttackTime = getAtckTime(a, monsters[0][1]);
        atk[0] = baseAttackTime;
        if (d * 2 + 1 <= maxD)
            atk[d * 2 + 1] = -baseAttackTime;
        long res = baseAttackTime;
        for (int i = 1; i < hp.length; i++) {
            atk[i] += atk[i - 1];
            if (hp[i] > atk[i]) {
                long times = hp[i] - atk[i];
                atk[i] += times;
                if (i + (d * 2) + 1 <= maxD)
                    atk[i + (d * 2) + 1] -= times;
                res += times;
            }
        }
        out.println(res);
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

    public long min(long... v) {
        long min = Long.MAX_VALUE;
        for (long i : v) min = Math.min(min, i);
        return min;
    }

    public long max(long... v) {
        long max = Long.MIN_VALUE;
        for (long i : v) max = Math.max(max, i);
        return max;
    }
}

class Combination {
    static final int MOD = (int) (Math.pow(10, 9) + 7);
    long[] fact;
    long[] invFact;
    long[] inv;

    public Combination(int n) {
        fact = new long[n + 1];
        invFact = new long[n + 1];
        inv = new long[n + 1];
        fact[0] = 1;
        fact[1] = 1;
        invFact[0] = 1;
        invFact[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            invFact[i] = invFact[i - 1] * inv[i] % MOD;
        }
    }

    public long combination(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return fact[n] * (invFact[k] * invFact[n - k] % MOD) % MOD;
    }
}