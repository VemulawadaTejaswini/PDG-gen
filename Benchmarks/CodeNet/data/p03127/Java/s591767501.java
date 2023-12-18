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
            int n = Integer.parseInt(in.next());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
            }
            int ans = 0;

            ans = gcd(a[0], a[1]);
            for (int i = 2; i < n; i++) {
                ans = gcd(ans, a[i]);
            }

            // 出力
            out.println(ans);

        }

        public static int gcd(int num1, int num2) {
            if (num2 == 0) return num1;
            else return gcd(num2, num1 % num2);
        }

    }
}

