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
        ABC049C solver = new ABC049C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC049C {
        static String[] strs = {
                "dream",
                "dreamer",
                "erase",
                "eraser"
        };

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            String s = in.next();

            while (true) {
                boolean endWithStr = false;
                for (String str : strs) {
                    if (s.endsWith(str)) {
                        endWithStr = true;
                        s = s.substring(0, s.length() - str.length());
                        break;
                    }

                }
                if (!endWithStr) {
                    // 出力
                    out.println("NO");
                    break;

                }
                if (s.length() <= 0) {
                    // 出力
                    out.println("YES");
                    break;

                }
            }


        }

    }
}

