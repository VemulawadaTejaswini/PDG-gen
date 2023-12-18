import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Long[] boals = new Long[N];

        for (int i = 0; i < boals.length; i++) {
            boals[i] = (long) scanner.nextInt();
        }
        scanner.close();

        // 辞書作成
        Map<Long, Long> boalMap = new HashMap<>();
        for (Long i : boals) {
            if (boalMap.containsKey(i)) {
                boalMap.put(i, boalMap.get(i) + 1);
            } else {
                boalMap.put(i, 1L);
            }
        }

        for (Long i : boals) {
            long ans = 0;
            for (Long key : boalMap.keySet()) {
                if (key == i) {
                    ans += calcu(boalMap.get(key) - 1);
                } else {
                    ans += calcu(boalMap.get(key));
                }
            }

            System.out.println(ans);
        }
    }

    public static Long calcu(Long n) {
        if (n <= 1) {
            return 0L;
        } else {
            return n * (n - 1) / 2;
        }
    }
}
