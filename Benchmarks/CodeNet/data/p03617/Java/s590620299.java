import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CodeMonk
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public Long min(Long... arr) {
            return Collections.min(Arrays.asList(arr));
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            long q = in.nextLong();
            long h = in.nextLong();
            long s = in.nextLong();
            long d = in.nextLong();
            long N = in.nextInt();
            long ans = (N / 2) * min(8 * q, 4 * h, 2 * s, d) + (N % 2) * min(4 * q, 2 * h, s);
            out.println(ans);
        }

    }
}

