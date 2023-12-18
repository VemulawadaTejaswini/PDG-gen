import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import java.util.Random;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AEoui
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
            int n = in.nextInt();
            int k = in.nextInt();

            Guess[] arr = new Guess[n];
            for (int i = 0; i < n; ++i)
                arr[i] = new Guess(in.nextInt(), in.nextInt(), in.next().charAt(0));

            Random r = new Random(new Date().getTime());
            out.println(1 + (Math.abs(r.nextInt()) % n));
        }

        private class Guess {
            int f;
            int s;
            char color;

            public Guess(int f, int s, char color) {
                this.f = f;
                this.s = s;

                this.color = color;
            }

        }

    }
}

