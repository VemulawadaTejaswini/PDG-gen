import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        long x = sc.nextLong();
        long y = sc.nextLong();

        long ans = x;
        while (ans <= (long)Math.pow(10, 8)) {
            if (ans % y != 0) {
                System.out.println(ans);
                return;
            }

            ans += x;
        }

        System.out.println(-1);
    }
}