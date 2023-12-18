import java.util.*;

public class Main {
    private static final int INF = Integer.MAX_VALUE;
    int a[], data[];

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        a = new int[n];
        data = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            data[i] = i;
        }
        for (int i = 0; i < m; i++) {
            link(sc.nextInt(), sc.nextInt());
        }
        sc.close();

        if (n - 1 == m) {
            System.out.println(0);
            return;
        } else if (n < 2 * (n - m - 1)) {
            System.out.println("Impossible");
            return;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = root(i);
            map.put(root, Math.min(map.getOrDefault(root, INF), a[i]));
        }

        long ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans += entry.getValue();
            a[entry.getKey()] = INF;
        }

        int cnt = 2 * (n - m - 1) - map.size();
        Arrays.sort(a);
        for (int i = 0; i < cnt; i++) {
            ans += a[i];
        }

        System.out.println(ans);
    }

    private void link(int src, int dst) {
        int srcRoot = root(src);
        int dstRoot = root(dst);

        if (a[srcRoot] > a[dstRoot]) {
            data[srcRoot] = dstRoot;
        } else {
            data[dstRoot] = srcRoot;
        }
    }

    private int root(int n) {
        if (data[n] == n) {
            return n;
        }

        int root = root(data[n]);
        if (a[n] > a[root]) {
            data[n] = root;
            return root;
        } else {
            data[root] = n;
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
