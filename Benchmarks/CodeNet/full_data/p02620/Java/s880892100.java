import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
            int D = in.Int();
            int N = 26;
            int[] c = in.Int(N);
            int[][] s = new int[D][N];
            for (int i = 0; i < D; i++) {
                s[i] = in.Int(N);
            }
            int[] t = new int[D];
            for (int i = 0; i < D; i++) {
                t[i] = in.Int() - 1;
            }
            int M = in.Int();
            int[] d = new int[M];
            int[] q = new int[M];
            for (int i = 0; i < M; i++) {
                d[i] = in.Int() - 1;
                q[i] = in.Int() - 1;
            }

            for (int m = 0; m < M; m++) {
                t[d[m]] = q[m];
                int score = 0;
                int[] last = new int[N];
                for (int di = 0; di < D; di++) {
                    score += s[di][t[di]];
                    last[t[di]] = di + 1;
                    for (int i = 0; i < N; i++) {
                        if (t[di] != i) {
                            score -= c[i] * ((di + 1) - last[i]);
                        }
                    }
                }
                out.println(score);
            }
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

        public int[] Int(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Int();
            }
            return a;
        }

    }
}

