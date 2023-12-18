import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.io.*;
import java.util.*;

public class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();

        PrintWriter pw = new PrintWriter(System.out);
        solve( i -> {
            pw.println(i);
            pw.flush();
            return sc.next().charAt(0);
        });

        sc.reader.close();
        pw.close();
    }

    interface Query {
        char run(int i);
    }

    static void solve(Query q) {
        char fc = q.run(0);
        if( fc == 'V' ) return;

        // (from, to)
        int from = 0;
        int to = N-1;

        for (int i = 0; i < 19; i++) {
            if( from + 1 == to ) {
                char must_v = q.run(to); // Vのはず
                if( must_v != 'V' ) {
                    throw new RuntimeException("wtf");
                } else {
                    return; // ok
                }
            }

            int half = (to - from)/2;
            int qi = from + half;
            char qc = q.run(qi);
            if( qc == 'V' ) return; // ok

            if( fc == qc ) {
                // (M, M) -> 偶数側を探す
                if( half % 2 == 0 ) {
                    from = qi;

                } else {
                    to = qi;
                }

            } else {
                // (M, F) -> 奇数側を探す
                if( half % 2 == 0 ) {
                    to = qi;

                } else {
                    from = qi;
                }
            }
            fc = qc;
        }
        throw new RuntimeException("wtf");
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
