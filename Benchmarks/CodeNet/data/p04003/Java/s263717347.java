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

    static class Route {
        long from;
        long to;
        int cost;

        public Route(long from, long to, int cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }
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
        long key;
        int cost;

        public State(long key, int cost) {
            this.key = key;
            this.cost = cost;
        }

        @Override
        public int compareTo(State o) {
            return Integer.compare(cost, o.cost);
        }
    }

    static int solve() {
        if( M == 0 ) return -1;

        Map<Long, List<Route>> rin = new HashMap<>();
        Map<Integer, Set<Integer>> rin2 = new HashMap<>(); // 駅に乗り入れている会社
        for (Edge e : E) {
            long pc = placeCompanyKey(e.p, e.c);
            long qc = placeCompanyKey(e.q, e.c);
            addRoute(rin, pc, qc, 0);
            addRoute(rin, qc, pc, 0);

            addCompany(rin2, e.p, e.c);
            addCompany(rin2, e.q, e.c);
        }

        PriorityQueue<State> q = new PriorityQueue<>();
        Map<Long, Integer> costs = new HashMap<>(M);
        long start = placeCompanyKey(0, 0);
        q.add( new State(start, 0) );
        costs.put(start, 0);

        while(!q.isEmpty()) {
            State s = q.poll();
            if( s.cost != costs.get(s.key) ) continue;

            // 連結ではない可能性がある
            for (Route r : rin.getOrDefault(s.key, Collections.emptyList())) {
                long next = r.to;
                int nextCost = s.cost + r.cost;
                if (!costs.containsKey(next) || costs.get(next) > nextCost) {
                    costs.put(next, nextCost);
                    q.add(new State(next, nextCost));
                }
            }

            int sp = extractPlace(s.key);
            int sc = extractCompany(s.key);
            if( sc != 0 ) {
                long next = placeCompanyKey(sp, 0);
                int nextCost = s.cost;
                if( !costs.containsKey(next) || costs.get(next) > nextCost ) {
                    costs.put(next, nextCost);
                    q.add( new State(next, nextCost));
                }
            } else {
                for (int company : rin2.getOrDefault(sp, Collections.emptySet())) {
                    // 0 -> company
                    long next = placeCompanyKey(sp, company);
                    int nextCost = s.cost + 1;
                    if( !costs.containsKey(next) || costs.get(next) > nextCost ) {
                        costs.put(next, nextCost);
                        q.add( new State(next, nextCost));
                    }
                }
            }
        }

        long last = placeCompanyKey(N-1, 0);
        return costs.getOrDefault(last, -1);
    }

    static void addCompany(Map<Integer, Set<Integer>> rin2, int p, int c) {
        if( !rin2.containsKey(p) ) {
            rin2.put(p, new HashSet<>());
        }
        rin2.get(p).add(c);
    }

    static void addRoute(Map<Long, List<Route>> rin, long from, long to, int cost) {
        if( !rin.containsKey(from) ) {
            rin.put(from, new ArrayList<>());
        }
        rin.get(from).add( new Route(from, to, cost));
    }

    static int INF = 1_000_000_000;

    static long placeCompanyKey(int p, int company) {
        return (long)p * INF + company;
    }

    static int extractPlace(long key) {
        return (int)(key / INF);
    }

    static int extractCompany(long key) {
        return (int)(key % INF);
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
