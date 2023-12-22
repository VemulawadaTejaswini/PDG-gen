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
        int N = scanInt(), M = scanInt();
        long[] ten = new long[N];
        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ten[i] = scanLong();
        }
        for (int i = 0; i < M; i++) {
            int A =  scanInt() - 1;
            int B =  scanInt() - 1;
            if (ten[A] < ten[B]) {
                ans[A] = 1;
            } else if (ten[A] > ten[B]) {
                ans[B] = 1;
            } else {
                ans[A] = 1;
                ans[B] = 1;
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (ans[i] == 0) count++;
        }
        out.print(count);
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