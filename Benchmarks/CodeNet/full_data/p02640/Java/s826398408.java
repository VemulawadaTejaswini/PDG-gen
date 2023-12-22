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
        CraneAndTurtle solver = new CraneAndTurtle();
        solver.solve(1, in, out);
        out.close();
    }

    static class CraneAndTurtle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();

            if (y < 2 * x || 4 * x < y || y % 2 == 1) {
                out.append("No\n");
                return;
            }

            for (int i = 0; i <= x; i++) {
                if ((2 * i + 4 * (x - i)) == y) {
                    out.append("Yes\n");
                    return;
                }

            }
            out.append("No\n");
        }

    }
}

