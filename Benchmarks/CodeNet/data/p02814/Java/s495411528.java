import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        boolean ok = true;
        int xx = f(a[0]);
        for (int i = 1; i < N; i++) {
            if (f(a[i]) != xx) {
                ok = false;
                break;
            }
        }
        if (!ok) {
            System.out.println(0);
            return;
        }

        long lcm = 1;
        for (int i = 1; i < N; i++) {
            lcm = calcLcm(lcm, a[i]/2);
        }
        //System.out.println(lcm);

        System.out.println((M/lcm+1)/2);
    }

    private static long calcGcd(long a, long b) {
        if (b == 0) {
            return a;
        }

        return calcGcd(b, a%b);
    }

    private static long calcLcm(long a, long b) {
        long gcd = calcGcd(a,b);
        return a/gcd*b;
    }

    private static int f(int x) {
        int ret = 0;
        while (x%2 == 0) {
            ret++;
            x /= 2;
        }

        return ret;
    }
}
