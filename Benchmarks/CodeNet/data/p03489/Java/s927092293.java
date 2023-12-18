import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] counts = new int[1000_000_001];
        for (int i = 0; i < n; i++) {
            counts[sc.nextInt()]++;
        }

        long ans = 0l;
        for (int i = 1; i <= 1000_000_000; i++) {
            if (counts[i] == 0) {
                continue;
            }

            if (counts[i] < i) {
                ans += counts[i];
            } else if (counts[i] > i) {
                ans += counts[i] - i;
            }
        }
        System.out.println(ans);
    }
}
