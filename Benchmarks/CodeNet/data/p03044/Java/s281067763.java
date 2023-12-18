import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static class Edge {
        int u;
        int v;
        int w;

        public Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;

        }
    }

    public static void main(String[] args) {

        int N;
        int K;
        Edge[] edgelist;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            edgelist = new Edge[N - 1];
            for (int i = 0; i < N - 1; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                if (u > v) {
                    int temp = u;
                    u = v;
                    v = temp;
                }
                edgelist[i] = new Edge(u, v, w);
            }
        }

        boolean[][] color = new boolean[N][2];

        PriorityQueue<Edge> que = new PriorityQueue<Main.Edge>(1, (e1, e2) -> e1.u - e2.u);
        for (Edge e : edgelist) {
            que.add(e);
        }
        Edge target;
        while ((target = que.poll()) != null) {
            if (color[target.v - 1][1] == true) {
                if (target.w % 2 != 0) {
                    color[target.u - 1][0] = !color[target.v - 1][0];
                } else {
                    color[target.u - 1][0] = color[target.v - 1][0];
                }
            } else {
                if (target.w % 2 != 0) {
                    color[target.v - 1][0] = !color[target.u - 1][0];
                } else {
                    color[target.v - 1][0] = color[target.u - 1][0];
                }
            }
            color[target.v - 1][1] = true;
            color[target.u - 1][1] = true;

        }

        for (boolean[] b : color) {
            System.out.println(b[0] ? "0" : "1");
        }

    }

}
