import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    FastScanner in;
    PrintWriter out;

    char[] s;

    void solve() {
        s = in.next().toCharArray();
        long res = 0;
        int cntAs = 0;
        for (int i = 0; i < s.length; ) {
            if (s[i] == 'A') {
                cntAs++;
                i++;
            } else {
                if (s[i] == 'C'){
                    cntAs = 0;
                    i++;
                } else {
                    if (i + 1 < s.length && s[i + 1] == 'C') {
                        res += cntAs;
                        i += 2;
                    } else {
                        cntAs = 0;
                        i++;
                    }
                }
            }
        }
        out.println(res);
    }

    void run() {
        try {
            in = new FastScanner(new File("MainC.in"));
            out = new PrintWriter(new File("MainC.out"));

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
