import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long a = n % k;
        System.out.println(Math.min(a, k-a));

        double c = (double)n / (double)k;
        long d = (long) Math.floor(c);
        long e = Math.abs(n - (k * d));
        long f = Math.abs(n - (k * (d +1)));
        System.out.println(Math.min(e, f));
    }
}