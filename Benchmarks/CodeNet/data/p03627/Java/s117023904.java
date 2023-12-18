import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        Arrays.setAll(a, i -> Long.parseLong(sc.next()));
        sc.close();

        // 主処理
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(a));
        List<Long> list = new ArrayList<>();
        while (list.size() < 2 && 1 < pq.size()) {
            long max = pq.poll();
            long second = pq.peek();
            if (max == second) {
                list.add(pq.poll());
            }
        }
        long result = 0;
        if (2 <= list.size()) {
            result = list.get(0) * list.get(1);
        }

        // 出力
        System.out.println(result);
    }
}
