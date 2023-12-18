import java.io.*;
import java.util.*;

public class Main {

    static int N, Q;
    static int[] S, T, X;
    static int[] D;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();

        S = new int[N];
        T = new int[N];
        X = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = sc.nextInt();
            T[i] = sc.nextInt();
            X[i] = sc.nextInt();
        }
        D = sc.nextIntArray(Q);

        writeLines(solve());
    }

    static int[] solve() {
        // [time, type, x]
        int[][] events = new int[N*2 + Q][3];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            // start
            events[idx][0] = S[i] - X[i];
            events[idx][1] = 0;
            events[idx][2] = X[i];
            idx++;

            // end
            events[idx][0] = T[i] - X[i];
            events[idx][1] = 1;
            events[idx][2] = X[i];
            idx++;
        }
        for (int i = 0; i < Q; i++) {
            events[idx][0] = D[i];
            events[idx][1] = 2;
            events[idx][2] = i;
            idx++;
        }

        Arrays.sort(events, Comparator.comparingInt(ev -> ev[0]));
        MultiIntSet set = new MultiIntSet();
        int[] ans = new int[Q];
        for (int[] ev : events) {
            int type = ev[1];
            if( type == 0 ) {
                set.add(ev[2]);

            } else if( type == 1 ) {
                set.remove(ev[2]);

            } else {
                if( set.size() == 0 ) {
                    ans[ev[2]] = -1;
                } else {
                    ans[ev[2]] = set.first();
                }
            }
        }
        return ans;
    }

    static class MultiIntSet {

        private final TreeSet<Node> tree = new TreeSet<>();
        private final Node nodeForQuery = new Node(-1, 1); // queryでobject作ると辛いのでケチる用
        private int size;

        boolean contains(int a) {
            nodeForQuery.a = a;
            return tree.contains(nodeForQuery);
        }

        void add(int a) {
            nodeForQuery.a = a;
            Node found = tree.ceiling(nodeForQuery);
            if( found == null || found.a != a ) {
                tree.add( new Node(a, 1) );
            } else {
                found.cnt++;
            }
            size++;
        }

        boolean remove(int a) {
            nodeForQuery.a = a;
            Node found = tree.ceiling(nodeForQuery);
            if( found == null || found.a != a ) {
                return false;

            } else {
                found.cnt--;
                if( found.cnt == 0 ) {
                    tree.remove(found);
                }
                size--;
                return true;
            }
        }

        int first() {
            return tree.first().a;
        }

        int last() {
            return tree.last().a;
        }

        int size() {
            return size;
        }

        static class Node implements Comparable<Node> {
            int a;
            int cnt;

            public Node(int a, int cnt) {
                this.a = a;
                this.cnt = cnt;
            }

            @Override
            public int compareTo(Node o) {
                return Integer.compare(a, o.a);
            }
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
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
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

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
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
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
