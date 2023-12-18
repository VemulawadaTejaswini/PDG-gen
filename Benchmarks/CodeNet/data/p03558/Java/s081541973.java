import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int K;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        K = sc.nextInt();
        System.out.println( solve() );
    }

    private static int solve() {
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            edges.add( new Edge(i, (i+1)%K, 1) );
            edges.add( new Edge(i, (i*10)%K, 0) );
        }
        List<Edge>[] adjs = calcAdjList(K, edges);

        int[] distance = new int[K];
        Arrays.fill(distance, Integer.MAX_VALUE);
        // distance[1] = 0;

        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add( new Node(1, 0) );

        while( !q.isEmpty() ) {
            Node node = q.poll();
            if( distance[node.node] <= node.cost ) {
                continue;
            }

            distance[node.node] = node.cost;

            for (Edge edge : adjs[node.node]) {
                int to = edge.b;
                q.add( new Node(to, node.cost + edge.cost) );
            }
        }
        return distance[0] + 1;
    }

    static List<Edge>[] calcAdjList(int n, List<Edge> edges) {
        @SuppressWarnings("unchecked")
        List<Edge>[] array = new List[n];
        for (int i = 0; i < n; i++) {
            array[i] = new ArrayList<>();
        }
        edges.forEach( e -> {
            array[e.a].add(e);
        });
        return array;
    }

    static class Node implements Comparable<Node> {
        private final int node;
        private final int cost;

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(cost, o.cost);
        }
    }

    static class Edge {
        final int a;
        final int b;
        final int cost;

        public Edge(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }

        public String toString() {
            return "Edge(" + a + "," + b + "," + cost + ")";
        }
    }

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

        double nextDouble() {
            return Double.parseDouble(next());
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
