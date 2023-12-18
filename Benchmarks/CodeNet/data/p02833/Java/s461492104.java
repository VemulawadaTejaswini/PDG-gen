import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n % 2 == 1) {
            System.out.println(0);
            return;
        }
        long base = 10;
        long count = 0;
        while (base <= n) {
            count += n / base;
            base *= 5;
        }
        System.out.println(count);
    }
}