import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Graph {
    int N;
    int edges[][];
    ArrayList<Integer>[] outEdges;
    static int INF = 100000;

    Graph(int N) {
        this.N = N;

        edges = new int[N][N];
        outEdges = new ArrayList[N];
        for (int i=0;i<N;i++) {
            outEdges[i] = new ArrayList<Integer>();
            for (int j=0;j<N;j++) {
                edges[i][j] = 0;
            }
        }
    }

    void addEdge(int s, int t, int w) {
//        System.out.printf("Add: %d -> %d (%d)\n", s, t, w);
        outEdges[s].add(t);
        edges[s][t] = w;
    }

    public int getNodeNum() {  return N; }
    public ArrayList<Integer> getOutEdges(int node) {
        return outEdges[node];
    }

    public int getEdge(int s, int t) {
        return edges[s][t];
    }
}

class MaxFlow {
    public int sink, source;
    public double maxFlow;
    public List<UnblockedPath> paths = new LinkedList<>();

    public MaxFlow(int s, int t) {
        source = s;
        sink = t;
    }

    static class UnblockedPath {
        public boolean found = false;
        public int[] preNodes = null;
        public double flow = 0;
    }

    public static UnblockedPath findUnblockedPath(Graph g, int source, int sink) {
        UnblockedPath ubp = new UnblockedPath();

        ubp.preNodes = new int[g.getNodeNum()];
        ubp.preNodes[source] = -1;

        boolean[] visited = new boolean[g.getNodeNum()];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            visited[currentNode] = true;

            if (currentNode == sink) {
                ubp.found = true;
                break;
            }

            for (Integer nextNode : g.getOutEdges(currentNode)) {
                if (!visited[nextNode] && g.getEdge(currentNode, nextNode) > 0) {
                    ubp.preNodes[nextNode] = currentNode;
                    queue.offer(nextNode);
                }
            }
        }
        return ubp;
    }

    public static MaxFlow FordFulkerson(Graph g, int source, int sink) {
        MaxFlow mf = new MaxFlow(source, sink);
        int increment = Graph.INF;

        while (true) {
            UnblockedPath ubp = findUnblockedPath(g, source, sink);
            if (!ubp.found) {
                break;
            }

            int end = ubp.preNodes[source];

            int temp = sink;
            while (ubp.preNodes[temp] != end) {
                increment = Math.min(increment, g.getEdge(ubp.preNodes[temp], temp));
                temp = ubp.preNodes[temp];
            }
            ubp.flow = increment;
            mf.maxFlow += increment;
            mf.paths.add(ubp);

            temp = sink;
            while (ubp.preNodes[temp] != end) {
                g.addEdge(ubp.preNodes[temp], temp, g.getEdge(ubp.preNodes[temp], temp) - increment);
                g.addEdge(temp, ubp.preNodes[temp], g.getEdge(temp, ubp.preNodes[temp]) + increment);
                temp = ubp.preNodes[temp];
            }
        }

        return mf;
    }

    /**
     * 結果展示
     */
    public void analyse() {
        System.out.println("source  : " + source);
        System.out.println("sink    : " + sink);
        System.out.println("maxFlow : " + maxFlow);
        for (UnblockedPath ubp : paths) {
            int temp = sink;
            int end = ubp.preNodes[source];
            System.out.print(ubp.flow + "\t: ");
            while (ubp.preNodes[temp] != end) {
                System.out.print(temp + " => ");
                temp = ubp.preNodes[temp];
            }
            System.out.println(source);
        }
    }
}

public class Main {

    public static int[] solve(boolean CHECK_B[][], int N, int M, int A[]) {
//        System.out.println("---");
        int ret[] = new int[M];

        Graph g = new Graph(2*M+2);
        int start = 2 * M;
        int goal  = 2 * M + 1;

        for (int i=0;i<M;i++) {
            g.addEdge(start, i, 1);
        }
        for (int i=0;i<M;i++) {
            g.addEdge(M+i, goal, 1);
        }

        int default_edges[][] = new int[M][M];

        for (int i=0;i<M;i++) {
            int r = (A[i] - 1) / M;

            for (int j=0;j<M;j++) {
                if (CHECK_B[j][r]) continue;

//                System.out.printf("%d %d\n", i, j);
                g.addEdge(i, M+j, 1);

                default_edges[i][j] = 1;
            }
        }

        MaxFlow mf = MaxFlow.FordFulkerson(g, start, goal);
//        mf.analyse();

        for (int i=0;i<M;i++) {
            for (int j=0;j<M;j++) {
                int d = default_edges[i][j];
                int e = g.edges[i][j+M];

                if (d == 1 && e == 0) {
//                    System.out.printf("%d %d\n", i, j);
                    ret[j] = i;

                    int r = (A[i] - 1) / M;
                    CHECK_B[j][r] = true;
                    break;
                }
            }
        }

        return ret;
    }

    public static void main(String[] args){
//        int n = 10000;
//        ArrayList<Integer> a = new ArrayList<Integer>();
//
//        for (int i=0;i<n;i++) {
//            a.add(i+1);
//        }
//        Collections.shuffle(a);
//
//        System.out.printf("100 100\n");
//        for (int i=0;i<100;i++) {
//            for (int j=0;j<100;j++) {
//                System.out.printf("%d  ", a.get(i + j*100));
//            }
//            System.out.println();
//        }
//
//        if (true) return;

        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[][] = new int[N][M];

        for (int i=0;i<N;i++) {
            for (int j=0;j<M;j++) {
                A[i][j] = sc.nextInt();
            }
        }
//        System.out.println("A");

        boolean CHECK_B[][] = new boolean[M][N];
        int B[][] = new int[N][M];
        for (int i=0;i<N;i++) {
//            for (int j=0;j<N;j++) {
//                for (int k=0;k<M;k++) {
//                    System.out.printf("%d ", CHECK_B[k][j] ? 1 : 0);
//                }
//                System.out.println();
//            }

            int ret[] = solve(CHECK_B, N, M, A[i]);

            for (int j=0;j<M;j++) {
                B[i][j] = A[i][ret[j]];
            }
        }

        for (int i=0;i<N;i++) {
            for (int j=0;j<M;j++) {
                if (j != 0) System.out.print(" ");
                System.out.printf("%d", B[i][j]);
            }
            System.out.println();
        }


        int C[][] = new int[N][M];
        for (int j=0;j<M;j++) {
            ArrayList<Integer> c = new ArrayList<Integer>();
            for (int i=0;i<N;i++) {
                c.add(B[i][j]);
            }
            Collections.sort(c);

            for (int i=0;i<N;i++) {
                C[i][j] = c.get(i);
            }
        }

        for (int i=0;i<N;i++) {
            for (int j=0;j<M;j++) {
                if (j != 0) System.out.print(" ");
                System.out.printf("%d", C[i][j]);
            }
            System.out.println();
        }

        out.flush();
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }

        int[] nextIntArray(int N) {
            int a[] = new int[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextInt();
            }

            return a;
        }

        long[] nextLongArray(int N) {
            long a[] = new long[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextLong();
            }

            return a;
        }

        double[] nextDoubleArray(int N) {
            double a[] = new double[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextDouble();
            }

            return a;
        }

        String[] nextTokenArray(int N) {
            String a[] = new String[N];
            for (int i=0;i<N;i++) {
                a[i] = this.nextToken();
            }

            return a;
        }
    }
}