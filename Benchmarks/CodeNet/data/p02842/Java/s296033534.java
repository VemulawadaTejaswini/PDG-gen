import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BMitsui solver = new BMitsui();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMitsui {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a = 0;
            int res = -1;
            while (true) {
                int b = (int) (1.08 * (double) a);
                if (b == n) {
                    res = a;
                    break;
                }
                if (b > n) {
                    break;
                }
                a++;
            }
            if (res == -1) {
                out.println(":(");
            } else {
                out.println(res);
            }
        }

    }
}

