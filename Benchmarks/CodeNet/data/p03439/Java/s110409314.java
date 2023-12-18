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
        // (from, to)
        int from = 0;
        int to = N-1;
        char fc = q.run(from);
        char tc = q.run(to);
        if( fc == 'V' || tc == 'V' ) return;

        for (int i = 0; i < 18; i++) {
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

            if( half % 2 == 0 ) {
                if( fc == qc ) {
                    // 前半がM2M -> 後半
                    from = qi;
                    fc = qc;

                } else {
                    to = qi;
                    tc = qc;
                }

            } else {
                if( fc == qc ) {
                    // 前半がM2M -> 後半
                    from = qi;
                    fc = qc;
                } else {
                    to = qi;
                    tc = qc;
                }
            }
        }

        // 21回目で死ぬと思われる
        q.run(0);
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
