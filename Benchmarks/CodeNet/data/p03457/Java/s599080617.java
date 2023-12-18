import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] t = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int sx = 0;
        int sy = 0;
        int prev_t = 0;
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            int gx = x[i];
            int gy = y[i];
            int cur_t = t[i] - prev_t;
            int man_dist = Math.abs(sx - gx) + Math.abs(sy - gy);
            if ((man_dist > cur_t) || (man_dist % 2 != cur_t % 2)) {
                possible = false;
                break;
            }

            sx = gx;
            sy = gy;
            prev_t = cur_t;
        }

        System.out.println((possible)? "Yes": "No");
    }
}