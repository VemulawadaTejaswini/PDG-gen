import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static final long INF = (long) 1e15;
    static long[] cum;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        cum = new long[n + 1];
        long min = INF;
        for (int i = 1; i <= n; i++)
            cum[i] = cum[i - 1] + a[i - 1];
        SegmentTree st = new SegmentTree(a);
        for (int i =1 ; i < n-1; i++) {
            long before = cum[i];
            long after = cum[n] - cum[i];
            int i1 = st.lower_bound(before / 2);
            int i2 = Math.min(st.lower_bound(before + (after / 2)), n);
            i2 = Math.max(i2, i + 1);
            i1 = Math.min(i1, i - 1);
            for (int k = -1; k < 2; k++) {
                for (int g = -1; g < 2; g++) {
                    int ii = i1 + k;
                    int jj = i2 + g;
                    if (ii <= 0 || ii == i) continue;
                    if (jj > n || jj == i) continue;
                    min = Math.min(min, getdiff(ii, i, jj, n));
                }
            }
        }
        out.println(min);
        out.flush();
        out.close();
    }

    static long getdiff(int one, int two, int three, int four) {
        long p = cum[one];
        long q = cum[two] - cum[one];
        long r = cum[three] - cum[two];
        long s = cum[four] - cum[three];
        long max = Math.max(Math.max(p, q), Math.max(r, s));
        long min = Math.min(Math.min(p, q), Math.min(r, s));
        return max - min;
    }

    static class SegmentTree {
        int N;
        long[] sTree, array;

        SegmentTree(int[] in) {
            N = 1;
            while (N < in.length)
                N <<= 1;
            array = new long[N + 1];
            sTree = new long[N << 1];
            for (int i = 1; i <= in.length; i++)
                array[i] = in[i - 1];
            build(1, 1, N);
        }

        void build(int node, int b, int e) {
            if (b == e) sTree[node] = array[b];
            else {
                int mid = (b + e) >> 1;
                build(node << 1, b, mid);
                build(node << 1 | 1, mid + 1, e);
                sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
            }
        }

        int lower_bound(long val) {
            return lower_bound(1, 1, N, val);
        }

        //find max idx such that prefix[sum]<=val
        int lower_bound(int node, int b, int e, long val) {
            if (b == e)
                return b;
            int mid = (b + e) >> 1;
            long left = sTree[node << 1];
            long right = sTree[node << 1 | 1];
            if ((left + right) <= val)
                return lower_bound(node << 1 | 1, mid + 1, e, val - left);
            return lower_bound(node << 1, b, mid, val);
        }

        //        int lower_bound(int node, int b, int e, long val) {
        //            if (b == e)
        //                return b;
        //            int mid = (b + e) >> 1;
        //            long left = sTree[node << 1];
        //            if (left >= val) return lower_bound(node << 1, b, mid, val);
        //            return lower_bound(node << 1 | 1, mid + 1, e, val - left);
        //        }


    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        public Scanner(String file) throws Exception {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public Long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

        public void waitForInput() throws InterruptedException {
            Thread.sleep(3000);
        }

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public Integer[] nextIntegerArray(int n) throws IOException {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public double[] nextDoubleArray(int n) throws IOException {
            double[] ans = new double[n];
            for (int i = 0; i < n; i++)
                ans[i] = nextDouble();
            return ans;
        }

    }
}
