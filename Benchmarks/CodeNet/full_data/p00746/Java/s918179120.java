import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Scanner;
import java.util.OptionalInt;

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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        private static final int[] DX = {-1, 0, 1, 0};
        private static final int[] DY = {0, -1, 0, 1};

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            while (n != 0) {
                int[] x = new int[n], y = new int[n];
                for (int i = 1; i < n; i++) {
                    int t = in.nextInt(), d = in.nextInt();
                    x[i] = x[t] + DX[d];
                    y[i] = y[t] + DY[d];
                }
                int w = IntStream.of(x).max().getAsInt() - IntStream.of(x).min().getAsInt() + 1;
                int h = IntStream.of(y).max().getAsInt() - IntStream.of(y).min().getAsInt() + 1;
                out.println(w + " " + h);
                n = in.nextInt();
            }
        }

    }
}


