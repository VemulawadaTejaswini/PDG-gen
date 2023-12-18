import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.solve();
    }
    public void solve() throws Exception {
        FastScan scan = new FastScan(System.in);
        int N = scan.scanInt();
        List<Edge>[] graph = new List[N+1];
        Node[] nodes = new Node[N+1];
        Edge[] edges = new Edge[N-1];
        for (int i = 1; i <= N; i++) {
            nodes[i] = new Node(i);
            graph[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < N-1; i++){
            Edge edge = new Edge(i, scan.scanInt(), scan.scanInt());
            edges[i] = edge;
            graph[edge.from].add(edge);
            graph[edge.to].add(edge);
        }
        Node top = null;
        int max = 0;
        for (int i = 1; i <= N; i++) {
            Node node = nodes[i];
            int d = graph[i].size();
            if (max < d) {
                top = node;
                max = d;
            }
        }
        int K = max;
        bfs(nodes, graph, K, top);
        System.out.println(K);
        for (int i = 0; i < N-1; i++) {
            System.out.println(edges[i].color);
        }
    }
    void bfs(Node[] nodes, List<Edge>[] graph, int K, Node root) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        while(!deque.isEmpty()) {
            Node node = deque.poll();
            if (node.visited) {
                continue;
            }
            node.visited = true;
            List<Edge> list = graph[node.no];
            HashSet<Integer> used = new HashSet<>();
            for (int i = 0; i < list.size(); i++) {
                Edge edge = list.get(i);
                if (0 < edge.color) {
                    used.add(edge.color);
                }
            }
            int color = 1;
            for (int i = 0; i < list.size(); i++) {
                Edge edge = list.get(i);
                if (0 < edge.color) {
                    continue;
                }
                while (used.contains(color)) {
                    color += 1;
                }
                if (edge.color < 1) {
                    edge.color = color;
                    color += 1;
                }
                if (edge.from != node.no) {
                    Node next = nodes[edge.from];
                    if (!next.visited) {
                        deque.add(next);
                    }
                }
                if (edge.to != node.no) {
                    Node next = nodes[edge.to];
                    if (!next.visited) {
                        deque.add(next);
                    }
                }
            }
        }

    }
    class Node {
        int no;
        boolean visited = false;
        Node(int no) {
            this.no = no;
        }
    }
    class Edge {
        int id;
        int from;
        int to;
        int color;
        Edge(int id, int from, int to) {
            this.id = id;
            this.from = from;
            this.to = to;
            this.color = -1;
        }
    }
    class FastScan {
        BufferedReader br;
        StringTokenizer st;
        FastScan(InputStream is) {
            InputStreamReader isr = new InputStreamReader(is);
            this.br = new BufferedReader(isr);
        }
        String next() throws IOException {
            while (this.st == null || !this.st.hasMoreTokens()) {
                this.st = new StringTokenizer(br.readLine().trim());
            }
            return st.nextToken();
        }
        long scanLong() throws IOException {
            return Long.parseLong(this.next());
        }
        int scanInt() throws IOException {
            return Integer.parseInt(this.next());
        }
        double scanDouble() throws IOException {
            return Double.parseDouble(this.next());
        }
        char scanCharacter() throws IOException {
            return this.next().charAt(0);
        }
        String nextLine() throws IOException {
            return br.readLine().trim();
        }
    }
}
