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
        expired solver = new expired();
        solver.solve(1, in, out);
        out.close();
    }

    static class expired {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int b = in.nextInt();
            int a = in.nextInt();
            if (a <= b) {
                out.print("delicious");
                return;
            }
            if (a - b <= x) {
                out.println("safe");
                return;
            }
            out.println("dangerous");
        }

    }
}

