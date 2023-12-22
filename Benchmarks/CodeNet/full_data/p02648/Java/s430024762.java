package tokiomarine2020;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.util.*;

public class D {
    long MOD = (long) 1e9 + 7;

    InputStream in;
    OutputStream out;

    public D() {
        this(System.in, System.out);
    }

    public D(InputStream in, OutputStream out) {
        this.in = in;
        this.out = out;
    }
    int n;
    int[] V, W;

    void run() {
        Scanner sc = new Scanner(this.in);
        PrintWriter out = new PrintWriter(this.out);

        // write your code
        n = sc.nextInt();
        V = new int[n];
        W = new int[n];
        for (int i = 0; i < n; i++) {
            V[i] = sc.nextInt();
            W[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int v = sc.nextInt(), l = sc.nextInt();
            ArrayList<Integer> nodes = new ArrayList<>();
            while (v > 0) {
                nodes.add(v - 1);
                v /= 2;
            }
            out.println(solve(nodes, l));
        }


        out.flush();
    }

    long solve(ArrayList<Integer> nodes, int l) {

        int size = nodes.size();

        ArrayList<Integer> left = new ArrayList<>(), right = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                left.add(nodes.get(i));
            } else {
                right.add(nodes.get(i));
            }
        }

        ArrayList<Pair> lp = enumerate(left, size / 2, l);
        ArrayList<Pair> rp = enumerate(right, size - size / 2, l);
//        debug(lp, rp);
        int rsize = rp.size();

        long max = 0;
        for (Pair p : lp) {
            if (l - p.ws < 0) continue;
            int idx = upperBound(rp, l - p.ws);
            if (idx == rsize) idx--;
//            debug(p, l, idx, rp.get(idx));
            max = Math.max(max, p.vs + rp.get(idx).vs);
        }

        return max;
    }

    void dfs(int idx, int size, long vs, long ws, int l, ArrayList<Integer> nodes, Map<Long, Long> ret) {
        if (idx == size) {
            long cv = ret.getOrDefault(ws, 0L);
            ret.put(ws, Math.max(vs, cv));
            return;
        }
        dfs(idx + 1, size, vs, ws, l, nodes, ret);
        if (ws + W[nodes.get(idx)] <= l)
            dfs(idx + 1, size, vs + V[nodes.get(idx)], ws + W[nodes.get(idx)], l, nodes, ret);
    }

    ArrayList<Pair> enumerate(ArrayList<Integer> nodes, int size, int L) {
        TreeMap<Long, Long> map = new TreeMap<>();
        dfs(0, size, 0, 0, L, nodes, map);

        ArrayList<Pair> ret = new ArrayList<>();
        long cv = 0;
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            cv = Math.max(cv, entry.getValue());
            ret.add(new Pair(cv, entry.getKey()));
        }
        return ret;
    }

    public int upperBound(ArrayList<Pair> array, long value) {
        int left = -1;
        int right = array.size();
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (array.get(middle).ws > value) {
                right = middle;
            } else {
                left = middle;
            }
        }
        return left;
    }

    class Pair implements Comparable<Pair> {
        long vs, ws;
        Pair(long vs, long ws) {
            this.vs = vs;
            this.ws = ws;
        }

        @Override
        public int compareTo(Pair o) {
            return Long.compare(ws, o.ws);
        }

        @Override
        public String toString() {
            return "(" + vs +", " + ws + ")";
        }
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new D().run();
    }
}