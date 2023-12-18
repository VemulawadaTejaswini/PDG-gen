import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] a = new int[n];
        int[][] ans = new int[h][w];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                for (int j = 0; j < h; j++) {
                    for (int k = 0; k < x[i]; k++) {
                        ans[j][k] = 1;
                    }
                }
            }
            if (a[i] == 2) {
                for (int j = 0; j < h; j++) {
                    for (int k = x[i]; k < w; k++) {
                        ans[j][k] = 1;
                    }
                }
            }
            if (a[i] == 3) {
                for (int j = 0; j < y[i]; j++) {
                    for (int k = 0; k < w; k++) {
                        ans[j][k] = 1;
                    }
                }
            }
            if (a[i] == 4) {
                for (int j = y[i]; j < h; j++) {
                    for (int k = 0; k < w; k++) {
                        ans[j][k] = 1;
                    }
                }
            }
        }
        int count = 0;
        for (int j = 0; j < h; j++) {
            for (int k = 0; k < w; k++) {
                if (ans[j][k] == 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
