import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author acesine
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
            int H = in.nextInt(), W = in.nextInt();
            for (int i = 0; i < W + 2; i++) {
                out.print("#");
            }
            out.print("\n");
            for (int i = 0; i < H; i++) {
                out.println(String.format("#%s#", in.next()));
            }
            for (int i = 0; i < W + 2; i++) {
                out.print("#");
            }
            out.print("\n");
        }

    }
}

