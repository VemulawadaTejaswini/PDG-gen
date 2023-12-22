

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static class UnionFind {
        private final int[] parent;
        private final int[] size;
        private int count;

        public UnionFind(int n) {
            parent = new int[n];
            size = new int[n];
            count = n;
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        public int find(int p) {
            // path compression
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public void union(int p, int q) {
            final int rootP = find(p);
            final int rootQ = find(q);
            if (rootP == rootQ) {
                return;
            }
            // union by size
            if (size[rootP] > size[rootQ]) {
                parent[rootQ] = rootP;
                size[rootP] += size[rootQ];
            } else {
                parent[rootP] = rootQ;
                size[rootQ] += size[rootP];
            }
            count--;
        }

        public int count() { return count; }

        public int[] size() { return size; }
    }

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final String[] line = in.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int[] p = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            uf.union(i, p[i] - 1);
        }
        long[] res = { (long) -1e9 };
        for (int i = 0; i < n; i++) {
            int currCycle = uf.size[uf.find(i)];
            int mult = k / currCycle;
            int r = k % currCycle;
            long fullCycle = calc(p, c, currCycle, i, res);
            long remainderCycle = calc(p, c, r, i, res);
            res[0] = Math.max(res[0], mult * fullCycle + remainderCycle);
        }
        System.out.println(res[0]);
    }

    // midCycle best value??
    private static long calc(int[] p, int[] c, int k, int startIdx, long[] res) {
        long curr = 0;
        for (int i = 0; i < k; i++) {
            int next = p[startIdx] - 1;
            curr += c[next];
            res[0] = Math.max(res[0], curr);
            startIdx = next;
        }
        return curr;
    }
}
