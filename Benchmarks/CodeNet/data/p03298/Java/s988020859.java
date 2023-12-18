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
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            String a = s.substring(0, n);
            String b = reverse(s.substring(n));
            long[] hashes1 = buildHashes(a);
            long[] hashes2 = buildHashes(b);
            Arrays.sort(hashes1);
            Arrays.sort(hashes2);
            int p1 = 0;
            int p2 = 0;
            long res = 0;
            while (p1 < hashes1.length && p2 < hashes2.length) {
                long h = Math.min(hashes1[p1], hashes2[p2]);
                int n1 = 0;
                int n2 = 0;
                while (p1 < hashes1.length && hashes1[p1] == h) {
                    ++p1;
                    ++n1;
                }
                while (p2 < hashes2.length && hashes2[p2] == h) {
                    ++p2;
                    ++n2;
                }
                res += n1 * (long) n2;
            }
            out.println(res);
        }

        private long[] buildHashes(String a) {
            int n = a.length();
            int maxMask = 1 << n;
            long[] res = new long[maxMask];
            for (int mask = 0; mask < maxMask; ++mask) {
                long h = 0;
                for (int i = 0; i < n; ++i) {
                    if ((mask & (1 << i)) != 0) {
                        h = h * 3137 + a.charAt(i);
                    }
                }
                h = h * 3137 + 1;
                for (int i = 0; i < n; ++i) {
                    if ((mask & (1 << i)) == 0) {
                        h = h * 3137 + a.charAt(i);
                    }
                }
                res[mask] = h;
            }
            return res;
        }

        private String reverse(String substring) {
            return new StringBuilder(substring).reverse().toString();
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

