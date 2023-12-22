import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long ans = 0;

        long l = 0;
        long r = n;
        while(l <= r) {
            long m = (l + r) / 2;
            long t = (long)Math.floor((double)a * m / b) - a * (m / b);
            if(t >= ans) {
                ans = t;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        System.out.println(ans);
    }
}
