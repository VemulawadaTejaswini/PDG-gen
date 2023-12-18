import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int H = sc.nextInt();
        int S = sc.nextInt();
        int D = sc.nextInt();

        int N = sc.nextInt();

        long ans = 0;
        long Q1 = 4*Q;
        long H1 = 2*H;
        long S1 = 1*S;
        // 2l price
        if (N >= 2) {
            PriorityQueue<long[]> pq = new PriorityQueue<>(4, new Comparator<long[]>() {
                public int compare(long[] a, long[] b) {
                    return Long.compare(a[0], b[0]);
                }
            });

            long Q2 = S1 * 2;
            long H2 = H1 * 2;
            long S2 = S1 * 2;
            long D2 = D;
            pq.offer(new long[]{Q2, 0});
            pq.offer(new long[]{H2, 1});
            pq.offer(new long[]{S2, 2});
            pq.offer(new long[]{D2, 3});

            long[] min1 = pq.poll();
            ans = N/2 * min1[0];
            N %= 2;
        }

        if (N == 1) {
            PriorityQueue<long[]> pq = new PriorityQueue<>(4, new Comparator<long[]>() {
                public int compare(long[] a, long[] b) {
                    return Long.compare(a[0], b[0]);
                }
            });

            pq.offer(new long[]{Q1, 0});
            pq.offer(new long[]{H1, 1});
            pq.offer(new long[]{S1, 2});
            long[] min1 = pq.poll();
            ans += min1[0];
        }

        System.out.println(ans);
        
        return;
    }

}