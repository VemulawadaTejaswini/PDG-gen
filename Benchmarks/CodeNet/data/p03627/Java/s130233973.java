import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        Arrays.setAll(a, i -> Long.parseLong(sc.next()));

        // 主処理
        PriorityQueue<Long> side = new PriorityQueue<>(Collections.reverseOrder());
        side.addAll(Arrays.asList(a));
        List<Long> list = new ArrayList<>();
        while (1 < side.size()) {
            long x = side.poll();
            long y = side.peek();
            if (x == y) {
                list.add(side.poll());
            }
        }

        long result = 0;
        if (2 <= list.size()) {
            result = list.get(0) * list.get(1);
        }
        // 出力
        System.out.println(result);
        sc.close();
    }
}
