import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@SuppressWarnings("unchecked")
public class Main {

    static int P;
    static int Q;
    static int A;
    static int N;

    public static void main(String[] args) {
        FastScanner fc = new FastScanner(System.in);

        while(true) {
            P = fc.nextInt();
            Q = fc.nextInt();
            A = fc.nextInt();
            N = fc.nextInt();

            if( P == 0 && Q == 0 && A == 0 && N == 0 ) break;

            System.out.println( solve() );
        }
    }

    static int solve() {
        return dfs(P, Q, 1, 1, 0);
    }

    // p/qを減らしていくdfs
    static int dfs(int p, int q, int i, int a, int n) {
        // System.out.println(p + " " + q + " " + i + " " + a + " " + n);
        if( a > A ) return 0; // 起きない予定
        if( n > N ) return 0;
        if( p < 0 ) return 0;
        if( p == 0 ) return 1;

        int ret = 0;
        for (int j = i; j <= A/a; j++) { // 割らないとすごいことに
            ret += dfs(p*j-q, q*j, j, a*j, n+1);
        }
        return ret;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        private String peeked;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        boolean hasNext() {
            return peekLine();
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(consumeLine());
            }
            return tokenizer.nextToken();
        }

        private boolean peekLine() {
            try {
                if( peeked != null ) return true;

                peeked = reader.readLine();
                return peeked != null;

            } catch( IOException e ) {
                throw new RuntimeException(e);
            }
        }

        private String consumeLine() {
            if( peeked != null ) {
                String t;
                t = peeked;
                peeked = null;
                return t;

            } else {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                return consumeLine();
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

