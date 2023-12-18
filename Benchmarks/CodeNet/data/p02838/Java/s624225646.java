import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final int mod = (int) (1e9 + 7);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt(), m = 60;
        long[] a = sc.nextLongArray(n);
        int[] zero = new int[m], one = new int[m];
        for (long x : a) {
            for (int i = 0; i < m; i++)
                if (isOne(x, i)) one[i]++;
                else zero[i]++;

        }
        int ans = 0;
        for (long x : a) {
            for (int i = 0; i < m; i++) {
                if (isOne(x, i)) {
                    ans = add(ans, mult(1l << i, zero[i]));
                    one[i]--;
                } else {
                    ans = add(ans, mult(1l << i, one[i]));
                    zero[i]--;
                }
            }
        }
        out.println(ans);
        out.flush();
        out.close();
    }

    static boolean isOne(long a, int i) {
        return (a & 1l << i) != 0;
    }

    static int mult(long a, int b) {
        return (int) ((a * b) % mod);
    }

    static int add(int a, int b) {
        long c = a + b;
        if (c >= mod) c -= mod;
        if (c < 0) c += mod;
        return (int) c;
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