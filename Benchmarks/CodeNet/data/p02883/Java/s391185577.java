import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

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
        Gluttony solver = new Gluttony();
        solver.solve(1, in, out);
        out.close();
    }

    static class Gluttony {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();

            Integer[] foods = new Integer[n];
            Integer[] team = new Integer[n];

            for (int i = 0; i < n; i++) {
                team[i] = in.nextInt();
            }

            for (int i = 0; i < n; i++) {
                foods[i] = in.nextInt();
            }

            Arrays.sort(foods);
            Arrays.sort(team, Collections.reverseOrder());

            if (score(team, foods, 0) <= k) {
                out.println(0);
                return;
            }

            int left = 0;
            int right = Integer.MAX_VALUE;
            while (right - left > 1) {
                int middle = (left + right) / 2;
                long s = score(team, foods, middle);
                if (s <= k) {
                    right = middle;
                } else {
                    left = middle;
                }
            }

            out.println(right);

        }

        public static long score(Integer[] team, Integer[] foods, int target) {

            long score = 0;
            for (int i = 0; i < team.length; i++) {
                int count = target / foods[i];
                score += Math.max(team[i] - count, 0);
            }
            return score;
        }

    }
}

