
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

    // mods
    long MOD = (long) Math.pow(10, 9) + 7;

    private void solveA() {
        int n = nextInt();
        int m = nextInt();
        int[][] lr = Stream.generate(() -> new int[]{nextInt(), nextInt()}).limit(m).toArray(int[][]::new);
        int min = 0;
        int max = n + 1;
        for (int i = 0; i < m; i++) {
            min = Math.max(min, lr[i][0]);
            max = Math.min(max, lr[i][1]);
        }
        if (max - min + 1 >= 0)
            out.println(max - min + 1);
        else
            out.println(0);
    }

    private void solveB() {
        int n = nextInt();
        int[] a = IntStream.range(0, n).map(i -> nextInt()).toArray();
        boolean[] visited = new boolean[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;
            int b = a[i];
            visited[i] = true;
            if (a[b - 1] - 1 == i) {
                cnt++;
                visited[b - 1] = true;
            }
        }
        out.println(cnt);
    }

    private static class Pair {
        int i;
        int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    private void solveC() {
        int h = nextInt();
        int w = nextInt();
        char[][] a = new char[h][w];
        boolean[][] visited = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = next().toCharArray();
        }
        ArrayDeque<Pair> queue = new ArrayDeque<Pair>();
        if (a[0][0] == '#') {
            queue.addFirst(new Pair(0, 0));
        } else {
            out.println("Impossible");
            return;
        }
        while (!queue.isEmpty()) {
            int cnt = queue.size();

            for (int i = 0; i < cnt; i++) {
                Pair p = queue.pollLast();
                visited[p.i][p.j] = true;
                int[] dx = new int[]{-1, 0, 1, 0};
                int[] dy = new int[]{0, -1, 0, 1};
                for (int k = 0; k < 4; k++) {
                    int wkX = dx[k] + p.i;
                    int wkY = dy[k] + p.j;
                    if (wkX < 0 || wkX >= h || wkY < 0 || wkY >= w || a[wkX][wkY] == '.')
                        continue;
                    if (visited[wkX][wkY])
                        continue;
                    if (k < 2) {
                        out.println("Impossible");
                        return;
                    }
                    visited[wkX][wkY] = true;
                    queue.addFirst(new Pair(wkX, wkY));
                }
                if (queue.size() > 1) {
                    out.println("Impossible");
                    return;
                }
            }
        }
        if (visited[h - 1][w - 1])
            out.println("Possible");
        else
            out.println("Impossible");
    }

    private static class Person {
        private int n;
        private Set<Integer> friends;

        public Person(int n) {
            this.n = n;
            this.friends = new HashSet<>();
        }

        public void addFriends(int f) {
            friends.add(f);
        }
    }

    private void solveD() {
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        Map<Integer, Person> friendsMap = new HashMap<Integer, Person>();
        UnionFind unionFind = new UnionFind(n);
        for (int i = 0; i < m; i++) {
            int a = nextInt();
            int b = nextInt();
            if (!friendsMap.containsKey(a))
                friendsMap.put(a, new Person(a));
            friendsMap.get(a).friends.add(b);
            if (!friendsMap.containsKey(b))
                friendsMap.put(b, new Person(b));
            friendsMap.get(b).friends.add(a);
            //aが属しているグループの総数がわかる
            unionFind.unite(a, b);
        }
        Map<Integer, Person> blockMap = new HashMap<Integer, Person>();
        for (int i = 0; i < k; i++) {
            int c = nextInt();
            int d = nextInt();
            if (!blockMap.containsKey(c))
                blockMap.put(c, new Person(c));
            blockMap.get(c).friends.add(d);
            if (!blockMap.containsKey(d))
                blockMap.put(d, new Person(d));
            blockMap.get(d).friends.add(c);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int num = 0;
            Person fPerson = friendsMap.getOrDefault(i, new Person(i));
            Person bPerson = blockMap.getOrDefault(i, new Person(i));
            //グループ総数-自分-直接の友達の数
            num = unionFind.getSize(i) - 1 - fPerson.friends.size();
            //ブロックしている人がグループに属しているかどうか
            for (int fn : bPerson.friends) {
                if (unionFind.isSame(i, fn))
                    num--;
            }
            builder.append(num).append(" ");
        }
        out.println(builder.toString());
    }

    private class UnionFind {
        int[] pars;

        public UnionFind(int n) {
            pars = new int[n + 1];
            Arrays.fill(pars, -1);
        }

        public int getChilds(int n) {
            int wk = getRoot(n);
            return pars[wk];
        }

        public int getRoot(int n) {
            if (pars[n] < 0)
                return n;
            return pars[n] = getRoot(pars[n]);
        }

        public boolean isSame(int a, int b) {
            return getRoot(a) == getRoot(b);
        }

        private int getSize(int a) {
            return -pars[getRoot(a)];
        }

        public void unite(int a, int b) {
            int wkA = getRoot(a);
            int wkB = getRoot(b);
            if (wkA == wkB)
                return;

            if (getSize(wkA) < getSize(wkB)) {
                int tmp = wkA;
                wkA = wkB;
                wkB = tmp;
            }
            pars[wkA] = pars[wkA] + pars[wkB];
            pars[wkB] = wkA;
        }
    }

    private void solveE() {

    }

    private void solveF() {
        int n = nextInt();
        int m = nextInt();
        int[] aA = IntStream.range(0, m).map(i -> nextInt()).sorted().toArray();
        final Map<Integer, Integer> MATCH = new HashMap<Integer, Integer>() {
            {
                put(1, 2);
                put(2, 5);
                put(3, 5);
                put(4, 4);
                put(5, 5);
                put(6, 6);
                put(7, 3);
                put(8, 7);
                put(9, 6);
            }
        };
        //dp[i] -> マッチi本消費して作れる文字列
        String[] dp = new String[10009];
        dp[0] = "";
        for (int i = 0; i < 10000; i++) {
            //埋まっていないということは、配れなかった値ということ
            if (dp[i] == null)
                continue;
            for (int a : aA) {
                /*
                 * dp[aA[j]の桁を選択した場合のマッチ消費数]
                 * = max(既に格納されている数値 , dp[現在のマッチ消費数]+aA[j]を選択した場合の数値)
                 */
                dp[i + MATCH.get(a)] = max(dp[i + MATCH.get(a)], dp[i] + a);
            }
        }
        out.println(dp[n]);
    }

    private String max(String a, String b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        } else if (a.length() < b.length()) {
            return b;
        } else if (a.length() > b.length()) {
            return b;
        } else if (a.length() == b.length()) {
            if (a.compareTo(b) < 0) {
                return b;
            } else {
                return a;
            }
        }
        return a;
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

    void fill(int array[], int x) {
        Arrays.fill(array, x);
    }

    void fill(long array[], long x) {
        Arrays.fill(array, x);
    }

    void fill(double array[], double x) {
        Arrays.fill(array, x);
    }

    void fill(boolean array[], boolean x) {
        Arrays.fill(array, x);
    }

    void fill(int array[][], int x) {
        for (int a[] : array) {
            fill(a, x);
        }
    }

    void fill(long array[][], long x) {
        for (long a[] : array) {
            fill(a, x);
        }
    }

    void fill(double array[][], double x) {
        for (double a[] : array) {
            fill(a, x);
        }
    }

    void fill(boolean array[][], boolean x) {
        for (boolean a[] : array) {
            fill(a, x);
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

    long INF = (long) 1e18 + 7;

    boolean isINF(long a) {
        return abs(a) > INF / 1000;
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

    long[] powsMod(long x, int max) {
        long pow[] = new long[max + 1];
        pow[0] = 1;
        for (int i = 0; i < max; i++) {
            pow[i + 1] = mod(pow[i] * x);
        }
        return pow;
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
