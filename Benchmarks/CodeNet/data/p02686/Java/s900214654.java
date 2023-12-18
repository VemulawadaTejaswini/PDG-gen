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
//        String[] S = new String[N];
        String ans = "";
        String left = "";
        String right = "";
        for (int i = 0; i < N; i++) {
            String tmp = scanString();
            while (tmp.indexOf("()") != -1) {
                tmp = tmp.replaceAll("\\(\\)", "");
            }
            if (tmp.indexOf(")(") != 1) {
                if (tmp.length() / 2 < tmp.replace(")", "").length()) {
                    ans = tmp + ans;
                } else {
                    ans = ans + tmp;
                }
            } else if (tmp.indexOf(")") != 1) {
                right += tmp;
            } else {
                left += tmp;
            }
//            System.out.println(tmp);
//            S[i] = tmp;
        }
        ans = left + ans + right;
        while (ans.indexOf("()") != -1) {
            ans = ans.replaceAll("\\(\\)", "");
        }
        if (ans.length() == 0) {
            out.print("Yes");
        } else {
            out.print("No");
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