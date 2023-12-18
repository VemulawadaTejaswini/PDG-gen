import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 1;
        for (long i = 1; i <= n; i++) {
            res *= i;
            res %= 1000000007;
        }
        System.out.println(res);
    }
}