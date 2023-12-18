import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
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
            TreeSet<Integer> tree = new TreeSet<>();
            int[] count2 = new int[123];
            int N = in.nextInt();
            for (int i = 0; i < N; i++) {
                int x = in.nextInt();
                int twos = 0;
                while ((x & 1) == 0) {
                    twos++;
                    x >>= 1;
                }
                count2[twos]++;
                tree.add(twos);
            }
            int last = tree.first();
            count2[last]--;
            if (count2[last] == 0) tree.remove(last);
            for (int i = 1; i < N; i++) {
                int required = 2 - last;
                Integer next = tree.ceiling(required);
                if (next == null) {
                    out.print("No");
                    return;
                }
                count2[next]--;
                if (count2[next] == 0) tree.remove(next);
                last = next;
            }
            out.print("Yes");
        }

    }

    static class InputReader {
        private int lenbuf = 0;
        private int ptrbuf = 0;
        private InputStream in;
        private byte[] inbuf = new byte[1024];

        public InputReader(InputStream in) {
            this.in = in;
        }

        private int readByte() {
            if (lenbuf == -1) throw new InputMismatchException();
            if (ptrbuf >= lenbuf) {
                ptrbuf = 0;
                try {
                    lenbuf = in.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (lenbuf <= 0) return -1;
            }
            return inbuf[ptrbuf++];
        }

        public int nextInt() {
            int num = 0, b;
            boolean minus = false;
            while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-')) ;
            if (b == '-') {
                minus = true;
                b = readByte();
            }

            while (true) {
                if (b >= '0' && b <= '9') {
                    num = num * 10 + (b - '0');
                } else {
                    return minus ? -num : num;
                }
                b = readByte();
            }
        }

    }
}

