import java.util.*;

import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static void solve() {
        String s = in.next();
        int n = s.length();
        boolean x = true;
        for (int i=0; i<n-1; i++) {
            if (s.charAt(i) != s.charAt(i+1)) {
                x = false;
            }
        }
        if (x) {
            out.println(0);
            return;
        }
        int max = 0;
        int idx = -1;
        int ans = Integer.MAX_VALUE;
        for (int k=0; k<26; k++) {
            boolean ok = true;
            int p = 1;

            String t1 = s, t2 = "";
            int m = n;
            outer:
            for (int i=0; i<m; i++) {
                boolean f = true;
                for (int j=0; j<m-1; j++) {
                    if (t1.charAt(j) - 'a' == k || t1.charAt(j+1) - 'a' == k) {
                        t2 += String.valueOf((char)(k + 'a'));
                        f = false;
                    } else {
                        t2 += "X";
                    }
                }
                if (f) {
                    ok = false;
                    break outer;
                }
                boolean ff = true;
                for (int j=0; j<m-1; j++) {
                    if (t2.charAt(j) - 'a' != k) {
                        ff = false;
                    }
                }
                if (ff) {
                    break outer;
                }
                p++;
                t1 = t2;
                t2 = "";
                m--;
            }
            if (ok) {
                ans = Math.min(ans, p);
            }
        }
        out.println(ans);
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.nanoTime();

		solve();
		out.flush();

		long end = System.nanoTime();
		dump((end - start) / 1000000 + " ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}