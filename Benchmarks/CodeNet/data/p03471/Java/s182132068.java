import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        Y = sc.nextInt();
        System.out.println(solve());
    }

    static String solve() {
        Y /= 1000;

        // 10a + 5b + c = Y
        // a + b + c = N
        // =>
        // 5b + c = Y - 10a
        // b + c = N - a
        // =>
        // 4b = (Y - 10a) - (N - a) = Y - 9a - N
        // c = N - a - b
        for (int a = 0; a <= N; a++) {
            int b4 = Y - 9*a - N;
            if( b4 % 4 != 0 ) continue;
            int b = b4 / 4;
            int c = N - a - b;

            if( b >= 0 && c >= 0 ) {
                return a + " " + b + " " + c;
            }
        }
        return "-1 -1 -1";
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
