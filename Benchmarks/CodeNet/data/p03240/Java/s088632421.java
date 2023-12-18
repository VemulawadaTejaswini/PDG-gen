

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    static int n;
    static int[] x;
    static int[] y;
    static int[] h;


    public static void main(String[] args) {
        n = sc.nextInt();
        x = new int[n];
        y = new int[n];
        h = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
        }

        //solve
        int minH = 0;
        int ansX = 0;
        int ansY = 0;
        for (int xi = 0; xi <= 100; xi++) {
            for (int yi = 0; yi <= 100; yi++) {
                int ans = sameHeight(xi, yi);
                if (ans < 0) {
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

    public static int sameHeight(int xi, int yi) {
        int height = 0;
        for (int j = 0; j < n; j++) {
            int ans = Math.abs(xi - x[j]) + Math.abs(yi - y[j]) + h[j];
            if (height == 0) {
                height = ans;
                continue;
            }
            if (height == ans) {
                continue;
            } else {
                return -1;
            }
        }
        return height;
    }
}
