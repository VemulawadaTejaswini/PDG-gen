import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC106_3 solver = new ABC106_3();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC106_3 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String S = in.nextLine();
            String K = in.nextLine();
            int hitIndex = 0;
            int ceilK = 0;
            if (K.length() > 3) {
                ceilK = Integer.parseInt(String.valueOf(K.substring(0, 4)));
            } else {
                ceilK = Integer.parseInt(String.valueOf(K));
            }

            for (int i = 0; i < S.length(); i++) {
                if (Integer.parseInt(String.valueOf(S.charAt(i))) >= 2) {
                    hitIndex = i;
                    break;
                }
            }
            if (ceilK < (hitIndex + 1)) {
                out.println(1);
                return;
            }
            //if (hitIndex<ceilK) {
            out.println(String.valueOf(S.charAt(hitIndex)));
            //} else {
//            out.println(String.valueOf(S.charAt(ceilK-1)));
            //}
        }

    }
}

