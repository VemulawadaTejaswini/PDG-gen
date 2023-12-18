import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        // n-1こ
        HashMap<Integer, UnionFind> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            map.put(i, new UnionFind(n+1));
        }
        for(int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map.get(x).unite(x, y);
        }
        // 0を除く
        long[] ans = new long[n+1];
        for(int i = 0; i < q; i++) {
            int nodeNum = sc.nextInt();
            int value = sc.nextInt();
            map.get(nodeNum).total += value;
        }
        for(int i = 1; i <= n; i++) {
            long t = map.get(i).total;
            int index = i - 1;
            while(index >= 1) {
                if (map.get(index).same(i, index)) {
                    t += map.get(index).total;
                    map.get(i).total = t;
                    break;
                }
                index--;
            }
            System.out.print(t + " ");
        }
    }


    public static class UnionFind {
        int[] parents, sizes;
        long total;

        UnionFind(int n) {
            parents = new int[n];
            sizes = new int[n];
            for(int i = 0; i < n; i++) {
                parents[i] = i;
                sizes[i] = 1;
            }
        }

        public int find(int x) {
            if (x == parents[x]) return x;
            return parents[x] = find(parents[x]);
        }

        public void unite(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) return;
            if (sizes[x] < sizes[y]) {
                int temp = x;
                x = y;
                y = temp;
            }
            parents[y] = x;
            sizes[x] += sizes[y];
        }

        public boolean same(int x, int y) {
            return find(x) == find(y);
        }

        public int size(int x) {
            return sizes[find(x)];
        }

    }
}
