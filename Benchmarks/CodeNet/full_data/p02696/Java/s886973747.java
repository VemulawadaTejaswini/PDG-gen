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
        long x = n - n % b - 1;
        long x2 = x - b;
        System.out.println(Math.max((long) Math.floor(a * x / b) - a * (long) Math.floor(x / b)
                , (long) Math.floor(a * x2 / b) - a * (long) Math.floor(x2 / b)));
    }
}
