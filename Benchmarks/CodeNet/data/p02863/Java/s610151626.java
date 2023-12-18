import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Main {
    FastScanner in;
    PrintWriter out;
    int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    long lcm(long a, long b){return a / gcd(a, b) * b;}

    void solve(){
        int N = in.nextInt(), T = in.nextInt();
        int[] A = new int[N+1], B = new int[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
        }

        long max = 0;
        for(int a = 1; a <= N; a++){
            long[][] dp = new long[N+1][T];
            long res = 0;
            for(int i = 1; i <= N; i++){
                for(int j = 0; j < T; j++){
                    if(i == a){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i-1][j];
                        if(j - A[i] >= 0) dp[i][j] = Math.max(dp[i][j], dp[i-1][j-A[i]]+B[i]);
                    }
                    if(i == N) res = Math.max(res, dp[i][j]);
                }
            }
            res += B[a];
            max = Math.max(max, res);
        }
        out.println(max);
    }

    static class ModCalculator{
        //引数の最大値、MOD
        private final int MAX_FAC, MOD;
        //階乗・階乗の逆元・積の逆元のテーブル
        private long[] fact, factInv, inv;

        public ModCalculator(){
            this(510000, (int)1e9+7);
        }

        public ModCalculator(int max, int mod){
            MAX_FAC = max; MOD = mod;
            init();
        }

        //テーブルの初期化
        private void init(){
            fact = new long[MAX_FAC+1];
            factInv = new long[MAX_FAC+1];
            inv = new long[MAX_FAC+1];
            fact[0] = factInv[0] = inv[0] = fact[1] = factInv[1] = inv[1] = 1;
            for (int i = 2; i <= MAX_FAC; ++i) {
                fact[i] = fact[i - 1] * i % MOD;
                inv[i] = MOD - (MOD / i) * inv[(int) (MOD % i)] % MOD;
                factInv[i] = factInv[i - 1] * inv[i] % MOD;
            }
        }

        //nPk % MOD
        public long modPerm(int n, int k){
            return (n >= k) ? fact[n] * factInv[n - k] % MOD : 0;
        }

        //nCk % MOD
        public long modComb(int n, int k){
            return (n >= k) ? fact[n] * factInv[k] % MOD * factInv[n - k] % MOD : 0;
        }

        //n! % MOD
        public long modFact(int n){
            return fact[n];
        }

        //(n!)^-1 % MOD
        public long modFactInv(int n){
            return factInv[n];
        }

        //n^-1 % MOD
        public long modMultiInv(int n){
            return inv[n];
        }

        /*
         * a^b % MOD をlog(n)で計算
         */
        public static long modPow(long a, long b, int mod){
            long res = 1;
            while(b > 0){
                if((b & 1) == 1) res = (res * a) % mod;
                a = (a * a) % mod;
                b = b >> 1;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        new Main().m();
    }

    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "output.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
        in.close();
        out.close();
    }

    static class FastScanner {
        private Reader input;

        public FastScanner() {this(System.in);}
        public FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
        public void close() {
            try {
                this.input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {return (int) nextLong();}

        public long nextLong() {
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

        public double nextDouble() {
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

        public char nextChar() {
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

        public String nextStr() {
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

        public String nextLine() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (b != -1 && b != '\n') {
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