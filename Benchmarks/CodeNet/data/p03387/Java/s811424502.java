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
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int max = Math.max(Math.max(a, b), c);
            int cnt = 0;
            while (1 < Math.abs(max - a)) {
                a += 2;
                cnt++;
            }
            while (1 < Math.abs(max - b)) {
                b += 2;
                cnt++;
            }
            while (1 < Math.abs(max - c)) {
                c += 2;
                cnt++;
            }

            if ((max - c + max - b + max - a) == 0) {
                out.print(cnt);
            } else if ((max - c + max - b + max - a) == 1) {
                out.print(cnt + 2);
            } else if ((max - c + max - b + max - a) == 2) {
                out.print(cnt + 1);
            }
        }

    }
}

