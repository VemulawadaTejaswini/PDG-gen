import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[] p = new int[w + 1];
        int[] q = new int[h + 1];
        for (int i= 0; i < w; i ++) {
            p[i] = sc.nextInt();
        }
        p[w] = Integer.MAX_VALUE;

        for (int i= 0; i < h; i ++) {
            q[i] = sc.nextInt();
        }
        q[h] = Integer.MAX_VALUE;
        System.out.println(cal(w, h, p, q));
    }

    private static long cal(final int w, final int h, final int[] p, final int[] q) {
        long mulq = w +1;
        long mulp = h+ 1;
        Arrays.sort(p);
        Arrays.sort(q);
        int pi = 0;
        int qi = 0;
        long res = 0;
        while (pi < w || qi < h) {
            if (p[pi] < q[qi]) {
                res += p[pi] * mulp;
                mulq--;
                pi++;
            } else {
                res += q[qi] * mulq;
                mulp--;
                qi++;
            }
        }
        return res;
    }
}
