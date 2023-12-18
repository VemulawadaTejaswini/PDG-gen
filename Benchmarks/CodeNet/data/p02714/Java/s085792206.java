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
        abc162_d solver = new abc162_d();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc162_d {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            String S = in.next();
            String sar[] = S.split("");
            int count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    for (int k = j + 1; k < N; k++) {
                        if ((sar[i].compareTo(sar[j]) != 0) && ((sar[i].compareTo(sar[k]) != 0)) && ((sar[j].compareTo(sar[k]) != 0))) {
                            if ((j - i) != (k - j)) {
                                count++;
                            }
                        }
                    }
                }
            }
            out.println(count);

        }

    }
}

