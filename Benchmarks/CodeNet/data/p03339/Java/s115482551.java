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
        ABC098_C solver = new ABC098_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC098_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String str = in.next();

            int cntE = 0;
            int cntW = 0;

            int ans = Integer.MAX_VALUE;
            for (char c : str.toCharArray()) {
                if (c == 'E') cntE++;
                if (c == 'W') cntW++;
            }

            //リーダーの左で、Wを向いている人
            int leftChange = 0;
            //リーダーの右で、Eを向いている人
            int rightChange = cntE;

            if (str.toCharArray()[0] == 'E') rightChange--;
            boolean isE = false;
            for (char c : str.toCharArray()) {
                if (c == 'E') {
                    rightChange--;
                }
                ans = Math.min(ans, leftChange + rightChange);
                //cをリーダーに任命する
                if (c == 'W') {
                    leftChange++;
                }
            }

            out.print(ans);

        }

    }
}

