							import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        C755 solver = new C755();
        solver.solve(1, in, out);
        out.close();
    }

    static class C755 {
        public void build(HashSet<String> h, StringBuilder str, ArrayList<Integer> a, boolean s, boolean f, boolean t) {
            if (str.length() >= 10) {
                return;
            }
            StringBuilder x = new StringBuilder(str.toString());
            StringBuilder y = new StringBuilder(str.toString());
            StringBuilder z = new StringBuilder(str.toString());
            if (s && f && t && !h.contains(str.toString()) && str.length() > 0) {
                h.add(str.toString());
                a.add(Integer.parseInt(str.toString()));
            }
            x.append("7");
            y.append("5");
            z.append("3");
            build(h, x, a, true, f, t);
            build(h, y, a, s, true, t);
            build(h, z, a, s, f, true);
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            ArrayList<Integer> a = new ArrayList<>();
            StringBuilder x = new StringBuilder("");
            HashSet<String> h = new HashSet<>();
            build(h, x, a, false, false, false);
            Collections.sort(a);
            int n = in.nextInt();
            int l = 0;
            int r = a.size() - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (a.get(mid) < n) l = mid + 1;
                else r = mid;
            }
            if (n >= a.get(a.size() - 1)) {
                out.println(a.size());
                return;
            }
            out.println(l);
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

