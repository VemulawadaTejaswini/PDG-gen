//Created by Aminul on 3/28/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(solve(in.next().toCharArray()));
        pw.close();
    }

    static String solve(char s[]) {
        return s[2] == s[3] && s[4] == s[5] ? "Yes" : "No";
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}