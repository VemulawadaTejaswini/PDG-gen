import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CSkillUp solver = new CSkillUp();
        solver.solve(1, in, out);
        out.close();
    }

    static class CSkillUp {
        int min = Integer.MAX_VALUE;
        int n;
        int m;
        int x;
        int[] c;
        int[][] book;
        int[] skill;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            x = in.nextInt();

            c = new int[n];
            book = new int[n][m];
            skill = new int[m];

            for (int i = 0; i < n; i++) {
                c[i] = in.nextInt();
                for (int j = 0; j < m; j++) {
                    book[i][j] = in.nextInt();
                }
            }

            dfs(-1, 0, skill);

            out.println(min == Integer.MAX_VALUE ? -1 : min);
        }

        public void dfs(int index, int cost, int[] skill) {
            index++;
            if (index == n) {
                // judge
                for (int i = 0; i < m; i++)
                    if (skill[i] < x) return;
                min = Math.min(min, cost);
                return;
            }

            dfs(index, cost, skill);
            for (int i = 0; i < m; i++) {
                skill[i] += book[index][i];
            }
            dfs(index, cost + c[index], skill);
            for (int i = 0; i < m; i++) {
                skill[i] -= book[index][i];
            }
        }

    }
}

