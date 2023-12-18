import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b ? "YES" : "NO"));}

    //System.out.println();はつかわない！！
    void solve() throws Exception{
        int N = in.nextInt(), K = in.nextInt();
        ArrayList<ArrayList<Integer>> G = new ArrayList<>();
        for(int i = 0; i < N; i++) G.add(new ArrayList<>());
        for(int i = 0; i < N-1; i++) {
            int u = in.nextInt() - 1;
            int v = in.nextInt() - 1;
            G.get(u).add(v);
            G.get(v).add(u);
        }

        if(N >= 2 && K == 1){
            out.println("0");
            return;
        }

        CombCalculator cc = new CombCalculator();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(0);
        boolean[] visited = new boolean[N];
        visited[0] = true;
        long ans = K;
        while(!deque.isEmpty()){
            int a = deque.removeFirst();
            int m = 0;
            for(int b : G.get(a)){
                if(!visited[b]){
                    m++;
                    visited[b] = true;
                    deque.addLast(b);
                }
            }
            if(m == 0) continue;
            //(K-s)P(m)
            //=(K-2)(K-3)...(K-2-m+1)
            //=(K-1)(K-2)...(K-1-m+1)
            int s = (a == 0) ? 1 : 2;
            ans *= cc.modPerm(K-s, m);
            ans %= MOD;
        }
        out.println(ans);
    }

    public static void main(String[] args) throws Exception {
        new Main().m();
    }

    void m() throws Exception {
        solve();
        out.flush();
    }

    class FastScanner {
        Reader input;

        FastScanner() {this(System.in);}
        FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}

        int nextInt() {return (int) nextLong();}

        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }

        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }

        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }

        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

        public int[] nextIntArray(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public int[] nextIntArrayDec(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt() - 1;
            }
            return res;
        }

        public int[] nextIntArray1Index(int n) {
            int[] res = new int[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextInt();
            }
            return res;
        }

        public long[] nextLongArray(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong();
            }
            return res;
        }

        public long[] nextLongArrayDec(int n) {
            long[] res = new long[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextLong() - 1;
            }
            return res;
        }

        public long[] nextLongArray1Index(int n) {
            long[] res = new long[n + 1];
            for (int i = 0; i < n; i++) {
                res[i + 1] = nextLong();
            }
            return res;
        }

        public double[] nextDoubleArray(int n) {
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextDouble();
            }
            return res;
        }
    }
}

class CombCalculator{
    //引数の最大値、MOD、階乗・MODの逆元・階乗の逆元のテーブル
    static int MAX_FAC = 510000;
    static int MOD = (int)1e9+7;
    static long[] fac = new long[MAX_FAC+1];
    static long[] finv = new long[MAX_FAC+1];
    static long[] inv = new long[MAX_FAC+1];

    public CombCalculator(){
        this(510000, (int)1e9+7);
    }

    public CombCalculator(int max, int mod){
        MAX_FAC = max; MOD = mod;
        initComb();
    }

    //テーブルの初期化
    void initComb(){
        fac[0] = finv[0] = inv[0] = fac[1] = finv[1] = inv[1] = 1;
        for (int i = 2; i <= MAX_FAC; ++i) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - (MOD / i) * inv[(int) (MOD % i)] % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

    //nPk % MOD
    public long modPerm(int n, int k){
        return (n >= k) ? fac[n] * finv[n - k] % MOD : 0;
    }

    //nCk % MOD
    public long modComb(int n, int k){
        return (n >= k) ? fac[n] * finv[k] % MOD * finv[n - k] % MOD : 0;
    }

    //n! % MOD
    public long modFact(int n){
        return fac[n];
    }

    //(n!)^-1 % MOD
    public long modFactInv(int n){
        return finv[n];
    }

    //n^-1 % MOD
    public long modInv(int n){
        return inv[n];
    }

    /*
     * MOD付きpowをlog(n)で計算
     */
    public long modPow(long a, long n, int mod){
        long res = 1;
        while(n > 0){
            if((n & 1) == 1) res = (res * a) % mod;
            a = (a * a) % mod;
            n = n >> 1;
        }
        return res;
    }
}
/* end Main */
