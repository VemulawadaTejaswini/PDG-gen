import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
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
        static int[][] cost;

        static int getMinCost(int sum, int min, int n, ArrayList<Integer> rest) {
            if (n == 1) return sum;
            if (sum > min) return sum;
            ArrayList<Integer> next = new ArrayList<Integer>();
            for (Integer i : rest) {
                if (i == n) continue;
                next.add(i);
            }
            int cMin = min;
            for (Integer i : next) {
                int nextSum = sum + cost[n][i];
                int iMin = getMinCost(nextSum, min, i, next);
                if (iMin < cMin) cMin = iMin;
            }
            return cMin;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            // int[][] field = new int[h][w];

            cost = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    cost[i][j] = in.nextInt();
                }
            }
            int[] minCost = new int[10];

            for (int i = 0; i < 10; i++) {
                ArrayList<Integer> path = new ArrayList<Integer>();
                for (int j = 0; j < 10; j++) if (j != i) path.add(j);
                minCost[i] = getMinCost(0, Integer.MAX_VALUE, i, path);
            }

            int ans = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int c = in.nextInt();
                    if (c != 1 && c != -1) ans += minCost[c];
                }
            }
            out.println(ans);
        }

    }
}

