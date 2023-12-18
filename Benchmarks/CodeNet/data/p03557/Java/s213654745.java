import java.util.*;
import java.lang.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int d[] = new int[n];
        int e[] = new int[n];

        for (int i = 0; i < n; i++) {
            int ok = n;
            int ng = -1;
            //[ok,ng)の中に、b[i]以上のaの中で最小のものがある
            while (Math.abs(ng-ok) > 1) {
                int mid = (ng + ok) / 2;
                if (a[mid] >= b[i]) {
                    ok = mid;
                } else {
                    ng = mid;
                }
            }
            d[i] = ok;
        }
        for (int i = 0; i < n; i++) {
            int ok = n;
            int ng = -1;
            while (Math.abs(ng - ok) > 1) {
                int mid = (ok + ng) / 2;
                if (c[mid] <= b[i]) {
                    ng = mid;
                } else {
                    ok = mid;
                }
            }
            e[i] = ok;
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long)d[i] * (long)(n - e[i]);
        }

        System.out.println(sum);

    }
}