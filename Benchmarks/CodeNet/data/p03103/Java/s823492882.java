import java.util.*;

public class Main {


    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long N = sc.nextLong();
        final long M = sc.nextLong();

        final long[] A = new long[(int)N];
        final long[] B = new long[(int)N];

        final PriorityQueue<Map.Entry<Long, Integer>> pq = new PriorityQueue<>((e1, e2) -> {
            if (e1.getKey() < e2.getKey()) {
                return -1;
            }
            if (e1.getKey() > e2.getKey()) {
                return +1;
            }
            return 0;
        });

        for (int i = 0; i < N; ++i) {
            A[i] = sc.nextLong();
            pq.offer(new AbstractMap.SimpleEntry<>(A[i], i));
            B[i] = sc.nextLong();
        }

        long leftToBuy = M;
        long money = 0;

        while (!pq.isEmpty() && leftToBuy > 0) {
            final Map.Entry<Long, Integer> entry = pq.poll();
            final long price = entry.getKey();
            final int index = entry.getValue();
            money += (Math.min(B[index], leftToBuy)) * price;
            leftToBuy -= Math.min(B[index], leftToBuy);
        }

        System.out.println(money);
        System.out.flush();
        sc.close();
    }
}
