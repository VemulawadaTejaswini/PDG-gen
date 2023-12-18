import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;

    void solve() {
        int h = in.nextInt();
        int w = in.nextInt();
        char[][] s = new char[h][];
        for (int i = 0; i < h; i++) {
            s[i] = in.next().toCharArray();
        }
        int[][] dp = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        }
        dp[0][0] = (s[0][0] == '.' ? 0 : 1);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i + 1 < h) {
                    int cost = s[i][j] == s[i + 1][j] ? 0 : 1;
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + cost);
                }
                if (j + 1 < w) {
                    int cost = s[i][j] == s[i][j + 1] ? 0 : 1;
                    dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + cost);
                }
            }
        }
        out.println((dp[h - 1][w - 1] + 1) / 2);
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