import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERedAndGreenApples solver = new ERedAndGreenApples();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERedAndGreenApples {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            ArrayList<Integer> red = new ArrayList<>();
            ArrayList<Integer> green = new ArrayList<>();
            ArrayList<Integer> none = new ArrayList<>();

            ArrayList<Integer> eat = new ArrayList<>();
            long sum = 0;

            for (int i = 0; i < a; i++) {
                red.add(in.nextInt());
            }
            for (int i = 0; i < b; i++) {
                green.add(in.nextInt());
            }
            for (int i = 0; i < c; i++) {
                none.add(in.nextInt());
            }

            red.sort(Comparator.reverseOrder());
            green.sort(Comparator.reverseOrder());
            none.sort(Comparator.reverseOrder());
            for (int i = 0; i < x; i++) {
                int r = red.get(i);
                eat.add(r);
                sum += r;
            }
            for (int i = 0; i < y; i++) {
                int g = green.get(i);
                eat.add(g);
                sum += g;
            }
            eat.sort(Comparator.naturalOrder());
            for (int i = 0; i < c; i++) {
                int e = eat.get(i);
                int n = none.get(i);
                if (e < n) {
                    sum = sum - e + n;
                } else {
                    break;
                }
            }
            out.println(sum);

        }

    }
}

