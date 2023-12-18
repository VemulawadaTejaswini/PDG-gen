import java.util.Arrays;
import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        int[] xa = new int[n];
        int[] ya = new int[n];
        int[] ha = new int[n];

        int cx = 0, cy = 0, ch = 0;
        int[] max = new int[2];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int h = sc.nextInt();
            xa[i] = x;
            ya[i] = y;
            ha[i] = h;
            max[0] = Math.max(x, max[0]);
            max[1] = Math.max(y, max[1]);
        }

        int[][] mx = new int[101][2]; // place, height, for x
        int[][] my = new int[101][2]; // place, height, for y
        boolean xf = false, yf = false;
        for (int i = 0; i < n; i++) {
            if (mx[xa[i]][0] == 0) {
                // init
                mx[xa[i]][0] = xa[i];
                mx[xa[i]][1] = ha[i];
            } else if (mx[xa[i]][1] == ha[i]) {
                // if same height with before,
                cx = (mx[xa[i]][0] + xa[i] + 1) / 2;
                xf = true;
            }
            if (my[ya[i]][0] == 0) {
                my[ya[i]][0] = ya[i];
                my[ya[i]][1] = ha[i];
            } else if (my[ya[i]][1] == ha[i]) {
                cy = (my[ya[i]][0] + ya[i] + 1) / 2;
                yf = true;
            }
        }
        if (!xf) {
            cx = max[0] > 50 ? 100 : 0;
        }
        if (!yf) {
            cy = max[1] > 50 ? 100 : 0;
        }
        ch = Math.abs(cx - xa[0]) + Math.abs(cy - ya[0]) + ha[0];
        System.out.println(cx + " " + cy + " " + ch);
    }
}
