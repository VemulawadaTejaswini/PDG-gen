import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        Arrays.setAll(a, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int d = Math.abs(a[i] - x);
            pq.add(d);
        }

        int result = pq.poll();
        while (!pq.isEmpty()) {
            int num = pq.poll();
            result = gcd(result, num);
        }

        // 出力
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        int temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
