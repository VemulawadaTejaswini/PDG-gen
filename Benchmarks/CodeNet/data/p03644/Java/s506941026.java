import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int ans = 1;
        for (int i = 0; i <= 100; i++) {
            if (ans > n) {
                System.out.println(ans / 2);
                return;
            }
            ans *= 2;
        }
    }
}