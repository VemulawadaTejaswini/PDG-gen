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
        equeue solver = new equeue();
        solver.solve(1, in, out);
        out.close();
    }

    static class equeue {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] v = new int[n];

            for (int i = 0; i < n; i++) {
                v[i] = in.nextInt();
            }

            long result = 0;
            for (int r = 0; r <= Math.min(n, k); r++) {
                for (int l = 0; r + l <= Math.min(n, k); l++) {
                    List<Integer> having = new ArrayList<>();
                    for (int i = 0; i < l; i++) {
                        having.add(v[i]);
                    }
                    for (int i = 0; i < r; i++) {
                        having.add(v[n - 1 - i]);
                    }
                    Collections.sort(having);

                    for (int i = 0; i < Math.min(k - (r + l), having.size()); i++) {
                        if (having.get(i) < 0) {
                            having.remove(i);
                        }
                    }

                    long score = 0;
                    for (Integer i : having) {
                        score += i;
                    }
                    result = Math.max(result, score);
                }
            }
            out.print(result);
        }

    }
}

