import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N, M, S, T;
    static Edge[] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        S = sc.nextInt()-1;
        T = sc.nextInt()-1;
        E = new Edge[M];
        for (int i = 0; i < M; i++) {
            E[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt());
        }

        System.out.println(solve());
    }

    static class Edge {
        final int a, b, d;

        public Edge(int a, int b, int d) {
            this.a = a;
            this.b = b;
            this.d = d;
        }

        int opposite(int x) {
            return a == x ? b : a;
        }
    }

    static class State implements Comparable<State> {
        int a;
        int d;

        public State(int a, int d) {
            this.a = a;
            this.d = d;
        }

        @Override
        public int compareTo(State o) {
            return Integer.compare(d, o.d);
        }
    }

    static int MOD = 1_000_000_007;
    static long INF = Long.MAX_VALUE / 2;

    static long solve() {
        Edge[][] G = adjB(N, E);

        Result r = calc(G);
        int collision = countCollision(G, r.dist);
        // System.out.println("dist=" + r.dist + " time=" + r.time + " collision=" + collision);
        return ((long)r.time * r.time - collision + MOD) % MOD;
    }

    static class Result {
        long dist;
        int time;

        public Result(long dist, int time) {
            this.dist = dist;
            this.time = time;
        }
    }

    static Result calc(Edge[][] G) {
        long[] dist = new long[N];
        int[] time = new int[N];
        Arrays.fill(dist, INF);
        Arrays.fill(time, -1);

        PriorityQueue<State> q = new PriorityQueue<>();
        q.add(new State(S, 0));
        dist[S] = 0;
        time[S] = 1;

        while( !q.isEmpty() ) {
            State s = q.poll();
            if( dist[s.a] != s.d ) continue;

            for (Edge e : G[s.a]) {
                int next = e.opposite(s.a);
                int nd = s.d + e.d;
                if( dist[next] > nd ) {
                    dist[next] = nd;
                    time[next] = time[s.a];
                    q.add( new State(next, nd) );

                } else if( dist[next] == nd ) {
                    time[next] += time[s.a];
                    time[next] %= MOD;
                }
            }
        }
        return new Result(dist[T], time[T]);
    }

    static int countCollision(Edge[][] G, long st) {
        long[] dist = new long[N];
        int[] time = new int[N];
        int[] collision = new int[N];
        Arrays.fill(dist, INF);
        Arrays.fill(time, -1);

        PriorityQueue<State> q = new PriorityQueue<>();
        q.add(new State(S, 0));
        dist[S] = 0;
        time[S] = 1;
        collision[S] = 0;

        while( !q.isEmpty() ) {
            State s = q.poll();
            if( dist[s.a] != s.d ) continue;

            for (Edge e : G[s.a]) {
                int next = e.opposite(s.a);
                int nd = s.d + e.d;

                if( dist[next] > nd ) {
                    dist[next] = nd;
                    time[next] = time[s.a];
                    if( isCollision(dist[s.a], e, st) ) {
                        collision[next] = time[s.a];
                    } else {
                        collision[next] = collision[s.a];
                    }

                    q.add( new State(next, nd) );

                } else if( dist[next] == nd ) {
                    time[next] += time[s.a];
                    time[next] %= MOD;
                    if( isCollision(dist[s.a], e, st) ) {
                        collision[next] += (collision[s.a] + time[s.a]);
                        collision[next] %= MOD;
                    } else {
                        collision[next] += collision[s.a];
                        collision[next] %= MOD;
                    }
                }
            }
        }
        return collision[T];
    }

    // (dist[n.a], dist[n.a] + e.d]の間にcollisionするかどうか
    static boolean isCollision(long dist, Edge e, long st) {
        long tak_s = dist;
        long aok_s = (st - dist);
        // System.out.println("e.a=" + e.a + " e.b=" + e.b + " collision=" + (aok_s - tak_s <= e.d * 2 && tak_s < aok_s));
        return aok_s - tak_s <= e.d * 2 // (5, 10] [10, 15)
                && tak_s < aok_s; // (5, 10] [6, 11)
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
