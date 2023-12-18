import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int M = in.Int();

            int c = N / 2;
            List<int[]> ans = new ArrayList<>();
            if (N % 2 == 0) {
                boolean[] f = new boolean[N + 1];
                ans.add(new int[]{1, 2});
                int l = 3;
                int r = 2;
                for (int i = 1; i < M; i++) {
                    ans.add(new int[]{l, l + r});
                    f[l] = true;
                    f[l + r] = true;
                    while (!f[l]) l++;
                    r += 2;
                }
            } else {
                for (int i = 0; i < M; i++) {
                    ans.add(new int[]{(c - i), (c + 1 + i)});
                }
            }
            ans.forEach(is -> out.println(is[0] + " " + is[1]));
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

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

