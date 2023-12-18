import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            StringBuilder sb = new StringBuilder();
            int n = in.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.nextInt();
            }
            Arrays.sort(ar);
            ArrayList<Integer> rec = new ArrayList();
            for (int i = 0; i < n - 1; i++) {
                if (ar[i] == ar[i + 1]) {
                    rec.add(ar[i]);
                    i++;
                } else {
                    // nop
                }
            }
            Collections.sort(rec, Comparator.reverseOrder());
            out.println(rec.size() >= 2 ? (long) rec.get(0) * rec.get(1) : 0);
        }

    }
}

