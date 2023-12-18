import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        long power = 1;
        long mod = (long)(Math.pow(10, 9) + 7);
        for (int i = 1; i <= n; i++) {
            power = (power % mod) * (i % mod) % mod;
        }
        System.out.println(power);
    }
}