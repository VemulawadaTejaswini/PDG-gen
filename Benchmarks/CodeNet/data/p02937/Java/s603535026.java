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
        E solver = new E();
        solver.solve(1, in, out);
        out.close();
    }

    static class E {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            String t = in.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                sb.append(s);
            }
            int idx = 0;
            int ret = 0;
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == t.charAt(idx)) {
                    idx++;
                    if (idx == t.length()) {
                        ret = i;
                        break;
                    }
                }
            }
            out.println(ret == 0 ? -1 : ret + 1);
        }

    }
}

