import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDoubleDots solver = new DDoubleDots();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDoubleDots {
        private static final int INF = 1 << 30;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int ans = 0;

            List<Integer> g[] = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int a = Integer.parseInt(in.next()) - 1;
                int b = Integer.parseInt(in.next()) - 1;
                g[a].add(b);
                g[b].add(a);
            }
            int[] dist = new int[n];
            Arrays.fill(dist, INF);
            int[] before = new int[n];
            Arrays.fill(before, -1);

            Deque<Integer> q = new ArrayDeque<>();
            q.add(0);
            dist[0] = 0;
            while (!q.isEmpty()) {
                int now = q.poll();
                for (int to : g[now]) {
                    if (dist[to] != INF) continue;
                    dist[to] = dist[now] + 1;
                    before[to] = now;
                    q.add(to);
                }
            }
            for (int i = 1; i < n; i++) {
                if (before[i] == -1) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
            for (int i = 1; i < n; i++) {
                out.println(before[i] + 1);
            }
        }

    }
}

