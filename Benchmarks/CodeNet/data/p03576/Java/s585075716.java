import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int K;
    static Cord[] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        C = new Cord[N];
        for (int i = 0; i < N; i++) {
            C[i] = new Cord(sc.nextInt(), sc.nextInt());
        }
        System.out.println( solve() );
    }

    private static long solve() {
        int[] X = new int[N];
        int[] Y = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = C[i].x;
            Y[i] = C[i].y;
        }
        Arrays.sort(X);
        Arrays.sort(Y);

        long ans = Long.MAX_VALUE;
        for (int x1 = 0; x1 < N-1; x1++) {
            for (int x2 = x1+1; x2 < N; x2++) {
                for (int y1 = 0; y1 < N-1; y1++) {
                    for (int y2 = y1+1; y2 < N ; y2++) {
                        if( X[x1] == X[x2] || Y[y1] == Y[y2] ) continue;

                        if( count(X[x1], X[x2], Y[y1], Y[y2]) >= K ) {
                            ans = Math.min(menseki(X[x1], X[x2], Y[y1], Y[y2]), ans);
                        }
                    }
                }
            }
        }
        return ans;
    }

    private static long menseki(int x1, int x2, int y1, int y2) {
        return ((long)x2-x1) * ((long)y2-y1);
    }

    private static int count(int x1, int x2, int y1, int y2) {
        int cnt = 0;
        for (Cord c : C) {
            if( x1 <= c.x && c.x <= x2 && y1 <= c.y && c.y <= y2 ) cnt++;
        }
        return cnt;
    }

    static class Cord {
        final int x;
        final int y;

        public Cord(int x, int y) {
            this.x = x;
            this.y = y;
        }
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
