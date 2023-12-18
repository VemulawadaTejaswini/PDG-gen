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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[][] card = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    card[i][j] = in.nextInt();
                }
            }

            int n = in.nextInt();
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                l.add(in.nextInt());
            }

            int[][] trans = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    trans[j][i] = card[i][j];
                }
            }

            int[] lDiagonally = {card[0][0], card[1][1], card[2][2]};
            int[] rDiagonally = {card[2][0], card[1][1], card[0][2]};

            if (checkLine(card[0], l) || checkLine(card[1], l) || checkLine(card[2], l) || checkLine(trans[0], l) || checkLine(trans[1], l) || checkLine(trans[2], l) || checkLine(lDiagonally, l) || checkLine(rDiagonally, l)) {
                out.append("Yes");
            } else {
                out.append("No");
            }
        }

        private boolean checkLine(int[] l, List<Integer> r) {
            for (int i : l) {
                if (!r.contains(i)) {
                    return false;
                }
            }
            return true;
        }

    }
}

