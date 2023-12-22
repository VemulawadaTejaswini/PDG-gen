//Created by Aminul on 8/29/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String a = in.next(), b = in.next();
        int minRes = Integer.MAX_VALUE;
        for (int i = 0; i + b.length() <= a.length(); i++) {
            int tmp = getMismatch(a.substring(i, i + b.length()), b);
            minRes = min(minRes, tmp);
        }
        pw.println(minRes);
        pw.close();
    }

    static int getMismatch(String a, String b) {
        if (a.length() != b.length()) return b.length();
        int cnt = 0;
        for (int i = 0; i < b.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) cnt++;
        }
        return cnt;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}