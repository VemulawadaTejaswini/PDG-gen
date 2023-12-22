import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge {
    int to;
    int cost;

    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}

class Pair implements Comparable<Pair> {
    int dist;
    int index;

    Pair(int dist, int index) {
        this.dist = dist;
        this.index = index;
    }

    public int compareTo(Pair p2) {
        return dist - p2.dist;
    }
}
 
public class Main {
    static final int INF = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        List<List<Edge>> g = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Edge> tmp = new ArrayList<>();
            g.add(tmp);
        }
        for(int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int k = sc.nextInt();
            for(int j = 0; j < k; j++) {
                int v = sc.nextInt();
                int c = sc.nextInt();
                g.get(u).add(new Edge(v, c));
            }
        }

        int[] d = new int[n];
        for(int i = 0; i < n; i++) {
            d[i] = INF;
        }
        d[0] = 0;

        PriorityQueue<Pair> que = new PriorityQueue<>();
        que.add(new Pair(0, 0));
        while(!que.isEmpty()) {
            Pair p = que.poll();
            int v = p.index;
            if(d[v] < p.dist) continue;

            for(int i = 0; i < g.get(v).size(); i++) {
                Edge e = g.get(v).get(i);
                if(d[e.to] > d[v] + e.cost) {
                    d[e.to] = d[v] + e.cost;
                    que.add(new Pair(d[e.to], e.to));
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.printf("%d %d\n", i, d[i]);
        }
 
        sc.close();
    }
}
