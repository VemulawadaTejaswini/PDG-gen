import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Comparator;
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
        CID solver = new CID();
        solver.solve(1, in, out);
        out.close();
    }

    static class CID {
        public void solve(int testNumber, LightScanner in, PrintWriter out) {
            int n = in.ints();
            int m = in.ints();
            CID.City[] c = new CID.City[m];
            CID.City[] s = new CID.City[m];

            for (int i = 0; i < m; i++) {
                s[i] = c[i] = new CID.City(i, in.ints(), in.ints());
            }
            Arrays.sort(s, Comparator.comparing(q -> q.year));
            int[] b = new int[n + 1];
            for (CID.City q : s) {
                b[q.pref]++;
                q.app = b[q.pref];
            }
            for (CID.City q : c) {
                out.println(String.format("%06d", q.pref) + String.format("%06d", q.app));
            }
        }

        private static class City {
            int index;
            int year;
            int pref;
            int app = -1;

            public City(int index, int pref, int year) {
                this.index = index;
                this.year = year;
                this.pref = pref;
            }

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

