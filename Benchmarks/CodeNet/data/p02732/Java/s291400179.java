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
            int[] k = new int[n];

            HashMap<Integer, Integer> counter = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                counter.put(a, counter.getOrDefault(a, 0) + 1);
                k[i] = a;
            }

            HashMap<Integer, Long> pattern = new HashMap<>();
            for (Integer key : counter.keySet()) {
                long anum = counter.get(key);
                pattern.put(key, anum * (anum - 1) / 2);
            }

            for (int i = 0; i < n; i++) {
                int a = k[i];
                int anum = counter.get(a);
                long result = 0;
                for (Integer key : pattern.keySet()) {
                    if (key == a) {
                        result += (anum - 1) * (anum - 2) / 2;
                    } else {
                        result += pattern.get(key);
                    }
                }
                out.println(result);
            }
        }

    }
}

