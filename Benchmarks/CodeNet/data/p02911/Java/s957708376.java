import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        CAttackSurvival solver = new CAttackSurvival();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAttackSurvival {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            StringBuilder sb = new StringBuilder();
            int n = in.nextInt();
            int k = in.nextInt();
            int q = in.nextInt();
            int[] score = new int[n];
            for (int i = 0; i < n; i++) {
                score[i] = k - q;
            }
            for (int i = 0; i < q; i++) {
                score[in.nextInt() - 1]++;
            }

            for (int i = 0; i < n; i++) {
                out.println(score[i] > 0 ? "Yes" : "No");
            }

        }

    }
}

