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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt(), h = in.nextInt();
            TaskD.Weapon[] ws = new TaskD.Weapon[n];
            int maxA = 0;
            for (int i = 0; i < n; i++) {
                TaskD.Weapon w = new TaskD.Weapon(in.nextInt(), in.nextInt());
                ws[i] = w;
                maxA = Math.max(maxA, w.a);
            }
            Arrays.sort(ws);
            int res = 0;
            for (int i = 0; i < n && h > 0; i++) {
                if (ws[i].b > maxA) {
                    h -= ws[i].b;
                    ++res;
                }
            }

            res += (int) Math.ceil((h * 1.0) / maxA);
            out.println(res);
        }

        static class Weapon implements Comparable<TaskD.Weapon> {
            int a;
            int b;

            public Weapon(int a, int b) {
                this.a = a;
                this.b = b;
            }


            public int compareTo(TaskD.Weapon o) {
                if (b == o.b) return -Integer.compare(a, o.a);
                return -Integer.compare(b, o.b);
            }

        }

    }
}

