import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N;
        int[] A;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        long ans = solve(N, A);
        System.out.println(ans);
        in.close();
    }

    static long solve(int N, int[] A) {
        long ans = 0;
        Map<Long, Long> cnt = new HashMap<>();
        //(i, j]
        long[] S = new long[N + 1];
        S[0] = 0;
        cnt.putIfAbsent(S[0], 1L);
        S[1] = A[0];
        for (int i = 1; i <= N; i++) {
            S[i] = A[i - 1] + S[i - 1];
            cnt.putIfAbsent(S[i], 0L);
            cnt.put(S[i], cnt.get(S[i]) + 1);
        }
        for (Map.Entry<Long, Long> e : cnt.entrySet()) {
            long v = e.getValue();
            ans += (v * (v - 1)) / 2L;
        }
        return ans;
    }
}
