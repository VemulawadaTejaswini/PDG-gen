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
            int H = Integer.parseInt(in.next());
            int W = Integer.parseInt(in.next());
            char[][] S = new char[H][W];
            for (int i = 0; i < H; i++) {
                S[i] = in.next().toCharArray();
            }
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    int mine = 0;
                    if (S[i][j] == '.') {
                        if (i > 0) {
                            if (j > 0) if (S[i - 1][j - 1] == '#') mine++;
                            if (S[i - 1][j] == '#') mine++;
                            if (j < W - 1) if (S[i - 1][j + 1] == '#') mine++;
                        }
                        if (i < H - 1) {
                            if (j > 0) if (S[i + 1][j - 1] == '#') mine++;
                            if (S[i + 1][j] == '#') mine++;
                            if (j < W - 1) if (S[i + 1][j + 1] == '#') mine++;
                        }
                        if (j > 0 && S[i][j - 1] == '#') mine++;
                        if (j < W - 1 && S[i][j + 1] == '#') mine++;
                        String temp = "" + mine;
                        char[] temp2 = temp.toCharArray();
                        S[i][j] = Character.valueOf(temp2[0]);

                    }
                }
            }

            // 出力
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    out.print(S[i][j]);

                }
                out.println();
            }

        }

    }
}

