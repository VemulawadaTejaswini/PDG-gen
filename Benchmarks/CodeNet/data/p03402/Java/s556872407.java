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
        DGridComponents solver = new DGridComponents();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGridComponents {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 白
            int a = in.nextInt();
            // 黒
            int b = in.nextInt();
            char[][] c = new char[100][100];

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    if (i < 50) {
                        // 黒字に白
                        if (i % 2 != 0 && j % 2 != 0 && a > 1) {
                            c[i][j] = '.';
                            a--;
                        } else {
                            c[i][j] = '#';
                        }
                    } else {
                        if (i % 2 != 0 && j % 2 != 0 && b > 1) {
                            c[i][j] = '#';
                            b--;
                        } else {
                            c[i][j] = '.';
                        }
                    }
                }
            }
                
            out.println("100 100");
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    out.print(c[i][j]);
                }
                out.println();
            }

        }

    }
}

