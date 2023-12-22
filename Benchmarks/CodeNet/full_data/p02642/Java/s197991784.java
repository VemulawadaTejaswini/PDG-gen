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
        NotDivisible solver = new NotDivisible();
        solver.solve(1, in, out);
        out.close();
    }

    static class NotDivisible {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            Arrays.sort(nums);
            if (nums[0] == nums[n - 1]) {
                out.append("0\n");
                return;
            }

            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    if (i == j || nums[j] == 0) {
                        continue;
                    }
                    if (nums[j] % nums[i] == 0) {
                        nums[j] = 0;
                    }
                }
            }

            int result = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    result++;
                }
            }
            out.append(String.valueOf(result));
        }

    }
}

