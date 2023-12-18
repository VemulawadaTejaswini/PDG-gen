import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ShekharN
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt(), d = in.nextInt();
            int[][] mat = new int[h + 1][w + 1];
            PairIntInt[] map = new PairIntInt[h * w + 2];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    mat[i][j] = in.nextInt();
                    map[mat[i][j]] = new PairIntInt(i, j);
                }
            }
            int[] dp = new int[h * w + 1];
            for (int i = 1; i <= h * w; i++) {
                if (d >= i) {
                    dp[i] += dp[i - d];
                    dp[i] += Math.abs(map[i].getFirst() - map[i - d].getFirst())
                            + Math.abs(map[i].getSecond() - map[i - d].getSecond());
                }
            }
            int q = in.nextInt();
            for (int tc = 0; tc < q; tc++) {
                int l = in.nextInt(), r = in.nextInt();
                int lo = l > d ? dp[l - d] : 0;
                out.println(dp[r] - lo);
            }
        }

    }

    static class PairIntInt {
        private int first;
        private int second;

        PairIntInt() {
        }

        public PairIntInt(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PairIntInt that = (PairIntInt) o;

            if (first != that.first) return false;
            return second == that.second;
        }


        public int hashCode() {
            int result = first;
            result = 31 * result + second;
            return result;
        }

    }

    static class FastScanner {
        private BufferedReader br;
        private StringTokenizer st;

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

        public String nextString() {
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

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }
}

