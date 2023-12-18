import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int k = in.nextInt();
            long[] a = new long[x];
            for (int i = 0; i < x; i++) {
                a[i] = in.nextLong();
            }
            long[] b = new long[y];
            for (int i = 0; i < y; i++) {
                b[i] = in.nextLong();
            }
            long[] c = new long[z];
            for (int i = 0; i < z; i++) {
                c[i] = in.nextLong();
            }
            long[] bc = new long[y * z];
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < z; j++) {
                    bc[i * z + j] = b[i] + c[j];
                }
            }
            Arrays.sort(bc);
            int min_k_yz = Math.min(k, y * z);
            long[] bc_higher = new long[min_k_yz];
            for (int i = 0; i < min_k_yz; i++) {
                bc_higher[i] = bc[bc.length - 1 - i];
            }
            long[] abc = new long[x * min_k_yz];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < min_k_yz; j++) {
                    abc[i * min_k_yz + j] = a[i] + bc_higher[j];
                }
            }
            Arrays.sort(abc);
            for (int i = 0; i < k; i++) {
                System.out.println(abc[abc.length - 1 - i]);
            }
            in.close();
        }

    }
}

