import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] s = new int[n + 1];
            s[0] = 0;
            for (int i = 1; i <= n; i++) {
                s[i] = in.nextInt() + s[i - 1];
                s[i] %= k;
            }

            for (int i = 1; i <= n; i++) {
                s[i] -= i;
                s[i] = Math.floorMod(s[i], k);
            }

            HashMap<Integer, Integer> list = new HashMap<>();
            for (int j = 0; j < Math.min(k, n + 1); j++) {
                int val = list.getOrDefault(s[j], 0);
                list.put(s[j], val + 1);
            }
            long res = 0;
            for (Integer id : list.keySet()) {
                int val = list.get(id);
                res += val * (val - 1) / 2;
            }

            for (int i = 0; i + k <= n; i++) {
                int val1 = list.get(s[i]);
                if (val1 == 1)
                    list.remove(s[i]);
                else
                    list.put(s[i], val1 - 1);

                int val2 = list.getOrDefault(s[i + k], 0);
                list.put(s[i + k], val2 + 1);

                res += val2;
            }

            out.println(res);
        }

    }
}

