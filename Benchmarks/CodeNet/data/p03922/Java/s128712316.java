import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N, M;
    static int[] X;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int solve() {
        int[] cnt = new int[(int)1e5+1];
        for (int i = 0; i < N; i++) {
            cnt[X[i]]++;
        }

        ArrayDeque<Integer>[] rq = new ArrayDeque[M];
        for (int r = 0; r < M; r++) {
            rq[r] = new ArrayDeque<>();
        }

        for (int i = 1; i <= (int)1e5; i++) {
            if( cnt[i] == 0 ) continue;
            int r = i % M;
            if( cnt[i] % 2 == 1 ) {
                rq[r].addFirst( cnt[i] );
            } else {
                rq[r].addLast( cnt[i] );
            }
        }

        int ans = 0;
        for (int r = 0; r < M; r++) {
            // 0, M/2
            if( r == 0 || r * 2 % M == 0 ) {
                ArrayDeque<Integer> p = rq[r];
                // M=4, で 4と8をくっつける、みたいなことをする
                while( p.size() >= 2 ) {
                    int a = p.pollFirst();
                    int b = p.pollFirst();
                    ans++;
                    a--;
                    b--;
                    a--;
                    b--;
                    if( a > 0 ) {
                        if( a%2 == 1 ) {
                            p.addFirst(a);
                        } else {
                            p.addLast(a);
                        }
                    }
                    if( b > 0 ) {
                        if( b%2 == 1 ) {
                            p.addFirst(b);
                        } else {
                            p.addLast(b);
                        }
                    }
                }

                while( !p.isEmpty() && p.peekLast() % 2 == 0 ) {
                    ans += p.pollLast() / 2;
                }
                continue;
            }

            ArrayDeque<Integer> p = rq[r];
            ArrayDeque<Integer> q = rq[M-r];

            // r, N-rのペアを優先する
            // 奇数のものから消費する
            while(!p.isEmpty() && !q.isEmpty()) {
                int a = p.poll();
                int b = q.poll();
                ans++;

                a--;
                b--;
                if( a > 0 ) {
                    if( a%2 == 1 ) {
                        p.addFirst(a);
                    } else {
                        p.addLast(a);
                    }
                }
                if( b > 0 ) {
                    if( b%2 == 1 ) {
                        q.addFirst(b);
                    } else {
                        q.addLast(b);
                    }
                }
            }

            while(!p.isEmpty() && p.peekLast() % 2 == 0 ) {
                ans += p.pollLast() / 2;
            }
            while(!q.isEmpty() && q.peekLast() % 2 == 0 ) {
                ans += q.pollLast() / 2;
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
