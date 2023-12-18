import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ZYCSwing
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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            Map<Long, Integer> mm = new HashMap<>();
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = in.nextInt();
            long sum = 0;
            mm.put(0L, 1);
            long res = 0;
            for (int i = 0; i < n; ++i) {
                sum += a[i];
                if (mm.containsKey(sum)) {
                    res += mm.get(sum);
                    mm.put(sum, mm.get(sum) + 1);
                } else {
                    mm.put(sum, 1);
                }
            }
            out.println(res);
        }

    }
}

