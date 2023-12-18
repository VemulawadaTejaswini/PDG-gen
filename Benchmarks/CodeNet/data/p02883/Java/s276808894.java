import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        EGluttony solver = new EGluttony();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGluttony {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            long l = 0;
            long r = 1000000_000000_000000L;
            int n = in.nextInt();
            long k = in.nextLong();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) a.add(in.nextInt());
            for (int i = 0; i < n; i++) b.add(in.nextInt());
            Collections.sort(a);
            Collections.sort(b, Collections.reverseOrder());
            while (l < r) {
                long mid = (l + r) / 2;
                long temp = 0;
                for (int i = 0; i < n; i++) temp += Math.max(0L, a.get(i) - (mid / b.get(i)));
                if (temp > k) l = mid + 1;
                else r = mid;
            }
            out.println(r);
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

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

