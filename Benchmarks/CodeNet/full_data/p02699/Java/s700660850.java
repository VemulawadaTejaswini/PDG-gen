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

        read();
        int S =  nextInt(), W = nextInt();
        println(W >= S ? "unsafe" : "safe");

        close();
    }

    static final int IBIG = 1000000007;
    static final int IMAX = 2147483647;
    static final long LMAX = 9223372036854775807L;
    static void read() throws IOException {input = new StringTokenizer(__in.readLine());}
    static String readLine() throws IOException {return __in.readLine();}
    static int nextInt() {return Integer.parseInt(input.nextToken());}
    static int readInt() throws IOException {return Integer.parseInt(__in.readLine());}
    static long nextLong() {return Long.parseLong(input.nextToken());}
    static void print(String s) {__out.print(s);}
    static void println(String s) {__out.println(s);}
    static void print(Object o) {__out.print(o);}
    static void println(Object o) {__out.println(o);}
    static void printy() {__out.println("Yes");}
    static void printY() {__out.println("YES");}
    static void printn() {__out.println("No");}
    static void printN() {__out.println("NO");}
    static void printyn(boolean b) {__out.println(b ? "Yes" : "No");}
    static void printYN(boolean b) {__out.println(b ? "YES" : "NO");}
    static void println(int... a) {for(int i = 0, len = a.length - 1; i < len; __out.print(a[i]), __out.print(' '), i++); __out.println(a[a.length - 1]);}
    static void println(long... a) {for(int i = 0, len = a.length - 1; i < len; __out.print(a[i]), __out.print(' '), i++); __out.println(a[a.length - 1]);}
    static void println() {__out.println();}
    static void close() {__out.close();}
}