import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] D;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        D = sc.nextIntArray(N);
        System.out.println( solve() );
    }

    static int solve() {
        boolean[] R = new boolean[24];
        R[0] = true;

        for (int i = 0; i < N; i++) {
            int d = D[i];
            if( d == 0 ) return 0;

            int fst;
            int snd;
            if( d % 2 == 0 ) {
                fst = d;
                snd = 24-d;
            } else {
                fst = 24-d;
                snd = d;
            }

            if(!R[fst]) R[fst] = true;
            else R[snd] = true;
        }

        int ans = 24;
        int prev = 0;
        for (int i = 1; i < 24; i++) {
            if( R[i] ) {
                ans = Math.min(i - prev, ans);
                prev = i;
            }
        }
        
        ans = Math.min(24-prev, ans);

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