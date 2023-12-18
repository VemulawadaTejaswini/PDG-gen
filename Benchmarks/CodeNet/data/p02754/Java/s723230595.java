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
            long n = Long.parseLong(in.next());
            long a = Long.parseLong(in.next());
            long b = Long.parseLong(in.next());

            if (a == 0 || b >= n) {
                out.println(0);
                return;
            }
            if (a >= n) {
                out.println(a);
                return;
            }

            String as = "";
            String bs = "";
            for (int i = 0; i < n - b; i++) {
                as += "b";
            }
//        for (int i = 0; i < b; i++) {
//            bs += "r";
//        }

//        StringBuilder sb = new StringBuilder();
//        boolean flg = false;
//        while (true) {
//            if (sb.length() >= n) break;
//            if (flg) {
//                sb.append(bs);
//                flg = false;
//
//            } else {
//                sb.append(as);
//                flg = true;
//            }
//        }
            int ans = 0;
//        String anss = sb.toString().replace("r", "");
//        String anss = as.toString().replace("r", "");
//        if (anss.length() >= n - b) {
//            ans = anss.substring(0, (int) n - (int) b).length();
//        } else {
//            ans = anss.length();
//        }

            ans = as.length();
            // 出力
            out.println(ans);

        }

    }
}

