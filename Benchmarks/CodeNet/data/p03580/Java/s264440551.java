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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            int ans = 0;
            int i = 0;
            while (i < n) {
                while (i < n && s[i] == '0') {
                    ++i;
                }
                if (i == n) {
                    break;
                }
                List<Integer> cur = new ArrayList<>();
                while (i < n) {
                    int block = 0;
                    while (i < n && s[i] == '1') {
                        ++i;
                        ++block;
                    }
                    cur.add(block);
                    if (i + 1 >= n || s[i + 1] == '0') {
                        ans += calc(cur);
                        break;
                    }
                    ++i;
                }
            }
            out.println(ans);
        }

        private int calc(List<Integer> cur) {
            int sum = 0;
            for (int x : cur) {
                sum += x;
            }
            if (cur.size() == 1) {
                return 0;
            }
            if (cur.size() == 2 && (cur.get(0) == 1 || cur.get(1) == 1)) {
                return sum - 1;
            }
            return sum - 2;
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(in.readLine());
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

