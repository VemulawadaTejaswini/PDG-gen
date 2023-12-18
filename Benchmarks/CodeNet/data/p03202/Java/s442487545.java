import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static Node[] S;
    static int last;
    static int cur;
    static int ans;

    static int solve() {
        S = new Node[N];
        S[0] = new Node(1, A[0], 1);
        last = 0;
        cur = 1;
        ans = 1;

        // showNode(S, last);

        for (int i = 1; i < N; i++) {
            if( A[i] > A[i-1] ) {
                Node l = S[last];
                if( l.n == 1 ) {
                    l.to = A[i];
                } else {
                    last++;
                    S[last] = new Node(l.to+1, A[i], 1);
                }

            } else if ( A[i] == A[i-1] ) {
                next(A[i]);

            } else {
                cut(A[i]);
                next(A[i]);
            }
            // showNode(S, last);
        }

        return ans;
    }

    static void cut(int a) {
        // abcc -> ab
        for (int j = last; j >= 0 ; j--) {
            if( a < S[j].from ) continue;
            S[j].to = a;
            last = j;
            break;
        }
        int ncur = 1;
        for (int j = 0; j <= last; j++) {
            ncur = Math.max(S[j].n, ncur);
        }
        cur = ncur;
    }

    static void next(int a) {
        for (int j = last; j >= 0 ; j--) {
            Node s = S[j];
            if( s.n < cur ) {
                if( s.from == s.to ) {
                    // ababb -> ab'b''aa'
                    s.n++;

                    if( s.to < a ) {
                        S[j+1] = new Node(s.to+1, a, 1);
                        last = j+1;
                    }

                } else {
                    // abaab -> ab'a''b''a'
                    S[j+1] = new Node(s.to, s.to, s.n+1);
                    s.to--;
                    last = j+1;

                    if( S[j+1].to < a ) {
                        S[j+2] = new Node(S[j+1].to+1, a, 1);
                        last = j+2;
                    }
                }
                return;
            }
        }

        if( a == 1 ) {
            // bbb -> 'c'
            cur++;
            ans = Math.max(cur, ans);
            last = 0;
            S[0] = new Node(1, 1, cur);

        } else {
            // aaa -> aab
            S[0] = new Node(1, a-1, cur);
            S[1] = new Node(a, a, cur+1);
            cur++;
            ans = Math.max(cur, ans);
            last = 1;
        }
    }

    static void showNode(Node[] S, int last) {
        StringJoiner j = new StringJoiner(" ");
        for (int i = 0; i <= last; i++) {
            j.add( "([" + S[i].from + "," + S[i].to + "]," + S[i].n + ")" );
        }
        System.err.println( j.toString() );
    }

    static class Node {
        int from, to, n;

        public Node(int from, int to, int n) {
            if( from > to ) throw new RuntimeException("[" + from + " " + to + "]");
            this.from = from;
            this.to = to;
            this.n = n;
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

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
