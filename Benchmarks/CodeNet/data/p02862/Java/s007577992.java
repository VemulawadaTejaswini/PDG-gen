import java.util.Scanner;

public class Main {
    public static long sa = 0;
    public static long sb = 0;
    public static long su = 0;
    public static long sv = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        long n = (2 * Y - X) / 3;
        long m = (2 * X - Y) / 3;
        long MN = 1;
        long MM = 1;
        if((2 * Y - X) < 0 || (2 * X - Y) < 0){
            System.out.println(0);
            return;
        }

        if((2 * Y - X) % 3 != 0 || (2 * X - Y) % 3 != 0){
            System.out.println(0);
            return;
        }

        long c = 1000000007L;
        long a = 12345678900000L;
        long b = 100000L;
        a %= c;
//        System.out.println(a * modInv(b,c) % c);
        for (long i = n + 1; i < n + m + 1; i++) {
//            System.out.println(MN);
            MN *= i;
            MN %= c;
        }
        for (long i = 1; i < m + 1; i++) {
//            System.out.println(MM);
            MM *= i;
            MM %= c;
        }
        System.out.println(MN * modInv(MM,c) % c);
    }

    private static long modInv(long a, long m) {
        long b = m;
        long u = 1;
        long v = 0;
        while (b > 0) {
            long t = a / b;
            a -= t * b;
            u -= t * v;
            sa = a;
            sb = b;
            a = sb;
            b = sa;
            su = u;
            sv = v;
            u = sv;
            v = su;
        }
        u %= m;
        if(u < 0) u+=m;
        return u;
    }
}
