import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        Pair[][] mat = new Pair[h][w];
        input = br.readLine().split(" ");
        int start = convert(Integer.parseInt(input[0])-1, Integer.parseInt(input[1])-1, h);
        input = br.readLine().split(" ");
        int end = convert(Integer.parseInt(input[0])-1, Integer.parseInt(input[1])-1, h);
        for(int i=0; i<h; i++) {
            String s = br.readLine();
            for(int j=0; j<w; j++)
                mat[i][j] = new Pair(convert(i, j, h), s.charAt(j));
        }
        Graph g = new Graph((h+1) * (w+1) + 1);
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(mat[i][j].c != '#') {
                    ArrayList<Node> connects = getConnects(i, j, h, w, mat);
                    int val = convert(i, j, h);
                    for (Node node : connects) {
                        g.addEdge(val, node.node, node.cost);
                    }
                }
            }
        }
        System.out.println(g.find(start, end));
        br.close();
    }

    static ArrayList<Node> getConnects(int i, int j, int h, int w, Pair[][] mat) {
        ArrayList<Node> list = new ArrayList<>();
        int m = i - 2, n = j - 2;
        for(int k=m; k<m+5; k++) {
            for(int l=n; l<n+5; l++) {
                if(isValidIndex(k, l, h, w)) {
                    if(i == k && j == l)
                        continue;
                    if(mat[k][l].c != '#') {
                        int diff = Math.abs(i - k);
                        diff += Math.abs(j - l);
                        if(diff == 1)
                            list.add(new Node(convert(k, l, h), 0));
                        else
                            list.add(new Node(convert(k, l, h), 1));
                    }
                }
            }
        }
        return list;
    }

    static boolean isValidIndex(int i, int j, int h, int w) {
        if(i >= h || j >= w || i < 0 || j < 0)
            return false;
        return true;
    }

    static class Graph {
        int V;
        ArrayList<Node> list[];

        Graph(int v) {
            V = v;
            list = new ArrayList[V];
            for(int i=0; i<V; i++) {
                list[i] = new ArrayList<>();
            }
        }

        void addEdge(int u, int v, int cost) {
            list[u].add(new Node(v, cost));
        }

        int find(int start, int end) {
            int[] dist = new int[V];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[start] = 0;
            boolean[] visited = new boolean[V];
            dijkstra(start, dist, visited);
            return dist[end] == Integer.MAX_VALUE ? -1 : dist[end];
        }

        void dijkstra(int start, int[] dist, boolean[] visited) {
            PriorityQueue<Node> pq = new PriorityQueue<>(V, new Node());
            pq.add(new Node(start, 0));
            while(!pq.isEmpty()) {
                Node a = pq.poll();
                if(visited[a.node])
                    continue;
                visited[a.node] = true;
                for(int i=0; i<list[a.node].size(); i++) {
                    Node u = list[a.node].get(i);
                    if(dist[u.node] > dist[a.node] + u.cost) {
                        dist[u.node] = dist[a.node] + u.cost;
                    }
                    if(!visited[u.node]) {
                        pq.add(new Node(u.node, dist[u.node]));
                    }
                }
            }
        }
    }

    private static int convert(int i, int j, int h) {
        return h*i+j;
    }

    static class Node implements Comparator<Node> {
        int node, cost;

        Node() {}

        Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        public int compare(Node a, Node b) {
            return a.cost - b.cost;
        }
    }

    static class Pair {
        int i;
        char c;

        Pair() {}

        Pair(int i, char c) {
            this.i = i;
            this.c = c;
        }
    }
}