import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] x = new Integer[m];
        Arrays.setAll(x, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        Arrays.sort(x);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < m - 1; i++) {
            int left = x[i];
            int right = x[i + 1];
            int diff = right - left;
            pq.add(diff);
        }
        for (int i = 0; i < n - 1; i++) {
            pq.poll();
        }
        int sum = pq.stream().mapToInt(i -> i).sum();
        int result = sum;

        // 出力
        System.out.println(result);
    }
}
