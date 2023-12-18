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
        management solver = new management();
        solver.solve(1, in, out);
        out.close();
    }

    static class management {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] nums = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                int boss = in.nextInt();
                nums[boss]++;
            }

            for (int i = 1; i <= n; i++) {
                out.println(nums[i]);
            }
        }

    }
}

