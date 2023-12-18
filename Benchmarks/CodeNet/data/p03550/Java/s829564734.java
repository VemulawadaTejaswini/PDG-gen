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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int n = in.nextInt();
            int z = in.nextInt();
            int w = in.nextInt();
            if (n % 2 == 0) {
                List<Integer> even = new ArrayList<>();
                List<Integer> odd = new ArrayList<>();
                int max = Integer.MIN_VALUE;
                for (int i : even) {
                    for (int j : odd) {
                        int d = Math.abs(i - j);
                        if (d > max) max = d;
                    }
                }
                out.println(max);
            } else {
                List<Integer> a = new ArrayList<>();
                a.add(z);
                a.add(w);
                for (int i = 0; i < n; i++) a.add(in.nextInt());
                Collections.sort(a);

                int maxScore = Integer.MIN_VALUE;
                boolean passed = false;
                for (int i = 0; i < n + 2; i++) {
                    if (a.get(i) == w && !passed) {
                        passed = true;
                        continue;
                    }
                    int score;
                    if (i == 0) score = a.get(1) - a.get(0);
                    else if (i == n + 1) score = a.get(n + 1) - a.get(n);
                    else score = Math.max((a.get(i + 1) - a.get(i)), (a.get(i) - a.get(i - 1)));
                    if (score > maxScore) maxScore = score;
                }

                out.println(maxScore);
            }
        }

    }
}

