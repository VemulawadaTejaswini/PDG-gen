//Created by Aminul on 9/13/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        //TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            b[i] = x;
            //map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int majA = majorityElement(n, a), majB = majorityElement(n, b);
        if (majA != -1 && majA == majB) {
            pw.println("No");
        } else {
            b = solve(n, a, b);
            if (b == null) pw.println("No");
            else {
                pw.println("Yes");
                for (int i : b) pw.print(i + " ");
                pw.println();
            }
        }

        pw.close();
    }

    static int[] solve(int n, int[] a, int b[]) {
        n--;
        int N = n;
        for (int i = 0; i <= n; i++) {
            if (a[i] == b[i]) {
                int tmp = b[n];
                b[n] = b[i];
                b[i] = tmp;
                n--;
            }
        }
        for (int i = 0; i < N; i++) {
            if (a[i] == b[i]) return null;
        }
        return b;
    }

    static int[] solve(int n, int[] a, TreeMap<Integer, Integer> map) {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            Integer val = map.lowerKey(a[i]);
            if (val == null) val = map.higherKey(a[i]);
            debug(i, a[i], val);
            if (val == null) return null;
            map.put(val, map.getOrDefault(val, 0) - 1);
            if (map.get(val) == 0) map.remove(val);
            b[i] = val;
        }
        return b;
    }

    static int majorityElement(int n, int[] a) {
        int f[] = new int[n + 1];
        for (int i : a) {
            f[i]++;
            if (f[i] > n / 2) return i;
        }
        return -1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}