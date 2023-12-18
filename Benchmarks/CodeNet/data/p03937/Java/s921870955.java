import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by fcdkbear on 15.10.16.
 */
public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        new Task().solve(in, out);
        out.close();
    }


    static class Task {

        public void solve(InputReader in, PrintWriter out) {

            int n = in.nextInt();
            int m = in.nextInt();
            String[] a = new String[n];
            int total = 0;
            for (int i = 0; i < n; ++i) {
                a[i] = in.next();
                for (int j = 0; j < m; ++j) {
                    if (a[i].charAt(j) == '#') {
                        total++;
                    }
                }
            }
            int x = 0;
            int y = 0;
            for (int i = 0; i < total; ++i) {
                if ((x >= n) || (y >= m) || (a[x].charAt(y) != '#')) {
                    out.println("Impossible");
                    return;
                }
                if ((x + 1 < n) && (a[x + 1].charAt(y) == '#')) {
                    x++;
                } else {
                    y++;
                }
            }
            out.println("Possible");

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

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}
