import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Long.min;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static void solve() throws Exception {
        int N = scanInt();
        long ans = 0;
        long A1 = scanLong();
        long A2 = scanLong();
        for (int i = 2; i < N; i++) {
            ans = ans ^ scanLong();
        }

        long limit = min(A1, 10000000);
        for (long i = 0; i < limit; i++) {
            if ((ans ^ (A1 - i) ^ (A2 + i)) == 0) {
                out.print(i);
                return;
            }
        }
        out.print(-1);
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