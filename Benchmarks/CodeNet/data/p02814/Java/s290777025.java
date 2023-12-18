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

        int t = f(a[0]);
        boolean ok = true;
        for (int i = 1; i < N; i++) {
            if (f(a[i]) != t) {
                ok = false;
                break;
            }
        }
        if (!ok) {
            System.out.println(0);
            return;
        }

        long l = 1;
        for (int i = 0; i < N; i++) {
            l = lcm(l, a[i]/2);
            if (l > M) {
                System.out.println(0);
                return;
            }
        }
        //System.out.println(lcm);

        System.out.println((M/l+1)/2);
    }

    private static long gcd(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        if (b == 0) {
            return a;
        }

        return gcd(b, a%b);
    }

    private static long lcm(long a, long b) {
        return a/gcd(a,b)*b;
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
