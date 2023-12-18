import java.io.*;
import java.util.*;

public class Main {
    private FastScanner in;
    private PrintWriter out;

    int solve(ArrayList<Integer> a) {
        int[][] dp = new int[2][a.size() + 1];
        for (int i = a.size() - 2; i >= 0; i--) {
            for (int j = 0; j < 2; j++) {
                int curSize = a.get(i) - j;
                dp[j][i] = Math.max((curSize == 0 ? dp[0][i + 1] : dp[0][i + 2]) + a.get(i + 1) * (curSize == 0 ? 0 : 1), dp[1][i + 1] + curSize);
            }
        }
        return Math.max(dp[0][0], dp[1][0]);
    }

    private void solve() {
        int n = in.nextInt();
        char[] a = in.next().toCharArray();
        int res = 0;
        for (int i = 0; i < n; ) {
            if (a[i] == '0') {
                i++;
                continue;
            }
            ArrayList<Integer> sizes = new ArrayList<>();
            int j = i;
            while (true) {
                while (j != n && a[j] == '1') {
                    j++;
                }
                sizes.add(j - i);
                i = j + 1;
                if (j == n || j + 1 == n || a[j + 1] == '0') {
                    break;
                }
                j++;
            }
            res += solve(sizes);
        }
        out.println(res);
    }

    private void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void runIO() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    private class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        FastScanner(InputStream f) {
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