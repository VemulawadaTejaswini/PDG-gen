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
        EStringsofImpurity solver = new EStringsofImpurity();
        solver.solve(1, in, out);
        out.close();
    }

    static class EStringsofImpurity {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String t = in.next();
            int[][] next = new int[s.length()][26];
            long res = 0;
            int num = 0;
            // next[i][j]: sのi文字目以降で何文字先にj(alphabet)が現れるか.
            // 現れなければ-1;
            StringBuilder sb = new StringBuilder(s);
            sb.append(s);
            String ss = new String(sb);

            for (int i = 0; i < 26; i++) {
                char alphabet = (char) ('a' + i);
                next[0][i] = ss.indexOf(alphabet);
            }


            for (int i = 1; i < s.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if (next[0][j] < 0) {
                        next[i][j] = -1;
                    } else {
                        next[i][j] = next[i - 1][j] - 1;
                        if (next[i][j] < 0) {
                            next[i][j] += s.length();
                        }
                    }
                }
            }


            for (int i = 0; i < t.length(); i++) {
                char t_i = t.charAt(i);
                if (next[num % s.length()][t_i - 'a'] < 0) {
                    res = -1;
                    break;
                }
                res += (long) next[num % s.length()][t_i - 'a'] + 1;
                num = (int) (res % s.length());
                // out.println(res);
            }

            out.println(res);

        }

    }
}

