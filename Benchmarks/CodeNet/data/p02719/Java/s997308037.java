import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        n %= k;
        while (Math.abs(n - k) < n) {
            n = Math.abs(n - k);
        }
        System.out.println(n);
    }
}
