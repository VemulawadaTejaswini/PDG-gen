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

    static State[] bests;
    static PriorityQueue<State> q = new PriorityQueue<>();
    static State[] buffers;

    static int[] calcTimes(int start, Edge[][] G) {
        if( bests != null ) {
            Arrays.fill(bests, null);
        } else {
            bests = new State[N];
        }
        if( buffers == null ) {
            buffers = new State[M + 100]; // どれくらいあればよいのかわかってない...
            for (int i = 0; i < buffers.length; i++) {
                buffers[i] = new State(-1, -1, -1);
            }
        }

        int bufferIdx = 0;
        // timeが少ないほうが偉い -> fuelが残っている方が偉い
        bests[start] = buffers[bufferIdx++].set(start, 0, L);
        q.add( bests[start] );

        while(!q.isEmpty()) {
            State s = q.poll();
            if( bests[s.a].compareTo(s) != 0 ) continue;

            for (Edge e : G[s.a]) {
                if( e.c > L ) continue;

                int b = e.a == s.a ? e.b : e.a;

                int nextTime;
                int nextFuel;
                if( e.c > s.fuel ) {
                    nextTime = s.time+1;
                    nextFuel = L - e.c;

                } else {
                    nextTime = s.time;
                    nextFuel = s.fuel - e.c;
                }

                if( bests[b] == null || bests[b].time > nextTime || bests[b].time == nextTime && bests[b].fuel < nextFuel ) {
                    State next = buffers[bufferIdx++].set(b, nextTime, nextFuel);
                    bests[b] = next;
                    q.add( next );
                }
            }
        }

        int[] times = new int[N];
        for (int i = 0; i < N; i++) {
            times[i] = bests[i] != null ? bests[i].time : -1;
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
