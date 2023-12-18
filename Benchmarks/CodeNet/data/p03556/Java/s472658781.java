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
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 0; i < n; i++) {
            int tmp = (i + 1) * (i + 1);
            if (tmp > n) {
                System.out.println(i * i);
                return;
            }
        }
    }
}