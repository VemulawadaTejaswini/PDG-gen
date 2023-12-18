import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

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
            final int n = in.nextInt();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            List<Integer> c = new ArrayList<>();
            for (int i = 0; i < n; i++) a.add(in.nextInt());
            for (int i = 0; i < n; i++) b.add(in.nextInt());
            for (int i = 0; i < n; i++) c.add(in.nextInt());
            a.sort(Comparator.naturalOrder());
            c.sort(Comparator.reverseOrder());

            int ans = 0;
            for (int x : b) {
                int min = 0;
                int max = n - 1;
                while (true) {
                    int mid = (min + max) / 2;
                    if (mid == min || mid == max) break;
                    if (a.get(mid) < x) min = mid;
                    else max = mid - 1;
                }
                int ba = (a.get(max) < x) ? max : min;
                min = 0;
                max = n - 1;
                while (true) {
                    int mid = (min + max) / 2;
                    if (mid == min || mid == max) break;
                    if (c.get(mid) > x) min = mid;
                    else max = mid - 1;
                }
                int bc = (c.get(max) > x) ? max : min;
                ans += ++ba * ++bc;
            }

            out.println(ans);
        }

    }
}

