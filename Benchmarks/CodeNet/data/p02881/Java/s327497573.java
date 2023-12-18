import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long num1 = 1;

        for (long i = 2; i <= 10; i++) {
            if (n % i == 0) {
                num1 = i;
            }
        }
        System.out.println(num1 - 1 + (n / num1 - 1));
    }
}