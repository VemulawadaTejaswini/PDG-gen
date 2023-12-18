import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            char[] tmp = String.valueOf(i).toCharArray();
            int sum = 0;
            for (char c : tmp) {
                sum += c - '0';
            }

            if (a <= sum && sum <= b) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}