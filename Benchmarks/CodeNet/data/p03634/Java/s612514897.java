import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static Map<Integer, Long> map = new HashMap<>();

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        Graph g = new Graph(n + 1);
        while (n > 1) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            g.addEdge(a, b, c);
            n--;
        }
        int q = in.nextInt();
        int k = in.nextInt();
        map.put(k, 0L);
        g.BFS(k);
        while (q > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(map.get(x) + map.get(y));
            q--;
        }
    }

    static class Edge {
        int to;
        int val;

        public Edge(int to, int val) {
            this.to = to;
            this.val = val;
        }
    }

    static class Graph {
        private int V;   // No. of vertices
        private LinkedList<Edge> adj[]; //Adjacency Lists

        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int v, int w, int c) {
            adj[v].add(new Edge(w, c));
            adj[w].add(new Edge(v, c));
        }

        void BFS(int s) {
            boolean visited[] = new boolean[V];
            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[s] = true;
            queue.add(s);
            while (queue.size() != 0) {
                s = queue.poll();
                Iterator<Edge> i = adj[s].listIterator();
                while (i.hasNext()) {
                    Edge e = i.next();
                    int n = e.to;
                    if (!visited[n]) {
                        map.put(n, map.get(s) + e.val);
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
