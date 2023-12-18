import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
            }

            int sumMin = Integer.MAX_VALUE;
            int answer = 0;
            for (int i = 1; i < n; i++) {
                // 左側
                int leftSum = 0;
                for (int j = 0; j < i; j++) {
                    leftSum += w[j];
                }
                // 右側
                int rightSum = 0;
                for (int j = i; j < n; j++) {
                    rightSum += w[j];
                }
                // 差
                int diff = Math.abs(leftSum - rightSum);
                // それまでで最小なら
                if (diff < sumMin) {
                    sumMin = diff;
                    answer = diff;
                }
            }
            out.print(answer);
        }

    }
}

