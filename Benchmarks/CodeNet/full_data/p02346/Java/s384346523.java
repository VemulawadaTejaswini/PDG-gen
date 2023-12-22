import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();

            BinaryIndexedTree bit = new BinaryIndexedTree(n);
            for (int i = 0; i < q; i++) {
                int com = in.nextInt();

                if (com == 0) {
                    int x = in.nextInt() - 1;
                    int y = in.nextInt();
                    bit.add(x, y);
                } else {
                    int x = in.nextInt() - 1;
                    int y = in.nextInt() - 1;
                    out.println(bit.sum(y) - (x > 0 ? bit.sum(x - 1) : 0));
                }
            }
        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }

    static class BinaryIndexedTree {
        int n;
        int[] bit;

        public BinaryIndexedTree(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        public int sum(int i) {
            i++;
            int s = 0;
            while (i > 0) {
                s += bit[i];
                i -= i & -i;
            }
            return s;
        }

        public void add(int i, int x) {
            i++;
            while (i <= n) {
                bit[i] += x;
                i += i & -i;
            }
        }

    }
}