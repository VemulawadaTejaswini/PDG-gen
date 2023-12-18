import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by Aksenov239 on 23.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(nextToken());
    }

    public void solveA() throws IOException {
        String s = nextToken();
        String f = "CF";
        int p = 0;
        for (int i = 0; i < s.length() && p < f.length(); i++) {
            if (s.charAt(i) == f.charAt(p)) {
                p++;
            }
        }
        if (p == 2) {
            out.println("Yes");
        } else {
            out.println("No");
        }
    }

    public void solveB() throws IOException {
        int k = nextInt();
        int t = nextInt();
        int[] a = new int[t];
        int max = 0;
        for (int i = 0; i < t; i++) {
            a[i] = nextInt();
            max = Math.max(a[i], max);
        }

        if (2 * max > k) {
            out.println(max - 1 - (k - max));
        } else {
            out.println(0);
        }
    }

    public void solveC() throws IOException {
        int n = nextInt();
        int[] t = new int[n];
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = nextInt();
        }

        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }

        int[] ready = new int[n];
        for (int i = 0; i < t.length; i++) {
            if (i == 0 || t[i] != t[i - 1]) {
                ready[i] = t[i];
            }
        }

        for (int i = a.length - 1; i >= 0; i--) {
            if (i == a.length - 1 || a[i] != a[i + 1]) {
                if (ready[i] != 0 && ready[i] != a[i]) {
                    out.println(0);
                    return;
                }
                ready[i] = a[i];
            }
        }

        long ans = 1;
        for (int i = 0; i < ready.length; i++) {
            if (ready[i] > t[i] || ready[i] > a[i]) {
                out.println(0);
                return;
            }
            if (ready[i] == 0) {
                ans = (ans * Math.min(t[i], a[i])) % 1000000007;
            }
        }
        out.println(ans);
    }

    public void solveD() throws IOException {
        int n = nextInt();
        int m = nextInt();
        char[][] cols = new char[m][n];
        for (int i = 0; i < n; i++) {
            char[] row = nextToken().toCharArray();
            for (int j = 0; j < m; j++) {
                cols[j][n - i - 1] = row[j];
            }
        }
        int total = 0;
        for (int i = 0; i < m - 1; i++) {
            int[][] shift = new int[2 * n + 1][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (cols[i][j] == cols[i + 1][k]) {
                        shift[(j - k) + n][n - Math.max(j, k) - 1]++;
                    }
                }
            }
//            System.err.println(Arrays.deepToString(shift));
            for (int d = 0; d < 2 * n + 1; d++) {
                for (int j = 1; j < n; j++) {
                    shift[d][j] += shift[d][j - 1];
                }
            }
//            System.err.println(Arrays.deepToString(shift));
            int[][] ans = new int[n + 1][n + 1];
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    int plus = shift[(j - k) + n][Math.min(j, k) - 1];
//                    System.err.println(j + " " + k + " " + plus);
                    ans[j][k] = Math.min(ans[j - 1][k], ans[j][k - 1]) + plus;
                }
            }
//            System.err.println(Arrays.deepToString(ans));
//            System.err.println(ans[n][n]);
            total += ans[n][n];
        }
        out.println(total);
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solveD();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
