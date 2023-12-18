import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
        }
        long ans = 0L;
        for (int i = 1; i <= n; i++) {
            long t = Math.min(a[i-1], a[i]);
            ans += t;
            a[i] -= t;
            long t2 = a[i]/2;
            ans += t2;
            a[i] -= t2*2;
        }
        System.out.println(ans);
        sc.close();

    }

}
