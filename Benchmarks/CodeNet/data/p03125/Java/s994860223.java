import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABA solver = new ABA();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = Integer.parseInt(in.next());
            int B = Integer.parseInt(in.next());
            if (B % A == 0) {
                out.println(B + A);
            } else {
                out.println(B - A);

            }
        }

    }
}

