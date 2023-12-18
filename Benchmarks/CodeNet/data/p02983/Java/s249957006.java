import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
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
        RemainderMinimization2019 solver = new RemainderMinimization2019();
        solver.solve(1, in, out);
        out.close();
    }

    static class RemainderMinimization2019 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            HashSet<Long> set = new HashSet<>();
            long l = in.nextLong();
            long r = in.nextLong();
            long[] mods = new long[2019];

            for (long i = l; i <= r; i++) {
                mods[(int) (i % 2019)]++;
                if (mods[0] > 1) {
                    out.println(0);
                    return;
                }
            }

            long result = Long.MAX_VALUE;
            for (int i = 0; i < 2019; i++) {
                if (mods[i] < 1) {
                    continue;
                }
                for (int j = 0; j < 2019; j++) {
                    if (mods[j] < 1) {
                        continue;
                    }

                    if (i == j && mods[j] < 2) {
                        continue;
                    }
                    result = Math.min(result, (i * j) % 2019);
                }
            }

            out.println(result);
        }

    }
}

