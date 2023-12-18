import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Main {
    static Monster[] monsters;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a = sc.nextInt();
        monsters = new Monster[n];
        for (int i = 0; i < n; i++)
            monsters[i] = new Monster(sc.nextInt(), sc.nextInt());
        Arrays.sort(monsters);
        long ans = 0;
        FenwickTree ft = new FenwickTree(n);
        TreeMap<Integer, Integer> one = new TreeMap<>(), two = new TreeMap<>();
        for (int i = 0; i < n; i++)
            two.put(monsters[i].x, i);
        for (int i = n - 1; i >= 0; i--)
            one.put(monsters[i].x, i);
        for (int i = 0; i < n; i++) {
            Monster cur = monsters[i];
            cur.h = Math.max(0, cur.h - ft.rsq(i + 1));
            long need = (cur.h + a - 1) / a;
            long damage = 1l * a * need;
            int left = one.get(one.ceilingKey(cur.x)), right = two.get(two.floorKey(cur.x + 2 * d));
            ft.update(left + 1, right + 1, damage);
            ans += need;
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static class FenwickTree {
        int n;
        long[] ft;

        public FenwickTree(int n) {
            this.n = n;
            ft = new long[n + 1];
        }

        void update(int l, int r, long val) {
            point_update(l, val);
            point_update(r + 1, -val);
        }

        long rsq(int b) {
            long sum = 0;
            while (b > 0) {
                sum += ft[b];
                b -= b & -b;
            }
            return sum;
        }

        void point_update(int k, long val) {
            while (k <= n) {
                ft[k] += val;
                k += k & -k;
            }
        }
    }


    static class Monster implements Comparable<Monster> {
        int x;
        long h;

        public Monster(int x, int h) {
            this.x = x;
            this.h = h;
        }

        @Override
        public int compareTo(Monster o) {
            return x - o.x;
        }
    }


    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        boolean ready() throws IOException {
            return br.ready();
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

        public int[] nextIntArray(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
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

        public short nextShort() throws IOException {
            return Short.parseShort(next());
        }

    }

}