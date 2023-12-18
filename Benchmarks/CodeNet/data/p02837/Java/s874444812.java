import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        ArrayList<Integer>[] honest = new ArrayList[n], unkind = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            honest[i] = new ArrayList<>();
            unkind[i] = new ArrayList<>();
            while (m-- > 0) {
                int j = sc.nextInt() - 1, t = sc.nextInt();
                if (t == 1) honest[i].add(j);
                else unkind[i].add(j);
            }
        }
        int ans = 0;
        main:
        for (int mask = 0; mask < 1<<n; mask++) {
            for (int i = 0; i < n; i++) {
                if (!isHonest(mask,i))continue ;
                for (int j : honest[i])
                    if (!isHonest(mask, j)) continue main;
                for (int j : unkind[i])
                    if (isHonest(mask, j)) continue main;
            }
            ans = Math.max(ans, Integer.bitCount(mask));
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static boolean isHonest(int mask, int i) {
        return (mask & 1 << i) != 0;
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