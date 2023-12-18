import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        n = n % k;

        while (true) {
            if (n <= Math.abs(n - k)) {
                break;
            }
            n = Math.abs(n - k);
        }
        System.out.println(n);
    }
}