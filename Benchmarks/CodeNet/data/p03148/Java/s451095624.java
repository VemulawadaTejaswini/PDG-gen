import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static Comparator<Long> comparator = new Comparator<Long>() {
        @Override
        public int compare(Long o1, Long o2) {
            if (o1 > o2) {
                return -1;
            }
            if (o1 == o2) return 0;
            return 1;
        }
    };

    public static void main(String[] args) {
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<PriorityQueue<Long>> kind = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            kind.add(new PriorityQueue<>(comparator));
        }

        for (int i = 0; i < N; i++) {
            int t = sc.nextInt();
            long d = sc.nextLong();
            kind.get(t - 1).add(d);
        }

        PriorityQueue<Long> best = new PriorityQueue<>(comparator);
        PriorityQueue<Long> remain = new PriorityQueue<>(comparator);
        // best: 各種類で一番美味しいやつを集めたもの
        // remain : bestの余り
        for (int i = 0; i < N; i++) {
            if (!kind.get(i).isEmpty()) {
                best.add(kind.get(i).poll());
                while (!kind.get(i).isEmpty()) {
                    remain.add(kind.get(i).poll());
                }
            }
        }

        List<Long> bsum = new ArrayList<>();
        bsum.add(0l);
        // bestの累積和 (bsum[i] = bestの先頭からi個の総和)
        while (!best.isEmpty()) {
            bsum.add(bsum.get(bsum.size() - 1) + best.poll());
        }

        List<Long> rsum = new ArrayList<>();
        rsum.add(0l);
        // remainの累積和
        while (!remain.isEmpty()) {
            rsum.add(rsum.get(rsum.size() - 1) + remain.poll());
        }

        long ans = 0;
        for (int x = 1; x <= K; x++) {
            // 種類が多すぎるケース
            if (x >= bsum.size()) break;

            // 種類が少なすぎて、余り物が足りないケース
            if (K - x >= rsum.size()) continue;

            // bestからx個、remainからK-x個貪欲に選ぶ
            ans = Math.max(ans, bsum.get(x) + rsum.get(K - x) + x * x);
        }

        System.out.println(ans);
    }
}