import java.util.*;

public class Main {
    static int N;
    static int K;
    static int Q;
    static int[] V;
    // static int[] k;
    // static Condition[] st;
    // static int[] p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        V = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }
        int ans = 0;
        for (int l = 0; l < N+1; l++) {
            for (int r = 0; r < N+1; r++) {
                if (l + r > Math.min(N,K)) continue;
                int cand = 0;
                PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
                for (int i = 0; i < l; i++) {
                    cand += V[i];
                    pq.add(V[i]);
                }
                for (int i = 0; i < r; i++) {
                    pq.add(V[N-1-i]);
                    cand += V[N-1-i];
                }
                int res = K - l - r;
                while(res > 0 && pq.size() > 0 && pq.peek() < 0) {
                    int v = pq.poll();
                    cand -= v;
                    res--;
                }
                ans = Math.max(ans,cand);
            }
        }
        System.out.println(ans);
    }
}