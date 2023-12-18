import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Set;
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
        GoodSequence solver = new GoodSequence();
        solver.solve(1, in, out);
        out.close();
    }

    static class GoodSequence {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            HashMap<Long, Long> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long a = Long.parseLong(in.next());
                map.put(a, map.getOrDefault(a, 0L) + 1);
            }

            long result = 0;
            Set<Long> keys = map.keySet();
            for (Long key : keys) {
                Long v = map.get(key);
                if (key < v) {
                    result += Math.min(v, v - key);
                } else if (v < key) {
                    result += v;
                }
            }
            out.println(result);
        }

    }
}

