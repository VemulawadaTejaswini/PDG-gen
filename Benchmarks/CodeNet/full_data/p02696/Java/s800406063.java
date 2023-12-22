import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        long ans = 0;
        if (n < b) {
            System.out.println((long) Math.max(ans, Math.floor(a * n / b)));
            return;
        }
        for (long i = n; i >= n - b; i--) {
            ans = Math.max(ans, (long) Math.floor(a * i / b) - a * (long) Math.floor(i / b));
        }
        System.out.println(ans);
    }
}
