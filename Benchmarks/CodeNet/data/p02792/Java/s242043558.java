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
        Handstand2 solver = new Handstand2();
        solver.solve(1, in, out);
        out.close();
    }

    static class Handstand2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[][] pair = new int[10][10];

            for (int i = 1; i <= n; i++) {
                String s = String.valueOf(i);
                int a = Integer.parseInt(s.substring(0, 1));
                int b = Integer.parseInt(s.substring(s.length() - 1));
                pair[a][b]++;

            }
            long result = 0;
            for (int i = 0; i < pair.length; i++) {
                for (int j = 0; j < pair.length; j++) {
                    result += pair[i][j] * pair[j][i];
                }
            }

            out.println(result);
        }

    }
}

