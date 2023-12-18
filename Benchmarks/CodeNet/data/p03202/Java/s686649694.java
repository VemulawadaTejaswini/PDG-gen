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

    static int solve() {
        Node[] S = new Node[N];
        S[0] = new Node(1, A[0], 1);
        int last = 0;
        int cur = 1;
        int ans = 1;

        lo: for (int i = 1; i < N; i++) {
            if( A[i] > A[i-1] ) {
                Node l = S[last];
                if( l.n == 1 ) {
                    l.to = A[i];
                } else {
                    last++;
                    S[last] = new Node(l.to+1, A[i], 1);
                }

            } else if (A[i] == A[i-1] ) {
                // abcc -> ac -> acaa
                for (int j = last; j >= 0 ; j--) {
                    if( S[j].n < cur ) {
                        if( S[j].from == S[j].to ) {
                            S[j].n++;
                            last = j+1;
                            S[last] = new Node(S[j].to+1, A[i], 1);
                            continue lo;
                        }
                    }
                }
                // aaa -> aab
                if( A[i] == 1 ) {
                    // bbb -> 'c'
                    cur++;
                    ans = Math.max(cur, ans);
                    last = 0;
                    S[0] = new Node(1, 1, cur);

                } else {
                    // aaa -> aab
                    S[0] = new Node(1, A[0]-1, cur);
                    S[1] = new Node(A[0], A[0], cur+1);
                    cur++;
                    ans = Math.max(cur, ans);
                    last = 1;
                }

            } else {
                // abcc -> ab
                for (int j = last; j >= 0 ; j--) {
                    if( A[i] < S[j].from ) continue;
                    S[j].to = A[i];
                    last = j;
                    break;
                }

                for (int j = last; j >= 0 ; j--) {
                    if( S[j].n < cur ) {
                        if( S[j].from == S[j].to ) {
                            S[j].n++;
                            last = j+1;
                            S[last] = new Node(S[j].to+1, A[i], 1);
                            continue lo;
                        }
                    }
                }
                // aaa -> aab
                if( A[i] == 1 ) {
                    // bbb -> 'c'
                    cur++;
                    ans = Math.max(cur, ans);
                    last = 0;
                    S[0] = new Node(1, 1, cur);

                } else {
                    // aaa -> aab
                    S[0] = new Node(1, A[0]-1, cur);
                    S[1] = new Node(A[0], A[0], cur+1);
                    cur++;
                    ans = Math.max(cur, ans);
                    last = 1;
                }
            }
        }

        return ans;
    }

    static class Node {
        int from, to, n;

        public Node(int from, int to, int n) {
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
