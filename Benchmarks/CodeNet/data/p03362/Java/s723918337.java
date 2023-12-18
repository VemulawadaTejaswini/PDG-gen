import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
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
        FiveEverywhere solver = new FiveEverywhere();
        solver.solve(1, in, out);
        out.close();
    }

    static class FiveEverywhere {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            boolean[] prime = eratos(55_556);

            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < prime.length; i++) {
                if (prime[i] && i % 5 == 0) {
                    nums.add(i);
                }
                if (nums.size() == n) {
                    break;
                }
            }

            out.print(nums.stream().map(Object::toString).collect(Collectors.joining(" ")));

        }

        static boolean[] eratos(int n) {
            boolean[] results = new boolean[n + 1];
            Arrays.fill(results, true);

            results[0] = false;
            results[1] = false;

            for (int i = 2; i <= n; i++) {
                int j = i + i;
                while (j <= n) {
                    results[j] = false;
                    j = j + i;
                }
            }
            return results;
        }

    }
}

