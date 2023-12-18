import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Collections;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        DCake123 solver = new DCake123();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCake123 {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int k = in.nextInt();
            long a[] = new long[x];
            long b[] = new long[y];
            long c[] = new long[z];
            for (int i = 0; i < x; i++) a[i] = in.nextLong();
            for (int i = 0; i < y; i++) b[i] = in.nextLong();
            for (int i = 0; i < z; i++) c[i] = in.nextLong();
            ArrayList<Long> p = new ArrayList<>();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    p.add(a[i] + b[j]);
                }
            }
            Collections.sort(p, Collections.reverseOrder());
            ArrayList<Long> q = new ArrayList<>();
            for (int i = 0; i < k && i < x * y; i++) {
                for (int j = 0; j < z; j++) {
                    q.add(p.get(i) + c[j]);
                }
            }
            Collections.sort(q, Collections.reverseOrder());
            long ans = 0;
            for (int i = 0; i < k; i++) {
                out.println(q.get(i));
            }
//        out.println(ans);
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

