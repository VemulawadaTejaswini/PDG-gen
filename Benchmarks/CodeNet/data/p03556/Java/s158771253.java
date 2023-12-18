import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = i * i;
            if (tmp > n) {
                System.out.println((i - 1) * (i - 1));
                return;
            }
        }
    }
}