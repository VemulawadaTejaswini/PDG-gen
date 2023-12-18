import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            pq.add(a);
        }
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + b);
            } else {
                map.put(c, (long) b);
            }
        }

        // 主処理
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, Collections.reverseOrder());
        for (int key : keySet) {
            long b = map.get(key);
            int c = key;
            for (long j = 0; j < b; j++) {
                int a = pq.peek();
                if (a < c) {
                    pq.poll();
                    pq.add(c);
                } else {
                    break;
                }
            }
        }
        sc.close();

        long result = pq.stream().mapToLong(i -> i).sum();

        // 出力
        System.out.println(result);
    }
}
