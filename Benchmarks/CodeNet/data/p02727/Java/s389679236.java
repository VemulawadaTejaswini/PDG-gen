import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long[] p = new long[a];
        long[] q = new long[b];
        long[] r = new long[c];
        for (int i = 0; i < a; i++) {
            p[i] = sc.nextLong();
        }
        for (int i = 0; i < b; i++) {
            q[i] = sc.nextLong();
        }
        for (int i = 0; i < c; i++) {
            r[i] = sc.nextLong();
        }

        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        long ans = 0;
        int ia = a - 1;
        int ib = b - 1;
        int ic = c - 1;
        while ((a - ia - 1) + (b - ib - 1) + (c - ic - 1) < x + y) {
            if (ia >= 0
                && (b - ib > y || ib < 0 || p[ia] > q[ib])
                && (ic < 0 || p[ia] > r[ic])) {
                ans += p[ia--];
            } else if (ib >= 0
                       && (a - ia > x || ia < 0 || q[ib] > p[ia])
                       && (ic < 0 || q[ib] > r[ic])) {
                ans += q[ib--];
            } else {
                ans += r[ic--];
            }
        }
        System.out.println(ans);
    }

}
