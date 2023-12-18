import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CTetrominoTiling solver = new CTetrominoTiling();
        solver.solve(1, in, out);
        out.close();
    }

    static class CTetrominoTiling {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            long res = 0;
            int i = in.nextInt();
            int o = in.nextInt();
            int t = in.nextInt();
            int j = in.nextInt();
            int l = in.nextInt();
            int s = in.nextInt();
            int z = in.nextInt();
            res += o * 2 + i / 2 * 4 + Math.min(j, l) * 4;
            out.println(res / 2);
        }

    }
}

