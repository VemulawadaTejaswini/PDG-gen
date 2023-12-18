import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        int c = sc.nextInt();
        int d = sc.nextInt();

        long count = b - a + 1;

        count -= ((b - a + 1 + (a % c)) / c);
        count -= ((b - a + 1 + (a % d)) / d);
        count += ((b - a + 1 + (a % lcm(c, d))) / lcm(c, d));

        System.out.println(count);
        sc.close();

    }

    static int gcd(int m, int n) {
        if (m < n)
            return gcd(n, m);
        if(n == 0)
            return m;
        return gcd(n, m%n);
    }

    static int lcm(int m, int n){
        return ((m*n) / gcd(m, n));
    }
}