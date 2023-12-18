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
        ABC105_3 solver = new ABC105_3();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC105_3 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int NN = in.nextInt();
            int ABSNN = Math.abs(NN);

            if (NN == 0) {
                out.println(0);
                return;
            }


            String temp = Integer.toBinaryString(ABSNN);
            String result = Integer.toBinaryString(~ABSNN);

            int getter = ((result.charAt(result.length() - 1) == '0') ? 1 : 0);


            String ans = result.substring(result.length() - temp.length(), result.length() - getter);

            out.println("1" + ans);

        }

    }
}

