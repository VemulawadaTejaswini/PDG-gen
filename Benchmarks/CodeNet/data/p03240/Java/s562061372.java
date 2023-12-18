import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] X, Y, H;


    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        X = new int[N];
        Y = new int[N];
        H = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
            H[i] = sc.nextInt();
        }

        System.out.println( solve() );
    }

    static String solve() {
        if( N == 1 ) return X[0] + " " + Y[0] + " " + H[0];

        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int ch = calc(cx, cy);
                if( ch != -1 ) {
                    return cx + " " + cy + " " + ch;
                }
            }
        }
        throw new RuntimeException("wtf");
    }

    static int calc(int cx, int cy) {
        int ch = -1;
        for (int i = 0; i < N; i++) {
            if( H[i] == 0 ) continue;

            int chi = Math.abs(X[i]-cx) + Math.abs(Y[i]-cy) + H[i];
            if( ch == -1 ) {
                ch = chi;
            } else {
                if( ch != chi ) return -1;
            }
        }

        if( ch == -1 ) {
            // Hが0のものしかいないのでどこに決めてもよいが、点のない部分にする
            for (int i = 0; i < N; i++) {
                if( cx == X[i] && cy == Y[i] ) return -1;
            }
            return 1;

        } else {
            // chと矛盾がないようにする
            for (int i = 0; i < N; i++) {
                if( H[i] > 0 ) continue;

                int d = Math.abs(X[i] - cx) + Math.abs(Y[i] - cy);
                if( d < ch ) return -1;
            }
            return ch;
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
