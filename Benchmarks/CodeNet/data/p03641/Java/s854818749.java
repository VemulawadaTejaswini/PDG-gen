import java.io.*;
import java.util.*;


public class Main {
    static SegmentTree stEven, stOdd;
    static int n, arr[], pos[];

    static Quadruple solve (int l, int r) {
        int p = l % 2;
        if (r < 0 || l >= n || l > r) return new Quadruple(Integer.MAX_VALUE, Integer.MAX_VALUE, l, r);
        int min1 = p == 0 ? stEven.query(l, r) : stOdd.query(l, r), minPos1 = pos[min1];
        int min2 = p == 0 ? stOdd.query(minPos1 + 1, r) : stEven.query(minPos1 + 1, r);
        return new Quadruple(min1, min2, l, r);
    }
    static class Quadruple implements Comparable<Quadruple>{
        int first, second, l, r;
        Quadruple (int f, int s, int ll, int rr) {
            first = f;
            second = s;
            l = ll;
            r = rr;
        }

        @Override
        public int compareTo(Quadruple quadruple) {
            return first != quadruple.first ? Integer.compare(first, quadruple.first) : Integer.compare(second, quadruple.second);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        n = sc.nextInt();
        arr = new int[n];
        pos = new int[(int)1e5 * 2 + 3];
        int[] even = new int[n], odd = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            pos[arr[i]] = i;
            if (i % 2 == 0) {
                even[i] = arr[i];
                odd[i] = Integer.MAX_VALUE;
            } else {
                odd[i] = arr[i];
                even[i] = Integer.MAX_VALUE;
            }
        }
        stEven = new SegmentTree(even);
        stOdd = new SegmentTree(odd);

        ArrayList<Integer> res = new ArrayList<>();
        Quadruple first = solve(0, n - 1);
        PriorityQueue<Quadruple> pq = new PriorityQueue<>();
        pq.add(first);
        for (int i = 0; i < n / 2; i++) {
            Quadruple cur = pq.poll();
            res.add(cur.first);
            res.add(cur.second);
            int pos1 = pos[cur.first], pos2 = pos[cur.second];
            pq.add(solve(cur.l, pos1 - 1));
            pq.add(solve(pos1 + 1, pos2 - 1));
            pq.add(solve(pos2 + 1, cur.r));
        }

        for (int i = 0; i < res.size(); i++) {
            if (i > 0) out.print(" ");
            out.print(res.get(i));
        }
        out.println();
        out.close();
    }





    static class SegmentTree {
        int[] a;
        int n;
        int[] t;

        SegmentTree(int[] aa) {
            a = aa.clone();
            n = a.length;
            t = new int[n << 1 << 1];
            Arrays.fill(t, Integer.MAX_VALUE);
            build(1, 0, n - 1);
        }

        void build(int node, int s, int e) {
            if (s == e) t[node] = a[s];
            else {
                int mid = (s + e) >> 1;
                build(node << 1, s, mid);
                build(node << 1 | 1, mid + 1, e);
                t[node] = Math.min(t[node << 1], t[node << 1 | 1]);
            }
        }

        int query(int s, int e) {
            return query(1, 0, n - 1, s, e);
        }

        int query(int node, int s, int e, int l, int r) {
            if (s >= l && e <= r) return t[node];
            if (s > r || e < l) return Integer.MAX_VALUE;
            int mid = (s + e) >> 1;
            return Math.min(query(node << 1, s, mid, l, r), query(node << 1 | 1, mid + 1, e, l, r));
        }

    }
































    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }
        public Scanner(FileReader s) {
            br = new BufferedReader(s);
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
            }
            return st.nextToken();
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}