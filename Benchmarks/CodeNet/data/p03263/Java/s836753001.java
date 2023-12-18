import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMakeThemEven solver = new DMakeThemEven();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMakeThemEven {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            boolean[] a = new boolean[w];
            List<DMakeThemEven.Op> ops = new ArrayList<>();
            for (int y = 0; y < h - 1; y++) {
                for (int x = 0; x < w; x++) {
                    a[x] ^= in.nextInt() % 2 == 1;
                    if (a[x]) {
                        ops.add(new DMakeThemEven.Op(x + 1, y + 1, x + 1, y + 2));
                    }
                }
            }
            boolean b = false;
            for (int x = 0; x < w - 1; x++) {
                b ^= a[x];
                b ^= in.nextInt() % 2 == 1;
                if (b) {
                    ops.add(new DMakeThemEven.Op(x + 1, h, x + 2, h));
                }
            }
            out.println(ops.size());
            for (DMakeThemEven.Op op : ops) {
                out.print(op.b);
                out.print(' ');
                out.print(op.a);
                out.print(' ');
                out.print(op.d);
                out.print(' ');
                out.println(op.c);
            }
        }

        public static class Op {
            int a;
            int b;
            int c;
            int d;

            public Op(int a, int b, int c, int d) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
            }

        }

    }
}

