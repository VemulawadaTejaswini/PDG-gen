
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = 0;
        int[] x = new int[n];
        for (int i = 0 ; i < n ;i++) {
            x[i] = sc.nextInt();
            if (x[i] < 0) {
                m++;
            }
        }
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0 ; i < n ; i++) {
            if (x[i] < 0) {
                b[i] = -2 * x[i];
                c[i] = -1 *x[i];
            } else {
                b[i] = x[i];
                c[i] = 2 * x[i];
            }
        }
        int cost = Integer.MAX_VALUE;
        for (int i = 0 ; i <= n - k ; i++) {
            int e = x[i];
            int f = x[i + k - 1];
            if (e < 0 && f < 0) {
                cost = Math.min(cost, -1 * e);
            } else if (e < 0 && f >= 0) {
                cost = Math.min(cost, Math.min(-2 * e + f, -1 * e + 2 *f));
            } else {
                cost = Math.min(cost, f);
            }
        }
System.out.println(cost);
    }

}
