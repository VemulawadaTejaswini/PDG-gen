//Created by Aminul on 8/22/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long n = in.nextInt(), x = in.nextInt(), t = in.nextInt();
        long res = (n / x) * t;
        if(n % x != 0) res += t;
        pw.println(res);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}