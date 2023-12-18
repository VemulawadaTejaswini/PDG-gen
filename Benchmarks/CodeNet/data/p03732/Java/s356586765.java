import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int w = in.nextInt();

            int[] ww = new int[n];
            int[] v = new int[n];

            for (int i = 0; i < n; ++i) {
                ww[i] = in.nextInt();
                v[i] = in.nextInt();
            }

            int totalValue = 0;
            int hi = 0;
            int totalWeight = 0;
            int tv2 = 0;

            for (int i = 0; i < n; ++i) {
                totalWeight += ww[i];
                for (int j = 1; j < n - 1; ++j) {
                    int w1 = ww[i];
                    int w2 = ww[j];

                    if ((w1 + w2 <= w) && i != j) {
                        totalValue = v[i] + v[j];
                        if (totalValue > hi) {
                            hi = totalValue;
                        }

                    }

                }

                if (totalWeight <= w) {
                    tv2 += v[i];
                }
            }


            if (totalWeight <= w) {
                out.println(tv2);
            } else {
                out.println(hi);
            }
        }

    }
}

