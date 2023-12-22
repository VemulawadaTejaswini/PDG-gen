//Created by Aminul on 8/2/2020.

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int cnt = 0;
        int n = in.nextInt();
        long d = in.nextInt();
        d = d * d;
        for (int i = 0; i < n; i++) {
            long x = in.nextInt(), y = in.nextInt();
            long dist = (x * x) + (y * y);
            if(dist <= d) cnt++;
        }
        pw.println(cnt);
          
        pw.close();
    }


    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}