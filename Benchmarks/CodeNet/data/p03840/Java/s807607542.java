import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int i = in.nextInt();
            int o = in.nextInt();
            int t = in.nextInt();
            int j = in.nextInt();
            int l = in.nextInt();
            int s = in.nextInt();
            int z = in.nextInt();

            long ans = 0;
            ans += (i%2 == 0) ? i : i - 1;
            if (i%2 == 0) i = 0; else i = 1;

            ans += o;

            ans += (j%2 == 0) ? j : j - 1;
            if (j%2 == 0) j = 0; else j = 1;

            ans += (l%2 == 0) ? l : l - 1;
            if (l%2 == 0) l = 0; else l = 1;

            if (i > 0 && j > 0 && l > 0) ans += 3;
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

