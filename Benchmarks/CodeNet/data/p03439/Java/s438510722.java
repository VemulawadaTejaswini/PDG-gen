import java.io.*;
import java.util.*;

public class Main {
    static MyScanner sc;
    private static PrintWriter out;
    static long M2 = 1_000_000_000L + 7;

    public static void main(String[] s) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();


        if (stringBuilder.length() == 0) {
            sc = new MyScanner(System.in);
        } else {
            sc = new MyScanner(new BufferedReader(new StringReader(stringBuilder.toString())));
        }


        out = new PrintWriter(new OutputStreamWriter(System.out));
        initData();
        solve();
        out.flush();
    }


    private static void initData() {

    }


    private static void solve() throws IOException {
        int n = sc.nextInt();
        int l = ask(0);
        if (l == 0) {
            return;
        }
        int s = 0;
        int e = n;

        while (true) {
            int m = (s + e) / 2;
            int x = ask(m);
            if (x == 0) {
                return;
            }
            int dd = m - s;
            if ((x == l) == (dd % 2 == 0)) {
                s = m;
                l = x;
            } else {
                e = m;
            }
        }

    }

    private static int ask(int i) {
        out.println(i);
        out.flush();
        return Arrays.asList("Vacant", "Male", "Female").indexOf(sc.next());
    }

    private static int ccw(int[] i1, int[] i2) {
        return ccw(i1, i2, new int[]{0, 0});
    }

    private static int ccw(int[] s1, int[] s2, int[] right) {
        long xa = s1[0] - right[0];
        long xb = s1[1] - right[1];
        long ya = s2[0] - right[0];
        long yb = s2[1] - right[1];
        return Long.compare(xb * ya, xa * yb);
    }


    private static void solveT() throws IOException {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    private static long gcd(long l, long l1) {
        if (l > l1) return gcd(l1, l);
        if (l == 0) return l1;
        return gcd(l1 % l, l);
    }

    private static long pow(long a, long b, long m) {
        if (b == 0) return 1;
        if (b == 1) return a;
        long pp = pow(a, b / 2, m);
        pp *= pp;
        pp %= m;
        return (pp * (b % 2 == 0 ? 1 : a)) % m;
    }

    private static final class SegmentTree {
        long[] val1;
        int[] from1;
        int[] to1;
        long[] sum1;
        long[] max1;

        public SegmentTree(int c) {
            c = Math.max(c, 2);
            int size = Integer.highestOneBit(c);
            if (size != c) {
                size <<= 1;
            }
            int rs = size << 1;
            val1 = new long[rs];
            from1 = new int[rs];
            sum1 = new long[rs];
            to1 = new int[rs];
            max1 = new long[rs];

            Arrays.fill(from1, Integer.MAX_VALUE);
            for (int r = val1.length - 1; r > 1; r--) {
                if (r >= size) {
                    from1[r] = r - size;
                    to1[r] = r - size;
                }
                from1[r / 2] = Math.min(from1[r / 2], from1[r]);
                to1[r / 2] = Math.max(to1[r / 2], to1[r]);
            }
        }

        public void clear() {
            Arrays.fill(val1, 0);
            Arrays.fill(sum1, 0);
            Arrays.fill(max1, 0);
        }

        public void add(int from, int to, long val) {
            add(1, from, to, val);
        }

        private void add(int cur, int from, int to, long val) {
            if (cur >= val1.length) return;
            if (from1[cur] > to || from > to1[cur]) {
                return;
            }
            if (from <= from1[cur] && to1[cur] <= to) {
                val1[cur] += val;
                max1[cur] += val;
                return;
            }
            int left = (cur << 1);
            int right = left + 1;
            sum1[cur] += (Math.min(to, to1[cur]) - Math.max(from, from1[cur]) + 1) * val;
            add(left, from, to, val);
            add(right, from, to, val);
            max1[cur] = val1[cur] + Math.max(max1[left], max1[right]);
        }

        public long sum(int from, int to) {
            return sum(1, from, to);
        }

        private long sum(int cur, int from, int to) {
            if (cur >= val1.length) return 0;
            if (from <= from1[cur] && to1[cur] <= to) {
                return val1[cur] * (to1[cur] - from1[cur] + 1) + sum1[cur];
            }
            if (from1[cur] > to || from > to1[cur]) {
                return 0;
            }
            int c1 = Math.max(from, from1[cur]);
            int c2 = Math.min(to, to1[cur]);
            return (c2 - c1 + 1) * val1[cur] + sum((cur << 1) + 1, from, to) + sum(cur << 1, from, to);
        }

        public long max(int from, int to) {
            return max(1, from, to);
        }

        private long max(int cur, int from, int to) {
            if (cur >= val1.length) return 0;
            if (from <= from1[cur] && to1[cur] <= to) {
                return max1[cur];
            }
            if (from1[cur] > to || from > to1[cur]) {
                return 0;
            }
            return val1[cur] + Math.max(max((cur << 1) + 1, from, to), max(cur << 1, from, to));
        }

        public int fistPos(int n) {
            int cur = 1;
            if (max1[cur] <= n) return Integer.MAX_VALUE;

            while (from1[cur] < to1[cur]) {
                n -= val1[cur];
                cur <<= 1;
                if (max1[cur] <= n) cur++;

            }
            return from1[cur];
        }

    }


    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        MyScanner(BufferedReader br) {
            this.br = br;
        }

        public MyScanner(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        String next() {
            findToken();
            return st.nextToken();
        }

        Integer[] nab(int n) {
            Integer[] k = new Integer[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.fi();
            }
            return k;
        }

        int[] na(int n) {
            int[] k = new int[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.fi();
            }
            return k;
        }

        long[] nl(int n) {
            long[] k = new long[n];
            for (int i = 0; i < n; i++) {
                k[i] = sc.nextLong();
            }
            return k;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int fi() {
            String t = next();
            int cur = 0;
            boolean n = t.charAt(0) == '-';
            for (int a = n ? 1 : 0; a < t.length(); a++) {
                cur = cur * 10 + t.charAt(a) - '0';
            }
            return n ? -cur : cur;
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }


}