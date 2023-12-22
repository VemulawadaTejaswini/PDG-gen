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
            boolean[][] map = new boolean[n + 1][n + 1];
            int[] tall = new int[n + 1];

            Map<Integer, Integer> p = new HashMap<>();

            for (int i = 1; i <= n; i++) {
                tall[i] = in.nextInt();

                int key = i - tall[i];
                p.put(key, p.getOrDefault(key, 0) + 1);
            }

            int result = 0;
            for (int i = 1; i <= n; i++) {
                int key = i + tall[i];
                if (p.containsKey(key)) {
                    result += p.get(key);
                }
            }

            out.append(String.valueOf(result));
        }

    }
}

