//package solution;

import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.awt.Point;

public final class Main {
    BufferedReader br;
    StringTokenizer stk;

    public static void main(String[] args) throws Exception {
        //new Thread(null, new Runnable() {
            //@Override
            //public void run() {
                //try {
                    new Main().run();
                //} catch(Exception ex) {ex.printStackTrace();}
            //}
        //}, "solution", 1<<26).start();
    }
    
    {
        stk = null;
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    //long mod = 1000000007L;
    void run() throws Exception {
        long n = ni();
        long total = (n / 500) * 1000;
        n %= 500;
        total += (n / 5) * 5;
        pl(total);
    }
    
    //Reader & Writer
    String nextToken() throws Exception {
        if (stk == null || !stk.hasMoreTokens()) {
            stk = new StringTokenizer(br.readLine(), " ");
        }
        return stk.nextToken();
    }

    String nt() throws Exception {
        return nextToken();
    }

    String ns() throws Exception {
        return br.readLine();
    }

    int ni() throws Exception {
        return Integer.parseInt(nextToken());
    }

    long nl() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nd() throws Exception {
        return Double.parseDouble(nextToken());
    }

    void p(Object o) {
        System.out.print(o);
    }

    void pl(Object o) {
        System.out.println(o);
    }
}