import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static void solve() throws Exception {
        long A = scanLong(), B = scanLong(), N = scanLong();
//        long ans = -1;
//        for (long i = 1; i <= N; i++) {
//            long t = (long)(A * i / B) - (long)(A * (long)(i / B));
//            System.out.println(A +":"+B+":"+i+":"+t);
//            if (ans < t) {
//                ans = t;
//            }
//        }
        out.print((long)(A * N / B) - (long)(A * (long)(N / B)));
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}