import java.util.*;
import java.io.*;

// Template for atcoder
public class Main {

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    final long MOD = 1000L * 1000L * 1000L + 7;
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {1, 0, -1, 0};

    long[] dp;
    long[] tree;
    class Pair implements Comparable<Pair> {
        int height;
        int value;
        int idx;
        public Pair(int height, int value, int idx) {
            this.height = height;
            this.value = value;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(height, o.height);
        }
    }
    void solve() throws IOException {
        int n = nextInt();
        int[] h = nextIntArr(n);
        int[] a = nextIntArr(n);
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(h[i], a[i], i);
        }
        Arrays.sort(arr);
        dp = new long[n];
        tree = new long[5 * n];
        for (Pair p : arr) {
            int idx = p.idx;
            long prev = query_tree(1, 0, n - 1, 0, idx - 1);
            long before = query_tree(1, 0, n - 1, idx, idx);
            long now = p.value;
            now += prev == Long.MIN_VALUE ? 0 : prev;
            update_tree(1, 0, n - 1, idx, now - before);
        }
        long res = query_tree(1, 0, n - 1, 0, n - 1);
        outln(res);
    }

    /**
     * Increment elements at queryIndex with value
     */
    void update_tree(int node, int nodeStartIndex, int nodeEndIndex, int queryIndex, long value) {
        if(nodeStartIndex > nodeEndIndex || nodeStartIndex > queryIndex || nodeEndIndex < queryIndex) // Current segment is not within range [i, j]
            return;
        if(nodeStartIndex == nodeEndIndex) { // Segment is fully within range
            tree[node] += value;
            return;
        }

        update_tree(node * 2, nodeStartIndex, (nodeStartIndex + nodeEndIndex) / 2, queryIndex, value); // Updating left child
        update_tree(node * 2 + 1, 1 + (nodeStartIndex + nodeEndIndex) / 2, nodeEndIndex, queryIndex, value); // Updating right child

        tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]); // Updating root
    }

    /**
     * Query tree to get max element value within range [queryStartIndex, queryEndIndex]
     */
    long query_tree(int node, int nodeStartIndex, int nodeEndIndex, int queryStartIndex, int queryEndIndex) {
        if(nodeStartIndex > nodeEndIndex || nodeStartIndex > queryEndIndex || nodeEndIndex < queryStartIndex) {
            return Long.MIN_VALUE; // Out of range!!! change if necessary
        }

        if(nodeStartIndex >= queryStartIndex && nodeEndIndex <= queryEndIndex) {// Current segment is totally within range [i, j]
            return tree[node];
        }

        long q1 = query_tree(node * 2, nodeStartIndex, (nodeStartIndex + nodeEndIndex) / 2, queryStartIndex, queryEndIndex); // Query left child
        long q2 = query_tree(1 + node * 2, 1 + (nodeStartIndex + nodeEndIndex) / 2, nodeEndIndex, queryStartIndex, queryEndIndex); // Query right child

        return Math.max(q1, q2);
    }

    void shuffle(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }
    private void outln(Object o) {
        out.println(o);
    }
    private void out(Object o) {
        out.print(o);
    }
    public Main() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    public static void main(String[] args) throws IOException {
        new Main();
    }

    public long[] nextLongArr(int n) throws IOException{
        long[] res = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
    public int[] nextIntArr(int n) throws IOException {
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }
    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }
    public String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
    }
    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() throws IOException {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() throws IOException {
        return Double.parseDouble(nextToken());
    }
}
