import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashMap;
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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            Long[] a = new Long[n];
            HashMap<Long, Long> hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                if (hm.containsKey(a[i]))
                    hm.put(a[i], hm.get(a[i]) + 1);
                else
                    hm.put(a[i], 1L);
            }
            Arrays.sort(a, (x1, x2) -> Long.compare(x2, x1));
            long s = 0;
            for (int i = 0; i < n; i++) {
                long t = a[i];
                if (!hm.containsKey(t))
                    continue;
                if (hm.get(t) >= 4) {
                    if (s > 0)
                        out.println(s * t);
                    else
                        out.println(t * t);
                    return;
                } else if (hm.get(t) >= 2) {
                    if (s == 0) {
                        s = t;
                        hm.remove(t);
                    } else {
                        out.println(s * t);
                        return;
                    }
                }
            }

            out.println(0);
        }

    }

    static class InputReader {
        StringTokenizer st;
        BufferedReader br;

        public InputReader(InputStream is) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            this.br = br;
        }

        public String next() {
            if (st == null || !st.hasMoreTokens()) {
                String nextLine = null;
                try {
                    nextLine = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (nextLine == null)
                    return null;
                st = new StringTokenizer(nextLine);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}
 