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
        DLunlunNumber solver = new DLunlunNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLunlunNumber {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long x = 10;
            if (n <= 10) {
                out.println(n);
            } else {
                for (int i = 10; i < n; i++) {
                    x = nextRunRun(x);
                }
                out.println(x);
            }


        }

        long nextRunRun(long x) {
            char[] s = Long.toString(x).toCharArray();
            int last = -1;
            for (int i = 1; i < s.length; i++) {
                if (s[i - 1] == s[i] && s[i - 1] < '9') {
                    last = i;
                } else if (s[i - 1] > s[i]) {
                    last = i;
                }
            }

            StringBuilder sb = new StringBuilder();
            if (last == -1) {
                if (s[0] == '9') {
                    sb.append(1);
                    for (int i = 0; i < s.length; i++) {
                        sb.append(0);
                    }
                } else {
                    char c = (char) (s[0] + 1);
                    for (int i = 0; i < s.length; i++) {
                        sb.append(c);
                        if (c > '0') {
                            c--;
                        }
                    }
                }
            } else {
                for (int i = 0; i < last; i++) {
                    sb.append(s[i]);
                }
                char c = (char) (s[last] + 1);
                for (int i = last; i < s.length; i++) {
                    sb.append(c);
                    if (c > '0') {
                        c--;
                    }
                }
            }
            return Long.parseLong(new String(sb));
        }

    }
}

