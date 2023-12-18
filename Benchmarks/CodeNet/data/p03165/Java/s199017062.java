import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FLCS solver = new FLCS();
        solver.solve(1, in, out);
        out.close();
    }

    static class FLCS {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            String T = in.next();
            int[][] lcs = new int[S.length() + 1][T.length() + 1];
            FLCS.Dir[][] dir = new FLCS.Dir[S.length() + 1][T.length() + 1];
            for (int t = 1; t <= T.length(); t++) {
                for (int s = 1; s <= S.length(); s++) {
                    int skipS = lcs[s - 1][t];
                    int skipT = lcs[s][t - 1];
                    int match = lcs[s - 1][t - 1] + (S.charAt(s - 1) == T.charAt(t - 1) ? 1 : 0);
                    if (skipS >= skipT && skipS >= match) {
                        lcs[s][t] = skipS;
                        dir[s][t] = FLCS.Dir.SKIP_S;
                    } else if (skipT >= skipS && skipT >= match) {
                        lcs[s][t] = skipT;
                        dir[s][t] = FLCS.Dir.SKIP_T;
                    } else {
                        lcs[s][t] = match;
                        dir[s][t] = FLCS.Dir.MATCH;
                    }
                }
            }
            int s = S.length();
            int t = T.length();
            StringBuilder res = new StringBuilder();
            while (s > 0 && t > 0) {
                switch (dir[s][t]) {
                    case FLCS.Dir.SKIP_S:
                        s--;
                        break;
                    case FLCS.Dir.SKIP_T:
                        t--;
                        break;
                    case FLCS.Dir.MATCH:
                        if (S.charAt(s - 1) != T.charAt(t - 1)) {
                            throw new RuntimeException("mismatch");
                        }
                        res.append(S.charAt(s - 1));
                        s--;
                        t--;
                }
            }
            out.println(res.reverse().toString());
        }

        enum Dir {
            SKIP_S,
            SKIP_T,
            MATCH,
            ;
        }

    }
}

