import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

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
        Nikkei_C solver = new Nikkei_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class Nikkei_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            long point = 0;


            ArrayList<dish> dishList = new ArrayList<dish>();

            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();

                b[i] = in.nextLong();

                point -= b[i];

                dish dish = new dish(a[i], b[i]);
                dishList.add(dish);
            }

            Collections.sort(dishList, new Comparator<dish>() {

                public int compare(dish o1, dish o2) {
                    return (int) ((o1.a + o1.b) - (o2.a + o2.b));
                }
            });

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    point += dishList.get(i).a + dishList.get(i).b;
                }
            }

            out.print(point);
        }

    }

    static class dish {
        long a;
        long b;

        dish(long a, long b) {
            this.a = a;
            this.b = b;
        }

    }
}

