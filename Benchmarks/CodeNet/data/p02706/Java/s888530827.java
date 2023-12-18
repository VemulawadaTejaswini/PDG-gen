import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Tree {
        int root;
        int vertices;
        ArrayList<ArrayList<Edge>> al;

        public Tree(int vertices, int root) {
            this.root = root;
            this.vertices = vertices;
            al = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                al.add(new ArrayList<Edge>());
            }
        }

        public static void addEdgeUndirected(ArrayList<ArrayList<Edge>> al, int source, int destination, int weight) {
            al.get(source).add(new Edge(source, destination, weight));
            al.get(destination).add(new Edge(destination, source, weight));
        }

        public static void addEdgeDirected(ArrayList<ArrayList<Edge>> al, int source, int destination, int weight) {
            // this function adds an edge from vertex u to vertex v in directed graph
            al.get(source).add(new Edge(source, destination, weight));
        }

        public static void bfs(ArrayList<ArrayList<Edge>> al, int v, int root) {
            //here root means the starting vertex for bfs
            boolean[] visited = new boolean[v];
            Queue<Integer> q = new LinkedList<>();
            visited[root] = true;
            q.add(root);
            while (!q.isEmpty()) {
                int u = q.poll();
                System.out.print(u + " ");
                for (int i = 0; i < al.get(u).size(); i++) {
                    if (!visited[al.get(u).get(i).destination]) {
                        visited[al.get(u).get(i).destination] = true;
                        q.add(al.get(u).get(i).destination);
                    }
                }
            }
        }
        public static void recursiveDFS(ArrayList<ArrayList<Edge>> al, int root, boolean[] visited) {
            visited[root] = true;
            System.out.print(root + " ");
            for (int i = 0; i < al.get(root).size(); i++) {
                if (!visited[al.get(root).get(i).destination]) {
                    visited[al.get(root).get(i).destination] = true;
                    recursiveDFS(al, al.get(root).get(i).destination, visited);
                }
            }
        }

        public static void dfs(ArrayList<ArrayList<Edge>> al, int v, int root) {
            boolean[] visited = new boolean[v];
            recursiveDFS(al, root, visited);
        }
    }

    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        int n = r.nextInt();
        int m = r.nextInt();
        int sum = 0;
        for(int i=0;i<m;i++) sum += r.nextInt();
        if((n-sum)>=0) System.out.println(n-sum);
        else System.out.println(-1);
    }
}
