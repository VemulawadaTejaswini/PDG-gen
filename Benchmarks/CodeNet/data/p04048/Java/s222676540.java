import java.util.*;
public class Main
{
    static long res;
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); long x = sc.nextLong();
        long gcd = gcd(n, x); res = n;
        go(x, n - x);
        System.out.println(res - gcd);
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static void go(long a, long b) {
        if (a < b) {
            long temp = a;
            a = b; b = temp;
        }
        if (b == 0) return;
        res += (a / b) * b * 2;
        go(b, a % b);
    }


}