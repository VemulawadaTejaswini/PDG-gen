import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
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
        ThisMessageWillSelf solver = new ThisMessageWillSelf();
        solver.solve(1, in, out);
        out.close();
    }

    static class ThisMessageWillSelf {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            long result = 0;

            Map<Integer, Integer> p = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                int tall = in.nextInt();

                int key = i + tall;
                p.put(key, p.getOrDefault(key, 0) + 1);

                if (p.containsKey(i - tall)) {
                    result += p.get(i - tall);
                }
            }

            out.append(String.valueOf(result));
        }

    }
}

