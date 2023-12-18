import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        abc164_c solver = new abc164_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc164_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            String S[] = new String[N];
            for (int i = 0; i < N; i++) {
                S[i] = in.next();

            }
            Arrays.sort(S);
            String oldS = "";
            int brakecount = 1;
            for (String item : S
            ) {
                if (oldS.isEmpty()) {
                    oldS = item;
                }
                if (item.compareTo(oldS) != 0) {
                    brakecount++;
                }
            }
            out.println(brakecount);
        }

    }
}

