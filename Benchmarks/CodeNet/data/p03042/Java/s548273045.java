import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
        ABC126_b solver = new ABC126_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC126_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.next();
            boolean gate[] = new boolean[2];

            int first = Integer.parseInt(S.substring(0, 2));
            int second = Integer.parseInt(S.substring(2, 4));

            if ((first > 0) && (first < 13)) {
                gate[0] = true;
            }
            if ((second > 0) && (second < 13)) {
                gate[1] = true;
            }
            if ((gate[0]) && (gate[1])) {
                out.println("AMBIGUOUS");
                return;
            }
            if ((!gate[0]) && (gate[1])) {
                out.println("YYMM");
                return;
            }
            if ((gate[0]) && (!gate[1])) {
                out.println("MMYY");
                return;
            }
            out.println("NA");
        }

    }
}

