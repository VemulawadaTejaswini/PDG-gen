import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n * 2; i++) {
            pq.add(Integer.parseInt(sc.next()));
        }
        sc.close();

        // 主処理
        int result = 0;
        while (!pq.isEmpty()) {
            result += pq.poll();
            pq.poll();
        }

        // 出力
        System.out.println(result);
    }
}
