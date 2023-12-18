
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long i = sc.nextLong();
        long mod = 1000000007;
        long result = 0;
        for (long k = i; k <= n + 1; k++){
            result += ((n + (n - k + 1)) * k / 2) - (k * (k - 1) / 2) + 1;
        }
        System.out.println(result % mod);
    }
}
