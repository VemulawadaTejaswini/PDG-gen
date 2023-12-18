import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BLRUDGame solver = new BLRUDGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class BLRUDGame {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            int n = in.nextInt();
            int sr = in.nextInt(), sc = in.nextInt();
            String s = in.next(), t = in.next();
            boolean ans = false;
            ans |= solve(sr, h, s, t, 'U', 'D');
            ans |= solve(sc, w, s, t, 'L', 'R');
            out.println(ans ? "NO" : "YES");
        }

        private boolean solve(int sr, int h, String s, String t, char u, char d) {
            int minWin = 0, maxWin = h + 1;
            for (int i = t.length() - 1; i >= 0; i--) {
                if (t.charAt(i) == d) {
                    if (minWin + 1 <= maxWin - 1) {
                        minWin = Math.max(0, minWin - 1);
                    }
                }
                if (t.charAt(i) == u) {
                    if (minWin + 1 <= maxWin - 1) {
                        maxWin = Math.min(h + 1, maxWin + 1);
                    }
                }
                if (s.charAt(i) == d) {
                    maxWin--;
                }
                if (s.charAt(i) == u) {
                    minWin++;
                }
            }
            System.err.println(u + " " + d + " " + minWin + " " + maxWin);
            return sr <= minWin || sr >= maxWin;
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

