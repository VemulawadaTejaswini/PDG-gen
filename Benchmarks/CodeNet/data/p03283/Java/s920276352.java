import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int M;
    static int Q;
    static int[] L;
    static int[] R;
    static Query[] QS;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        L = new int[M];
        R = new int[M];
        for (int i = 0; i < M; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }
        QS = new Query[Q];
        for (int i = 0; i < Q; i++) {
            QS[i] = new Query(sc.nextInt(), sc.nextInt());
        }

        PrintWriter pw = new PrintWriter(System.out);
        for (int i : solve()) {
            pw.println(i);
        }
        pw.flush();
    }

    static int[] solve() {
        int[][] rui = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            rui[L[i]][R[i]]++;
        }

        for (int l = 1; l <= N; l++) {
            for (int r = 1; r <= N; r++) {
                rui[l][r] += rui[l][r-1];
            }
        }

        int[] ans = new int[Q];
        for (int i = 0; i < Q; i++) {
            Query q = QS[i];

            ans[i] = calc(q, rui);
        }
        return ans;
    }

    private static int calc(Query query, int[][] rui) {
        int ret = 0;
        for (int i = query.p; i <= query.q; i++) {
            ret += rui[i][query.q];
        }
        return ret;
    }

    static class Query {
        int p;
        int q;

        public Query(int p, int q) {
            this.p = p;
            this.q = q;
        }
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
