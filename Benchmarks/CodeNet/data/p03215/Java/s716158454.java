
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * https://kenkoooo.com/atcoder/#/contest/show/5c4220a1-5d27-48d0-ab91-9341d1f2fcab
 */
public class Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    //    private final InputStream in = Files.newInputStream(Paths.get("C:\\Users\\ryo.suzuki\\Downloads\\02.txt"));
    private final InputStream in = System.in;
    private final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private void solve() throws IOException {
        try {
//            solveA();
//            solveB();
//            solveC();
//            solveD();
            solveE();
//            solveF();
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

    // mods
    long MOD = (long) Math.pow(10, 9) + 7;

    /**
     * https://atcoder.jp/contests/code-formula-2014-quala/tasks/code_formula_2014_qualA_a
     * A - 立方数
     */
    private void solveA() {
        long a = nextLong();
        for (int i = 1; i <= Math.sqrt(a); i++) {
            if (Math.pow(i, 3) == a) {
                out.println("YES");
                return;
            }
        }
        out.println("NO");
    }

    /**
     * https://atcoder.jp/contests/abc161/tasks/abc161_b
     * B - Popular Vote
     */
    private void solveB() {
        int n = nextInt();
        int m = nextInt();
        int[] a = IntStream.range(0, n).map(i -> nextInt()).toArray();
        int sum = Arrays.stream(a).sum();
        int cnt = 0;
        for (int item : a) {
            if (item * 4 * m >= sum) {
                cnt++;
            }
        }
        out.println(cnt >= m ? "Yes" : "No");
    }

    /**
     * https://atcoder.jp/contests/abc097/tasks/abc097_b
     * B: Exponential
     * <p>
     * 全部試す。
     */
    private void solveC() {
        int x = nextInt();
        int res = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 2; j <= 10; j++) {
                int tmp = (int) Math.pow(i, j);
                if (tmp > x)
                    break;
                res = Math.max(res, tmp);
            }
        }
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/abc147/tasks/abc147_d
     * D - Xor Sum 4
     */
    private void solveD() {
        int n = nextInt();
        long[] a = LongStream.range(0, n).map(i -> nextLong()).toArray();
        long res = 0;

        /*
         * A0	3					0	0	0	1	1
         * A1	1					0	0	0	0	1
         * A2	4					0	0	1	0	0
         * A3	1					0	0	0	0	1
         * A4	5					0	0	1	0	1
         * A5	9					0	1	0	0	1
         * A6	2					0	0	0	1	0
         * A7	6					0	0	1	1	0
         * A8	5					0	0	1	0	1
         * A9	3					0	0	0	1	1
         *
         * 各桁ごとの1の個数		0	1	4	4	7
         * 各桁ごとの0の個数		0	9	6	6	3
         *
         * 累乗						4	3	2	1	0
         *
         * 1の個数×0の個数×2^累乗	0	72	96	48	21
         *
         * 合計										237
         */

        for (int i = 0; i < 60; i++) {
            long o = 0;
            long z = 0;
            for (long l : a) {
                if ((((l >> i) & 1) == 1))
                    o++;
                else
                    z++;
            }
            long cnt = o * z % MOD;
            res += (cnt * (Math.pow(2, i)) % MOD) % MOD;
            res %= MOD;
        }
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/dwacon5th-prelims/tasks/dwacon5th_prelims_b
     * B - Sum AND Subarrays
     * https://aoaoaoaoaoaoaoi.hatenablog.com/entry/2018/12/16/014125
     *
     *
     * https://ufcpp.net/study/csharp/st_operator.html
     * https://hewla.hatenablog.com/entry/2018/11/24/222232
     * https://qiita.com/nomikura/items/d66e3d8efe0a9adde962
     */
    private void solveE() {
        int n = nextInt();
        int k = nextInt();
        int[] a = IntStream.range(0, n).map(i -> nextInt()).toArray();
        //空ではない部分文字列の和を保存するためのリスト
        List<Long> item = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            long tmp = 0;
            for (int j = i; j < n; j++) {
                tmp += a[j];
                if (tmp != 0)
                    item.add(tmp);
            }
        }
        //和の中の最大値
        OptionalLong wkMax = item.stream().mapToLong(x -> x).max();
        /*
        javaのlog(x,2)は、対数の底の変換公式を使う
        やっていることは単純に、動かすbitの左端の位置を求めている
        例えば、14なら1110→3という風に
        1L<<3をしたい
         */
        long max = (long) (Math.log(wkMax.getAsLong()) / Math.log(2));
        long res = 0;
        //最大値から0までループを回す
//        for (long i = wkMax.getAsLong(); i >= 0; i--) {
        for (long i = max; i >= 0; i--) {
            final long bit = 1L << i;
            //2のi乗との論理積
            //結果が1以上になったもの（結果で1が立っている）ものだけをリストに保存
            List<Long> tmp = item.stream().filter(x -> (bit & x) != 0).collect(Collectors.toList());

            //Kよりもリスト内の数が大きければ
            if (k <= tmp.size()) {
                //次の処理にリストをコピーする
                item = tmp;
                //これまでの答えとの論理和
                res |= bit;
            }
        }
        out.println(res);
    }

    private void solveF() {

    }

    static final long CONST_INF = Long.MAX_VALUE / 4;


    private static class VectorCalculation {
        /**
         * 点Pと線(AB)の距離
         *
         * @param p
         * @param a
         * @param b
         * @return
         */
        private double distanceDotAndLine(DoublePair p, DoublePair a, DoublePair b) {
            DoublePair ab = new DoublePair(b.x - a.x, b.y - a.y);
            DoublePair ap = new DoublePair(p.x - a.x, p.y - a.y);

            // ベクトルAB、APの外積の絶対値が平行四辺形Dの面積になる
            double d = Math.abs(crossVector(ab, ap));

            double l = distanceVertex(a, b); // AB間の距離

            double h = d / l;
            return h;
        }

        /**
         * 2点間距離
         *
         * @param p1
         * @param p2
         * @return
         */
        private double distanceVertex(DoublePair p1, DoublePair p2) {
            double dx = p1.x - p2.x;
            double dy = p1.y - p2.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        /**
         * ベクトル外積
         *
         * @param vl
         * @param vr
         * @return
         */
        private double crossVector(DoublePair vl, DoublePair vr) {
            return vl.x * vr.y - vl.y * vr.x;
        }
    }

    private static class DoublePair implements Comparable<DoublePair> {
        double x;
        double y;

        public DoublePair(double k, double v) {
            this.x = k;
            this.y = v;
        }

        public int compareTo(DoublePair pair) {
            return Double.compare(this.y, pair.y);
        }
    }

    private static class SimplePair implements Comparable<SimplePair> {
        long k;
        long v;

        public SimplePair(int k, int v) {
            this.k = k;
            this.v = v;
        }

        public SimplePair(long k, long v) {
            this.k = k;
            this.v = v;
        }

        public int compareTo(SimplePair pair) {
            return Long.compare(this.v, pair.v);
        }
    }


    private static class SimpleGraphNode {
        private int n;
        private Map<Integer, Integer> childs;

        public SimpleGraphNode(int n) {
            this.n = n;
            childs = new HashMap<Integer, Integer>();
        }

        public void addChild(int child, int d) {
            this.childs.put(child, d);
        }
    }

    private static class SimpleGraph {

        private Map<Integer, SimpleGraphNode> graph;

        public SimpleGraph(int[][] list) {
            graph = new HashMap<Integer, SimpleGraphNode>();
            Arrays.stream(list).forEach(l -> {
                int a = l[0];
                int b = l[1];
                int d = l[2];
                graph.put(a, graph.getOrDefault(a, new SimpleGraphNode(a)));
                graph.get(a).addChild(b, d);
                graph.put(b, graph.getOrDefault(b, new SimpleGraphNode(b)));
                graph.get(b).addChild(a, d);
            });
        }

        public SimpleGraphNode getNode(int i) {
            return graph.getOrDefault(i, new SimpleGraphNode(-1));
        }

    }

    private static class GraphNode {
        private long n;
        private Map<Long, SimplePair> childs;

        public GraphNode(long n) {
            this.n = n;
            childs = new TreeMap<Long, SimplePair>();
        }

        /**
         * not update
         *
         * @param child
         * @param d
         */
        public void addChild(long child, long d) {
            this.childs.put(child, this.childs.getOrDefault(child, new SimplePair(child, d)));
        }

        public SimplePair getChild(long child) {
            return this.childs.getOrDefault(child, new SimplePair(child, CONST_INF));
        }
    }

    private static class Graph {

        private Map<Long, GraphNode> graph;
        int n;

        /**
         * @param n    頂点数
         * @param list
         */
        public Graph(int n, int[][] list) {
            this.n = n;
            graph = new HashMap<Long, GraphNode>();
            /*
            隣接行列作成
            0-indexed
             */
            Arrays.stream(list).forEach(l -> {
                long a = l[0] - 1;
                long b = l[1] - 1;
                long d = l[2];
                graph.put(a, graph.getOrDefault(a, new GraphNode(a)));
                graph.get(a).addChild(b, d);
                graph.put(b, graph.getOrDefault(b, new GraphNode(b)));
                graph.get(b).addChild(a, d);
            });
            /*
            たどり着けない場所はCONST_INFで埋める
            自分へはCOST=0でたどり着ける
             */
            for (long i = 0; i < n; i++) {
                graph.put(i, graph.getOrDefault(i, new GraphNode(i)));
                GraphNode node = graph.get(i);
                for (int j = 0; j < n; j++) {
                    if (i == j)
                        node.addChild(j, 0L);
                    else
                        node.addChild(j, CONST_INF);
                }
            }
        }

        /**
         * ワーシャルフロイド
         */
        public void warshallFloyd() {
            for (long k = 0; k < n; k++) {
                for (long i = 0; i < n; i++) {
                    for (long j = 0; j < n; j++) {
                        long min = Math.min(graph.get(i).getChild(j).v, graph.get(i).getChild(k).v + graph.get(k).getChild(j).v);
                        graph.get(i).getChild(j).v = min;
                    }
                }
            }
        }

        public void partialUpdateAndWarshallFloyd(long x, long y, long w) {
            if (graph.get(x).getChild(y).v > w)
                graph.get(x).getChild(y).v = graph.get(y).getChild(x).v = w;
            long[] l = {x, y};
            for (long k : l) {
                for (long i = 0; i < n; i++) {
                    for (long j = 0; j < n; j++) {
                        if (graph.get(i).getChild(j).v > graph.get(i).getChild(k).v + graph.get(k).getChild(j).v) {
                            graph.get(i).getChild(j).v = graph.get(i).getChild(k).v + graph.get(k).getChild(j).v;
                        }
                    }
                }
            }
        }

        /**
         * 2点間の距離
         *
         * @param from
         * @param to
         * @return
         */
        public long getDistance(long from, long to) {
            return graph.get(from).getChild(to).v;
        }

    }

    public long calcSimpleCombination(long n, long m, long CONST_MOD) {
        long mole = 1;
        for (long i = 1; i <= n + m; i++) {
            mole *= i;
            mole %= CONST_MOD;
        }
        long deno = 1;
        for (long i = 1; i <= n; i++) {
            deno *= i;
            deno %= CONST_MOD;
        }
        for (int i = 1; i <= m; i++) {
            deno *= i;
            deno %= CONST_MOD;
        }
        deno = modInverse(deno, CONST_MOD);
        return (mole * deno) % CONST_MOD;
    }

    long abs(double x) {
        return (long) Math.abs(x);
    }

    long round(double x) {
        return Math.round(x);
    }

    long floor(double x) {
        return (long) Math.floor(x);
    }

    long ceil(double x) {
        return (long) Math.ceil(x);
    }

    double sqrt(double x) {
        return Math.sqrt(x);
    }

    double pow(double x, double y) {
        return Math.pow(x, y);
    }

    long pow(long x, long y) {
        return (long) Math.pow(x, y);
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public long lcmMod(long... ab) {

        Map<Long, Long> ps = new HashMap<Long, Long>();

        for (int abl = 0; abl < ab.length; abl++) {
            long target = ab[abl];
            long l = target;
            for (long p = 2; p * p <= l; p++) {
                long cnt = 0;
                while (target > 1 && target % p == 0) {
                    cnt++;
                    target /= p;
                }
                if (cnt == 0)
                    continue;
                ps.put(p, Long.max(cnt, ps.getOrDefault(p, 0L)));
            }
            if (target > 1)
                ps.put(target, Long.max(1, ps.getOrDefault(target, 0L)));
        }
        long res = 1L;
        for (Map.Entry<Long, Long> e : ps.entrySet()) {
            res *= powMod(e.getKey(), e.getValue());
            res %= MOD;
        }
        return res;
    }

    int upperToInt(char a) {
        return a - 'A';
    }

    int lowerToInt(char a) {
        return a - 'a';
    }

    int numToInt(char a) {
        return a - '0';
    }

    int charToInt(char a) {
        return a >= 'a' ? lowerToInt(a) : a >= 'A' ? upperToInt(a) : numToInt(a);
    }

    char intToUpper(int a) {
        return (char) (a + 'A');
    }

    char intToLower(int a) {
        return (char) (a + 'a');
    }

    char intToNum(int a) {
        return (char) (a + '0');
    }

    void reverse(String array[]) {
        String reversed[] = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void reverse(int array[]) {
        int reversed[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void reverse(long array[]) {
        long reversed[] = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void reverse(double array[]) {
        double reversed[] = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void reverse(boolean array[]) {
        boolean reversed[] = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = reversed[i];
        }
    }

    void fill(int array[][], int x) {
        for (int a[] : array) {
            Arrays.fill(a, x);
        }
    }

    void fill(long array[][], long x) {
        for (long a[] : array) {
            Arrays.fill(a, x);
        }
    }

    void fill(double array[][], double x) {
        for (double a[] : array) {
            Arrays.fill(a, x);
        }
    }

    void fill(boolean array[][], boolean x) {
        for (boolean a[] : array) {
            Arrays.fill(a, x);
        }
    }

    void fill(int array[][][], int x) {
        for (int a[][] : array) {
            fill(a, x);
        }
    }

    void fill(long array[][][], long x) {
        for (long a[][] : array) {
            fill(a, x);
        }
    }

    void fill(double array[][][], double x) {
        for (double a[][] : array) {
            fill(a, x);
        }
    }

    void fill(boolean array[][][], boolean x) {
        for (boolean a[][] : array) {
            fill(a, x);
        }
    }

    long L_INF = (long) 1e18 + 7;

    boolean isINF(long a) {
        return abs(a) > L_INF / 1000;
    }

    boolean isPlusINF(long a) {
        return a > 0 && isINF(a);
    }

    boolean isMinusINF(long a) {
        return isPlusINF(-a);
    }

    int I_INF = (int) 1e9 + 7;

    boolean isINF(int a) {
        return abs(a) > I_INF / 1000;
    }

    boolean isPlusINF(int a) {
        return a > 0 && isINF(a);
    }

    boolean isMinusINF(int a) {
        return isPlusINF(-a);
    }

    /**
     * 指定したx以下の素数をリストアップする
     */
    public long[] getPrimesUnderX(long x) {
        return LongStream.rangeClosed(2, x)
                .filter(i -> LongStream.rangeClosed(2, (long) Math.sqrt(i)).allMatch(j -> i % j != 0)).toArray();
    }


    public long mod(long i) {
        return i % MOD + ((i % MOD) < 0 ? MOD : 0);
    }

    long powMod(long x, long y) {
        if (y == 0) {
            return 1;
        } else {
            long tmp = powMod(x, y / 2);
            return mod(mod(tmp * tmp) * (y % 2 == 0 ? 1 : x));
        }
    }

    long inv(long x) {
        return powMod(x, MOD - 2);
    }

    int MAX_FACT = 5_000_100;
    long fact[];
    long invFact[];

    /**
     * Combination簡易版
     * 5 C 2
     * 異なる n個のものから r個を選ぶ組み合わせの総数 nCr を求めます。
     * 5!(5*4*3*2*1)
     * /
     * 2!(2*1) *  (5-2)!(3*2*1)
     *
     * @param n
     * @param r
     * @return
     */
    private long getComb(int n, int r) {
        long tmp = 1;
        for (int i = 1; i <= r; i++) {
            tmp *= n - i + 1;
            tmp = mod(tmp);
            tmp *= inv(i);
            tmp = mod(tmp);
        }
        return tmp;
    }

    /**
     * 階乗計算の事前累積和
     * [1, 1, 2, 3, 4, 5, … FACTORIAL_NUM]
     * mod済
     */
    void prepareFact() {
        fact = new long[MAX_FACT];
        Arrays.fill(fact, 0);
        invFact = new long[MAX_FACT];
        Arrays.fill(invFact, 0);
        fact[0] = 1;
        int maxIndex = (int) min(MAX_FACT, (int) MOD);
        for (int i = 1; i < maxIndex; i++) {
            fact[i] = mod(fact[i - 1] * i);
        }
        invFact[maxIndex - 1] = inv(fact[maxIndex - 1]);
        for (int i = maxIndex - 1; i > 0; i--) {
            invFact[i - 1] = mod(invFact[i] * i);
        }
    }

    /**
     * 順列
     * nPk -> n! / (n-k)!
     *
     * @param n
     * @param r
     * @return
     */
    long permutation(int n, int r) {
        if (n < 0 || r < 0 || n < r) {
            return 0;
        }
        return mod(fact[n] * invFact[n - r]);
    }

    /**
     * 組み合わせ
     * nCk -> n! / k!・(n-k)!
     *
     * @param n
     * @param r
     * @return
     */
    long combination(int n, int r) {
        if (n < 0 || r < 0 || n < r) {
            return 0;
        }
        return mod(permutation(n, r) * invFact[r]);
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
     * @return
     */
    long homogeneousProduct(int n, int r) {
        return combination((n - 1) + r, r);
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
