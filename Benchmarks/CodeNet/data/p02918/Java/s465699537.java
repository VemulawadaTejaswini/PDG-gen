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
        FaceProducesUnhappiness solver = new FaceProducesUnhappiness();
        solver.solve(1, in, out);
        out.close();
    }

    static class FaceProducesUnhappiness {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            char[] chars = in.next().toCharArray();
            long start = 0;
            for (int i = 1; i < chars.length; i++) {
                if (chars[i - 1] == chars[i]) {
                    start++;
                }
            }
            out.println(Math.min(start + 2 * k, n - 1));
        }

    }
}

