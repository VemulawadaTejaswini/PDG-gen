import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskB_147 solver = new TaskB_147();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB_147 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(s.length() - 1 - i);
                if (c1 != c2)
                    res++;
            }

            out.println(res / 2);
        }

    }
}

