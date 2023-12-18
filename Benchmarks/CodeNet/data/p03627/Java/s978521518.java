import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));

        // 主処理
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> side = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < a.length; i++) {
            if (list.contains(a[i])) {
                side.add(a[i]);
                list.remove(list.indexOf(a[i]));
            } else {
                list.add(a[i]);
            }
        }
        int result = 0;
        if (2 <= side.size()) {
            int x = side.poll();
            int y = side.poll();
            result = x * y;
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}
