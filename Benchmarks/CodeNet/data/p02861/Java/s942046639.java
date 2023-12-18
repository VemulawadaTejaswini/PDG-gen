import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        Point[] base = new Point[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            base[i] = new Point(x, y);
        }

        double sum = permutation(base);
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            cnt *= i;
        }

        System.out.println(sum / cnt);
    }

     static double permutation(Point[] base) {
        Point[] perm = new Point[base.length];
        boolean[] used = new boolean[base.length];
        return buildPerm(base, perm, used, 0);
     }

     static double buildPerm(Point[] base, Point[] perm, boolean[] used, int index) {
        if (index == base.length) {
            return calc(perm);
        }

         double sum = 0.0;
         for (int i = 0; i < base.length; i++) {
             if (used[i]) continue;
             perm[index] = base[i];
             used[i] = true;
             sum += buildPerm(base, perm, used, index+1);
             used[i] = false;
         }

         return sum;
     }

     static double calc(Point[] a) {
        double sum = 0.0;
        for (int i = 0; i < a.length-1; i++) {
            sum += dist(a[i], a[i+1]);
        }
        return sum;
     }

    static double dist(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2.0) + Math.pow((a.y - b.y), 2.0));
    }

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}