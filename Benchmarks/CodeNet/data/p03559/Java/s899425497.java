import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }

        int[] bs = new int[n];
        for (int i = 0; i < n; i++) {
            bs[i] = sc.nextInt();
        }
        
        int[] cs = new int[n];
        for (int i = 0; i < n; i++) {
            cs[i] = sc.nextInt();
        }

        long ans = 0;
        for (int a : as) {
            for (int b : bs) {
                if (b <= a) {
                    continue;
                }

                for (int c : cs) {
                    if (c > b) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
