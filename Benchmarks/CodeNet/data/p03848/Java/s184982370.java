
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * https://kenkoooo.com/atcoder/#/contest/show/7786b247-8cfb-4385-aff7-ace64c5a14f6
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
            solveC();
//            solveD();
//            solveE();
//            solveF();
//            solveG();
//            solveH();
//            solveI();
//            solveJ();
//            solveK();
//            solveL();
//            solveM();
//            solveN();
//            solveO();
//            solveP();
//            solveQ();
//            solveR();

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
     * https://atcoder.jp/contests/abc057/tasks/abc057_c
     * C - Digits in Multiplication
     */
    private void solveA() {
        long n = nextLong();
        Map<Long, Integer> memo = new HashMap<Long, Integer>();
        long res = Long.MAX_VALUE;
        for (long i = 1; i <= Math.sqrt(n); i++) {
            long tmp = n / i;
            if (tmp * i != n)
                continue;
            int d1 = memo.getOrDefault(tmp, getDigits(tmp));
            memo.put(tmp, d1);
            int d2 = memo.getOrDefault(i, getDigits(i));
            memo.put(i, d2);
            res = Math.min(res, Math.max(d1, d2));
        }
        out.println(res);
    }

    private int getDigits(long n) {
        int cnt = 0;
        while (n > 0) {
            n /= 10;
            cnt++;
        }
        return cnt;
    }

    /**
     * https://atcoder.jp/contests/arc067/tasks/arc067_a
     * C - Factors of Factorial
     * <p>
     * https://mathtrain.jp/numberofd
     * <p>
     * 6!=6×5×4×3×2×16!=6×5×4×3×2×1
     * 6=3×26=3×2 であり、、4=2×2
     * 6!=3×2×5×2×2×3×26!=3×2×5×2×2×3×2
     * <p>
     * https://qiita.com/nomikura/items/15a97df87468c2feb256#abc052-factors-of-factorial
     * https://qiita.com/recuraki/items/362ff89a991905196b35
     */
    private void solveB() {
        long n = nextLong();
        Map<Long, Long> memo = new HashMap<Long, Long>();
        for (long i = 2; i <= n; i++) {
            long tmp = i;
            for (long j = 2; j <= i; j++) {
                while (tmp % j == 0) {
                    tmp /= j;
                    memo.put(j, memo.getOrDefault(j, 0L) + 1);
                }
            }
        }
        long res = 1;
        for (Map.Entry<Long, Long> e : memo.entrySet()) {
            res *= (e.getValue() + 1L) % MOD;
            res %= MOD;
        }
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/arc066/tasks/arc066_a
     * C - Lining Up
     *
     * https://oraclesqlpuzzle.ninja-web.net/kyoupro/kyoupro-08-050-c.html
     * http://keita-matsushita.hatenablog.com/entry/2016/12/26/220534
     * ダブリンぐ
     * やり直しを要する
     * https://tech-kyopro.com/atcoder-abc050-c-c
     */
    private void solveC() {
        /*
        N = 5 の時
        4, 2, 0, 2, 4
        N = 8 の時
        7, 5, 3, 1, 1, 3, 5, 7
         */
        int n = nextInt();
        int[] a = IntStream.range(0, n).map(i -> nextInt()).sorted().toArray();
        boolean isCorrect = true;

        for (int i = 1; i <= n; i++) {
            int wkNum;
            //Nが偶数の場合
            if (n % 2 == 0) {
                wkNum = (i % 2 == 0 ? i - 1 : i);
            } else {
                //Nが奇数の場合
                wkNum = (i % 2 == 1 ? i - 1 : i);
            }
            if (a[i - 1] != wkNum) {
                isCorrect = false;
                break;
            }
        }

        if (isCorrect)
            out.println(powMod(2, n / 2));
        else
            out.println(0);
    }

    /**
     * https://atcoder.jp/contests/abc048/tasks/arc064_a
     * C - Boxes and Candies
     */
    private void solveD() {
        int n = nextInt();
        int x = nextInt();
        int[] a = IntStream.range(0, n).map(i -> nextInt()).toArray();
        long res = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] + a[i + 1] > x) {
                int diff = (a[i] + a[i + 1]) - x;
                if (a[i + 1] >= diff)
                    a[i + 1] -= diff;
                else
                    a[i + 1] = 0;
                res += diff;
            }
        }
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/abc045/tasks/arc061_a
     * C - たくさんの数式
     */
    private void solveE() {
        String s = next();
        int n = s.length() - 1;
        long res = 0;
        for (long i = 0; i < (1 << n); i++) {
            long wk = i;
            int idx = 0;
            long tRes = 0;
            for (int j = 0; j < n; j++) {
                if ((wk & 1) == 1) {
                    tRes += Long.parseLong(s.substring(idx, j + 1));
                    idx = j + 1;
                }
                wk >>= 1;
            }
            tRes += Long.parseLong(s.substring(idx, n + 1));
//            out.println(tRes);
            res += tRes;
        }
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/abc042/tasks/arc058_a
     * C - こだわり者いろはちゃん
     */
    private void solveF() {
        int n = nextInt();
        int k = nextInt();
        int[] d = IntStream.range(0, k).map(i -> nextInt()).toArray();
        Set<Integer> set = Arrays.stream(d).mapToObj(i -> i).collect(Collectors.toSet());
        for (int i = n; i <= n * 100; i++) {
            if (chkD(i, set)) {
                out.println(i);
                return;
            }
        }
    }


    private boolean chkD(int n, Set<Integer> set) {
        while (n > 0) {
            int t = n % 10;
            if (set.contains(t))
                return false;
            n /= 10;
        }
        return true;
    }

    /**
     * https://atcoder.jp/contests/abc041/tasks/abc041_c
     * C - 背の順
     * 多次元配列のソートで簡単かつ他の言語でも練習しておきたい。
     */
    private void solveG() {
        int n = nextInt();
        long[][] a = LongStream.range(0, n).mapToObj(i -> new long[]{nextLong(), i + 1}).sorted((x, y) -> -Long.compare(x[0], y[0])).toArray(long[][]::new);
        Arrays.stream(a).forEach(i -> out.println(i[1]));
    }

    /**
     * https://atcoder.jp/contests/abc037/tasks/abc037_c
     * C - 総和
     */
    private void solveH() {
        int n = nextInt();
        int k = nextInt();
        long[] a = LongStream.range(0, n).map(i -> nextInt()).toArray();
        long[] rui = new long[n];
        rui[0] = a[0];
        for (int i = 1; i < n; i++) {
            rui[i] = rui[i - 1] + a[i];
        }
        long res = 0;
        for (int i = 0; i < (n - k + 1); i++) {
            if (i == 0)
                res += rui[i - 1 + k];
            else
                res += rui[i - 1 + k] - rui[i - 1];
        }
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/abc038/tasks/abc038_c
     * C - 単調増加
     * https://qiita.com/drken/items/ecd1a472d3a0e7db8dce
     * 尺取り法でも、増加する個数をとって（累積して）、n(n+1)/2でも
     * 累積をとる方法は下記
     * https://atcoder.jp/contests/abc038/submissions/5117648
     */
    private void solveI() {
        int n = nextInt();
        long[] a = LongStream.range(0, n).map(i -> nextLong()).toArray();
        long res = 0;
        int right = 0;
        for (int left = 0; left < n; left++) {
            while (right < n && (right == left || a[right - 1] < a[right])) {
                right++;
            }
            res += (long) right - (long) left;

        }
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/abc039/tasks/abc039_c
     * C - ピアニスト高橋君
     */
    private void solveJ() {
        String s = next();
        final String KEY_BOARD = "WBWBWWBWBWBW";
        final int n = KEY_BOARD.length();
        final String[] KEY_BOARD_SOUND = new String("Do,,Re,,Mi,Fa,,So,,La,,Si").split(",");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            builder.append(KEY_BOARD);
        }
        int idx = builder.toString().indexOf(s);
        idx %= n;
        out.println(KEY_BOARD_SOUND[idx]);
    }

    /**
     * https://atcoder.jp/contests/abc040/tasks/abc040_c
     * C - 柱柱柱柱柱
     */
    private void solveK() {
        int n = nextInt();
        int[] a = IntStream.range(0, n).map(i -> nextInt()).toArray();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 2; j++) {
                if (i + j < n)
                    dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(a[i + j] - a[i]));
            }
        }
        out.println(dp[n - 1]);
    }

    /**
     * https://atcoder.jp/contests/abc033/tasks/abc033_c
     * C - 数式の書き換え
     * <p>
     * 尺取り法Versionは下記
     * https://atcoder.jp/contests/abc033/submissions/5127101
     */
    private void solveL() {
        String s = next();
        String[] wk = s.split("\\+");
        int res = 0;
        for (String item : wk) {
            String[] tmp = item.split("\\*");
            if (tmp.length > 1) {
                int cnt = 0;
                for (String tmpItem : tmp) {
                    if (tmpItem.equals("0")) {
                        cnt++;
                        break;
                    }
                }
                if (cnt == 0)
                    res++;
            } else {
                if (item.length() > 1 || !"0".equals(item))
                    res++;
            }
        }
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/abc029/tasks/abc029_c
     * C - Brute-force Attack
     */
    private void solveM() {
        int n = nextInt();
        dfs(n, 0, "");
    }

    private void dfs(int n, int curr, String s) {
        if (curr >= n) {
            out.println(s);
            return;
        }
        for (int i = 0; i < 3; i++) {
            char c = (char) ('a' + i);
            dfs(n, curr + 1, s + c);
        }
    }

    /**
     * https://atcoder.jp/contests/abc010/tasks/abc010_3
     * C - 浮気調査
     */
    private void solveN() {
        int txa = nextInt();
        int tya = nextInt();
        int txb = nextInt();
        int tyb = nextInt();
        int t = nextInt();
        int v = nextInt();
        int n = nextInt();
        int[][] xy = IntStream.range(0, n).mapToObj(i -> new int[]{nextInt(), nextInt()}).toArray(int[][]::new);
//        for (int i = 0; i < n; i++) {
//            double total = (Math.hypot(Math.abs(xy[i][0] - txa), Math.abs(xy[i][1] - tya))
//                    + Math.hypot(Math.abs(xy[i][0] - txb), Math.abs(xy[i][1] - tyb)));
//            if (t * v >= total) {
//                out.println("YES");
//                return;
//            }
//        }
        for (int i = 0; i < n; i++) {
            double t1 = Math.sqrt(pow(xy[i][0] - txa, 2) + pow(xy[i][1] - tya, 2));
            double t2 = Math.sqrt(pow(txb - xy[i][0], 2) + pow(tyb - xy[i][1], 2));
            if (t * v >= t1 + t2) {
                out.println("YES");
                return;
            }
        }
        out.println("NO");
    }

    /**
     * https://atcoder.jp/contests/abc003/tasks/abc003_3
     * C - AtCoderプログラミング講座
     */
    private void solveO() {
        int n = nextInt();
        int k = nextInt();
        int[] r = IntStream.range(0, n).map(i -> nextInt()).sorted().toArray();
        double res = 0;
        for (int i = n - k; i < n; i++) {
            res = (res + (double) r[i]) / 2d;
        }
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/abc004/tasks/abc004_3
     * C - 入れ替え
     */
    private void solveP() {
        int n = nextInt();
        n %= 30;
        int[] card = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < n; i++) {
            int wk = i % 5;
            int tmp = card[wk];
            card[wk] = card[wk + 1];
            card[wk + 1] = tmp;
        }
        String res = Arrays.stream(card).mapToObj(i -> Integer.toString(i)).collect(Collectors.joining(""));
        out.println(res);
    }

    /**
     * https://atcoder.jp/contests/abc006/tasks/abc006_3
     * C - スフィンクスのなぞなぞ
     */
    private void solveQ() {
        int n = nextInt();
        int m = nextInt();
        int older = m % 2 == 0 ? 0 : 1;
        for (int i = 0; i <= n; i++) {
            int j = n - (i + older);
            if (j < 0)
                continue;
            int man = i * 2 + older * 3 + j * 4;
            if (man == m) {
                out.println(i + " " + older + " " + j);
                return;
            }
        }
        out.println("-1 -1 -1");
    }

    /**
     * https://atcoder.jp/contests/abc005/tasks/abc005_3
     * C - おいしいたこ焼きの売り方
     */
    private void solveR() {
        int t = nextInt();
        int n = nextInt();
        int[] a = IntStream.range(0, n).map(i -> nextInt()).toArray();
        int m = nextInt();
        int[] b = IntStream.range(0, m).map(i -> nextInt()).toArray();
        int aIdx = 0;
        for (int i = 0; i < m; i++) {
            if (aIdx < n && a[aIdx] <= b[i] && b[i] <= a[aIdx] + t) {
                aIdx++;
                continue;
            }
            while (aIdx + 1 < n && a[aIdx + 1] <= b[i])
                aIdx++;
            if (aIdx >= n || !(a[aIdx] <= b[i] && b[i] <= a[aIdx] + t)) {
                out.println("no");
                return;
            }
        }
        out.println("yes");
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
