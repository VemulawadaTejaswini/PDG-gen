import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int N;
    private static Edge[] E;
    private static int K;
    private static Query[] Q;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        E = new Edge[N-1];
        for (int i = 0; i < N-1; i++) {
            E[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        int q = sc.nextInt();
        K = sc.nextInt();
        Q = new Query[q];
        for (int i = 0; i < q; i++) {
            Q[i] = new Query(sc.nextInt(), sc.nextInt());
        }

        for (long ans : solve()) {
            System.out.println( ans );
        }
    }

    private static long[] solve() {
        List[] nodeEdges = new List[N+1];
        for (int i = 0; i < N+1; i++) {
            nodeEdges[i] = new ArrayList();
        }

        for (Edge edge : E) {
            nodeEdges[edge.a].add( edge );
            nodeEdges[edge.b].add( edge );
        }

        long[] fromK = caclFromK(nodeEdges);

        long[] ans = new long[Q.length];
        for (int i = 0; i < Q.length; i++) {
            Query q = Q[i];
            ans[i] = fromK[q.x] + fromK[q.y];
        }
        return ans;
    }

    private static long[] caclFromK(List[] nodeEdges) {
        long[] fromK = new long[N+1];
        boolean[] done = new boolean[N+1];
        dfs(K, 0, fromK, done, nodeEdges);
        return fromK;
    }

    private static void dfs(int node, long cost, long[] fromK, boolean[] done, List[] nodeEdges) {
        fromK[node] = cost;
        done[node] = true;
        for (Object o : nodeEdges[node]) {
            Edge edge = (Edge) o;
            int next = edge.next(node);
            if( !done[next] ) {
                dfs(next, cost + edge.c, fromK, done, nodeEdges);
            }
        }
    }

    private static class Edge {
        private final int a;
        private final int b;
        private final int c;

        public Edge(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int next(int from) {
            if(from == a ) return b;
            else if( from == b ) return a;
            else throw new IllegalArgumentException("wtf");
        }
    }

    private static class Query {
        private final int x;
        private final int y;

        public Query(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}