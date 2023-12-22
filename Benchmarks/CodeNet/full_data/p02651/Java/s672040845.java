import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int tc = in.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = in.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
            }
            char[] s = in.next().toCharArray();
            Set set = new Set();
            boolean ok = true;
            for (int i = n - 1; i >= 0; i--) {
                if (s[i] == '1') {
                    if (!set.isRepresentable(a[i])) {
                        ok = false;
                    }
                } else {
                    set.add(a[i]);
                }
            }
            out.println(ok ? '0' : '1');
        }
    }

    class Set {
        long[] all = new long[61];

        Set() {

        }

        boolean isRepresentable(long x) {
            for (int bit = 60; bit >= 0; bit--) {
                if (((1L << bit) & x) != 0) {
                    if (all[bit] == 0) {
                        all[bit] = x;
                        return false;
                    } else {
                        x ^= all[bit];
                    }
                }
            }
            return true;
        }

        void add(long x) {
            for (int bit = 60; bit >= 0; bit--) {
                if (((1L << bit) & x) != 0) {
                    if (all[bit] == 0) {
                        all[bit] = x;
                        return;
                    } else {
                        x ^= all[bit];
                    }
                }
            }
        }
    }

    final int mod = 988244353;

    int mul(int x, int y) {
        return (int) ((x * 1L * y) % mod);
    }

    int add(int x, int y) {
        x += y;
        return x >= mod ? (x - mod) : x;
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