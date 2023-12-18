import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.StringJoiner;
import java.util.TreeSet;

class Main {

    static PrintWriter out;
    static InputReader sc;

    public static void main(String[] args) {
        sc = new InputReader(System.in);
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }

    static void solve() {
        out.println((int) Math.pow(sc.nextInt(), 3));
    }

    public static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) {
                j.add("null");
            } else if (arg instanceof int[]) {
                j.add(Arrays.toString((int[]) arg));
            } else if (arg instanceof long[]) {
                j.add(Arrays.toString((long[]) arg));
            } else if (arg instanceof double[]) {
                j.add(Arrays.toString((double[]) arg));
            } else if (arg instanceof Object[]) {
                j.add(Arrays.toString((Object[]) arg));
            } else {
                j.add(arg.toString());
            }
        }
        System.err.println(j.toString());
    }

    /**
     * 素数判定 O(√n)
     *
     * @param n
     * @return nが素数かどうか
     */
    public static boolean is_prime(long n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    /**
     * nの約数列挙 O(√n)
     *
     * @param n
     * @return nの約数のList
     */
    public static List<Integer> divisor(long n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                if (i != n / i) {
                    res.add((int) (n / i));
                }
            }
        }
        return res;
    }

    /**
     * エラトステネスの篩によりnまでの素数のListを返す O(n log(log(n)))
     *
     * @param n
     * @return nまでの素数のList
     */
    public static List<Integer> SieveofEratosthenes(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] is_prime = new boolean[n + 1];
        Arrays.fill(is_prime, true);
        is_prime[0] = false;
        is_prime[1] = false;
        for (int i = 2; i <= n; i++) {
            if (is_prime[i]) {
                list.add(i);
                for (int j = 2 * i; j <= n; j += i) {
                    is_prime[j] = false;
                }
            }
        }
        return list;
    }

    /**
     * エラトステネスの篩によりnまでの数が素数かどうかの配列を返す O(n log(log(n)))
     *
     * @param n
     * @return インデックスの数が素数かどうか
     */
    public static boolean[] is_prime_array(int n) {
        boolean[] is_prime = new boolean[n + 1];
        Arrays.fill(is_prime, true);
        is_prime[0] = false;
        is_prime[1] = false;
        for (int i = 0; i <= n; i++) {
            if (is_prime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    is_prime[j] = false;
                }
            }
        }
        return is_prime;
    }

    /**
     * aの逆元を求める O(log(MOD)^2)
     *
     * @param a
     * @param MOD
     * @return aの逆元
     */
    public static long modinv(long a, int MOD) {
        long b = MOD, u = 1, v = 0;
        long tmp;
        while (b != 0) {
            long t = a / b;
            a -= t * b;

            tmp = a;
            a = b;
            b = tmp;

            u -= t * v;

            tmp = u;
            u = v;
            v = tmp;
        }
        u %= MOD;
        if (u < 0) {
            u += MOD;
        }
        return u;
    }

    /**
     * (a÷b)%MODを求める O(log(MOD)^2)
     *
     * @param a
     * @param b
     * @param MOD
     * @return (a÷b)%MOD
     */
    public static long moddiv(long a, long b, int MOD) {
        a %= MOD;
        return a * modinv(b, MOD) % MOD;
    }

    /**
     * 繰り返し二乗法で a^n % MOD を求める O(log(n))
     *
     * @param a
     * @param n
     * @param MOD
     * @return a^n % MOD
     */
    public static long modpow(long a, long n, int MOD) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % MOD;
            }
            a = a * a % MOD;
            n >>= 1;

        }
        return res;
    }

    /**
     * x,yが定義域に含まれるかどうか求める O(1)
     *
     * @param x
     * @param y
     * @param X xの上限
     * @param Y yの上限
     * @return x,yが定義域に含まれるかどうか
     */
    public static boolean ok(int x, int y, int X, int Y) {
        return 0 <= x && x < X && 0 <= y && y < Y;
    }

    /**
     * aとbの最大公約数を求める O(log(min(a,b)))
     *
     * @param a
     * @param b
     * @return aとbの最大公約数
     */
    public static long gcd(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        long r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    /**
     * ソートされたarr内で、key以上の要素の内の一番左側のindexを求める O(log(n))
     *
     * @param arr
     * @param key
     * @return arr内で、key以上の要素の内の一番左側のindex
     */
    public static int lower_bound(long[] arr, long key) {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    /**
     * ソートされたarr内で、keyより大きい要素の内の一番左側のindexを求める O(log(n))
     *
     * @param arr
     * @param key
     * @return arr内で、keyより大きい要素の内の一番左側のindex
     */
    public static int upper_bound(long[] arr, long key) {
        int low = 0;
        int high = arr.length;
        int mid;
        while (low < high) {
            mid = ((high - low) >>> 1) + low;
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    /**
     * arr内で狭義単調増加となる最長部分増加列の長さを求める O(n log(n))
     *
     * @param arr
     * @return arr内で狭義単調増加となる最長部分増加列の長さ
     */
    public static int narrowLIS(long[] arr) {
        final long INF = Long.MAX_VALUE / 3;
        final int N = arr.length;
        long[] dp = new long[N];
        Arrays.fill(dp, INF);
        for (int i = 0; i < N; i++) {
            dp[lower_bound(dp, arr[i])] = arr[i];
        }
        return lower_bound(dp, INF);
    }

    /**
     * arr内で広義単調増加となる最長部分増加列の長さを求める O(n log(n))
     *
     * @param arr
     * @return arr内で広義単調増加となる最長部分増加列の長さ
     */
    public static int broadLIS(long[] arr) {
        final long INF = Long.MAX_VALUE / 3;
        final int N = arr.length;
        long[] dp = new long[N];
        Arrays.fill(dp, INF);
        for (int i = 0; i < N; i++) {
            dp[upper_bound(dp, arr[i])] = arr[i];
        }
        return lower_bound(dp, INF);
    }

    /**
     * arrの中身を逆に並び替える O(n)
     *
     * @param arr
     */
    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    /**
     * nを素因数分解する O(√n)
     *
     * @param n
     * @return nの素因数のMap
     */
    public static Map<Integer, Integer> mapFactorization(int n) {
        Map<Integer, Integer> factor = new HashMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                Integer value = factor.get(i);
                if (value != null) {
                    factor.put(i, value + 1);
                } else {
                    factor.put(i, 1);
                }
                n /= i;
            }
        }
        if (n != 1) {
            factor.put(n, 1);
        }
        return factor;
    }

    /**
     * nを素因数分解する O(√n)
     *
     * @param n
     * @return nの素因数の配列
     */
    public static int[] arrayFactorization(int n) {
        int[] factor = new int[n + 1];
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factor[i]++;
                n /= i;
            }
        }
        if (n != 1) {
            factor[n]++;
        }
        return factor;
    }

    /**
     * 座標を圧縮し、長さを返す O(n log(n)).
     *
     * <pre>
     * {@code
     * W = compress(x1, x2, W);
     * H = compress(y1, y2, H);
     *  }
     * </pre>
     *
     * みたいに使って圧縮する
     *
     * @param x1
     * @param x2
     * @param w
     * @return 座標圧縮後の長さ
     */
    public static int compress(int[] x1, int[] x2, int w) {
        int n = x1.length;
        // 自動でソートしてくれる
        TreeSet<Integer> set = new TreeSet<>();
        // 両端を入れないと端の余白が消える
        set.add(0);
        set.add(w);
        for (int i = 0; i < n; i++) {
            set.add(x1[i]);
            set.add(x2[i]);
        }
        int nw = set.size();
        Integer[] x = set.toArray(new Integer[nw]);
        for (int i = 0; i < n; i++) {
            x1[i] = Arrays.binarySearch(x, x1[i]);
            x2[i] = Arrays.binarySearch(x, x2[i]);
        }
        return nw - 1;
    }

    /**
     * 多次元配列arrayの値をすべてvalueにする
     *
     * @param array
     * @param value
     */
    public static void fill(Object array, Object value) {

        // 第一引数が配列か判定
        Class<?> type = array.getClass();
        if (!type.isArray()) {
            throw new IllegalArgumentException("not array");
        }

        // クラスの型を判定
        String arrayClassName = array.getClass().getSimpleName().replace("[]", "").toLowerCase();
        String valueClassName = value.getClass().getSimpleName().toLowerCase().replace("character", "char")
                .replace("integer", "int");
        if (!arrayClassName.equals(valueClassName)) {
            throw new IllegalArgumentException("does not match");
        }

        // 処理
        if (type.getComponentType().isArray()) {
            for (Object o : (Object[]) array) {
                fill(o, value);
            }
        } else if (array instanceof boolean[]) {
            Arrays.fill((boolean[]) array, (boolean) value);
        } else if (array instanceof char[]) {
            Arrays.fill((char[]) array, (char) value);
        } else if (array instanceof byte[]) {
            Arrays.fill((byte[]) array, (byte) value);
        } else if (array instanceof short[]) {
            Arrays.fill((short[]) array, (short) value);
        } else if (array instanceof int[]) {
            Arrays.fill((int[]) array, (int) value);
        } else if (array instanceof long[]) {
            Arrays.fill((long[]) array, (long) value);
        } else if (array instanceof float[]) {
            Arrays.fill((float[]) array, (float) value);
        } else if (array instanceof double[]) {
            Arrays.fill((double[]) array, (double) value);
        } else {
            Arrays.fill((Object[]) array, value);
        }
    }

    /**
     * Range Minimum Query (RMQ) のセグメント木による実装
     */
    public static class RMQ {
        private int n;
        private int[] dat;
        private final int INF = Integer.MAX_VALUE / 3;

        /**
         * セグメント木の初期化
         *
         * @param n_ 要素数
         */
        public RMQ(int n_) {
            this.n = 1;
            while (this.n < n_) {
                this.n *= 2;
            }
            Arrays.fill(this.dat, this.INF);
        }

        /**
         * k番目の値(0-indexed)をaに変更 O(log(n))
         *
         * @param k
         * @param a
         */
        public void update(int k, int a) {
            // 葉の節点
            k += this.n - 1;
            this.dat[k] = a;
            while (k > 0) {
                k = (k - 1) / 2;
                this.dat[k] = Math.min(this.dat[k * 2 + 1], this.dat[k * 2 + 2]);
            }
        }

        /**
         * [a,b)の最小値を求める O(log(n)).
         *
         * 後ろの方の引数は、計算の簡単のための引数。<br>
         * kは節点の番号、l、rはその節点が[l,r)に対応づいていることを表す。<br>
         * したがって、外からは {@code query(a,b,0,0,n)}として呼ぶ。
         *
         * @param a 範囲の先頭番号(aを含む)
         * @param b 範囲の最後尾番号(bを含まない)
         * @param k 節点の番号
         * @param l 節点kが対応づく範囲の先頭番号(lを含む)
         * @param r 節点kが対応づく範囲の最後尾番号(rを含まない)
         * @return [a,b)の最小値
         */
        int query(int a, int b, int k, int l, int r) {
            // [a,b)と[l,r)が交差しなければ、INF
            if (r <= a || b <= l) {
                return this.INF;
            }

            // [a,b)が[l,r)を完全に含んでいれば、この節点の値
            if (a <= l && r <= b) {
                return this.dat[k];
            } else {
                // そうでなければ、２つの子の最小値
                int v1 = query(a, b, k * 2 + 1, l, (l + r) / 2);
                int v2 = query(a, b, k * 2 + 1, (l + r) / 2, r);
                return Math.min(v1, v2);
            }

        }
    }

    /**
     * Binary Indexed Tree (BIT) の実装
     */
    public static class BIT {
        private int n;
        private int[] bit;

        /**
         * BITの初期化
         *
         * @param n 要素数
         */
        public BIT(int n) {
            this.n = n;
            this.bit = new int[n + 1];
        }

        /**
         * 節点番号iまでの和を求める O(log(n))
         *
         * @param i
         * @return 節点番号iまでの和
         */
        public int sum(int i) {
            int s = 0;
            while (i > 0) {
                s += this.bit[i];
                i -= i & -i;
            }
            return s;
        }

        /**
         * 節点iにxを加える
         *
         * @param i
         * @param x
         */
        public void add(int i, int x) {
            while (i <= this.n) {
                this.bit[i] += x;
                i += i & -i;
            }
        }
    }

    /**
     * コンピネーション、パーミネーションの実装
     */
    public static class Comb {
        private long[] fac, finv, inv;
        private int MOD;

        /**
         * 初期化 O(MAX)
         *
         * @param MAX 処理する数の上限
         * @param MOD
         */
        public Comb(int MAX, int MOD) {
            MAX++;
            this.fac = new long[MAX];
            this.finv = new long[MAX];
            this.inv = new long[MAX];
            this.MOD = MOD;

            this.fac[0] = this.fac[1] = 1;
            this.finv[0] = this.finv[1] = 1;
            this.inv[1] = 1;
            for (int i = 2; i < MAX; i++) {
                this.fac[i] = this.fac[i - 1] * i % MOD;
                this.inv[i] = MOD - this.inv[MOD % i] * (MOD / i) % MOD;
                this.finv[i] = this.finv[i - 1] * this.inv[i] % MOD;
            }
        }

        /**
         * nCkを求める O(1)
         *
         * @param n
         * @param k
         * @return nCk
         */
        public long combination(int n, int k) {
            if (n < k) {
                return 0;
            }
            if (n < 0 || k < 0) {
                return 0;
            }
            return this.fac[n] * (this.finv[k] * this.finv[n - k] % this.MOD) % this.MOD;
        }

        /**
         * nPkを求める O(1)
         *
         * @param n
         * @param k
         * @return nPk
         */
        public long permutation(int n, int k) {
            if (n < k) {
                return 0;
            }
            if (n < 0 || k < 0) {
                return 0;
            }
            return this.fac[n] * (this.finv[n - k] % this.MOD) % this.MOD;
        }

    }

    /**
     * C++のPairと同じ
     */
    public static class Pair implements Comparable<Pair> {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int hashCode() {
            return Integer.valueOf(this.first + this.second).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pair)) {
                return false;
            }
            Pair pair = (Pair) obj;
            return this.first == pair.first && this.second == pair.second;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.first, o.first);
        }

        @Override
        public String toString() {
            return String.format("%d %d", this.first, this.second);
        }

    }

    /**
     * グループ分けを管理するデータ構造Union-Find(Disjoint Set)の実装
     */
    public static class UnionFind {

        private int[] parent;

        /**
         * Union-Findの初期化
         *
         * @param n 要素数
         */
        public UnionFind(int n) {
            // 親の番号を格納する。
            // 自分自身が親だった場合は-(その集合のサイズ)を格納する。
            this.parent = new int[n];

            for (int i = 0; i < n; i++) {
                // 最初の時点では親は自分自身
                // 集合のサイズは１
                this.parent[i] = -1;
            }
        }

        /**
         * aがどのグループに属しているか調べる O(α(n)). <br>
         * アッカーマン関数をAとして、関数f(n)=A(n,n)の逆関数
         *
         * @param a
         * @return 親の番号
         */
        public int root(int a) {
            if (this.parent[a] < 0) {
                return a;
            } else {
                // 再帰的に親をたどる。
                return this.parent[a] = this.root(this.parent[a]);
            }
        }

        /**
         * aの集合のサイズを返す O(1)
         *
         * @param a
         * @return aの集合のサイズ
         */
        public int size(int a) {
            return -this.parent[this.root(a)];
        }

        /**
         * aとbをつなぐ O(α(n))
         *
         * @param a
         * @param b
         * @return 違う集合に属していたならば{@code true}、すでに同じ集合に属しているならば{@code false}を返す
         */
        public boolean connect(int a, int b) {
            // 親同士をつなぐ。
            a = this.root(a);
            b = this.root(b);

            // すでにくっついている場合
            if (a == b) {
                return false;
            }

            if (this.size(a) < this.size(b)) {
                int r = a;
                a = b;
                b = r;
            }

            this.parent[a] += this.parent[b];
            this.parent[b] = a;

            return true;
        }
    }

    /**
     * BellmanFord法による単一視点最短経路問題の実装.<br>
     * 負の辺がある場合もうまく計算できる
     */
    public static class BellmanFord {

        private class Edge {
            int from;
            int to;
            long cost;

            public Edge(int from, int to, long cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }
        }

        private final long INF = Long.MAX_VALUE / 3;
        private long[] d;
        private int V;
        List<Edge> es = new ArrayList<>();

        /**
         * 初期化
         *
         * @param n 頂点の数
         */
        public BellmanFord(int n) {
            this.d = new long[n];
            this.V = n;
        }

        public void set(int from, int to, long cost) {
            this.es.add(new Edge(from, to, cost));
        }

        /**
         * sを始点とする各頂点への最短距離を計算する O(|V|×|E|).<br>
         *
         * @param s
         * @return 負の閉路が存在しなければ、trueを返す<br>
         *         負の閉路が存在すれば、falseを返し終了する
         */
        public boolean calc(int s) {
            Arrays.fill(this.d, this.INF);
            this.d[s] = 0;
            for (int i = 0; i < this.V; i++) {
                for (Edge e : this.es) {
                    if (this.d[e.from] != this.INF && this.d[e.to] > this.d[e.from] + e.cost) {
                        this.d[e.to] = this.d[e.from] + e.cost;
                        if (i == this.V - 1) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        /**
         * 始点からgまでの最短距離を返す O(1).<br>
         * 経路が存在しない場合はINF(Long.MAX_VALUE / 3)を返す
         *
         * @param g
         * @return 始点からgまでの最短距離
         */
        public long distance(int g) {
            return this.d[g];
        }

    }

    /**
     * Dijkstra法によるたんいる始点最短経路問題の実装.<br>
     * 負のコストの辺がある場合はうまく計算することはできない
     */
    public static class Dijkstra {

        private class Edge {
            long w;
            Vertex to;

            public Edge(long w, Vertex to) {
                this.w = w;
                this.to = to;
            }

        }

        private class Vertex {
            int name;
            List<Edge> adj;

            public Vertex(int name) {
                this.name = name;
                this.adj = new ArrayList<>();
            }

        }

        private class PairForDijkstra implements Comparable<PairForDijkstra> {
            long value;
            Vertex now;

            public PairForDijkstra(long value, Vertex now) {
                this.value = value;
                this.now = now;
            }

            @Override
            public int compareTo(PairForDijkstra o) {

                return Long.compare(this.value, o.value);
            }

        }

        private final long INF = Long.MAX_VALUE / 3;
        private Vertex[] g;
        private PriorityQueue<PairForDijkstra> que;
        private long[] d;

        /**
         * 初期化
         *
         * @param n 要素数
         */
        public Dijkstra(int n) {
            this.g = new Vertex[n];
            this.d = new long[n];
            this.que = new PriorityQueue<>();

            for (int i = 0; i < n; i++) {
                this.g[i] = new Vertex(i);
            }
        }

        public void set(int from, int to, long cost) {
            Vertex u = this.g[from];
            Vertex v = this.g[to];
            u.adj.add(new Edge(cost, v));
            v.adj.add(new Edge(cost, u));
        }

        /**
         * 始点sから各頂点への最短距離を計算する O(|E|log|V|)
         *
         * @param s
         */
        public void calc(int s) {
            Arrays.fill(this.d, this.INF);
            this.d[s] = 0;
            this.que.add(new PairForDijkstra(0, this.g[s]));

            while (this.que.size() > 0) {
                PairForDijkstra t = this.que.poll();
                int from = t.now.name;
                List<Edge> toes = t.now.adj;
                if (this.d[from] < t.value) {
                    continue;
                }
                for (Edge e : toes) {
                    int to = e.to.name;
                    long cost = e.w;
                    if (this.d[to] > this.d[from] + cost) {
                        this.d[to] = this.d[from] + cost;
                        this.que.add(new PairForDijkstra(this.d[to], e.to));
                    }
                }
            }
        }

        /**
         * 始点からgまでの最短距離を返す O(1).<br>
         * 経路が存在しない場合はINF(Long.MAX_VALUE / 3)を返す
         *
         * @param g
         * @return 始点からgまでの最短距離
         */
        public long distance(int g) {
            return this.d[g];
        }
    }

    /**
     * WarshallFloyd法による全点対最短経路問題の実装.<br>
     * 負の辺があっても動作する
     */
    public static class WarshallFloyd {

        private final long INF = Long.MAX_VALUE / 3;
        private long[][] d;
        private int V;

        /**
         * 初期化
         *
         * @param n 頂点の数
         */
        public WarshallFloyd(int n) {
            this.d = new long[n][n];
            for (long[] ls : this.d) {
                Arrays.fill(ls, this.INF);
            }
            this.V = n;
        }

        public void set(int from, int to, long cost) {
            this.d[from][to] = cost;
        }

        /**
         * すべての2頂点間の最短距離を計算する O(|V|^3)
         */
        public void calc(int s) {
            for (int k = 0; k < this.V; k++) {
                for (int i = 0; i < this.V; i++) {
                    for (int j = 0; j < this.V; j++) {
                        this.d[i][j] = Math.min(this.d[i][j], this.d[i][k] + this.d[k][j]);
                    }
                }
            }
        }

        /**
         * fromからtoまでの最短距離を返す O(1).<br>
         * 経路が存在しない場合はINF(Long.MAX_VALUE / 3)を返す
         *
         * @param from
         * @param to
         * @return fromからtoまでの最短距離
         */
        public long distance(int from, int to) {
            return this.d[from][to];
        }

    }

    /**
     * Kruskal法により最小全域木(Minimum Spanning Tree)を求める.<br>
     * 全域木：向こうグラフが与えられたときに、その部分グラフで任意の２頂点を連結にするような木<br>
     * 最小全域木：使われるへんの コストの和を最小にする全域木
     */
    public static class Kruskal {
        /**
         * 初期化
         *
         * @param n 頂点数
         */
        public Kruskal(int n) {
            this.V = n;
        }

        private class Edge {
            int from;
            int to;
            long cost;

            public Edge(int from, int to, long cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }
        }

        private List<Edge> es = new ArrayList<>();
        private int V;

        public void set(int from, int to, long cost) {
            this.es.add(new Edge(from, to, cost));
        }

        /**
         * 最小全域木のコストの和を求める O(|E| log|V|)
         *
         * @return 最小全域木のコストの和
         */
        public int calc() {
            int res = 0;
            Collections.sort(this.es, new Comparator<Edge>() {
                @Override
                public int compare(Edge o1, Edge o2) {
                    return Long.compare(o1.cost, o2.cost);
                }
            });
            UnionFind uni = new UnionFind(this.V);
            for (Edge e : this.es) {
                if (uni.connect(e.from, e.to)) {
                    res += e.cost;
                }
            }
            return res;
        }
    }

    /**
     * 高速Scanner
     */
    public static class InputReader {

        private InputStream in;
        private byte[] buffer = new byte[1024];
        private int curbuf;
        private int lenbuf;

        public InputReader(InputStream in) {
            this.in = in;
            this.curbuf = this.lenbuf = 0;
        }

        public boolean hasNextByte() {
            if (this.curbuf >= this.lenbuf) {
                this.curbuf = 0;
                try {
                    this.lenbuf = this.in.read(this.buffer);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (this.lenbuf <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (this.hasNextByte()) {
                return this.buffer[this.curbuf++];
            } else {
                return -1;
            }
        }

        private boolean isSpaceChar(int c) {
            return !(c >= 33 && c <= 126);
        }

        private void skip() {
            while (this.hasNextByte() && this.isSpaceChar(this.buffer[this.curbuf])) {
                this.curbuf++;
            }
        }

        public boolean hasNext() {
            this.skip();
            return this.hasNextByte();
        }

        public String next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            StringBuilder sb = new StringBuilder();
            int b = this.readByte();
            while (!this.isSpaceChar(b)) {
                sb.appendCodePoint(b);
                b = this.readByte();
            }
            return sb.toString();
        }

        public int nextInt() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int c = this.readByte();
            while (this.isSpaceChar(c)) {
                c = this.readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = this.readByte();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = this.readByte();
            } while (!this.isSpaceChar(c));
            return minus ? -res : res;
        }

        public long nextLong() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            int c = this.readByte();
            while (this.isSpaceChar(c)) {
                c = this.readByte();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = this.readByte();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res = res * 10 + c - '0';
                c = this.readByte();
            } while (!this.isSpaceChar(c));
            return minus ? -res : res;
        }

        public double nextDouble() {
            return Double.parseDouble(this.next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextInt();
            }
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextLong();
            }
            return a;
        }

        public char[][] nextCharMap(int n, int m) {
            char[][] map = new char[n][m];
            for (int i = 0; i < n; i++) {
                map[i] = this.next().toCharArray();
            }
            return map;
        }
    }

}
