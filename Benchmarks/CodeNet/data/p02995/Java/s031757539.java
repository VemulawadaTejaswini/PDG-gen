import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextInt();
        long d = stdIn.nextInt();
        
        long x = b / c - (a-1) / c;
        long y = b / d - (a-1) / d;

        long n = lcm(c,d);
        
        long w = b / n - (a-1) / n;

        System.out.println(b-a+1-(x+y-w));
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
}