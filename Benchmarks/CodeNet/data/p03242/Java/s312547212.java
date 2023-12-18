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
        ABC111 solver = new ABC111();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC111 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String N = in.next();

            N = N.replace("1", "q");
            N = N.replace("9", "i");

            N = N.replace("q", "9");
            N = N.replace("i", "1");

            out.println(N);

        }

    }
}

