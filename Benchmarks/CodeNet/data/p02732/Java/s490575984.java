import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

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
        BannedK solver = new BannedK();
        solver.solve(1, in, out);
        out.close();
    }

    static class BannedK {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] nums = new int[n + 1];
            int[] k = new int[n];

            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                nums[a]++;
                k[i] = a;
            }

            HashMap<Integer, Long> pattern = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = k[i];
                int anum = nums[a];
                if (pattern.containsKey(a)) {
                    continue;
                }
                if (anum < 2) {
                    pattern.put(a, 0L);
                    continue;
                }
                pattern.put(a, combination(anum, 2));
            }

            for (int i = 0; i < n; i++) {
                int a = k[i];
                int anum = nums[a];
                long result = 0;
                for (Integer key : pattern.keySet()) {
                    if (key == a) {
                        if (anum - 1 < 2) {
                            continue;
                        }
                        result += combination(anum - 1, 2);
                    } else {
                        result += pattern.get(key);
                    }
                }
                out.println(result);
            }
        }

        public static long factorial(long number) {
            if (number <= 1)
                return 1;
            else
                return number * factorial(number - 1);
        }

        static long combination(long a, long b) {
            return factorial(a) / (factorial(b) * factorial(a - b));
        }

    }
}

