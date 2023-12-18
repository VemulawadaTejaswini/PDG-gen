import java.io.*;
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
        Map<Long, Integer> compDists = new HashMap<>();
        int INF = Integer.MAX_VALUE / 2;
        Arrays.fill(dist, INF);
        q.add( new State(0, 0, -1) );
        dist[0] = 0;

        while(!q.isEmpty()) {
            State s = q.poll();

            if( s.cost != dist[s.p] ) continue;

            // 連結ではない可能性がある
            if( rin[s.p] == null ) continue;

            for (Edge e : rin[s.p]) {
                int next = s.p == e.p ? e.q : e.p;
                int nextDist = s.cost + (s.company == e.c ? 0 : 1);
                int nextCompany = e.c;

                if( dist[next] > nextDist ) {
                    dist[next] = nextDist;
                    compDists.put(compDistKey(next, nextCompany), nextDist);
                    q.add( new State(next, nextDist, e.c) );

                } else if( dist[next] == nextDist ) {
                    long key = compDistKey(next, nextCompany);
                    Integer compDist = compDists.get(key);

                    if( compDist == null || compDist > nextDist ) {
                        // dist[next] = nextDist;
                        compDists.put(compDistKey(next, nextCompany), nextDist);
                        q.add( new State(next, nextDist, e.c) );
                    }
                }
            }
        }

        if( dist[N-1] == INF ) {
            return -1;
        } else {
            return dist[N-1];
        }
    }

    static long compDistKey(int p, int company) {
        return p * Integer.MAX_VALUE / 2 + company;
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
