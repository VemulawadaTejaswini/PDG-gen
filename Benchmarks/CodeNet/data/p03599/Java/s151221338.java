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
        int A;
        int B;
        int C;
        int D;
        int E;
        int F;

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            A = in.Int() * 100;
            B = in.Int() * 100;
            C = in.Int();
            D = in.Int();
            E = in.Int();
            F = in.Int();

            boolean[] wa = new boolean[F + 1];
            Arrays.fill(wa, false);
            wa[0] = true;
            for (int i = 0; i <= F; i++) {
                if (wa[i]) {
                    for (int w : Arrays.asList(A, B)) {
                        for (int j = i + w; j <= F; j += w) {
                            wa[j] = true;
                        }
                    }
                }
            }
            boolean[] sa = new boolean[F + 1];
            Arrays.fill(sa, false);
            sa[0] = true;
            for (int i = 0; i <= F; i++) {
                if (sa[i]) {
                    for (int s : Arrays.asList(C, D)) {
                        for (int j = i + s; j <= F; j += s) {
                            sa[j] = true;
                        }
                    }
                }
            }
            int[] ans = new int[2];
            double p = 0;
            for (int i = 0; i <= F; i++) {
                if (wa[i]) {
                    int s = (i / 100) * E;
                    while (0 <= s && !sa[s]) s--;
                    if (i + s > F) continue;
                    double tmp = 100.0 * s / (i + s);
                    if (p - tmp < 0) {
                        p = tmp;
                        ans[0] = i + s;
                        ans[1] = s;
                    }
                }
            }
            out.println(ans[0] + " " + ans[1]);
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
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

