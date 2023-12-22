//Created by Aminul on 7/25/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int x = in.nextInt();
        for (int i = 1800, j = 1; i >= 400; i -= 200, j++) {
            if (i <= x) {
                pw.println(j + "-kyu");
                break;
            }
        }

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}