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
        Cell best(Cell a, Cell b, Cell c) {
            if (a.len >= b.len && a.len >= c.len) {
                return a;
            }
            if (b.len >= a.len && b.len >= c.len) {
                return b;
            }
            return c;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            String T = in.next();
            Cell[][] lcs = new Cell[S.length() + 1][T.length() + 1];
            for (int t = 0; t <= T.length(); t++) {
                lcs[0][t] = new Cell(0, 0, 0, false);
            }
            for (int s = 0; s <= S.length(); s++) {
                lcs[s][0] = new Cell(0, 0, 0, false);
            }
            for (int t = 1; t <= T.length(); t++) {
                for (int s = 1; s <= S.length(); s++) {
                    Cell skipS = new Cell(s - 1, t, lcs[s - 1][t].len, false);
                    Cell skipT = new Cell(s, t - 1, lcs[s][t - 1].len, false);
                    Cell match = new Cell(s - 1, t - 1, lcs[s - 1][t - 1].len, S.charAt(s - 1) == T.charAt(t - 1));
                    lcs[s][t] = best(skipS, skipT, match);
                }
            }
            int s = S.length();
            int t = T.length();
            StringBuilder res = new StringBuilder();
            while (s > 0 && t > 0) {
                if (lcs[s][t].match) {
                    res.append(S.charAt(s - 1));
                }
                s = lcs[s][t].prevS;
                t = lcs[s][t].prevT;
            }
            out.println(res.reverse().toString());
        }

    }

    static class Cell {
        final int prevS;
        final int prevT;
        final int len;
        final boolean match;

        public Cell(int prevS, int prevT, int prevLen, boolean match) {
            this.prevS = prevS;
            this.prevT = prevT;
            this.match = match;
            this.len = match ? prevLen + 1 : prevLen;
        }

    }
}

