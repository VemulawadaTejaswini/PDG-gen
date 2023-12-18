import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private int prime[] = { 2, 3, 5, 7 };
    private int target[] = { 2, 4, 14, 24, 74 };

    public void main(Scanner sc) {
        int n = sc.nextInt();

        // 9! までは七五数がない
        if (n < 10) {
            System.out.println(0);
            return;
        }

        // n! を素因数分解
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            int tmp = i;
            for (int j = 0; j < 4; j++) {
                if (tmp % prime[j] == 0) {
                    while (tmp % prime[j] == 0) {
                        list.add(prime[j]);
                        tmp /= prime[j];
                    }
                }
            }
            if (tmp != 1) {
                list.add(tmp);
            }
        }

        // 各素因数の出現回数を統計
        Map<Integer, Long> map =
            list.stream().collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        // 2,4,14,24,74 個以上出現した素因数の数をカウント
        int tmp[] = new int[5];
        for (Long cnt : map.values()) {
            for (int i = 0; i < 5; i++) {
                if (cnt >= target[i]) {
                    tmp[i]++;
                }
            }
        }

        int ans = 0;
        // p^74 のパターン
        ans += tmp[4];

        // p^2*q^24 のパターン
        if (tmp[3] > 0) {
            ans += (tmp[0] - tmp[3]) * tmp[3];
            ans += tmp[3] * (tmp[3] - 1);
        }

        // p^4*q^14 のパターン
        if (tmp[2] > 0) {
            ans += (tmp[1] - tmp[2]) * tmp[2];
            ans += tmp[2] * (tmp[2] - 1);
        }

        // p^2*q^4*r^4 のパターン
        if (tmp[1] >= 2) {
            ans += (tmp[0] - tmp[1]) * tmp[1] * (tmp[1] - 1) / 2;
            ans += tmp[1] * (tmp[1] - 1) * (tmp[1] - 2) / 2;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().main(sc);
        } catch (Exception e) {
            throw e;
        }
    }
}
