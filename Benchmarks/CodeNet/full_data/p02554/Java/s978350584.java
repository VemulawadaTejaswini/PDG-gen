import java.util.Scanner;

public class Main {
    private static long mod = (long) (1e9 + 7);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2) {
            System.out.println(0);
        } else {
            long ans = (powAndMod(10, n) - powAndMod(9, n) * 2 + powAndMod(8, n)) % mod;
            System.out.println(ans);
        }
    }


    private static long powAndMod(long a, long b) {
        long x = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                x = (x * a) % mod;
                b--;
            } else {
                a = (a * a) % mod;
                b /= 2;
            }
        }
        return x;
    }

}