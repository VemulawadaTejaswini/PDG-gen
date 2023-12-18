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
            E[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        System.out.println( solve() );
    }

    private static String solve() {
        List<Edge>[] rin = new List[N+1];
        for (int i = 1; i <= N; i++) {
            rin[i] = new ArrayList<>();
        }

        for (Edge edge : E) {
            rin[edge.a].add( edge );
        }

        long[] cost = new long[N+1];
        Arrays.fill(cost, Long.MIN_VALUE);

        ArrayDeque<Node> q = new ArrayDeque<>();
        q.add(new Node(null, 1, 0));
        while( !q.isEmpty() ) {
            Node node = q.poll();

            for (Edge edge : rin[node.n]) {
                if( node.contains(edge.b) ) {
                    return "inf";
                }

                if( cost[edge.b] > node.cost + edge.b ) {
                    continue;
                }

                q.add( new Node(node, edge.b, node.cost + edge.c) );
                cost[edge.b] = node.cost + edge.c;
            }
        }

        return "" + cost[N];
    }

    static class Node {
        private Node prev;
        private int n;
        private long cost;

        public Node(Node prev, int n, long cost) {
            this.prev = prev;
            this.n = n;
            this.cost = cost;
        }

        public boolean contains(int arg) {
            if( n == arg ) return true;

            Node pre = prev;
            if( pre != null ) {
                if( pre.n == arg ) {
                    return true;
                }
                prev = pre.prev;
            }
            return false;
        }
    }

    static class Edge {
        private int a;
        private int b;
        private int c;

        public Edge(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
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

