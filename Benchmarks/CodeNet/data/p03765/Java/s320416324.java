import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static String S;
    static String T;
    static Query[] Q;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        S = sc.next();
        T = sc.next();
        Q = new Query[sc.nextInt()];
        for (int i = 0; i < Q.length; i++) {
            Q[i] = new Query(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt()-1, sc.nextInt()-1);
        }

        boolean[] answer = solve();
        PrintWriter pw = new PrintWriter(System.out);
        for (boolean b : answer) {
            pw.println( b ? "YES" : "NO");
        }
        pw.flush();
    }

    static boolean[] solve() {
        boolean[] ans = new boolean[Q.length];
        for (int i = 0; i < Q.length; i++) {
            ans[i] = solve(Q[i]);
        }
        return ans;
    }

    static boolean solve(Query q) {
        return calc(q.a, q.b, S) == calc(q.c, q.d, T);
    }

    static Type calc(int from, int to, String s) {
        // [from, to]
        Type type = Type.EMPTY;
        for (int i = from; i <= to ; i++) {
            char c = s.charAt(i);
            if( type == Type.A ) {
                if( c == 'A' ) {
                    type = Type.B;
                } else {
                    type = Type.EMPTY;
                }
            } else if( type == Type.B ) {
                if( c == 'A' ) {
                    type = Type.EMPTY;
                } else {
                    type = Type.A;
                }
            } else {
                if( c == 'A' ) {
                    type = Type.A;
                } else {
                    type = Type.B;
                }
            }
        }
        return type;
    }

    enum Type {
        A, B, EMPTY
    }

    static class Query {
        int a;
        int b;
        int c;
        int d;

        public Query(int a, int b, int c, int d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
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
