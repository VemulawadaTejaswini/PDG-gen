import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static String S;
    static int Q;
    static int[] K;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        S = sc.next();
        Q = sc.nextInt();
        K = sc.nextIntArray(Q);

        long[] ans = solve();
        PrintWriter pw = new PrintWriter(System.out);
        for (long i : ans) {
            pw.println(i);
        }
        pw.flush();
    }

    static long[] solve() {
        long[] ans = new long[Q];
        for (int i = 0; i < Q; i++) {
            ans[i] = calc(K[i]);
        }
        return ans;
    }

    static long calc(int k) {
        int d = 0;
        int m = 0;
        long dm = 0;
        long ret = 0;
        for (int i = 0; i < N; i++) {
            char in = S.charAt(i);
            if( in == 'D' ) {
                d++;

            } else if( in == 'M' ) {
                m++;
                dm += d;

            } else if( in == 'C' ) {
                ret += dm;
            }

            if( i >= k-1 ) {
                char out = S.charAt(i-k+1);
                if( out == 'D' ) {
                    d--;
                    dm -= m;

                } else if( out == 'M' ) {
                    m--;
                }
            }

            // System.out.println(i + " " + d + " " + m + " " + dm + " " + ret);
        }
        return ret;
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
