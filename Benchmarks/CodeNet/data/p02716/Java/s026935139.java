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
        int N = scanInt();
        long A[] = new long[N];
        long odd = 0;
        long even = 0;

        if (N % 2 == 0) {
            for (int i = 0; i < N; i++) {
                A[i] = scanLong();
                if (i % 2 == 0) {
                    even += A[i];
                }
                else {
                    odd += A[i];
                }
            }
            out.print(even > odd ? even : odd);
        }
        else {
            long minVal = Long.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                A[i] = scanLong();
                minVal = minVal < A[i] ? minVal : A[i];
                if (i % 2 == 0) {
                    even += A[i];
                }
                else {
                    odd += A[i];
                }
            }
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    even += A[i];
                }
                else {
                    odd += A[i];
                }
            }
            out.print(even > odd ? even : odd - minVal);
        }
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