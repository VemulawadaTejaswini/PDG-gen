import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static final long INF = Long.MAX_VALUE / 4;

    public static void main(String[] args) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        SegTree st = new SegTree(N);
        Edge[] edges = new Edge[M];
        for (int i = 0; i < M; i++) {
            int L = sc.nextInt() - 1;
            int R = sc.nextInt() - 1;
            int C = sc.nextInt();
            edges[i] = new Edge(L, R, C);
        }
        Arrays.sort(edges);
        for (int i = 0; i < M; i++) {
            Edge e = edges[i];
            long s = st.get(e.l);
            if (s == INF) {
                System.out.println(-1);
                return;
            }
            st.add(e.l + 1, e.r + 1, s + e.c);
        }
        long ans = st.get(N - 1);
        System.out.println(ans == INF ? -1 : ans);
    }

    static class Edge implements Comparable<Edge> {
        int l, r, c;

        public Edge(int l, int r, int c) {
            this.l = l;
            this.r = r;
            this.c = c;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.l, o.l);
        }
    }

    static class SegTree {

        int size;
        long[] tree;

        SegTree(int size) {
            this.size = size;
            int l = 1;
            while (l < size * 2) {
                l *= 2;
            }
            tree = new long[l];
            Arrays.fill(tree, INF);
            add(0, 1, 0);
        }

        void add(int lo, int hi, long v) {
//            System.err.println("add:" + lo + " " + hi + " " + v);
            add(0, 0, size, lo, hi, v);
        }

        private void add(int idx, int left, int right, int lo, int hi, long v) {
            if (lo <= left && right <= hi) {
                tree[idx] = Math.min(tree[idx], v);
                return;
            }
            int mid = (left + right) / 2;
            if (lo < mid) add(idx * 2 + 1, left, mid, lo, hi, v);
            if (mid < hi) add(idx * 2 + 2, mid, right, lo, hi, v);
        }

        long get(int pos) {
            return get(0, 0, size, pos);
        }

        private long get(int idx, int left, int right, int pos) {
//            System.err.println("get:" + idx + " " + left + " " + right + " " + pos);
            if (pos < left || right <= pos) return Long.MAX_VALUE;
            long ret = tree[idx];
            if (right - left == 1) return ret;
            int mid = (left + right) / 2;
            if (pos < mid) ret = Math.min(ret, get(idx * 2 + 1, left, mid, pos));
            if (mid <= pos) ret = Math.min(ret, get(idx * 2 + 2, mid, right, pos));
            return ret;
        }
    }
}
