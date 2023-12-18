import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 人数
        int m = sc.nextInt();// 種類
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= m; i++) {
            // 初期化
            map.put(i, 0);
        }

        for (int i = 0; i < n; i++) {
            int count = sc.nextInt();// 調査した食べ物の数
            for (int j = 0; j < count; j++) {
                int food = sc.nextInt();
                map.put(food, map.get(food)+1);
            }
        }

        int count = 0;
        for (Map.Entry entry: map.entrySet()){
            if ((Integer) entry.getValue() == n) count++;
        }

        System.out.println(count);
    }
}
