import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    int ans(String s) {
        char last = '.';
        int res = 0;
        for (char c : s.toCharArray()) {
            if (c == last) {
                res++;
                last = '.';
            } else {
                last = c;
            }
        }
        return res;
    }

    void solve() {
        String s = in.next();
        int k = in.nextInt();
        long justS = ans(s);
        if (k == 1) {
            out.println(justS);
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                if (s.length() == 1) {
                    out.println(k / 2);
                } else {
                    long one = Math.min(ans(s.substring(1)), ans(s.substring(0, s.length() - 1))) + 1;
                    out.println(one * k);
                }
            } else {
                out.println(justS * k);
            }
        }
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
