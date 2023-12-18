import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, C_MAX;
    static int[][] D;
    static int[][] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        C_MAX = sc.nextInt();

        D = new int[C_MAX][C_MAX];
        for (int i = 0; i < C_MAX; i++) {
            for (int j = 0; j < C_MAX; j++) {
                D[i][j] = sc.nextInt();
            }
        }
        C = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j] = sc.nextInt();
            }
        }

        System.out.println( solve() );
    }

    private static int solve() {
        int[][] cost = new int[3][C_MAX];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int g = (i+j)%3;

                int c_from = C[i-1][j-1]-1;
                for (int c_to = 0; c_to < C_MAX; c_to++) {
                    cost[g][c_to] += D[c_from][c_to];
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int c_g0 = 0; c_g0 < C_MAX; c_g0++) {
            for (int c_g1 = 0; c_g1 < C_MAX; c_g1++) {
                for (int c_g2 = 0; c_g2 < C_MAX; c_g2++) {
                    if( c_g0 == c_g1 || c_g1 == c_g2 || c_g2 == c_g0 ) continue;
                    min = Math.min(cost[0][c_g0] + cost[1][c_g1] + cost[2][c_g2], min);
                }
            }
        }
        return min;
    }

    static class FastScanner {

        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}

