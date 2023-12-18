import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A;
    static int[] B;
    static int[] X;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();

        if( N == 1 ) {
            A = new int[0];
            B = new int[0];
            sc.nextLine();

        } else {
            A = new int[N-1];
            B = new int[N-1];
            for (int i = 0; i < N - 1; i++) {
                int a = sc.nextInt() - 1;
                int b = i + 1;
                A[i] = a;
                B[i] = b;
            }
        }
        X = sc.nextIntArray(N);

        System.out.println(solve() ? "POSSIBLE" : "IMPOSSIBLE");
    }

    static boolean solve() {
        int[][] G = adjD(N, A, B);

        try {
            dfs(0, G);
            return true;

        } catch( WrongException e ) {
            return false;
        }
    }

    static class WrongException extends RuntimeException {
    }

    static Result dfs(int n, int[][] G) {
        int len = G[n].length;
        if( len == 0 ) return new Result(0, X[n]);

        Result[] rs = new Result[len];
        for (int i = 0; i < len; i++) {
            rs[i] = dfs(G[n][i], G);
        }

        int suma = 0;
        int sumb = 0;
        for (Result r : rs) {
            suma += r.a;
            sumb += r.b;
        }

        int x = X[n];
        if( x < suma ) {
            // 割り当て不可
            throw new WrongException();

        } else if( suma <= x && x < sumb ) {
            return new Result(x, sumb);

        } else {
            return new Result(suma, x);
        }
    }

    // a <= b
    static class Result {
        int a, b;

        public Result(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    static int[][] adjD(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
        }
        return adj;
    }

    @SuppressWarnings("unused")
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
