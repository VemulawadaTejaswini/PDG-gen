import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) arr[i] = in.nextInt();
            int ans = 0;
            ArrayList<Integer> p = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (arr[i] == i) p.add(i);
            }
            int add = 999999;
            ArrayList<TaskD.Pair> pairs = new ArrayList<>();

            for (int i = 1; i < p.size(); i++) {
                pairs.add(new TaskD.Pair(p.get(i), p.get(i - 1)));
            }
            Collections.sort(pairs);
            boolean[] v = new boolean[n + 1];
            for (int i = 0; i < pairs.size(); ++i) {
                if (!v[pairs.get(i).from] && !v[pairs.get(i).to]) {
                    ans += pairs.get(i).cost;
                    v[pairs.get(i).from] = true;
                    v[pairs.get(i).to] = true;
                }
            }
            for (int i = 0; i < pairs.size(); i++) {
                if (!v[pairs.get(i).from]) {
                    v[pairs.get(i).from] = true;
                    ++ans;
                }
                if (!v[pairs.get(i).to]) {
                    v[pairs.get(i).to] = true;
                    ++ans;
                }
            }
            out.println(ans);
        }

        static class Pair implements Comparable<TaskD.Pair> {
            int from;
            int to;
            int cost;

            public Pair(int from, int to) {
                this.from = from;
                this.to = to;
                this.cost = Math.abs(from - to);
            }


            public int compareTo(TaskD.Pair o) {
                return Integer.compare(cost, o.cost);
            }


            public String toString() {
                return "Pair{" +
                        "from=" + from +
                        ", to=" + to +
                        ", cost=" + cost +
                        '}';
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException ex) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

