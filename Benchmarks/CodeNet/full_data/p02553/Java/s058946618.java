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

       long a = scanLong();
       long b = scanLong();
       long c = scanLong();
       long d = scanLong();
        long aa[] = {a,b};
        long bb[] = {c,d};

        long ans = Long.MIN_VALUE;
       for(long t : aa)
       {
           for(long q : bb)
           {
               ans = Math.max(ans,t*q);
           }
       }
       out.println(ans);
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