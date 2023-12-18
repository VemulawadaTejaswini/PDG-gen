import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    long gcd(long x, long y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    long lcm(long x, long y) {
        return x / gcd(x, y) * y;
    }

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        char[] a = in.next().toCharArray();
        char[] b = in.next().toCharArray();
        long len = lcm(n, m);
        for (int i = 0; i < n; i++) {
            long pos = i * (len / n);
            if (pos % (len / m) == 0) {
                long j = pos / (len / m);
                if (a[i] != b[(int) j]) {
                    out.println(-1);
                    return;
                }
            }
        }
        out.println(len);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
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
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}