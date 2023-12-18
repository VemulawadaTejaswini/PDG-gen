import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long ans = n - 1;

        int sqrt = (int) Math.sqrt(n);

        for (int i = sqrt; 1 < i; i--) {
            if (n % i == 0) {
                ans = i + (n / i) - 2;
                break;
            }
        }
        System.out.println(ans);
    }
}