//Created by Aminul on 7/5/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        HashMap<String, Integer> map = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        pw.println("AC x " + map.getOrDefault("AC", 0));
        pw.println("WA x " + map.getOrDefault("WA", 0));
        pw.println("TLE x " + map.getOrDefault("TLE", 0));
        pw.println("RE x " + map.getOrDefault("RE", 0));


        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}