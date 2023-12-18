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
        DMitsui solver = new DMitsui();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMitsui {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int num = in.nextInt();
            String s = in.next();
            int res = 0;
            for (int i = 0; i < 1000; i++) {
                if (search(i, s)) {
                    res++;
                }
            }
            out.println(res);
        }

        public static boolean search(int num, String s) {
            String x1 = Integer.toString(num / 100);
            String x2 = Integer.toString((num / 10) % 10);
            String x3 = Integer.toString(num % 10);
            if (!s.contains(x1)) {
                return false;
            } else {
                s = s.substring(s.indexOf(x1) + 1);
                if (!s.contains(x2)) {
                    return false;
                } else {
                    s = s.substring(s.indexOf(x2) + 1);
                    if (!s.contains(x3)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }

        }

    }
}

