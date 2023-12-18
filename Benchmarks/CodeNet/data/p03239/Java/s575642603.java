import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

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
        TimeLimitExceeded solver = new TimeLimitExceeded();
        solver.solve(1, in, out);
        out.close();
    }

    static class TimeLimitExceeded {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int N = in.nextInt();
            int limitedTime = in.nextInt();

            Map<Integer, Integer> input = new TreeMap<>();

            // 経路値の入力の取得
            for (int i = 0; i < N; i++) {
                input.put(in.nextInt(), in.nextInt());
            }

            int ans = 0;
            for (Map.Entry<Integer, Integer> e : input.entrySet()) {
                if (e.getValue() <= limitedTime) {
                    ans = e.getKey();
                    break;
                }
            }

            if (ans == 0) {
                out.println("TLE");
                return;
            }

            out.println(ans);
        }

    }
}

