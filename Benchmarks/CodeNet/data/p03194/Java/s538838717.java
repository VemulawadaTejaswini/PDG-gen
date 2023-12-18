import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long n = stdin.nextLong();
        long p = stdin.nextLong();

        long k = 2;
        long ans = 1;
        while (p > 1) {
            long v = 0;
            while (p % k == 0) {
                v++;
                p /= k;
            }
            if (n <= v) {
                ans *= k * (v / n);
            }
            k++;
        }
        System.out.println(ans);
    }
}