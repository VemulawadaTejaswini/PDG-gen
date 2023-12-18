import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC104_1 solver = new ABC104_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC104_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int RR = in.nextInt();

            if (RR < 1200) {
                out.println("ABC");
            } else if (RR < 2800) {
                out.println("ARC");
            } else {
                out.println("AGC");
            }
        }

    }
}

