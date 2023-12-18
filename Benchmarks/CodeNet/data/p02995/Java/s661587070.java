import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long lcm = (long) Math.floor(C * D / gcd(C, D));
        long x = (long) Math.floor(B/C) - (long) Math.floor(A/C);
        long y = (long) Math.floor(B/D) - (long) Math.floor(A/D);
        long z = (long) Math.floor(B/lcm) - (long) Math.floor(A/lcm);

        System.out.println((B - A) - (x + y - z));
    }

    public static long gcd(long m, long n)
    {
        long temp;
        while (m % n != 0)
        {
            temp = n;
            n = m % n;
            m = temp;
        }
        return n;
    }
}