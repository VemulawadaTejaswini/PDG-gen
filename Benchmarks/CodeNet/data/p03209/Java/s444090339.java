import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DChristmas solver = new DChristmas();
        solver.solve(1, in, out);
        out.close();
    }

    static class DChristmas {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long x = in.nextLong();
            out.println(findPatty(n, x));
        }

        long findPatty(int level, long layer) {
            long tot = 1;
            for (long i = 0; i < level; i++) {
                tot *= 2;
                tot += 3;
            }
            if (level == 0) {
                return 1;
            }

            if (layer == 1) {
                return 0;
            } else if (layer == tot) {
                return 2 * findPatty(level - 1, (tot - 3) / 2) + 1;
            } else if (layer == (tot + 1) / 2) {
                return 1 + findPatty(level - 1, (tot - 3) / 2);
            } else {
                if (layer <= tot / 2) {
                    return findPatty(level - 1, layer - 1);
                } else {
                    return findPatty(level - 1, (layer - 1) % (tot / 2)) +
                            findPatty(level - 1, (tot - 3) / 2) + 1;
                }
            }
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

