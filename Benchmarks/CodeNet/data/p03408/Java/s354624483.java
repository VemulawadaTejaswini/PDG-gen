import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();// 青いカードの枚数
        HashMap<String, Integer> cards = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            if (cards.containsKey(key)) {
                cards.put(key, cards.get(key) + 1);
            } else {
                cards.put(key, 1);
            }
        }

        int m = sc.nextInt();// 赤いカードの枚数
        for (int i = 0; i < m; i++) {
            String key = sc.next();
            if (cards.containsKey(key)) {
                cards.put(key, cards.get(key) - 1);
            } else {
                cards.put(key, -1);
            }
        }

        int max = 0;
        for (Map.Entry<String, Integer> entry: cards.entrySet()) {
            if (max < entry.getValue()) max = entry.getValue();
        }

        System.out.println(max < 0 ? 0 : max);
    }
}
