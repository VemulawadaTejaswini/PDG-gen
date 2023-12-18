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
 *
 * @author CodeMonk
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            String s = in.next();
            int[][] next = new int[s.length() + 5][26];
            s = " " + s;
            int len = s.length() - 1;
            for (int i = 0; i < 26; i++)
                next[len + 1][i] = len + 1;
            for (int i = len; i > 0; i--) {
                for (int j = 0; j < 26; j++) {
                    next[i][j] = next[i + 1][j];
                }
                next[i][s.charAt(i) - 'a'] = i;
            }
            int dp[] = new int[len + 500];
            dp[len + 1] = 1;
            for (int i = len; i > 0; i--) {
                dp[i] = len + 1;
                for (int c = 0; c < 26; c++) {
                    dp[i] = Math.min(dp[i], dp[next[i][c] + 1] + 1);
                }
            }
            List<Character> li = new ArrayList<>();
            int cur = 1;
            while (cur <= len) {
                for (int i = 0; i < 26; i++) {
                    if (dp[cur] == dp[next[cur][i] + 1] + 1) {
                        li.add((char) (i + 'a'));
                        cur = next[cur][i] + 1;
                        break;
                    }
                }
            }
            for (Character c : li) {
                out.print(c);
            }
        }

    }
}

