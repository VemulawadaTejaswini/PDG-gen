import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Q = in.nextInt();
        Node[] e = new Node[n + 1];
        for (int i = 1; i <= n; ++i) e[i] = new Node();
        for (int i = 1; i < n; ++i) {
            int a = in.nextInt();
            int c = in.nextInt();
            e[a].next.add(c);
        }
        long[] b = new long[n + 1];
        Arrays.fill(b, 0);
        for (int i = 0; i < Q; ++i) {
            int p = in.nextInt();
            int x = in.nextInt();
            b[p] += x;
        }
        long[] cnt = new long[n + 1];
        Arrays.fill(cnt, 0);
        boolean[] vis = new boolean[n + 1];
        Arrays.fill(vis, false);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            vis[u] = true;
            if (b[u] > 0) {
                List<Integer> list = e[u].next;
                for (int v : list) {
                    if (vis[v]) continue;
                    b[v] += b[u];
                    queue.offer(v);
                }
                cnt[u] += b[u];
                b[u] = 0;
            }
        }
        for (int i = 1; i <= n; ++i)
            System.out.print(cnt[i] + (i == n ? "\n" : " "));
    }

    static class Node {
        List<Integer> next = new ArrayList<>();
    }
}
