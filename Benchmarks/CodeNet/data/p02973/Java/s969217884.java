import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    static int[] a;
    static int n;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n = sc.nextInt();
        a = sc.nextIntArray(n);
        int lo = 1, hi = n;
        int ans = n;
        while (lo <= hi) {
            int mid = lo + hi >> 1;
            if (check(mid)) {
                hi = mid - 1;
                ans = mid;
            } else lo = mid + 1;
        }
//    check(3);
        out.println(ans);
        out.flush();
        out.close();
    }

    static boolean check(int m) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int s = 0;
        for (int i = 0; i < n; i++) {
            int cur = a[i];
            Integer best = map.lowerKey(cur);
//            System.err.println(best + " " + map + " " + s);
            if (best != null) {
                int occ = map.get(best);
                if (occ == 1) map.remove(best);
                else
                    map.put(best, occ - 1);
                s--;
            }  s++;
            map.put(cur, map.getOrDefault(cur, 0) + 1);
            if (s > m) return false;
        }
        return true;
    }


    static class Scanner {

        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
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