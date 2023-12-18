import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            char[][] s = new char[N][];
            for (int i = 0; i < N; i++) {
                s[i] = in.next().toCharArray();
            }
            long counter = 0;
            Map<String, Long> mp = new HashMap<>();
            for (int i = 0; i < N; i++) {
                Arrays.sort(s[i]);
                mp.compute(String.valueOf(s[i]), (key, value) -> value == null ? 1 : value + 1);
            }

            for (long value : mp.values()) {
                counter += value * (value - 1) / 2;
            }
            out.println(counter);
        }

    }
}

