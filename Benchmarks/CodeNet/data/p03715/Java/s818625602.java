import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());
        sc.close();

        // 主処理
        long result = solve(h, w);

        // 出力
        System.out.println(result);
    }

    private static long solve(long h, long w) {
        if (h % 3 == 0 || w % 3 == 0) {
            return 0;
        }

        long diff = Long.MAX_VALUE;

        // 同じ方向に3回切る
        if (3 < h || 3 < w) {
            diff = (h < w) ? (w % 3 * h) : (h % 3 * w);
        }

        PriorityQueue<Long> pq = new PriorityQueue<>();
        // 最初に縦に切る
        for (long i = 1; i <= w / 2; i++) {
            long left = h * i;
            long up = (w - i) * (h / 2);
            long down = (w - i) * (h - h / 2);
            pq.add(left);
            pq.add(up);
            pq.add(down);
            long min = pq.poll();
            pq.poll();
            long max = pq.poll();
            diff = Math.min(diff, max - min);
        }
        // 最初に横に切る
        for (long i = 1; i <= h / 2; i++) {
            long up = w * i;
            long left = (h - i) * (w / 2);
            long right = (h - i) * (w - w / 2);
            pq.add(up);
            pq.add(left);
            pq.add(right);
            long min = pq.poll();
            pq.poll();
            long max = pq.poll();
            diff = Math.min(diff, max - min);
        }

        return diff;
    }
}
