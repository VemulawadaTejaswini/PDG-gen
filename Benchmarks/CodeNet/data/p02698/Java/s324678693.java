import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Vector;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HLISOnTree solver = new HLISOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class HLISOnTree {
        int n;
        int[] arr;
        ArrayList<Integer>[] adjL;
        SegmentTree st;
        int[] LIS;

        public void solve(int testNumber, Scanner sc, PrintWriter pw) {
            n = sc.nextInt();
            arr = new int[n];
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                set.add(arr[i]);
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int x : set)
                map.put(x, map.size() + 1);
            for (int i = 0; i < n; i++)
                arr[i] = map.get(arr[i]);
            adjL = new ArrayList[n];
            for (int i = 0; i < n; i++)
                adjL[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int u = sc.nextInt() - 1, v = sc.nextInt() - 1;
                adjL[u].add(v);
                adjL[v].add(u);
            }
            int N = 1;
            while (N < map.size())
                N <<= 1;
            st = new SegmentTree(new int[N + 1]);
            LIS = new int[n];
            dfs(0, -1);
            for (int x : LIS)
                pw.println(x);
        }

        private void dfs(int u, int P) {
            int max = st.query(1, arr[u] - 1);
            st.update_point(arr[u], max + 1);
            LIS[u] = max + 1;
            for (int v : adjL[u]) {
                if (P == v)
                    continue;
                dfs(v, u);
            }
            st.update_point(arr[u], 0);
        }

        public class SegmentTree {
            int N;
            int[] array;
            int[] sTree;
            Stack<Integer>[] st;

            SegmentTree(int[] in) {
                array = in;
                N = in.length - 1;
                sTree = new int[N << 1];        //no. of nodes = 2*N - 1, we add one to cross out index zero
                st = new Stack[in.length + 1];
                build(1, 1, N);
            }

            void build(int node, int b, int e) {
                if (b == e) {
                    sTree[node] = array[b];
                    st[b] = new Stack<>();
                } else {
                    int mid = b + e >> 1;
                    build(node << 1, b, mid);
                    build(node << 1 | 1, mid + 1, e);
                    sTree[node] = Math.max(sTree[node << 1], sTree[node << 1 | 1]);
                }
            }

            void update_point(int index, int val) {
                if (val == 0) {
                    sTree[index + N - 1] = st[index].pop();
                    index += N - 1;
                } else {
                    st[index].add(sTree[index + N - 1]);
                    index += N - 1;
                    sTree[index] = val;
                }
                while (index > 1) {
                    index >>= 1;
                    sTree[index] = Math.max(sTree[index << 1], sTree[index << 1 | 1]);
                }
            }

            int query(int i, int j) {
                return query(1, 1, N, i, j);
            }

            int query(int node, int b, int e, int i, int j) {
                if (i > e || j < b)
                    return 0;
                if (b >= i && e <= j)
                    return sTree[node];
                int mid = b + e >> 1;
                int q1 = query(node << 1, b, mid, i, j);
                int q2 = query(node << 1 | 1, mid + 1, e, i, j);
                return Math.max(q1, q2);

            }

        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

