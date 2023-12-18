
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n, m;
    ArrayList<ArrayList<Edge>> es;
    long[] dist;
    private final long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        es = new ArrayList<>(n);
        for (int i = 0; i < n; i++) es.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            long c = sc.nextLong();
            es.get(a).add(new Edge(a, b, -c));
        }
    }

    private void solve() {
        boolean b = bellman();
        if (b)
            System.out.println(-dist[n-1]);
        else
            System.out.println("inf");
    }

    private boolean bellman() {
        dist = new long[n];
        Arrays.fill(dist, INF);
        dist[0] = 0;
        boolean[] flg = new boolean[n];
        flg[0] = true;
        boolean updflg = true;
        int cnt = 0;
        while (updflg) {
            updflg = false;
            for (ArrayList<Edge> ls: es) {
                for (Edge e: ls) {
                    if (flg[e.a] && dist[e.b] > dist[e.a] + e.c) {
                        dist[e.b] = dist[e.a] + e.c;
                        updflg = true;
                        flg[e.b] = true;
                    }
                }
            }
            cnt++;
            if (cnt > n) return false;
        }
        return true;
    }

    private class Edge {
        int a, b;
        long c;
        Edge (int a, int b, long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
