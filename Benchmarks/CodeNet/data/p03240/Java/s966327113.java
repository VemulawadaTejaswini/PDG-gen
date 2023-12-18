

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    static int n;
    static int[] x;
    static int[] y;
    static long[] h;


    public static void main(String[] args) {
        n = sc.nextInt();
        x = new int[n];
        y = new int[n];
        h = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextLong();
        }

        //solve
        long minH = 0;
        int ansX = 0;
        int ansY = 0;
        for (int xi = 0; xi <= 100; xi++) {
            for (int yi = 0; yi <= 100; yi++) {
                long ans = sameHeight(xi, yi);
                if (ans < 1) {
                    continue;
                }
                if (minH < ans) {
                    minH = ans;
                    ansX = xi;
                    ansY = yi;
                }
            }
        }

        System.out.println(ansX + " " + ansY + " " + minH);
    }

    public static long sameHeight(int xi, int yi) {
        long height = -1;
        for (int j = 0; j < n; j++) {
            if (h[j] > 0) {
                long ans = Math.abs(xi - x[j]) + Math.abs(yi - y[j]) + h[j];
                if (ans < 0) {
                    ans = 0;
                }
                if (height < 0) {
                    height = ans;
                    continue;
                }
                if (height == ans) {
                    continue;
                } else {
                    return -1;
                }
            } else {
                long dist = Math.abs(xi - x[j]) + Math.abs(yi - y[j]);
                if (height > dist) {
                    return -1;
                }
            }
        }
        return height;
    }
}
