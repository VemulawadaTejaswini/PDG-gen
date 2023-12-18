import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int Q = in.nextInt();
        Node[] e = new Node[n + 1];
        for (int i = 1; i < n; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (e[a] == null) e[a] = new Node();
            if (e[b] == null) e[b] = new Node();
            e[a].next.add(b);
            e[b].next.add(a);
        }
        int[] b = new int[n + 1];
        Arrays.fill(b, 0);
        for (int i = 0; i < Q; ++i) {
            int p = in.nextInt();
            int x = in.nextInt();
            b[p] += x;
        }
        int[] cnt = new int[n + 1];
        Arrays.fill(cnt, 0);
        boolean[] vis = new boolean[n + 1];
        Arrays.fill(vis, false);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        while (!queue.isEmpty()) {
            int p = queue.poll();
            vis[p] = true;
            if (b[p] > 0) {
                List<Integer> list = e[p].next;
                for (int i = list.size() - 1; i >= 0; --i) {
                    if (vis[list.get(i)]) continue;
                    b[list.get(i)] += b[p];
                    queue.offer(list.get(i));
                }
                cnt[p] += b[p];
            }
        }
        for (int i = 1; i <= n; ++i)
            System.out.print(cnt[i] + (i == n ? "\n" : " "));
    }

    static class Node {
        List<Integer> next = new ArrayList<>();
    }

    static class P {
        int first, second;

        public P(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
