import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int n = in.nextInt();
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        int c = in.nextInt() - 1;
        int d = in.nextInt() - 1;
        if (c < d) {
            int tmp = a;
            a = b;
            b = tmp;
            tmp = c;
            c = d;
            d = tmp;
        }
        char[] s = in.next().toCharArray();
        // C > D
        while (a < c || b < d) {
//            System.err.println("!" + a + " " + b);
            if (a < c && (a + 1 != b) && s[a + 1] == '.') {
                a++;
                continue;
            }
            if (a + 1 < c && (a + 2 != b) && s[a + 2] == '.') {
                a += 2;
                continue;
            }
            if (b < d && b + 1 != a && s[b + 1] == '.') {
                b++;
                continue;
            }
            if (b + 1 < d && b + 2 != a && s[b + 2] == '.') {
                b += 2;
                continue;
            }
            break;
        }
        out.println(a == c && b == d ? "Yes" : "No");
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
