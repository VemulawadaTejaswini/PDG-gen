import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main/*Change to Main When Submitting*/ {
    static BufferedReader __in;
    static PrintWriter __out;
    static StringTokenizer input;

    public static void main(String[] args) throws IOException {
        __in = new BufferedReader(new InputStreamReader(System.in));
        __out = new PrintWriter(new OutputStreamWriter(System.out));

        r();
        int n = ni(), m = ni();
        for(int i = 1; i <= m; ++i) {
            prln(i, n - i + 1);
        }

        close();
    }

    // references
    // IBIG = 1e9 + 7
    // IRAND ~= 3e8
    // IMAX ~= 2e10
    // LMAX ~= 9e18
    // constants
    static final int IBIG = 1000000007;
    static final int IRAND = 327859546;
    static final int IMAX = 2147483647;
    static final int IMIN = -2147483648;
    static final long LMAX = 9223372036854775807L;
    static final long LMIN = -9223372036854775808L;
    // util
    static int minof(int a, int b, int c) {return min(a, min(b, c));}
    static int minof(int... x) {return x.length == 1 ? x[0] : x.length == 2 ? min(x[0], x[1]) : min(x[0], minstarting(1, x));}
    static int minstarting(int offset, int... x) {assert x.length > 2; return offset == x.length - 2 ? min(x[offset], x[offset + 1]) : min(x[offset], minstarting(offset + 1, x));}
    static long minof(long a, long b, long c) {return min(a, min(b, c));}
    static long minof(long... x) {return x.length == 1 ? x[0] : x.length == 2 ? min(x[0], x[1]) : min(x[0], minstarting(1, x));}
    static long minstarting(int offset, long... x) {assert x.length > 2; return offset == x.length - 2 ? min(x[offset], x[offset + 1]) : min(x[offset], minstarting(offset + 1, x));}
    static int powi(int a, int b) {if(a == 0) return 0; int ans = 1; while(b > 0) {if((b & 1) > 0) ans *= a; a *= a; b >>= 1;} return ans;}
    static long powl(long a, int b) {if(a == 0) return 0; long ans = 1; while(b > 0) {if((b & 1) > 0) ans *= a; a *= a; b >>= 1;} return ans;}
    static int floori(double d) {return (int)d;}
    static int ceili(double d) {return (int)ceil(d);}
    static long floorl(double d) {return (long)d;}
    static long ceill(double d) {return (long)ceil(d);}
    // input
    static void r() throws IOException {input = new StringTokenizer(__in.readLine());}
    static int ri() throws IOException {return Integer.parseInt(__in.readLine());}
    static long rl() throws IOException {return Long.parseLong(__in.readLine());}
    static int[] ria(int n) throws IOException {int[] a = new int[n]; input = new StringTokenizer(__in.readLine()); for(int i = 0; i < n; ++i) a[i] = Integer.parseInt(input.nextToken()); return a;}
    static long[] rla(int n) throws IOException {long[] a = new long[n]; input = new StringTokenizer(__in.readLine()); for(int i = 0; i < n; ++i) a[i] = Long.parseLong(input.nextToken()); return a;}
    static char[] rcha() throws IOException {return __in.readLine().toCharArray();}
    static String rline() throws IOException {return __in.readLine();}
    static int ni() {return Integer.parseInt(input.nextToken());}
    static long nl() {return Long.parseLong(input.nextToken());}
    // output
    static void pr(int i) {__out.print(i);}
    static void prln(int i) {__out.println(i);}
    static void pr(long l) {__out.print(l);}
    static void prln(long l) {__out.println(l);}
    static void pr(double d) {__out.print(d);}
    static void prln(double d) {__out.println(d);}
    static void pr(char c) {__out.print(c);}
    static void prln(char c) {__out.println(c);}
    static void pr(char[] s) {__out.print(new String(s));}
    static void prln(char[] s) {__out.println(new String(s));}
    static void pr(String s) {__out.print(s);}
    static void prln(String s) {__out.println(s);}
    static void pr(Object o) {__out.print(o);}
    static void prln(Object o) {__out.println(o);}
    static void prln() {__out.println();}
    static void pryes() {__out.println("yes");}
    static void pry() {__out.println("Yes");}
    static void prY() {__out.println("YES");}
    static void prno() {__out.println("no");}
    static void prn() {__out.println("No");}
    static void prN() {__out.println("NO");}
    static void pryesno(boolean b) {__out.println(b ? "yes" : "no");};
    static void pryn(boolean b) {__out.println(b ? "Yes" : "No");}
    static void prYN(boolean b) {__out.println(b ? "YES" : "NO");}
    static void prln(int... a) {for(int i = 0, len = a.length - 1; i < len; __out.print(a[i]), __out.print(' '), i++); __out.println(a[a.length - 1]);}
    static void prln(long... a) {for(int i = 0, len = a.length - 1; i < len; __out.print(a[i]), __out.print(' '), i++); __out.println(a[a.length - 1]);}
    static void flush() {__out.flush();}
    static void close() {__out.close();}
    // debug
    static void debug(String desc, int... a) {System.out.print(desc); System.out.print(": "); for(int i = 0, len = a.length - 1; i < len; System.out.print(a[i]), System.out.print(", "), i++); System.out.println(a[a.length - 1]);}
    static void debug(String desc, long... a) {System.out.print(desc); System.out.print(": "); for(int i = 0, len = a.length - 1; i < len; System.out.print(a[i]), System.out.print(", "), i++); System.out.println(a[a.length - 1]);}
}