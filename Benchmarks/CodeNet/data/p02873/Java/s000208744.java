import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    long ans(long cntOpen, long cntClose) {
        if (cntOpen < cntClose) {
            return ans(cntClose, cntOpen);
        }
        return s(cntOpen) + s(cntClose - 1);
    }

    long s(long x) {
        return x * (x + 1) / 2;
    }

    void solve() {
        char[] s = in.next().toCharArray();
        long res = 0;
        for (int i = 0; i < s.length; ) {
            int cntOpen = 0;
            while (i != s.length && s[i] == '<') {
                cntOpen++;
                i++;
            }
            int cntClose = 0;
            while (i != s.length && s[i] == '>') {
                cntClose++;
                i++;
            }
            res += ans(cntOpen, cntClose);
        }
        out.println(res);
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
