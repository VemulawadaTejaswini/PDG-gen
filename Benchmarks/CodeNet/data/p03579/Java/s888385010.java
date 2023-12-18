import java.util.*;

public class Main {
    int n, m;
    ArrayList<ArrayList<Integer>> es;
    ArrayList<HashSet<Integer>> es2;
    Queue<Tuple> queue;

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
        es2 = new ArrayList<>(n);
        queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            es.add(new ArrayList<>());
            es2.add(new HashSet<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            es.get(a).add(b);
            es.get(b).add(a);
        }
    }

    private void solve() {
        makeQueue();
        long ans = 0L;
        while (!queue.isEmpty()) {
            Tuple t = queue.poll();
            if (t.snd == t.fst)
                break;
            if (es.get(t.fst).contains(t.snd))
                continue;
            ans++;
////            System.out.printf("%d, %d\n", t.fst+1, t.snd+1);
            es.get(t.fst).add(t.snd);
            es.get(t.snd).add(t.fst);
            for (int i: es2.get(t.fst)) {
                queue.add(new Tuple(i, t.snd));
            }
            for (int i: es2.get(t.snd)) {
                queue.add(new Tuple(i, t.fst));
            }
        }
        if (queue.size() != 0)
            System.out.println((n * (n - 1)) / 2 - m);
        else
            System.out.println(ans);
    }

    private void makeQueue() {
        for (int i = 0; i < n; i++) {
            dfs(i, 0, i);
        }
    }

    private void dfs(int root, int depth, int current) {
        if (depth > 3)
            return;
        if (depth == 2) {
            es2.get(root).add(current);
        }
        if (depth == 3) {
            queue.add(new Tuple(root, current));
        }
        for (int nxt: es.get(current)) {
            dfs(root, depth+1, nxt);
        }
    }

    private class Tuple {
        int fst, snd;
        Tuple(int x, int y) {
            fst = x;
            snd = y;
        }
    }
}
