import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;

        long[] prime = new long[n + 1];
        for (int i = 2; i <= n; i++) {
            int num = i;
            for (int j = 2; j <= n; j++) {
                while (num % j == 0) {
                    prime[j] = (prime[j] + 1) % mod;
                    num /= j;
                }
            }
        }

        long count = 1;
        for (int i = 1; i < prime.length; i++) {
            count = (count * (prime[i] + 1)) % mod;
        }
        System.out.println(count);
    }

}
