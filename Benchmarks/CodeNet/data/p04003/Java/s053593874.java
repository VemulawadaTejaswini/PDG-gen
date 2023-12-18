import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static Edge[] E;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        E = new Edge[M];
        for (int i = 0; i < M; i++) {
            E[i] = new Edge(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt());
        }
        System.out.println(solve());
    }

    static class Edge {
        int p;
        int q;
        int c;

        public Edge(int p, int q, int c) {
            this.p = p;
            this.q = q;
            this.c = c;
        }

        public String toString() {
            return "Edge(" + p + "," + q + "," + c + ")";
        }
    }

    static class State implements Comparable<State> {
        int p;
        int cost;
        int company;

        public State(int p, int cost, int company) {
            this.p = p;
            this.cost = cost;
            this.company = company;
        }

        @Override
        public int compareTo(State o) {
            return Integer.compare(cost, o.cost);
        }
    }

    static int solve() {
        if( M == 0 ) return -1;

        List<Edge>[] rin = new List[N];
        for (Edge e : E) {
            if( rin[e.p] == null ) {
                rin[e.p] = new ArrayList<>();
            }
            rin[e.p].add( e );
            if( rin[e.q] == null ) {
                rin[e.q] = new ArrayList<>();
            }
            rin[e.q].add( e );
        }

        PriorityQueue<State> q = new PriorityQueue<>();
        int[] dist = new int[N];
        int INF = Integer.MAX_VALUE / 2;
        Arrays.fill(dist, INF);
        q.add( new State(0, 0, -1) );
        dist[0] = 0;

        while(!q.isEmpty()) {
            State s = q.poll();

            if( s.cost != dist[s.p] ) continue;

            for (Edge e : rin[s.p]) {
                int next = s.p == e.p ? e.q : e.p;
                int nextCost = s.cost + (s.company == e.c ? 0 : 1);
                if( dist[next] > nextCost ) {
                    dist[next] = nextCost;
                    q.add( new State(next, nextCost, e.c) );
                }
            }
        }

        if( dist[N-1] == INF ) {
            return -1;
        } else {
            return dist[N-1];
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

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }
}
