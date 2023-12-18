import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int W;
    static int H;
    static int[] P;
    static int[] Q;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        W = sc.nextInt();
        H = sc.nextInt();
        P = sc.nextIntArray(W);
        Q = sc.nextIntArray(H);
        System.out.println( solve() );
    }

    static long solve() {
        Arrays.sort(P);
        Arrays.sort(Q);

        int pi = 0;
        int qi = 0;

        long ans = 0;
        while(pi < W || qi < H) {
            if( pi == W ) {
                ans += Q[qi];
                qi++;

            } else if( qi == H ) {
                ans += P[pi];
                pi++;

            } else {
                int p = P[pi];
                int q = Q[qi];

                if( p < q ) {
                    ans += p * (H - qi + 1);
                    pi++;
                } else {
                    ans += q *(W - pi + 1);
                    qi++;
                }
            }
        }
        return ans;
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