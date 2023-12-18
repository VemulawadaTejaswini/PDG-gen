import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, Q;
    static int[] A, B;
    static int[] P, X, Y;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt() * 2;
        Q = sc.nextInt();
        A = sc.nextIntArray(N);
        B = sc.nextIntArray(N);
        P = new int[Q];
        X = new int[Q];
        Y = new int[Q];
        for (int i = 0; i < Q; i++) {
            P[i] = sc.nextInt()-1;
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        writeLines(solve());
    }

    static long[] solve() {
        long total = 0;
        Multiset<Integer> ma = new Multiset<>();
        Multiset<Integer> mb = new Multiset<>();
        for (int i = 0; i < N; i++) {
            if( i == 0 || i == N-1 ) {
                total += A[i];

            } else {
                if( A[i] >= B[i] ) {
                    ma.add(A[i] - B[i]);
                    total += A[i];
                } else {
                    mb.add(B[i] - A[i]);
                    total += B[i];
                }
            }
        }

        long[] ans = new long[Q];

        for (int i = 0; i < Q; i++) {
            int p = P[i];
            int x = X[i];
            int y = Y[i];

            if( p == 0 || p == N-1 ) {
                // Aを使う他ない
                total -= A[p];
                A[p] = x;
                total += x;
                ans[i] = total;
                continue;
            }

            if( A[p] > B[p] ) {
                ma.remove(A[p] - B[p]);
                total -= A[p];
            } else {
                mb.remove(B[p] - A[p]);
                total -= B[p];
            }
            if( x > y ) {
                ma.add( x - y );
                total += x;
            } else {
                mb.add( y - x );
                total += y;
            }
            A[p] = x;
            B[p] = y;

            long r = total;
            if( ma.size() % 2 == 1 ) {
                int a = ma.peek();
                int b = mb.peek();

                if( a > b ) {
                    r -= b;
                } else {
                    r -= a;
                }
            }
            ans[i] = r;
        }

        return ans;
    }

    static class Multiset<A> {

        private TreeSet<A> set = new TreeSet<>();
        private Map<A, Integer> cnt = new HashMap<>();
        private int size;

        public void add(A a) {
            size++;
            if (cnt.containsKey(a)) {
                cnt.put(a, cnt.get(a) + 1);

            } else {
                set.add(a);
                cnt.put(a, 1);
            }
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public A pollLast() {
            if (isEmpty()) return null;

            size--;
            A last = set.last();
            if (cnt.get(last) == 1) {
                cnt.remove(last);
                return set.pollLast();

            } else {
                cnt.put(last, cnt.get(last) - 1);
                return last;
            }
        }

        public A peek() {
            if (isEmpty()) return null;
            return set.first();
        }

        public A poll() {
            if (isEmpty()) return null;

            size--;
            A first = set.first();
            if (cnt.get(first) == 1) {
                cnt.remove(first);
                return set.pollFirst();

            } else {
                cnt.put(first, cnt.get(first) - 1);
                return first;
            }
        }

        public void remove(A a) {
            size--;
            if( cnt.get(a) == 1 ) {
                cnt.remove(a);
                set.remove(a);

            } else {
                cnt.put(a, cnt.get(a)-1);
            }
        }

        public String toString() {
            List<A> list = new ArrayList<>();
            for (A k : set) {
                for (int i = 0; i < cnt.get(k); i++) {
                    list.add(k);
                }
            }
            return list.toString();
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
