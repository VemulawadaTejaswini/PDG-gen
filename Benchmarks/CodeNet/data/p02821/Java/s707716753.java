import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {

    static int N;
    static long M;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextLong();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static long all() {
        PriorityQueue<Pair> q = new PriorityQueue<>(Comparator.comparingInt(p -> -p.happy()));
        for (int i = 0; i < N; i++) {
            q.add(new Pair(i, i));
            for (int j = i+1; j < N; j++) {
                q.add(new Pair(i, j));
                q.add(new Pair(i, j));
            }
        }
        long r = M;
        long ret = 0;
        while( r > 0 && !q.isEmpty() ) {
            ret += q.poll().happy();
            r--;
        }
        return ret;
    }

    static long solve() {
        Arrays.sort(A);
        reverse(A);

        // debug("all", all());

        // (x, x)がM個の中に含まれない最大のものを探す
        int maxx = maximize(1, N, x -> {
            long cnt = 0;
            for (int i = 0; i < x; i++) {
                final int ii = i;
                int maxy = maximize(i, N, y -> {
                    // (i, y) >= (x, x)
                    return A[ii] + A[y] >= A[x] + A[x];
                });

                cnt += (maxy - i) * 2 + 1;
            }
            return cnt <= M-1;
        });

        long[] C = new long[N+1];
        for (int i = 0; i < N; i++) {
            C[i+1] = A[i] + C[i];
        }

        // シミュする
        PriorityQueue<Pair> q = new PriorityQueue<>(Comparator.comparingInt(p -> -p.happy()));
        long r = M;
        long ans = 0;
        for (int i = 0; i < maxx; i++) {
            final int ii = i;
            int maxy = maximize(i, N, y -> {
                // (i, y) >= (maxx, maxx)
                return A[ii] + A[y] >= A[maxx] + A[maxx];
            });

            // r -= (maxy - i) * 2 + 1;
            // (i, i)
            ans += A[i] + A[i];
            r--;
            // (i, i+1)...(i, maxy)
            ans += (C[maxy+1] - C[i+1] + (long)(maxy-i) * A[i]) * 2;
            // debug((C[maxy+1] - C[i+1] + (long)(maxy-i) * A[i]) * 2);
            r -= (maxy - i) * 2;
            if( maxy+1 > N ) {
                q.add( new Pair(i, maxy+1) ); // 次の候補
            }
        }
        // debug(ans, r);
        q.add( new Pair(maxx, maxx) );
        while( r > 0 && !q.isEmpty() ) {
            Pair p = q.poll();
            if( p.x == p.y ) {
                ans += p.happy();
                r--;
                if( p.y+1 < N ) {
                    q.add( new Pair(p.x, p.y+1));
                }

            } else {
                if( r >= 2 ) {
                    r -= 2;
                    ans += p.happy() *2;
                } else {
                    r--;
                    ans += p.happy();
                }
                if( p.y+1 < N ) {
                    q.add( new Pair(p.x, p.y+1) );
                }
            }
        }

        return ans;
    }

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int happy() {
            return A[x] + A[y];
        }
    }

    static int maximize(int lo, int hi, IntPredicate p) {
        while(lo < hi) {
            int x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                lo = x + 1;
            } else {
                hi = x;
            }
        }
        return lo - 1;
    }

    static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
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
