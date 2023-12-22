import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main implements Runnable {
    static boolean use_n_tests = false;
    static int stack_size = 1 << 20;
    static int[] tree;

    void solve(FastScanner in, PrintWriter out, int testNumber) {
        int n, q;
        n = in.nextInt();
        q = in.nextInt();
        Integer[] c = Array.read(n, in);
        Range[] r = Array.readRanges(q, in);
        Arrays.sort(r, Comparator.comparing(Range::getR)); // sort by right value

        tree = new int[n];
        int[] answers = new int[q];
        int rid = 0;
        int[] lastIndex = new int[n + 1];
        Arrays.fill(lastIndex, -1);
        int curIndex = 0;
        for (Integer x : c) {
            if (lastIndex[x] != -1) {
                // need to delete from Fenwic tree
                addToTree(lastIndex[x], -1);
            }
            lastIndex[x] = curIndex;
            addToTree(lastIndex[x], 1); // add new position for x to Fenwic tree
            while (rid < r.length && curIndex == r[rid].r - 1) {
                    int ans = calcDifferentColor(r[rid].l - 2, r[rid].r - 1);
                answers[r[rid].id] = ans;
                rid++;
            }
            curIndex++;
        }
        for (int x : answers) {
            out.println(x);
        }
    }

    int calcDifferentColor(int L, int R) {
        int res = 0;
        while (R >= 0) {
            res += tree[R];
            R = G(R) - 1;
        }
        while (L >= 0) {
            res -= tree[L];
            L = G(L) - 1;
        }
        return res;
    }

    int G(int a) {
        return a & (a + 1);
    }

    void addToTree(int index, int element) {
        while (index < tree.length) {
            tree[index] += element;
            index = index | (index + 1);
        }
    }

    // ****************************** template code ***********

    static class Range {
        int l, r;
        int id;

        public int getL() {
            return l;
        }

        public int getR() {
            return r;
        }

        public Range(int l, int r, int id) {
            this.l = l;
            this.r = r;
            this.id = id;
        }
    }
    static class Array {
        static Range[] readRanges(int n, FastScanner in) {
            Range[] result = new Range[n];
            for (int i = 0; i < n; i++) {
                result[i] = new Range(in.nextInt(), in.nextInt(), i);
            }
            return result;
        }
        static public Integer[] read(int n, FastScanner in) {
            Integer[] out = new Integer[n];
            for (int i = 0; i < out.length; i++) {
                out[i] = in.nextInt();
            }
            return out;
        }
    }
    class Graph {
        List<List<Integer>> create(int n) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            return graph;
        }
    }
    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream io) {
            br = new BufferedReader(new InputStreamReader(io));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }

    void run_t_tests() {
        int t = in.nextInt();
        int i = 0;
        while (t-- > 0) {
            solve(in, out, i++);
        }
    }

    void run_one() {
        solve(in, out, -1);
    }

    @Override
    public void run() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        if (use_n_tests) {
            run_t_tests();
        } else {
            run_one();
        }
        out.close();
    }

    static FastScanner in;
    static PrintWriter out;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(null, new Main(), "", stack_size);
        thread.start();
        thread.join();
    }
}