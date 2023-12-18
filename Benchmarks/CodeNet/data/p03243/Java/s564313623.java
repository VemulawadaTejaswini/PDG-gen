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
        ABC111_2 solver = new ABC111_2();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC111_2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String[] N = in.next().split("");
            String leftone = N[0];

            if ((leftone.compareTo(N[1]) == 0) & (leftone.compareTo(N[2]) == 0)) {
                out.println(N[0] + N[0] + N[0]);
                return;
            }

            for (int i = 1; i < 3; i++) {
                if (Integer.parseInt(leftone) > Integer.parseInt(N[i])) {
                    out.println(N[0] + N[0] + N[0]);
                    return;
                }
            }
            leftone = String.valueOf(Integer.parseInt(leftone) + 1);
            out.println(leftone + leftone + leftone);
            return;
        }

    }
}

