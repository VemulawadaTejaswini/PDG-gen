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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int D = Integer.parseInt(in.next());
            int[] c = new int[26];
            for (int i = 0; i < 26; i++) {
                c[i] = Integer.parseInt(in.next());
            }
            int[][] s = new int[D][26];
            for (int i = 0; i < D; i++) {
                for (int j = 0; j < 26; j++) {
                    s[i][j] = Integer.parseInt(in.next());
                }
            }
            int[] t = new int[D];
            for (int i = 0; i < D; i++) {
                t[i] = Integer.parseInt(in.next());
            }
            long satisfaction = 0;
            long[] last = new long[26];
            for (int i = 0; i < D; i++) {
                int j = t[i] - 1;
                last[j] = (long) i + 1;
                for (int k = 0; k < 26; k++) {
                    satisfaction -= (i + 1 - last[k]) * c[k];
                }
                satisfaction += (long) s[i][j];
                out.println(satisfaction);
            }

//        out.println(Math.max(0, 1000000 + satisfaction));

        }

    }
}

