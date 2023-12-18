import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScan in = new MyScan(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, MyScan in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();


            char[][] res = new char[n][m];
            for (int s = 0; s < n; s++) {
                Arrays.fill(res[s], '.');
            }
            if (n % 2 == 1) {
                n--;
                for (int s = 0; s < m - 1 && a > 0; s += 2) {
                    res[n][s] = '<';
                    res[n][s + 1] = '>';
                    a--;
                }
            }
            if (m % 2 == 1) {
                m--;
                for (int s = 0; s < n - 1 && b > 0; s += 2) {
                    res[s][m] = '^';
                    res[s + 1][m] = 'v';
                    b--;
                }
            }

            if (4 * ((a + 1) / 2 + (b + 1) / 2) > n * m) {
                out.print("NO");
                return;
            }
            out.println("YES");
            int s = 0;
            int x = 0;
            while (b > 0) {
                if (x > m - 1) {
                    x = 0;
                    s += 2;
                }
                b--;
                res[s][x] = '^';
                res[s + 1][x] = 'v';
                x++;
            }


            int lastx = x;
            while (a > 0) {
                if (x >= m - 1) {
                    x = lastx;
                    lastx = 0;
                    s++;
                }
                if (x >= m - 1) {
                    x = lastx;
                    lastx = 0;
                    s++;
                }
                a--;
                res[s][x] = '<';
                res[s][x + 1] = '>';
                x += 2;
            }
            for (char[] l : res) {
                out.println(new String(l));
            }

        }

    }

    static class MyScan {
        BufferedReader br;
        StringTokenizer st;

        MyScan(BufferedReader br) {
            this.br = br;
        }

        public MyScan(InputStream in) {
            this(new BufferedReader(new InputStreamReader(in)));
        }

        public void findToken() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public String next() {
            findToken();
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

