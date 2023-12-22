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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long x = in.nextLong();
            long years = 0;

            out.println(answer(x, 0, 100l));


        }

        public long answer(long x, long years, long current) {

//        double y = ceil(x*1.0000/100.0000);
//        double lgy = Math.log(y);
//        double xx = Math.log(1.0100);
//        double an =  lgy/xx;
//        return (long)ceil(an);
            double cd = current * 1.00000;
            long y = 0;
            while (x > cd) {
                cd = Math.floor(cd * 1.01);
                y++;
            }
            return y;
        }

    }
}

