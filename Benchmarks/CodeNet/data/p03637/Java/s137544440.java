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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int num = in.nextInt();
            int number;
            int a = 0, b = 0, c = 0;
            for (int i = 0; i < num; i++) {
                number = in.nextInt();
                if (number % 4 == 0) {
                    a += 1;
                } else if (number % 2 == 0) {
                    b += 1;
                } else {
                    c += 1;
                }
            }
            if (b == 0) {
                if (a + 1 >= c) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            } else {
                if (a >= c) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }
        }

    }
}

