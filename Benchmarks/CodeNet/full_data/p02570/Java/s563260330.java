//Created by Aminul on 8/29/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int d = in.nextInt(), t = in.nextInt(), s = in.nextInt();
        pw.println(t * s >= d ? "Yes" : "No");

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}