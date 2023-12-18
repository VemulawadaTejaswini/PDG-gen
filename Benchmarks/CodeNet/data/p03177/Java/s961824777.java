import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }

    private static class Solver {
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt();
            long k = inp.nextLong();
            long[][] a = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = inp.nextInt();
                }
            }
            long[][] pow = pow(a, k);
            long sum = 0;
            for (long[] i: pow) {
                for (long j: i) {
                    sum = (sum + j) % MOD;
                }
            }
            out.print(sum);
        }

        // p != 0
        private long[][] pow(long[][] a, long p) {
            if (p == 1) return a;
            if ((p & 1) == 1) return mul(pow(a, p-1), a);
            long[][] temp = pow(a, p >> 1);
            return mul(temp, temp);
        }


        private static final int MOD = 1000000007;
        private static final long BIG = 8L * (long) MOD * MOD;

        private static long[][] p2(long[][] A) {
            int n = A.length;
            long[][] C = new long[n][n];
            for(int i = 0;i < n;i++){
                long[] sum = new long[n];
                for(int k = 0;k < n;k++){
                    for(int j = 0;j < n;j++){
                        sum[j] += A[i][k] * A[k][j];
                        if(sum[j] >= BIG) sum[j] -= BIG;
                    }
                }
                for(int j = 0;j < n;j++) C[i][j] = (sum[j] % MOD);
            }
            return C;
        }

        private static long[][] mul(long[][] a, long[][] b) {
            int n = a.length;
            int m = a[0].length;
            int k = b[0].length;
            long[][] res = new long[n][k];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    for (int p = 0; p < m; p++) {
                        res[i][j] = res[i][j] + a[i][p] * b[p][j];
                        if (res[i][j] >= BIG) res[i][j] -= BIG;
                    }
                    res[i][j] %= MOD;
                }
            }
            return res;
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
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
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
