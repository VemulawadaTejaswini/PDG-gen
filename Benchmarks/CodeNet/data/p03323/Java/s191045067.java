import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AHappyBirthday solver = new AHappyBirthday();
        solver.solve(1, in, out);
        out.close();
    }

    static class AHappyBirthday {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            int res = Math.min(A, B) * 2 + Math.abs(A - B) * 2;
            System.err.println("res = " + res);
            out.println(res <= 16 ? "Yay!" : ":(");

        }

    }
}

