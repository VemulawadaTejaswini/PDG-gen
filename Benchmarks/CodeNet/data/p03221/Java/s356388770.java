import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] arrayP = new int[m];
        int[] arrayY = new int[m];
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, new PriorityQueue<>());
        }
        for (int i = 0; i < m; i++) {
            int p = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            map.get(p).add(y);
            arrayP[i] = p;
            arrayY[i] = y;
        }
        sc.close();

        // 主処理
        Map<Integer, List<Integer>> sortedMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            sortedMap.put(i, new ArrayList<>(map.get(i)));
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String left = String.format("%06d", arrayP[i]);
            String right = String.format("%06d", sortedMap.get(arrayP[i]).indexOf(arrayY[i]) + 1);
            list.add(left + right);
        }
        String result = String.join("\r\n", list);

        // 出力
        System.out.println(result);
    }
}
