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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String str = in.next();
            int a = Character.getNumericValue(str.charAt(0));
            int b = Character.getNumericValue(str.charAt(1));
            int c = Character.getNumericValue(str.charAt(2));
            int d = Character.getNumericValue(str.charAt(3));
            String op1, op2, op3;


            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        int ans = 0;
                        if (i % 2 == 1) {
                            ans += (a + b);
                            op1 = "+";
                        } else {
                            ans += (a - b);
                            op1 = "-";
                        }

                        if (j % 2 == 1) {
                            ans += c;
                            op2 = "+";
                        } else {
                            ans -= c;
                            op2 = "-";
                        }

                        if (k % 2 == 1) {
                            ans += d;
                            op3 = "+";
                        } else {
                            ans -= d;
                            op3 = "-";
                        }

                        if (ans == 7) {
                            out.print(a + op1 + b + op2 + c + op3 + d + "=7");
                            return;
                        }
                    }
                }
            }


        }

    }
}

