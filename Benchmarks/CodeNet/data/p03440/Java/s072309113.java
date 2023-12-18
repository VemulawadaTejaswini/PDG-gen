import java.util.*;

public class Main {
    private class Data {
        int root, cost;

        public Data(int root, int cost) {
            this.root = root;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return root + ":" + cost;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        Data data[] = new Data[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            data[i] = new Data(i, a[i]);
        }
        for (int i = 0; i < m; i++) {
            link(sc.nextInt(), sc.nextInt(), data);
        }
        sc.close();

        long ans = 0;
        for (int i = 0; i < n; i++) {
            Data iRoot = root(i, data);
            for (int j = i + 1; j < n; j++) {
                Data jRoot = root(j, data);
                if (iRoot.root != jRoot.root) {
                    link(i, j, data);
                    ans += iRoot.cost + jRoot.cost;
                }
            }
        }

        System.out.println(ans);
    }

    private void link(int src, int dst, Data data[]) {
        Data srcRoot = root(src, data);
        Data dstRoot = root(dst, data);
        int minCost = Math.min(dstRoot.cost, data[src].cost);

        srcRoot.cost = minCost;
        data[dstRoot.root] = new Data(srcRoot.root, minCost);
    }

    private Data root(int n, Data data[]) {
        if (data[n].root == n) {
            return data[n];
        }

        return data[n] = root(data[n].root, data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }
}
