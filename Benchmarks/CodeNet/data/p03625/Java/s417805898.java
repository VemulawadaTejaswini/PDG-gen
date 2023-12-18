import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
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
        MakeRectangle solver = new MakeRectangle();
        solver.solve(1, in, out);
        out.close();
    }

    static class MakeRectangle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Map<Long, Long> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                long a = in.nextLong();
                map.put(a, map.getOrDefault(a, 0L) + 1);
            }
            List<Long> list = new ArrayList<>(map.keySet());
            Collections.sort(list, Collections.reverseOrder());

            long a = 0;
            long b = 0;

            for (Long key : list) {
                if (map.get(key) < 2) {
                    continue;
                }
                if (a == 0) {
                    a = key;
                } else if (b == 0) {
                    b = key;
                }

                if (a > 0 && b > 0) {
                    break;
                }
            }
            out.print(a * b);
        }

    }
}

