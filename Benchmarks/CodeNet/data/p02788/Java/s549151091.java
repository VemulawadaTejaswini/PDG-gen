import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out,false);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        long a = scanner.nextInt();
        long[][] pts = new long[n][2];
        TreeSet<Long> vals = new TreeSet<>();
        for(int i =0; i < n; i++) {
            pts[i][0] = scanner.nextInt();
            pts[i][1] = scanner.nextInt();
            vals.add(pts[i][0]);
            vals.add(pts[i][0]+2*d);
        }
        int cnt = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        for(long vv: vals) {
            map.put(vv, cnt++);
        }
        Arrays.sort(pts, new Comparator<long[]>() {
            public int compare(long[] o1, long[] o2) {
                return Long.compare(o1[0], o2[0]);
            }
        });
        SegTree sg = new SegTree(cnt, 0, cnt-1);
        for(int i = 0; i < n; i++) {
            sg.update(1, map.get(pts[i][0]), map.get(pts[i][0]),pts[i][1]);
        }
        long times = 0;
        for(int i = 0; i < n; i++) {
            int ind1 = map.get(pts[i][0]);
            int ind2 = map.get(pts[i][0]+2*d);
            long min = sg.query(1, ind1, ind1);
            if (min <= 0) continue;
            long num = (min + a-1)/ a;
            sg.update(1, ind1, ind2, -a * num);
            times += num;
        }
        out.println(times);
        out.flush();
    }
    static class SegTree {
        int[] hi, lo;long[] max, delta;
        public SegTree(int ss, int l, int r) {
            hi = new int[4 * ss + 1];
            lo = new int[4 * ss + 1];
            max = new long[4 * ss + 1];
            delta = new long[4 * ss + 1];
            init(1, l, r);
        }
        void init(int cur, int l, int r) {
            hi[cur] = r;
            lo[cur] = l;
            if (l == r) return;
            int mid = (l + r)/2;
            init(cur*2, l, mid);
            init(cur*2 + 1, mid + 1, r);
        }
        void prop(int cur) {
            delta[cur*2] += delta[cur];
            delta[cur*2+1] += delta[cur];
            delta[cur] = 0;
        }
        void update(int cur) {
            max[cur] = Math.max(max[cur*2] + delta[cur*2], max[cur*2+1] + delta[cur*2+1]);
        }
        void update(int cur, int l, int r, long amt) {
            if (l > hi[cur] || r < lo[cur]) return;
            if (l <= lo[cur] && r >= hi[cur]) {
                delta[cur] += amt;
                return;
            }
            prop(cur);
            update(cur*2, l, r, amt);
            update(cur*2+1, l, r, amt);
            update(cur);
        }
        long query(int cur, int l, int r) {
            if (l > hi[cur] || r < lo[cur]) return Long.MIN_VALUE;
            if (l <= lo[cur] && r >= hi[cur]) {
                return max[cur] + delta[cur];
            }
            prop(cur);
            long ll = query(cur*2, l, r);
            long rr = query(cur*2 + 1, l, r);
            update(cur);
            return Math.max(ll, rr);
        }
    }
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
