import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.HashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Map;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DLine solver = new DLine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLine {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int x = s.nextInt() - 1;
            int y = s.nextInt() - 1;
            int[] ans = new int[n];
            DLine.Graph g = new DLine.Graph(n, false, false);
            for (int i = 0; i < n - 1; i++) {
                g.addEdge(i, i + 1, 1l);
            }

            g.addEdge(x, y, 1l);
//        out.println(g.neighbours);
            long[][] distance = new long[n][];
            for (int i = 0; i < n; i++) {
                distance[i] = g.dijkstra(i);
            }

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    ans[(int) distance[i][j]]++;
                }
            }

            out.println(DLine.arrays.printArr(ans));
//        out.println(Arrays.deepToString(distance));
        }

        private static class Graph {
            HashMap<Integer, HashMap<Integer, Long>> neighbours;
            int numVertices;
            boolean isDirected;
            boolean isWeighted;

            public Graph(int numVertices, boolean isDirected, boolean isWeighted) {
                neighbours = new HashMap<>();
                this.numVertices = numVertices;
                this.isDirected = isDirected;
                this.isWeighted = isWeighted;
            }

            private void addEdge(int src, int dest, long wt) {
                HashMap<Integer, Long> list = neighbours.getOrDefault(src, new HashMap<>());
                list.put(dest, wt);
                neighbours.put(src, list);
                if (!isDirected) {
                    list = neighbours.getOrDefault(dest, new HashMap<>());
                    list.put(src, wt);
                    neighbours.put(dest, list);
                }
            }

            public long[] dijkstra(int src) {

                long[] dist = new long[numVertices]; // The output array. dist[i] will hold
                // the shortest distance from src to i

                // sptSet[i] will true if vertex i is included in shortest
                // path tree or shortest distance from src to i is finalized
                HashSet<Integer> sptSet = new HashSet<>();
                TreeMap<Long, HashSet<Integer>> distance = new TreeMap<>();

                // Initialize all distances as INFINITE and stpSet[] as false
                Arrays.fill(dist, Long.MAX_VALUE);

                HashSet<Integer> set = new HashSet<>();
                for (int i = 0; i < numVertices; i++) {
                    if (i == src) {
                        continue;
                    }
                    set.add(i);
                }

                distance.put(Long.MAX_VALUE, set);
                HashSet<Integer> l = new HashSet<>();
                l.add(src);
                distance.put(0L, l);
                // Distance of source vertex from itself is always 0
                dist[src] = 0L;

                // Find shortest path for all vertices
                while (sptSet.size() < numVertices) {
                    // Pick the minimum distance vertex from the set of vertices
                    // not yet processed. u is always equal to src in first
                    // iteration.
                    long minD = distance.firstKey();

                    int u = distance.get(minD).iterator().next();
                    // Mark the picked vertex as processed
                    sptSet.add(u);

                    // Update dist value of the adjacent vertices of the
                    // picked vertex.
                    ArrayList<Integer> list1 = new ArrayList<>(neighbours.get(u).keySet());
                    for (int v : list1) {

                        // Update dist[v] only if is not in sptSet, there is an
                        // edge from u to v, and total weight of path from src to
                        // v through u is smaller than current value of dist[v]
                        long d = neighbours.get(u).get(v);
                        if (!sptSet.contains(v) &&
                                dist[u] != Long.MAX_VALUE && dist[u] + d < dist[v]) {
                            long currDis = dist[v];
                            HashSet<Integer> set1 = distance.get(currDis);
                            set1.remove(v);
                            if (set1.isEmpty()) {
                                distance.remove(currDis);
                            } else {
                                distance.put(currDis, set1);
                            }
                            dist[v] = dist[u] + d;

                            set1 = distance.getOrDefault(dist[v], new HashSet<>());
                            set1.add(v);
                            distance.put(dist[v], set1);
                        }
                    }

                    HashSet<Integer> set1 = distance.get(minD);
                    set1.remove(u);
                    if (set1.isEmpty()) {
                        distance.remove(minD);
                    } else {
                        distance.put(minD, set1);
                    }


                }

                // print the constructed distance array
                //            printSolution(dist, V);
                return dist;
            }

        }

        private static class arrays {
            static StringBuilder printArr(int[] arr) {
                StringBuilder ans = new StringBuilder();
                for (int i = 1; i < arr.length; i++) {
                    ans.append(arr[i] + " ");
                }
                return ans;
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

