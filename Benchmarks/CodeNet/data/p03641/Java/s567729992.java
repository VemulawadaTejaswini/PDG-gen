import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    int n;
    int[] ps;
    RangeMinQuery rmqOdd;
    RangeMinQuery rmqEven;

    public static void main(String args[]) {
        new Main().run();
    }

    void run() {
        FastReader sc = new FastReader();
        n = sc.nextInt();
        ps = new int[n];
        for (int i = 0; i < n; i++) {
            ps[i] = sc.nextInt();
        }
        solve();
    }

    void solve() {
        Pair[] odds = new Pair[n];
        Pair[] evens = new Pair[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evens[i] = new Pair(ps[i], i);
                odds[i] = new Pair(1 << 30, i);
            } else {
                evens[i] = new Pair(1 << 30, i);
                odds[i] = new Pair(ps[i], i);
            }
        }
        rmqOdd = new RangeMinQuery(odds);
        rmqEven = new RangeMinQuery(evens);
        List<Integer> ans = dfs(0, ps.length);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i < ans.size() - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }

    List<Integer> dfs(int l, int r) {
        //System.out.println(l + " " + r);
        if (r == l) {
            return new ArrayList<>();
        }
        if (r - l == 2) {
            List<Integer> ret = new ArrayList<>();
            ret.add(ps[l]);
            ret.add(ps[l + 1]);
            return ret;
        }
        RangeMinQuery tempOdd = rmqOdd;
        RangeMinQuery tempEven = rmqEven;
        if (l % 2 != 0) {
            tempOdd = rmqEven;
            tempEven = rmqOdd;
        }
        Pair minEven = tempEven.query(l, r);
        Pair minOdd = tempOdd.query(minEven.index + 1, r);
        List<Integer> minPair = new ArrayList<>();
        minPair.add(minEven.value);
        minPair.add(minOdd.value);
        //System.out.println(minEven.value + " " + minEven.index + " " + minOdd.value + " " + minOdd.index);
        List<Integer> ret = merge(dfs(l, minEven.index),
                merge(dfs(minEven.index + 1, minOdd.index),
                        dfs(minOdd.index + 1, r)));
        /*
        for (int i = 0; i < ret.size(); i++) {
            System.out.print(ret.get(i));
            if (i < ret.size() - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
        */
        minPair.addAll(ret);
        return minPair;
    }

    List<Integer> merge(List<Integer> a, List<Integer> b) {
        //System.out.println(a.toString());
        //System.out.println(b.toString());
        List<Integer> ret = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.size() || j < b.size()) {
            if (i == a.size()) {
                ret.add(b.get(j++));
                ret.add(b.get(j++));
            } else if (j == b.size()) {
                ret.add(a.get(i++));
                ret.add(a.get(i++));
            } else {
                if (a.get(i) < b.get(j)) {
                    ret.add(a.get(i++));
                    ret.add(a.get(i++));
                } else {
                    ret.add(b.get(j++));
                    ret.add(b.get(j++));
                }
            }
        }
        return ret;
    }

    class Pair implements Comparable<Pair>{
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Pair o) {
            return this.value - o.value;
        }
    }

    class RangeMinQuery {
        private final Pair[] tree;
        private final int N;
        private final int paddedN;
        int MAX = 1 << 30;

        RangeMinQuery(Pair[] arr) {
            this.N = arr.length;
            int n = 2;
            while (n < arr.length) {
                n <<= 1;
            }
            paddedN = n;
            tree = new Pair[2 * n - 1];
            int j = 0;
            for (int i = n - 1; i < n - 1 + arr.length; i++, j++) {
                tree[i] = arr[j];
            }
            for (int i = n - 1 + arr.length; i < tree.length; i++) {
                tree[i] = new Pair(MAX, i);
            }
            build(0, 0, arr.length, arr);
        }

        void build(int k, int l, int r, Pair[] arr) {
            if (r - l == 1) {
                tree[k] = arr[l];
            } else {
                int mid = (l + r) >> 1;
                int lChild = (k << 1) + 1;
                int rChild = (k << 1) + 2;
                build(lChild, l, mid, arr);
                build(rChild, mid, r, arr);
                if (tree[lChild].compareTo(tree[rChild]) <= 0) {
                    tree[k] = tree[lChild];
                } else {
                    tree[k] = tree[rChild];
                }
            }
        }

        // returns minimum value from [a, b).
        Pair query(int a, int b) {
            return query(a, b, 0, 0, paddedN);
        }

        Pair query(int a, int b, int k, int l, int r) {
            if (r <= a || b <= l) {
                return new Pair(MAX, -1);
            }
            if (a <= l && r <= b) {
                return tree[k];
            }
            int mid = (l + r) >> 1;
            Pair lMin = query(a, b, (k << 1) + 1, l, mid);
            Pair rMin = query(a, b, (k << 1) + 2, mid, r);
            if (lMin.compareTo(rMin) <= 0) {
                return lMin;
            } else {
                return rMin;
            }
        }

        void add_point(int index, int val) {
            index += paddedN - 1;
            tree[index].value += val;
            while (index > 0) {
                index = (index - 1) >> 1;
                if (tree[(index << 1) + 1].compareTo(tree[(index << 1) + 2]) <= 0) {
                    tree[index] = tree[(index << 1) + 1];
                } else {
                    tree[index] = tree[(index << 1) + 2];
                }
            }
        }

        void update_point(int index, int val) {
            index += paddedN - 1;
            tree[index].value = val;
            while (index > 0) {
                index = (index - 1) >> 1;
                if (tree[(index << 1) + 1].compareTo(tree[(index << 1) + 2]) <= 0) {
                    tree[index] = tree[(index << 1) + 1];
                } else {
                    tree[index] = tree[(index << 1) + 2];
                }
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
