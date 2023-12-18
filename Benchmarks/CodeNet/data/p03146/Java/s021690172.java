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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int s = Integer.parseInt(in.next());
            int ans = 0;

            List<Integer> collats = new ArrayList<>();

            collats.add(s);
            int i = 0;
            while (true) {
                i++;
                int tmp = fn(collats.get(i - 1));

                if (collats.contains(tmp)) break;

                collats.add(tmp);

            }

            // 出力
            out.println(++i);

        }

        public static int fn(int n) {
            if (n % 2 == 0) {
                return n / 2;
            } else {
                return 3 * n + 1;
            }
        }

    }
}

