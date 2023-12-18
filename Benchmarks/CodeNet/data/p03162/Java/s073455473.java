import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }

    private static class Solver {
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt();
            int aLast = 0, bLast = 0, cLast = 0;
            for (int i = 0; i < n; i++) {
                int a = inp.nextInt(), b = inp.nextInt(), c = inp.nextInt();
                int aLast2 = aLast, bLast2 = bLast, cLast2 = cLast;
                aLast = Math.max(bLast2, cLast2) + a;
                bLast = Math.max(aLast2, cLast2) + b;
                cLast = Math.max(aLast2, bLast2) + c;
            }
            out.print(Math.max(Math.max(aLast, bLast), cLast));
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
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