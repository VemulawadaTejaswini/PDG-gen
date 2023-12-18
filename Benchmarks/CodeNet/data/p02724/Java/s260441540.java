//Created by Aminul on 3/28/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(solve(in.nextInt()));
        pw.close();
    }

    static long solve(long n) {
        long res = 1000 * (n / 500);
        n %= 500;
        res += 5 * (n / 5);
        return res;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}