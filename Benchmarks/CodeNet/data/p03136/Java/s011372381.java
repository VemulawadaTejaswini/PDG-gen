import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            max = Math.max(max, l);
            sum += l;
        }
        System.out.println(max < sum - max ? "Yes" : "No");
    }
}
