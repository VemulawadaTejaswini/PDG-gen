import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
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
            String o = in.nextLine();
            String e = in.nextLine();
            String password = "";

            int size = Math.max(o.length(), e.length());

            for (int i = 0; i < size; ++i) {
                if (i < o.length()) {
                    password += String.valueOf(o.charAt(i));
                }

                if (i < e.length()) {
                    password += String.valueOf(e.charAt(i));
                }
            }

            out.println(password);
        }

    }
}