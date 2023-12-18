import java.util.*;

import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

    static final Scanner in = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out,false);
    static boolean debug = false;

    static void solve() {
        int n = in.nextInt();
        int[] a = new int[n];
        int cnt = 0;
        int f = -1;
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
            if (i != 0) {
                if (f == -1) {
                    if (a[i-1] < a[i]) { f = 1;}
                    else if (a[i-1] > a[i]) {f = 2; }
                } else {
                    if (f == 1) {
                        if (a[i-1] > a[i]) {
                            f = -1;
                            cnt++;
                            // out.println(i);
                        }
                    } else if (f == 2) {
                        if (a[i-1] < a[i]) {
                            f = -1;
                            cnt++;
                            // out.println(i);
                        }
                    }
                }
            }
        }

        out.println((cnt+1));
    }

    public static void main(String[] args) {
        debug = args.length > 0;
        long start = System.nanoTime();

        solve();
        out.flush();

        long end = System.nanoTime();
        in.close();
        out.close();
    }

    static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}