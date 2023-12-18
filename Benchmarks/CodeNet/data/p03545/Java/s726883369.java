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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String abcd = in.next();
            int a = Integer.parseInt(abcd.substring(0, 1));
            int b = Integer.parseInt(abcd.substring(1, 2));
            int c = Integer.parseInt(abcd.substring(2, 3));
            int d = Integer.parseInt(abcd.substring(3, 4));

            char op[] = {'+', '-'};

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        int ans = calc(a, op[i], b, op[j], c, op[k], d);
                        if (ans == 7) {
                            // 出力
                            out.println(a + String.valueOf(op[i]) + b + String.valueOf(op[j]) + c + String.valueOf(op[k]) + d + "=7");
                            return;
                        }
                    }
                }
            }

        }

        public static int calc(int a, char op1, int b, char op2, int c, char op3, int d) {
            int ret = 0;
            if (op1 == '+') {
                ret = a + b;
            } else {
                ret = a - b;
            }
            if (op2 == '+') {
                ret = ret + c;
            } else {
                ret = ret - c;
            }
            if (op3 == '+') {
                ret = ret + d;
            } else {
                ret = ret - d;
            }
            return ret;
        }

    }
}

