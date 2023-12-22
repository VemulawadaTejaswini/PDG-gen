//Created by Aminul on 6/27/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), m = in.nextInt();
        long k = in.nextInt();
        long[] a = new long[n], b = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (i > 0) a[i] += a[i - 1];
        }

        TreeMap<Long, Integer> map = new TreeMap<>();
        map.put(Long.MIN_VALUE, 0);
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
            if (i > 0) b[i] += b[i - 1];
            map.put(b[i], i + 1);
        }


        int res = map.floorEntry(k).getValue();
        for (int i = 0; i < n; i++) {
            if(k >= a[i]) res = max(res, i + 1 + map.floorEntry(k - a[i]).getValue());
        }

        pw.println(res);

        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}