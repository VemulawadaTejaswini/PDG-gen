import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author test
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc187_b solver = new abc187_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc187_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long aa = in.nextLong();
            long bb = in.nextLong();
            long cc = in.nextLong();
            long dd = in.nextLong();
            long max = -1999999999;

            out.println(Math.max(aa * cc, Math.max(aa * dd, Math.max(bb * cc, dd * bb))));
        /*
        max = Math.max(max,aa*cc);
        max = Math.max(max,aa*dd);
        max = Math.max(max,bb*cc);
        max = Math.max(max,bb*dd);

        out.println(max);


         */
        /*
        int X = Math.max(aa,bb);
        int Y = Math.max(cc,dd);

         */


        /*
        long X = aa<bb?bb:aa;
        long Y = cc<dd?dd:cc;

        if (bb<0 && dd<0){
            out.println(aa * dd);
            return;
        } else if (cc>0 && dd<0) {
            out.println(aa*dd);
            return;

        }
        out.println(X*Y);

         */
/*
        if ((X <0) && (Y>=0))
        {

        }

        if (X<Y) {
            if (X<0) {
                Y = cc;
            }
        } else if (X>Y) {
            if (Y<0) {
                X = aa;
            }
        }
        out.println(X*Y);
         */
        }

    }
}

