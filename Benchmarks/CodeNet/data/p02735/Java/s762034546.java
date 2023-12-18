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
        char[][] mat  = new char[h][w];
        for(int i=0; i<h; i++) {
            mat[i] = br.readLine().toCharArray();
        }
        Graph g = new Graph(h*w, mat);
        for(int i=1; i<w; i++) {
            int left = getIndex(w, 0, i-1);
            int index = getIndex(w, 0, i);
            if(mat[0][i-1] == '.') {
                if(mat[0][i] == '.')
                    g.addEdge(left, index, 0);
                else
                    g.addEdge(left, index, 1);
            } else {
                if(i == 1)
                    g.addEdge(left, index, 1);
                else {
                    g.addEdge(left, index, 0);
                }
            }
        }
        for(int i=0; i<w; i++) {
            for(int j=1; j<h; j++) {
                if(i == 0) {
                    int index = getIndex(w, j, i);
                    int prev = getIndex(w, j-1, i);
                    //System.out.println(index +  " " + prev);
                    if(j == 1) {
                        if(mat[j-1][i] == '.') {
                            if(mat[j][i] == '.')
                                g.addEdge(prev, index, 0);
                            else
                                g.addEdge(prev, index, 1);
                        } else {
                            g.addEdge(prev, index, 1);
                        }
                    } else {
                        if (mat[j - 1][i] == '.') {
                            if (mat[j][i] == '.') {
                                g.addEdge(prev, index, 0);
                            } else {
                                g.addEdge(prev, index, 1);
                            }
                        } else {
                            g.addEdge(prev, index, 0);
                        }
                    }
                } else {
                    int up = getIndex(w, j-1, i);
                    int left = getIndex(w, j, i-1);
                    int index = getIndex(w, j, i);
                    if(mat[j][i-1] == '.') {
                        if(mat[j][i] == '.')
                            g.addEdge(left, index, 0);
                        else
                            g.addEdge(left, index, 1);
                    } else {
                        g.addEdge(left, index, 0);
                    }
                    if(j == 1) {
                        if(mat[j-1][i] == '.') {
                            if(mat[j][i] == '.')
                                g.addEdge(up, index, 0);
                            else
                                g.addEdge(up, index, 1);
                        } else {
                            g.addEdge(up, index, 1);
                        }
                    } else {
                        if (mat[j - 1][i] == '.') {
                            if (mat[j][i] == '.') {
                                g.addEdge(up, index, 0);
                            } else {
                                g.addEdge(up, index, 1);
                            }
                        } else {
                            g.addEdge(up, index, 0);
                        }
                    }
                }
            }
        }
        g.dijsktra(0);
        System.out.println(g.getAns());
        br.close();
    }

    private static int getIndex(int w, int i, int j) {
        return w*i + j;
    }

    static class Node implements Comparator<Node> {
        int s, e, cost;

        Node(int s, int e, int cost) {
            this.s = s;
            this.e = e;
            this.cost = cost;
        }

        Node() {}

        public int compare(Node a, Node b) {
            return a.cost - b.cost;
        }
    }

    static class Graph {
        int V;
        ArrayList<Node> list[];
        int dist[];
        char[][] mat;

        Graph(int v, char[][] mat) {
            V = v;
            list = new ArrayList[V];
            dist = new int[V];
            for(int i=0; i<V; i++) {
                list[i] = new ArrayList<>();
            }
            this.mat = mat;
        }

        void addEdge(int u, int v, int cost) {
            list[u].add(new Node(u, v, cost));
        }

        void dijsktra(int s) {
            boolean[] visited = new boolean[V];
            PriorityQueue<Node> pq = new PriorityQueue<>(V, new Node());
            pq.add(new Node(s, s, mat[0][0] == '.' ? 0 : 1));
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[s] = 0;
            while(!pq.isEmpty()) {
                Node u = pq.poll();
                if(visited[u.s])
                    continue;
                visited[u.s] = true;
                for(int i=0; i<list[u.s].size(); i++) {
                    Node v = list[u.s].get(i);
                    if(dist[v.e] > dist[u.s] + v.cost) {
                        dist[v.e] = dist[u.s] + v.cost;
                    }
                    if(!visited[v.e]) {
                        pq.add(new Node(v.e, v.e, dist[v.e]));
                    }
                }
            }
        }

        int getAns() {
            //for(int i=0; i<V; i++)
                //System.out.println(i + " = " + dist[i]);
            return dist[dist.length-1];
        }
    }
}
