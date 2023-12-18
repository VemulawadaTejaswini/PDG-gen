import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int h = Integer.parseInt(in.next());
            int w = Integer.parseInt(in.next());

            for (int i = 0; i < h + 2; i++) {
                for (int j = 0; j < w + 2; j++) {
                    if (i == 0 || i == h + 1) {
                        out.print("#");
                    } else if (j == 0 || j == w + 1) {
                        out.print("#");
                    } else {
                        String tmp = in.next();
                        out.print(tmp);
                        j += tmp.length() - 1;
                        continue;
                    }
                }
                out.println();
            }

        }

    }
}

