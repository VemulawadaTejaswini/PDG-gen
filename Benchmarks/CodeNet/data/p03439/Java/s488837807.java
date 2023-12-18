import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author rizhiy
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
        PrintWriter out;
        InputReader in;
        int n;

        void rec(int i, int j) {
//            System.out.println(i + " " + j);
            System.out.println((j + i + 1) / 2);
            System.out.flush();
            String kj = in.next();
            if (kj.equals("Vacant")) return;
            System.out.println(i);
            System.out.flush();
            String ki = in.next();
            if (ki.equals("Vacant")) return;
            if (ki.equals(kj)) {
                rec(((j + i + 1) / 2) +1, j - 1);
            } else {
                rec(i + 1, (j + i + 1) / 2);
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            this.out = out;
            this.in = in;
            rec(0, n - 1);
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

