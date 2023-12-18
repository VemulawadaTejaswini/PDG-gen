import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
        TaskAC68C solver = new TaskAC68C();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAC68C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long x = in.nextLong();
            System.out.println(findNumOperations(x));
        }

        private long findNumOperations(long x) {
            long start = 1;
            long end = x / 5 + 1;

            long ans = Long.MAX_VALUE;

            while (start <= end) {
                long mid = (start + end) / 2;

                long sum = 0;
                if (mid % 2 == 0) {
                    sum = mid / 2 * 11;
                } else {
                    sum = mid / 2 * 11 + 5;
                }
                if (sum == x) {
                    return mid;
                } else if (sum > x) {
                    ans = Math.min(ans, mid);
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return ans;
        }

    }
}

