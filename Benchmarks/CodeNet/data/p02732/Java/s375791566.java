import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        DBannedK solver = new DBannedK();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBannedK {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] a = new int[n];
            Arrays.setAll(a, i -> in.nextInt());
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (map.containsKey(a[i])) {
                    map.put(a[i], map.get(a[i]) + 1);
                } else {
                    map.put(a[i], 1);
                }
            }
            long sum = 0;
            for (int e : map.values()) {
                sum += (long) e * (e - 1) / 2;
            }
            long[] ans = new long[n];
            for (int i = 0; i < n; i++) {
                int v = map.get(a[i]);
                out.println(sum - v + 1);
            }
        }

    }
}

