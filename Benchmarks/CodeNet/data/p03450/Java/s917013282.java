import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DPeopleOnALine solver = new DPeopleOnALine();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPeopleOnALine {
        private static final String YES = "Yes";
        private static final String NO = "No";
        private static final int ORIGIN = 5 * 100_000_000;

        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints(), m = in.ints();
            Map<Integer, Integer> p = new HashMap<>();
            for (int i = 0; i < m; i++) {
                int l = in.ints(), r = in.ints(), d = in.ints();
                if (p.containsKey(l)) {
                    if (p.containsKey(r)) {
                        if (p.get(r) - p.get(l) != d) {
                            out.println(NO);
                            return;
                        }
                    } else {
                        p.put(r, p.get(l) + d);
                    }
                } else if (p.containsKey(r)) {
                    p.put(l, p.get(r) - d);
                } else {
                    p.put(l, ORIGIN);
                    p.put(r, ORIGIN + d);
                }
            }
            out.println(YES);
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

