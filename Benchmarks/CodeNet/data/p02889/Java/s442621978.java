import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, M, L;
    static Edge[] E;
    static int Q;
    static int[] S, T;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        L = sc.nextInt();
        E = new Edge[M];
        for (int i = 0; i < M; i++) {
            E[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt());
        }
        Q = sc.nextInt();
        S = new int[Q];
        T = new int[Q];
        for (int i = 0; i < Q; i++) {
            S[i] = sc.nextInt()-1;
            T[i] = sc.nextInt()-1;
        }

        writeLines(solve());
    }

    static int[] solve() {
        Edge[][] G = adjB(N, E);

        int[][] times = new int[N][];
        for (int i = 0; i < N; i++) {
            times[i] = calcTimes(i, G);
        }

        int[] ans = new int[Q];
        for (int i = 0; i < Q; i++) {
            int s = S[i];
            int t = T[i];
            ans[i] = times[s][t];
        }
        return ans;
    }

    static long[] bests;
    static MinRadixHeap<Integer> q = new MinRadixHeap<>();

    static int[] calcTimes(int start, Edge[][] G) {
        if( bests == null ) bests = new long[N];
        Arrays.fill(bests, Long.MAX_VALUE);

        bests[start] = L; // time 0, fuel max
        q.push( bests[start], start );

        while(!q.isEmpty()) {
            MinRadixHeap.Pair<Integer> s = q.poll();
            int a = s.value;
            long timeFuel = s.key;
            if( bests[a] != timeFuel ) continue;

            int time = (int)(timeFuel >> 32);
            int fuel = (int)(timeFuel - (((long)time) << 32)); // maskとか欲しいかな...

            for (Edge e : G[a]) {
                if( e.c > L ) continue;

                int b = e.a == a ? e.b : e.a;

                int nextTime;
                int nextFuel;
                if( e.c > fuel ) {
                    nextTime = time+1;
                    nextFuel = L - e.c;

                } else {
                    nextTime = time;
                    nextFuel = fuel - e.c;
                }

                long nextTimeFuel = ((long)nextTime << 32) | nextFuel;

                if( bests[b] > nextTimeFuel ) {
                    bests[b] = nextTimeFuel;
                    q.push(nextTimeFuel, b);
                }
            }
        }

        int[] times = new int[N];
        for (int i = 0; i < N; i++) {

            long bestTimeFuel = bests[i];
            if( bestTimeFuel == Long.MAX_VALUE ) {
                times[i] = -1;
            } else {
                int time = (int)(bestTimeFuel >> 32);
                times[i] = time;
            }
        }
        return times;
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

    public static class MinRadixHeap<A> {

        ArrayDeque<Pair<A>>[] v;
        int size;
        long last;

        public MinRadixHeap() {
            size = 0;
            last = 0;
            //noinspection unchecked
            v = new ArrayDeque[65];
            for (int i = 0; i < 65; i++) {
                v[i] = new ArrayDeque<>();
            }
        }

        public void push(long key, A value) {
            size++;
            v[index(key ^ last)].add(new Pair<>(key, value));
        }

        public Pair<A> poll() {
            if( isEmpty() ) throw new IllegalStateException("heap is empty");

            if( v[0].isEmpty() ) {
                int idx = 1;
                while(v[idx].isEmpty()) idx++;
                last = Collections.min(v[idx], Comparator.comparingLong(p -> p.key)).key;

                for (Pair<A> p : v[idx]) {
                    v[index(p.key ^ last)].addLast(p);
                }
                v[idx].clear();
            }
            --size;
            return  v[0].pollLast();
        }

        public boolean isEmpty() {
            return size == 0;
        }

        private int index(long a) {
            if( a == 0 ) {
                return 0;

            } else {
                return 64 - Long.numberOfLeadingZeros(a);
            }
        }

        public static class Pair<A> {
            final long key;
            final A value;

            public Pair(long key, A value) {
                this.key = key;
                this.value = value;
            }
        }
    }

    static class Edge {
        int a, b, c;

        public Edge(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    static class State implements Comparable<State> {
        int a, time, fuel;

        public State(int a, int time, int fuel) {
            this.a = a;
            this.time = time;
            this.fuel = fuel;
        }

        State set(int a, int time, int fuel) {
            this.a = a;
            this.time = time;
            this.fuel = fuel;
            return this;
        }

        @Override
        public int compareTo(State o) {
            if (time != o.time) {
                return Integer.compare(time, o.time);
            } else {
                return Integer.compare(o.fuel, fuel);
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
