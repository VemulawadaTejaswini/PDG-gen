import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Long> a = new ArrayList<>();
            ArrayList<Long> copy = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                a.add(in.nextLong());
            }

            Collections.sort(a, Comparator.reverseOrder());

            int ans = 0;
            for (Long l : a) {
                for (long i = l; i < 2 * l; i++) {
                    if ((i & (i - 1)) == 0) {
                        if (a.contains(i - l)) {
                            if (!copy.contains(i - l)) {
                                ans++;
                                copy.add(i);
                                copy.add(i - l);
                            }
                            break;
                        }
                    }
                }
            }

            out.print(ans);
        }

    }
}

