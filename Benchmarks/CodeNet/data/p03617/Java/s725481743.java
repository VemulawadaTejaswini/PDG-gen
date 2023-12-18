import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int Q;
    static int H;
    static int S;
    static int D;
    static int N;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);
        Q = fc.nextInt();
        H = fc.nextInt();
        S = fc.nextInt();
        D = fc.nextInt();
        N = fc.nextInt();
        System.out.println(solve());
    }

    static long solve() {
        int DQ = Q * 8;
        int DH = H * 4;
        int DS = S * 2;
        int DD = D;

        int cheap = Math.min(Math.min(Math.min(DQ, DH), DS), DD);
        if( DQ == cheap ) {
            return (long)N * 4 * Q;
        } else if( DH == cheap ) {
            return (long)N * 2 * H;
        } else if( DS == cheap ) {
            return (long)N * S;

        } else {
            if( N % 2 == 0 ) {
                return (long)N / 2 * D;

            } else {
                long ans = (long)N / 2 * D;
                int cheap2 = Math.min(Math.min(DQ, DH), DS);
                if( DQ == cheap2 ) {
                    return ans + 4 * Q;
                } else if( DH == cheap2 ) {
                    return ans + 2 * H;
                } else {
                    return ans + S;
                }
            }
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
