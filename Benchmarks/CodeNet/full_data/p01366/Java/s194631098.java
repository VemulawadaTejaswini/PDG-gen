import java.io.*;
import java.util.*;

public class Main {

    static int N, M;
    static Edge[] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        while(true) {
            N = sc.nextInt();
            M = sc.nextInt();

            if( N == 0 ) break;

            E = new Edge[M];
            for (int i = 0; i < M; i++) {
                E[i] = new Edge( sc.nextInt()-1, sc.nextInt()-1, sc.nextInt(), sc.nextInt());
            }

            System.out.println(solve());
        }
    }

    static int solve() {
        Edge[][] G = adjB(N, E);

        int totalCost = 0;
        int[] dist = new int[N];
        int[] cost = new int[N];
        Arrays.fill(dist, Integer.MAX_VALUE/2);
        Arrays.fill(cost, -1);
        PriorityQueue<State> q = new PriorityQueue<>(Comparator.comparingInt(s -> s.d));
        dist[0] = 0;
        q.add( new State(0, 0, 0) );
        while( !q.isEmpty() ) {
            State s = q.poll();
            if( dist[s.a] != s.d ) continue;

            // 同じdistの場合、costの安いほうを採用する
            if( cost[s.a] == -1 ) {
                cost[s.a] = s.c;
                totalCost += s.c;

            } else {
                if( cost[s.a] > s.c ) {
                    totalCost -= cost[s.a] - s.c;
                    cost[s.a] = s.c;
                }
            }

            for (Edge e : G[s.a]) {
                int b = e.a == s.a ? e.b : e.a;
                if( dist[b] > s.d + e.d ) {
                    dist[b] = s.d + e.d;
                    q.add( new State(b, dist[b], e.c) );
                } else if( dist[b] == s.d + e.d ) {
                    q.add( new State(b, dist[b], e.c) );
                }
            }
        }
        return totalCost;
    }

    static class State {
        int a, d, c;

        public State(int a, int d, int c) {
            this.a = a;
            this.d = d;
            this.c = c;
        }
    }

    static Edge[][] adjB(int n, Edge[] E) {
        Edge[][] adj = new Edge[n][];
        int[] cnt = new int[n];
        for (Edge e : E) {
            cnt[e.a]++;
            cnt[e.b]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new Edge[cnt[i]];
        }
        for (Edge e : E) {
            adj[e.a][--cnt[e.a]] = e;
            adj[e.b][--cnt[e.b]] = e;
        }
        return adj;
    }


    static class Edge {
        int a, b, d, c;

        public Edge(int a, int b, int d, int c) {
            this.a = a;
            this.b = b;
            this.d = d;
            this.c = c;
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

