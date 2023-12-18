import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        TaskATG1 solver = new TaskATG1();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskATG1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] l = new int[2 * n];

            int sum = 0;
            for (int i = 0; i < 2 * n; i++) {
                l[i] = in.nextInt();
            }
            Arrays.sort(l);
            for (int i = 1; i <= 2 * n; i++) {
                if (i % 2 != 0) {
                    sum += l[i - 1];
                }
            }
            out.println(sum);
        }

    }
}
