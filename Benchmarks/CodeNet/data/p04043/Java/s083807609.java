// Created By Jefferson Samuel on 23/08/20 at 2:47 PM

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;

class Main {


    static void solve() throws Exception {

        int fc = 0 ,sc = 0;
        for(int i = 0 ; i < 3;i++)
        {
            int f = scanInt();
            if(f == 5) fc++;
            else if(f == 7) sc ++;
        }
        out.println(fc == 2 && sc == 1 ? "YES":"NO");

    }




    // dont touch this side
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
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}