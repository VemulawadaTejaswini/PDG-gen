import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        if (n < b) {
            System.out.println(a * n / b);
            return;
        }
        long x = n - (n % b) - 1;
        if (n % b == b - 1) {
            x = n;
        }
        long x2 = Math.max(0, x - b);
        System.out.println(
                Math.max((a * x / b) - a * (x / b), (a * x2 / b) - a * (x2 / b));
    }
}
