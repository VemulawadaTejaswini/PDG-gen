import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        int[] xs = new int[n];
        int[] ys = new int[n];
        int[] hs = new int[n];

        for (int i = 0; i < n; i++) {
            int[] xyh = Arrays.stream(sc.nextLine().split(" +")).mapToInt(Integer::parseInt).toArray();
            xs[i] = xyh[0];
            ys[i] = xyh[1];
            hs[i] = xyh[2];
        }


        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int h = -1;
                int maxH = Integer.MAX_VALUE;
                boolean ok = true;
                for (int k = 0; k < n; k++) {
                    if (hs[k] == 0) {
                        maxH = Math.min(maxH, Math.abs(xs[k] - cx) + Math.abs(ys[k] - cy));
                    }
                    else {
                        int l = height(hs[k], cx, cy, xs[k], ys[k]);
                        if (h == -1) h = l;
                        else if (h != l) {
                            ok = false;
                            break;
                        }
                    }
                }
                if (ok && 1 <= h && h <= maxH) {
                    System.out.printf("%d %d %d\n", cx, cy, h);
                    return;
                }
            }
        }

        sc.close();
    }

    private static int height(int v, int cx, int cy, int x, int y) {
        return v + Math.abs(x - cx) + Math.abs(y - cy);
    }
}
