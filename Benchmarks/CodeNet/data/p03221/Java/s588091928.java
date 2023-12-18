import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] p = new Integer[m];
        Integer[] y = new Integer[m];
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new PriorityQueue<Integer>());
        }
        for (int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            map.get(p[i]).add(y[i]);
        }
        sc.close();

        // 主処理
        Map<Integer, Integer> birthNumberMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int num = 1;
            while (!map.get(i).isEmpty()) {
                birthNumberMap.put(map.get(i).poll(), num);
                num++;
            }
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String left = String.format("%06d", p[i]);
            String right = String.format("%06d", birthNumberMap.get(y[i]));
            list.add(left + right);
        }

        String result = String.join("\r\n", list);

        // 出力
        System.out.println(result);
    }
}
