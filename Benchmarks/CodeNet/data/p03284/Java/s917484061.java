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
        ABC105_1 solver = new ABC105_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC105_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int NN = in.nextInt();
            int KK = in.nextInt();

            if ((NN % KK) > 0) {
                out.println(1);
            } else out.println(0);

        }

    }
}

