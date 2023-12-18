import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
 * @author __shangu__
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CID solver = new CID();
        solver.solve(1, in, out);
        out.close();
    }

    static class CID {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt(), m = in.nextInt(), cnt[] = new int[n + 10];
            City[] cities = new City[m];
            for (int i = 0; i < m; ++i) {
                cities[i] = new City();
                cities[i].p = in.nextInt();
                cities[i].y = in.nextInt();
                cities[i].idx = i;
            }
            Arrays.sort(cities, Comparator.comparingInt(a -> a.y));
            String ans[] = new String[m];
            for (int i = 0; i < m; ++i) {
                int p = cities[i].p, idx = cities[i].idx;
                StringBuilder stringBuilder = new StringBuilder(String.format("%06d", p)).append(String.format("%06d", ++cnt[p]));
                ans[idx] = stringBuilder.toString();
            }
            for (int i = 0; i < m; ++i) out.println(ans[i]);
        }

        class City {
            int p;
            int y;
            int idx;

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

