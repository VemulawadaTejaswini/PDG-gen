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
        int x = scanInt(), y = scanInt();
        if (y % 2 != 0) {
            System.out.println("No");
        } else if (x * 4 < y) {
            System.out.println("No");
        } else {
            if (x * 2 == y) {
                System.out.println("Yes");
                return;
            }
            for (int i = 1; i <= x; i++) {
                if ((i * 4) + ((x - i) * 2) == y) {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
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