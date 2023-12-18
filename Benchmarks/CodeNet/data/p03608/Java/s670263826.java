import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DJoisinosTravel solver = new DJoisinosTravel();
        solver.solve(1, in, out);
        out.close();
    }

    static class DJoisinosTravel {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();
            int r = in.nextInt();
            Integer[] per = new Integer[r];
            Graph g = new Graph(n);
            for (int i = 0; i < r; i++)
                per[i] = in.nextInt() - 1;

            Arrays.sort(per);

            for (int i = 0; i < m; i++)
                g.addUnDirectedEdge(new Edge(in.nextInt() - 1, in.nextInt() - 1, in.nextInt()));

            long[][] d = g.warshallFloyd();
            NextPermutation<Integer> np = new NextPermutation<>();

            long min = Long.MAX_VALUE;

            while (true) {
                long cmp = 0;
                for (int i = 0; i < r - 1; i++)
                    cmp += d[per[i]][per[i + 1]];
                min = Math.min(min, cmp);
                if (np.nextPermutation(per) == null) break;
            }

            out.println(min);


        }

    }

    static class Edge {
        public int from;
        public int to;
        public long cost;

        public Edge(int to) {
            this.to = to;
        }

        public Edge(int to, long cost) {
            this.to = to;
            this.cost = cost;
        }

        public Edge(int from, int to, long cost) {
            this.from = from;
            this.to = to;
            this.cost = cost;
        }

        public Edge inv() {
            return new Edge(to, from, cost);
        }

        public String toString() {
            return "Edge{" +
                    "from=" + from +
                    ", to=" + to +
                    ", cost=" + cost +
                    '}';
        }

    }

    static class NextPermutation<T extends Comparable<T>> {
        public T[] nextPermutation(T[] array) {
            int k = -1;
            int i = array.length - 2;
            while (i >= 0) {
                if (array[i].compareTo(array[i + 1]) < 0) {
                    k = i;
                    break;
                }
                i--;
            }

            // 存在しない場合nullを返す
            if (k == -1) return null;
            int l = k + 1;
            i = array.length - 1;
            while (i > k + 1) {
                if (array[k].compareTo(array[i]) < 0) {
                    l = i;
                    break;
                }
                i--;
            }

            T tmp = array[k];
            array[k] = array[l];
            array[l] = tmp;
            int[] res = new int[array.length];
            // k+1 <-> n-1
            for (int j = k + 1; j < array.length + k - j; j++) {
                tmp = array[j];
                array[j] = array[array.length + k - j];
                array[array.length + k - j] = tmp;
            }
            return array;
        }

    }

    static class Graph {
        public int size;
        public ArrayList<Edge>[] adj;
        public int[] inDeg;
        public int[] vertexCost;

        public Graph(int size) {
            this.size = size;
            adj = new ArrayList[size];
            inDeg = new int[size];
            vertexCost = new int[size];
            for (int i = 0; i < size; i++) {
                adj[i] = new ArrayList<>();
            }
        }

        public void addEdge(Edge e) {
            adj[e.from].add(e);
            inDeg[e.to]++;
        }

        public void addUnDirectedEdge(Edge e) {
            addEdge(e);
            addEdge(e.inv());
        }

        public long[][] warshallFloyd() {
            long[][] dist = new long[size][size];
            for (int i = 0; i < size; i++) {
                Arrays.fill(dist[i], Long.MAX_VALUE / 3);
                dist[i][i] = 0;
            }

            for (ArrayList<Edge> ale : adj) {
                for (Edge e : ale) {
                    dist[e.from][e.to] = Math.min(e.cost, dist[e.from][e.to]);
                }
            }

            for (int k = 0; k < size; k++) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        dist[i][j] = Math.min(dist[i][k] + dist[k][j], dist[i][j]);
                    }
                }
            }

            return dist;
        }

    }
}

