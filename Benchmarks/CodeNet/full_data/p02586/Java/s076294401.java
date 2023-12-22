import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static class Task {

        private static final int MOD = 998244353;

        private long gcd(long m, long n) {
            if (n == 0) {
                return m;
            }
            return gcd(n, m % n);
        }

        // 快速幂
        public int pow(long x, long n, int mod) {
            long res = 1;
            x %= mod;
            while (n > 0) {
                if ((n & 1) == 1) {
                    res = res * x % mod;
                }

                x = x * x % mod;
                n >>>= 1;
            }
            return (int) res % mod;
        }


        int[] h,to,next,wt,fa;int ct = 0;
        void init(int n ,int m){
            h = new int[n]; Arrays.fill(h,-1);
            to = new int[m*2+2];
            wt = new int[m*2+2];
            next = new int[m*2+2];
            fa = new int[n];Arrays.fill(fa,-1);
            ct = 0;
        }

        void add(int u,int v,int w){
            to[++ct] = v;
            next[ct] = h[u];
            wt[ct] = w;
            h[u] = ct;
        }


        long[][] mult(long a[][],long b[][], long mod){
            int l1 = a.length;
            int l2 = b.length;
            int l3 = b[0].length;
            long r[][] = new long[l1][l3];
            for(int i=0;i<l1;++i){
                for(int j=0;j<l2;++j){
                    for(int k=0;k<l3;++k){
                        r[i][k] = (r[i][k] + a[i][j] * b[j][k])%mod;
                    }
                }
            }
            return r;
        }

        long[][] ones(int len){
            long r[][] = new long[len][len];
            for(int i=0;i<len;++i){
                r[i][i] = 1L;
            }
            return r;
        }

        long[][] quick(long a[][], int times,long mod){
            int len = a.length;
            long ans[][] = ones(len);

            while(times>0){
                if((times&1)==1) {
                    ans = mult(ans, a, mod);
                }
                a = mult(a, a, mod);
                times >>= 1;
            }

            return ans;
        }

        public static long max(long... a) {
            long x = a[0];
            int len = a.length;
            for (int i = 1; i < len; ++i) {
                x = Math.max(x, a[i]);
            }
            return x;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int r = in.nextInt();
            int c = in.nextInt();
            int k = in.nextInt();
            long[][] g = new long[r + 1][c + 1];
            for (int i = 0; i < k; i++) g[in.nextInt()][in.nextInt()] = in.nextLong();
            long[][][] dp = new long[4][r + 1][c + 1];
            for (int i = 1; i <= r; i++) {
                for (int x = 1; x <= 3; x++) {
                    for (int j = 1; j <= c; j++) {
                        dp[x][i][j] = max(dp[x - 1][i][j - 1] + g[i][j], dp[x][i][j - 1]);
                        if (x == 1) {
                            dp[x][i][j] = max(dp[x][i][j], g[i][j] + max(dp[1][i - 1][j], dp[2][i - 1][j], dp[3][i - 1][j]));
                        }
                    }
                }
            }
            long ans = max(dp[1][r][c], dp[2][r][c], dp[3][r][c]);
            out.println(ans);



        }
    }

    private static void sort(double[] arr) {
        Double[] objArr = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(int[] arr) {
        Integer[] objArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(long[] arr) {
        Long[] objArr = Arrays.stream(arr).boxed().toArray(Long[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task task = new Task();
        task.solve(1, in, out);
        out.close();
    }

    public static void main(String[] args) {
        new Thread(null, () -> solve(), "1", 1 << 26).start();
    }

    static class InputReader {

        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextArray(int n){
            int res[]  = new int[n];
            for(int i=0;i<n;++i){
                res[i] = nextInt();
            }
            return res;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}


