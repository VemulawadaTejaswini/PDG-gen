import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
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
            int[] a = in.nextIntArray(n);
            int[] c1 = new int[123456];
            int[] c2 = new int[123456];
            PriorityQueue<Integer> pq1 = new PriorityQueue<>(new Comparator<Integer>() {

                public int compare(Integer o1, Integer o2) {
                    return c1[o2] - c1[o1];
                }
            });
            PriorityQueue<Integer> pq2 = new PriorityQueue<>(new Comparator<Integer>() {

                public int compare(Integer o1, Integer o2) {
                    return c2[o2] - c2[o1];
                }
            });
            int ct1 = 0;
            int ct2 = 0;
            for (int i = 0; i < n; i += 2) {
                ++ct1;
                ++c1[a[i]];
            }
            for (int i = 1; i < n; i += 2) {
                ++ct2;
                ++c2[a[i]];
            }
            for (int i = 1; i < c1.length; ++i) {
                if (c1[i] != 0) pq1.add(i);
                if (c2[i] != 0) pq2.add(i);
            }
            int op = n;
            Integer v11 = pq1.poll();
            Integer v12 = pq1.poll();
            Integer v21 = pq2.poll();
            Integer v22 = pq2.poll();
            if (v11 == null) v11 = 0;
            if (v12 == null) v12 = 0;
            if (v21 == null) v21 = 0;
            if (v22 == null) v22 = 0;
            if (!v11.equals(v21)) op = Math.min(op, n - c1[v11] - c2[v21]);
            if (!v12.equals(v21)) op = Math.min(op, n - c1[v11] - c2[v22]);
            if (!v11.equals(v22)) op = Math.min(op, n - c1[v12] - c2[v21]);
            if (!v12.equals(v22)) op = Math.min(op, n - c1[v12] - c2[v22]);
            out.println(op);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

        public InputReader(InputStream var1) {
            this.stream = var1;
        }

        private int pread() {
            if (this.pnumChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.pnumChars) {
                    this.curChar = 0;

                    try {
                        this.pnumChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.pnumChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public int nextInt() {
            int var1;
            for (var1 = this.pread(); this.isSpaceChar(var1); var1 = this.pread()) {
                ;
            }

            byte var2 = 1;
            if (var1 == 45) {
                var2 = -1;
                var1 = this.pread();
            }

            int var3 = 0;

            do {
                if (var1 == 44) {
                    var1 = this.pread();
                }

                if (var1 < 48 || var1 > 57) {
                    throw new InputMismatchException();
                }

                var3 *= 10;
                var3 += var1 - 48;
                var1 = this.pread();
            } while (!this.isSpaceChar(var1));

            return var3 * var2;
        }

        public int[] nextIntArray(int var1) {
            int[] var2 = new int[var1];

            for (int var3 = 0; var3 < var1; ++var3) {
                var2[var3] = this.nextInt();
            }

            return var2;
        }

        private boolean isSpaceChar(int var1) {
            return var1 == 32 || var1 == 10 || var1 == 13 || var1 == 9 || var1 == -1;
        }

    }
}

