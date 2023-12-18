import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FSugoroku solver = new FSugoroku();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSugoroku {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            String s = in.next();

            String res = solveMe(n, m, s);
            out.println(res);
        }

        private String solveMe(int n, int m, String s) {
            int possible = -1;
            int jump = 1;
            List<Integer> possibles = new ArrayList<>();
            for (int i = n - 1; i >= 0; i--) {
                boolean isPossible = s.charAt(i) == '0';
                if (isPossible)
                    possible = jump;

                if (jump == m || i == 0) {
                    if (!isPossible && possible == -1)
                        return "-1";

                    possibles.add(possible);
                    jump = m - possible;
                    possible = -1;
                }

                jump++;
            }

            Collections.reverse(possibles);
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < possibles.size(); i++) {
                if (i > 0)
                    res.append(" ");
                res.append(possibles.get(i));

            }
            return res.toString();
        }

    }
}

