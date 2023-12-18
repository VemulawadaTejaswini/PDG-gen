import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Aeroui
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            s = s.substring(0, s.length() - 1);

            while (!s.isEmpty()) {
                String s1 = s.substring(0, s.length() / 2);
                String s2 = s.substring(s.length() / 2);

                //out.println(s1);
                //out.println(s2);
                if (s1.equals(s2)) {
                    out.println(s.length());
                    return;
                }

                s = s.substring(0, s.length() - 1);
            }

        }

    }
}

