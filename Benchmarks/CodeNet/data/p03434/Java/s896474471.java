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
        int alice = 0;
        int bob = 0;
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        Arrays.sort(as);
        boolean a = true;
        for (int i = n - 1; i >= 0; i--) {
            if (a) {
                alice += as[i];
                a = false;
            } else {
                bob += as[i];
                a = true;
            }
        }
        System.out.println(alice - bob);
    }
}