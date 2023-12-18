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
            // 整数の入力
            long A = Long.parseLong(in.next());
            long B = Long.parseLong(in.next());
            long K = Long.parseLong(in.next());
            long K2 = K - A;
            String ans = "";

//        if(A >= K) ans = String.valueOf(K - A) + " " + String.valueOf(B);
//        if(B >= K) ans = String.valueOf(A) + " " + String.valueOf(K - B);
            if (A >= B) {
                ans = String.valueOf(0) + " " + String.valueOf(K - B - A);
                out.println(ans);
                return;
            }
//        if (A + B >= K) {
//            ans = String.valueOf(A-(K-B)) + " " + String.valueOf(B -(K-B));
//            out.println(ans);
//            return;
//        }
            for (int i = 0; i < K; i++) {
                if (A >= 1) {
                    A--;
                } else if (B >= 1) {
                    B--;

                }
            }

            ans = String.valueOf(A) + " " + String.valueOf(B);
            // 出力
            out.println(ans);

        }

    }
}

