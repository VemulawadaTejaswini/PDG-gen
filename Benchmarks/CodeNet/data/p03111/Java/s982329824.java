import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.OptionalInt;
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
        int N;
        int A;
        int B;
        int C;
        int[] l;

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            N = in.Int();
            A = in.Int();
            B = in.Int();
            C = in.Int();
            l = in.Int(N);

            int ans = calc(0, 0, 0, 0);
            out.println(ans);
        }

        private int calc(int i, int a, int b, int c) {
            if (i == N) {
                if (a > 0 && b > 0 && c > 0)
                    return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
                return 1 << 30;
            }

            int n = l[i];
            int a1 = calc(i + 1, a, b, c);
            int a2 = calc(i + 1, a + n, b, c) + 10;
            int a3 = calc(i + 1, a, b + n, c) + 10;
            int a4 = calc(i + 1, a, b, c + n) + 10;
            return IntStream.of(a1, a2, a3, a4).min().getAsInt();
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

