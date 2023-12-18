import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    static final int MX = 100_000;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int edge[][] = new int[m][2];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            edge[i][0] = a;
            edge[i][1] = b;
        }

        int notBridge = 0;
        for (int i = 0; i < m; i++) {
            P p[] = new P[n];
            for (int j = 0; j < n; j++) {
                p[j] = new P(j);
            }

            for (int j = 0; j < m; j++) {
                if (i == j) continue;
                p[edge[j][0]].adj.add(p[edge[j][1]]);
                p[edge[j][1]].adj.add(p[edge[j][0]]);
            }

            boolean reach[] = new boolean[n];
            Arrays.fill(reach, false);
            Queue<P> q = new LinkedBlockingDeque<>();
            q.add(p[0]);
            while (q.size() > 0) {
                P next = q.poll();
                if (reach[next.n] == true) {
                    continue;
                }
                reach[next.n] = true;
                for (P p2 : next.adj) {
                    q.add(p2);
                }
            }
            reach[0] = true;

            int total = 0;
            for (int j = 0; j < n; j++) {
                if (reach[j] == false) {
                    break;
                }
                total++;
            }
            if (total == n) {
                notBridge++;
            }
        }
        System.out.println(m - notBridge);
    }
}

class P {
    int n;
    List<P> adj = new ArrayList<P>();
    public P(int n)  {
        this.n = n;
    }
}