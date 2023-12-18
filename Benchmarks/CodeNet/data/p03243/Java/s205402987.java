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
            int abc[] = new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999};
            int n = Integer.parseInt(in.next());

            int ans = 0;
            for (int i = 0; i < 9; i++) {
                if (n > abc[i]) {
                    continue;
                } else {
                    ans = abc[i];
                    break;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

