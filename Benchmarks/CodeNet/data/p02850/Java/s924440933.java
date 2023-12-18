import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
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
        ColoringEdgesonTree solver = new ColoringEdgesonTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class ColoringEdgesonTree {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            List<List<Integer>> lists = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                lists.add(new ArrayList<>());
            }
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                lists.get(a).add(b);
                lists.get(b).add(a);
            }

            StringBuilder sb = new StringBuilder();
            long result = 0;
            for (int i = 0; i < n; i++) {
                result = Math.max(lists.get(i).size(), result);
            }
            sb.append(result).append("\n");

            int[] results = new int[n];
            for (int src = 0; src < n; src++) {
                List<Integer> children = lists.get(src);
                int color = 1;
                for (Integer dest : children) {
                    if (results[dest] > 0) {
                        continue;
                    }
                    if (dest < src) {
                        continue;
                    }
                    if (results[src] == color) {
                        color++;
                    }
                    results[dest] = color;
                    color++;
                }
            }
            for (int i = 1; i < n; i++) {
                sb.append(results[i] + "\n");
            }
            out.print(sb.toString().trim());

        }

    }
}

