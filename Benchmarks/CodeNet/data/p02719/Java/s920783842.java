import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n < k) {
            System.out.println(n);
            return;
        } else if(n == k || k == 1) {
            System.out.println(0);
            return;
        }
        double c = (double)n / k;
        long d = (long) Math.ceil(c);
        long e = n - (k * d);
        long f = n - (k * (d -1));
        long g = Math.min(e, f);
        System.out.println(Math.abs(g));
    }
}