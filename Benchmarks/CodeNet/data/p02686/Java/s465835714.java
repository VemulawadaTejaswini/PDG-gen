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
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int[][] bl = new int[N][2];
            for (int i = 0; i < N; i++) {
                String s = in.next();
                String t = null;
                while (true) {
                    t = s.replaceAll("\\(\\)", "");
                    if (s.equals(t)) {
                        break;
                    }
                    s = t;
                }
                int r = 0, l = 0;
                int len = s.length();
                while (r < len && s.charAt(r) == ')') {
                    r++;
                }
                while (l < len && s.charAt(s.length() - l - 1) == '(') {
                    l++;
                }
                bl[i][0] = l;
                bl[i][1] = r;
            }
            Arrays.sort(bl, (o1, o2) -> {
                int c = Integer.compare(o2[0], o1[0]);
                if (c == 0) c = Integer.compare(o1[1], o2[1]);
                return c;
            });
            if (bl[0][1] > 0 || bl[N - 1][0] > 0) {
                out.println("No");
                return;
            }
            long cnt = 0;
            for (int i = 0; i < N; i++) {
                cnt += bl[i][0] - bl[i][1];
                if (cnt < 0) {
                    out.println("No");
                    return;
                }
            }
            out.println(cnt == 0 ? "Yes" : "No");
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

