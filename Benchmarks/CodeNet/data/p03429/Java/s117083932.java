import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;


    char[][] get(int n, int m, int a, int b) {
        char[][] res = new char[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(res[i], '.');
        }
        if (n % 2 == 1) {
            n--;
            for (int i = 0; i + 1 < m; i += 2) {
                if (a > 0) {
                    a--;
                    res[n][i] = '<';
                    res[n][i + 1] = '>';
                }
            }
        }
        if (m % 2 == 1) {
            m--;
            for (int i = 0; i + 1 < n; i += 2) {
                if (b > 0) {
                    b--;
                    res[i][m] = '^';
                    res[i + 1][m] = 'v';
                }
            }
        }
        for (int x = 0; x < n; x += 2) {
            for (int y = 0; y < m; y += 2) {
                if (a >= 2) {
                    res[x][y] = '<';
                    res[x][y + 1] = '>';
                    res[x + 1][y] = '<';
                    res[x + 1][y + 1] = '>';
                    a -= 2;
                } else if (b >= 2) {
                    res[x][y] = '^';
                    res[x][y + 1] = '^';
                    res[x + 1][y] = 'v';
                    res[x + 1][y + 1] = 'v';
                    b -= 2;
                } else {
                    if (a > 0) {
                        res[x][y] = '<';
                        res[x][y + 1] = '>';
                        a--;
                    } else if (b > 0) {
                        res[x][y] = '^';
                        res[x + 1][y] = 'v';

                        b--;
                    }
                }
            }
        }
        if (a != 0 || b != 0) {
            return null;
        }
        return res;
    }

    char[][] rotate(char[][] a) {
        if (a == null) {
            return null;
        }
        int n = a.length;
        int m = a[0].length;
        char[][] res = new char[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[j][i] = a[i][j];
            }
        }
        return res;
    }

    void solve22() {
        Random rnd = new Random(123);
        final int MAX = 10;
        for (int it = 0; it < 123123; it++) {
            System.err.println("it =" + it);
            int n = 1 + rnd.nextInt(MAX);
            int m = 1 + rnd.nextInt(MAX);
            int a = rnd.nextInt(MAX * 5);
            int b = rnd.nextInt(MAX * 5);
            if (get(n, m, a, b) != null && get(m, n, b, a) == null) {
                throw new AssertionError();
            }
        }
    }

    void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        char[][] ans = get(n, m, a, b);
        if (ans == null) {
            ans = rotate(get(m, n, b, a));
        }
        if (ans == null) {
            out.println("NO");
            return;
        }
        out.println("YES");
        for (int i = 0; i < ans.length; i++) {
            out.println(new String(ans[i]));
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