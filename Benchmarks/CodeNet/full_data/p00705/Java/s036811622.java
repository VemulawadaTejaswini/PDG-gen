import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, q, m, d, max_key, max_count;

        while (true) {
            int ans = 0;
            max_key = 0;
            max_count = 0;
            HashMap<Integer, Integer> dayCounts = new HashMap<>();
            n = Integer.parseInt(sc.next());
            q = Integer.parseInt(sc.next());
            if (n == 0 && q == 0)
                break;

            for (int i = 0; i < n; i++) {
                m = Integer.parseInt(sc.next());
                for (int j = 0; j < m; j++) {
                    d = Integer.parseInt(sc.next());
                    int c = dayCounts.containsKey(d) ? dayCounts.get(d) : 0;
                    dayCounts.put(d, ++c);
                    if (c > max_count || (c == max_count && d < max_key)) {
                        max_key = d;
                        max_count = c;
                    }
                }
            }
            if (max_count >= q)
                ans = max_key;

            System.out.println(ans);
        }

    }
}