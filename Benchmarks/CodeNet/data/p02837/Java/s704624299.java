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
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.nextInt();

            int[][] com = new int[N + 1][N + 1];
            for (int i = 1; i <= N; i++) {
                Arrays.fill(com[i], -1);
                int A = in.nextInt();
                for (int j = 0; j < A; j++) {
                    int x = in.nextInt();
                    int y = in.nextInt();
                    com[i][x] = y;
                }
            }

            int[] rev = new int[]{1, 0};
            int max = 0;
            int m = (int) Math.pow(2, N);
            for (int i = 0; i < m; i++) {
                boolean b = true;
                for (int j = 0; b && j < N; j++) {
                    int cur = (i >> j) % 2;
                    for (int k = 0; b && k < N; k++) {
                        if (j == k) continue;
                        if (com[j][k] == -1) continue;
                        if (cur == 0) {
                            b = rev[com[j][k]] == (i >> k) % 2;
                        } else {
                            b = rev[com[j][k]] != (i >> k) % 2;
                        }
                    }
                }
                if (b) {
                    max = Math.max(max, Integer.bitCount(i));
                }
            }
            out.println(max);
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

