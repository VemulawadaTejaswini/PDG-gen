import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Vector;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        DHandstand solver = new DHandstand();
        solver.solve(1, in, out);
        out.close();
    }

    static class DHandstand {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            String x = in.next();
            ArrayList<Integer> z = new ArrayList<>();
            ArrayList<Integer> o = new ArrayList<>();
            Stack<Character> s = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (s.size() == 0) {
                    s.push(x.charAt(i));
                    continue;
                }
                if (x.charAt(i) != s.peek()) {
                    if (s.peek() == '1') {
                        o.add(s.size());
                    } else {
                        z.add(s.size());
                    }
                    s.clear();
                    s.push(x.charAt(i));
                    continue;
                }
                s.push(x.charAt(i));
            }
            if (s.size() != 0) {
                if (s.peek() == '1') o.add(s.size());
                else z.add(s.size());
            }
            if (z.size() <= k) {
                out.println(n);
                return;
            }
            int zl = 0;
            int zr = 0;
            int ol = 0;
            int or = 0;
            int zc = 0;
            int oc = 0;
            for (int i = 0; i < k && i < z.size(); i++) {
                zr++;
                zc += z.get(i);
            }
            for (int i = 0; i < k + 1 && i < o.size(); i++) {
                or++;
                oc += o.get(i);
            }
            int ans = 0;
            zr--;
            or--;
            while (zr + 1 < z.size()) {
                ans = Math.max(ans, zc + oc);
                zr++;
                zc += z.get(zr) - z.get(zl);
                zl++;
                or++;
                if (or < o.size()) oc += o.get(or);
                oc -= o.get(ol);
                ol++;
            }
//        out.println(z.toString());
//        out.println(o.toString());
            ans = Math.max(ans, zc + oc);
            out.println(ans);


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

