import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i ++) {
            t[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        System.out.println(cal(n, t, a));
    }

    private static long cal(final int n, final int[] t, final int[] a) {
        long lastt = t[0];
        long lasta = a[0];
        for (int i = 1; i < n; i ++) {
            if (t[i] > lastt && a[i] > lasta) {
                lastt = t[i];
                lasta = a[i];
            } else {
                long xt = lastt % t[i] == 0 ? lastt /t[i] : lastt/t[i] + 1;
                long xa = lasta % a[i] ==0 ? lasta / a[i] : lasta/a[i] + 1;
                lastt = Math.max(xt, xa) * t[i];
                lasta = Math.max(xt, xa) * a[i];
            }
        }
        return lasta + lastt;
    }
}
