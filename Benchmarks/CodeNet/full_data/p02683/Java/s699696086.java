import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
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
        SkillUp solver = new SkillUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class SkillUp {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();

            Integer[] c = new Integer[n];
            int[][] a = new int[n][m];

            int[] skill = new int[m];
            Arrays.fill(skill, 0);

            long total = 0;

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
                int tmp = 0;
                while (map.containsKey(c[i] + tmp)) {
                    tmp++;
                }
                map.put(c[i] + tmp, i);
                total += c[i];
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                    skill[j] += a[i][j];
                }
            }

            for (int i = 0; i < m; i++) {
                if (skill[i] < x) {
                    out.append("-1\n");
                    return;
                }
            }

            Arrays.sort(c, Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                Integer price = c[i];
                Integer c_pos = map.get(price);

                boolean canSubtract = true;
                for (int j = 0; j < m; j++) {
                    if (skill[j] - a[c_pos][j] < x) {
                        canSubtract = false;
                    }
                }
                if (canSubtract) {
                    for (int j = 0; j < m; j++) {
                        skill[j] -= a[c_pos][j];
                    }
                    total -= price;
                }
            }

            out.append(String.valueOf(total));
        }

    }
}

