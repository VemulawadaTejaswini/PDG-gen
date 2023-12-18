import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();

        System.out.println(solve());
    }

    static String solve() {
        long[] from = new long[32];
        long[] to = new long[32];
        from[0] = 1;
        to[0] = 1;
        from[1] = -2;
        to[1] = -1;

        for (int i = 2; i < 32; i++) {
            long b = (long)Math.pow(-2, i);

            if( b > 0 ) {
                from[i] = to[i-2] + 1;
                to[i] = to[i-2] + b;

            } else {
                from[i] = from[i-2] + b;
                to[i] = from[i-2] - 1;
            }
        }

        StringBuilder ans = new StringBuilder();
        int n = N;
        for (int i = 31; i >= 0; i--) {
            long b = (long)Math.pow(-2, i);
            if( from[i] <= n && n <= to[i] ) {
                n -= b;
                ans.append("1");
            } else {
                ans.append("0");
            }
        }

        int idx = ans.indexOf("1");
        if( idx == -1 ) {
            return "0";
        } else {
            return ans.substring(idx);
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
