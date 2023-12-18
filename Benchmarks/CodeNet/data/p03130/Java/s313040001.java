import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            boolean[][] map = new boolean[4][4];

            List<List<Integer>> list = getPermutations(3);
            for (int i = 0; i < 3; i++) {
                int a = in.nextInt();
                int b = in.nextInt();

                map[a - 1][b - 1] = true;
                map[b - 1][a - 1] = true;
            }

            boolean ans = false;

            for (List<Integer> element : list) {
                if (map[element.get(0)][element.get(1)] &&
                        map[element.get(1)][element.get(2)] &&
                        map[element.get(2)][element.get(3)]) {
                    ans = true;
                }
            }

            if (ans) {
                out.print("YES");
            } else {
                out.print("NO");
            }
        }

        private static List<List<Integer>> getPermutations(Integer n) {

            List<List<Integer>> results = new ArrayList<List<Integer>>();

            if (n == 0) {
                results.add(new ArrayList<Integer>(Arrays.asList(0)));
                return results;
            }

            List<List<Integer>> prevResults = getPermutations(n - 1);

            for (List<Integer> permutation : prevResults) {
                for (int i = 0; i <= n; ++i) {
                    permutation.add(i, n);
                    results.add(new ArrayList<Integer>(permutation));
                    permutation.remove(n);
                }
                permutation.clear();
            }
            prevResults.clear();

            return results;
        }

    }
}

