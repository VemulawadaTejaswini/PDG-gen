import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println( solve() );
    }

    private static long solve() {
        Graph g = build(0, N);
        g.calcCount();
        long sum = 0;

        while(!g.isEmpty()) {
            sum += g.count;
            g.removeFirst();
        }
        return sum;
    }

    static Graph build(int start, int end) {
        List<Node> nodes = new ArrayList<>();
        Node node = new Node(A[start]);
        nodes.add(node);
        int prev = start;
        for (int i = start + 1; i < end; i++) {
            if( node.n < A[i] ) continue;

            if( i - prev > 1 ) {
                node.sub = build(prev+1, i);
            }

            Node next = new Node(A[i]);
            nodes.add(next);
            prev = i;
            node = next;
        }
        if( prev != end-1 ) {
            node.sub = build(prev+1, end);
        }

        return new Graph(nodes);
    }

    static class Graph {
        List<Node> nodes;
        long count = 0;

        public Graph(List<Node> nodes) {
            this.nodes = nodes;
        }

        public String toString() {
            return nodes.toString();
        }

        public boolean isEmpty() {
            return nodes.isEmpty();
        }

        public void removeFirst() {
            Node first = nodes.remove(0);
            count -= first.count;

            if( first.sub != null ) {
                // addFirstAll みたいなのがあるといいんだけどね
                int len = first.sub.nodes.size();
                for (int i = 0; i < len; i++) {
                    Node n = first.sub.nodes.get(i);
                    nodes.add(i, n);
                    count += n.count;
                }
            }
        }

        public void calcCount() {
            long sum = 0;
            for (Node node : nodes) {
                node.calcCount();
                sum += node.count;
            }
            count = sum;
        }

        public int size() {
            int sum = 0;
            for (Node node : nodes) {
                sum += node.size();
            }
            return sum;
        }
    }

    static class Node {
        int n;
        Graph sub;
        int count;

        public Node(int n) {
            this.n = n;
        }

        @Override
        public String toString() {
            if( sub != null ) {
                return "Node(" + n + ", " + sub + ")";
            } else {
                return "Node(" + n + ")";
            }
        }

        public void calcCount() {
            count = sub != null ? n * (sub.size()+1) : n;
            if( sub != null ) sub.calcCount();
        }

        public int size() {
            return sub != null ? 1 + sub.size() : 1;
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
