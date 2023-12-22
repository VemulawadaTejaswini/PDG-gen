import java.io.*;
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main/*Change to Main When Submitting*/ {
    static BufferedReader __in;
    static PrintWriter __out;
    static StringTokenizer input;

    static int[] ans;
    static Comparator<P> cmpi = (a, b) -> a.a == b.a ? a.b - b.b : a.a - b.a, cmpd = (a, b) -> a.a == b.a ? a.b - b.b : b.a - a.a;

    public static void main(String[] args) throws IOException {
        __in = new BufferedReader(new InputStreamReader(System.in));
        __out = new PrintWriter(new OutputStreamWriter(System.out));

        int n = ri();
        Node[] g = new Node[n];
        r();
        for(int i = 0; i < n; ++i) {
            g[i] = new Node(i, ni());
        }
        for(int i = 0; i < n - 1; ++i) {
            r();
            g[ni() - 1].add(g[ni() - 1]);
        }
        g[0].label(null);
        ans = new int[n];
        fill(ans, 1);
        g[0].solve(n);
        for(int i : ans) {
            prln(i);
        }

        close();
    }

    static class Node {
        List<Node> nei = new ArrayList<>();
        int i, v;
        Node par;

        Node(int i_, int v_) {
            i = i_;
            v = v_;
        }

        void label(Node par_) {
            par = par_;
            for(Node n : nei) {
                if(n != par) {
                    n.label(this);
                }
            }
        }

        void add(Node n) {
            nei.add(n);
            n.nei.add(this);
        }

        void solve(int tot) {
            int[] dp = new int[tot], vals = new int[tot];
            fill(dp, 1);
            vals[0] = v;
            for(Node n : nei) {
                n.solve(dp, vals, 1);
            }
        }

        void solve(int[] dp, int[] vals, int ind) {
//            prln(ind);
//            prln(dp);
//            prln(vals);
//            prln(ans);
//            prln();
            dp[ind] = 1;
            for(int i = 0; i < ind; ++i) {
                if(v > vals[i]) {
                    dp[ind] = max(dp[ind], dp[i] + 1);
                    ans[this.i] = max(ans[i], dp[ind]);
                }
            }
            vals[ind] = v;
            for(Node n : nei) {
                if(n != par) {
                    n.solve(dp, vals, ind + 1);
                }
            }
        }
    }

    /* static class Node {
        List<Node> nei = new ArrayList<>();
        int v;

        Node(int v_) {
            v = v_;
        }

        // returns {inc, dec}
        List<TreeSet<P>> solve(Node par) {
            TreeSet<P> inc = new TreeSet<>(cmpi), dec = new TreeSet<>(cmpd);
            P self = P.mk(v, 1);
            if(nei.size() == 1) {
                inc.add(self);
                dec.add(self);
            } else {
                for(Node n : nei) {
                    if(n != par) {
                        List<TreeSet<P>> res = n.solve(this);
                        inc.addAll(res.get(0));
                        dec.addAll(res.get(1));
                    }
                }
                P maxInc = inc.floor(P.mk(v - 1, 0)), maxDec = dec.floor(P.mk(v + 1, 0));
                int cur = 1;
                if(maxInc != null) {
                    cur += maxInc.b;
                    inc.add(P.mk(v, maxInc.b + 1));
                }
                if(maxDec == null) {
                    cur += maxDec.b;
                    dec.add(P.mk(v, maxDec.b + 1));
                }
                ans = max(ans, cur);
            }
            List<TreeSet<P>> ret = new ArrayList<>(2);
            ret.add(inc);
            ret.add(dec);
            return ret;
        }
    } */

    static class P {
        int a, b;

        P(int a_, int b_) {
            a = a_;
            b = b_;
        }

        @Override
        public String toString() {
            return "Pair{" + "a = " + a + ", b = " + b + '}';
        }

        public static P mk(int a, int b) {
            return new P(a, b);
        }

        public boolean equalsSafe(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            P p = (P)o;
            return a == p.a && b == p.b;
        }

        public boolean equalsUnchecked(Object o) {
            P p = (P)o;
            return a == p.a && b == p.b;
        }

        @Override
        public boolean equals(Object o) {
            return equalsUnchecked(o);
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
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