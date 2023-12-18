import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            for (int j = 1; j * j <= a; j++) {
                if (a % j == 0) {
                    if (m.containsKey(j)) {
                        m.put(j, m.get(j) + 1);
                    } else {
                        m.put(j, 1);
                    }
                    if (j * j != n) {
                        int k = a / j;
                        if (m.containsKey(k)) {
                            m.put(k, m.get(k) + 1);
                        } else {
                            m.put(k, 1);
                        }
                    }
                }
            }
        }

        int ans = 0;
        for (Integer k : m.keySet()) {
            if (m.get(k) >= n - 1) {
                ans = Math.max(ans, k);
            }
        }

        System.out.println(ans);
    }
}