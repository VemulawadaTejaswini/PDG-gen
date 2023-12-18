import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
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
        XorSum solver = new XorSum();
        solver.solve(1, in, out);
        out.close();
    }

    static class XorSum {
        public static int MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<Map<Integer, Integer>> list = new ArrayList<>();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                list.add(new HashMap<>());
            }
            long result = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {

                    if (!list.get(i).containsKey(j)) {
                        list.get(i).put(j, (int) ((a[i] ^ a[j]) % MOD));
                    }
                    result += list.get(i).get(j);
                    result %= MOD;
                }
            }
            out.println(result);

        }

    }
}

