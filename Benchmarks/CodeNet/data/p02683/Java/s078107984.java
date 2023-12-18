import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
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
        SkillUp solver = new SkillUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class SkillUp {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();

            int[] c = new int[n];
            int[][] a = new int[n][m];

            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                }
            }

            List<Integer> costs = new ArrayList<>();
            for (int i = 0; i < 1 << n; i++) {
                int[] tmpSkill = new int[m];
                int cost = 0;
                for (int j = 0; j < n; j++) {
                    if ((1 & i >> j) == 1) {
                        // j冊目を購入
                        for (int k = 0; k < m; k++) {
                            tmpSkill[k] += a[j][k];
                        }
                        cost += c[j];
                    }
                }

                boolean over_x = true;
                for (int j = 0; j < m; j++) {
                    if (tmpSkill[j] < x) {
                        over_x = false;
                        break;
                    }
                }

                if (over_x) {
                    costs.add(cost);
                }
            }


            if (!costs.isEmpty()) {
                costs.sort(Comparator.naturalOrder());
                out.append(String.valueOf(costs.get(0)));
                return;
            }
            out.append("-1\n");
        }

    }
}

