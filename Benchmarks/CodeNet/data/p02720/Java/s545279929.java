import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
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
        LunlunNumber solver = new LunlunNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class LunlunNumber {
        List<Long> result = new ArrayList<>();

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            for (int i = 1; i < 10; i++) {
                val(i, 1);
            }
            Collections.sort(result);
            out.println(result.get(n - 1));
        }

        public void val(long v, int k) {
            result.add(v);

            if (k > 10) {
                return;
            }

            for (int j = -1; j <= 1; j++) {
                long add = v % 10 + j;
                if (0 <= add && add <= 9) {
                    String sb = String.valueOf(v) + add;
                    val(Long.parseLong(sb), k + 1);
                }
            }
        }

    }
}

