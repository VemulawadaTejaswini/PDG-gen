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
        Integer[] as = new Integer[n];
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();
        }
        Arrays.sort(as, Collections.reverseOrder());

        Integer[] bs = new Integer[n];
        for (int i = 0; i < n; i++) {
            bs[i] = sc.nextInt();
        }
        Arrays.sort(bs, Collections.reverseOrder());

        Integer[] cs = new Integer[n];
        for (int i = 0; i < n; i++) {
            cs[i] = sc.nextInt();
        }
        Arrays.sort(cs, Collections.reverseOrder());

        long ans = 0;
        for (int a : as) {
            for (int b : bs) {
                if (b <= a) {
                    break;
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
