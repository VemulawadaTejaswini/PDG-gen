import java.util.*;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Pair> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(new Pair(sc.nextInt()));
        }
        Collections.sort(A,(a,b)->b.absA-a.absA);

        int negativeCnt = 0;
        boolean[] pick = new boolean[N];
        for (int i = 0; i < K; i++) {
            Pair a = A.get(i);
            if (!a.positive) negativeCnt++;
            pick[i] = true;
        }

        boolean ansNegative = false;
        if (negativeCnt%2 == 1) {
            int foundIdx = -1;
            boolean searchFlag = !A.get(K-1).positive;
            for (int i = K; i < N; i++) {
                if (A.get(i).positive == searchFlag) {
                    foundIdx = i;
                    break;
                }
            }
            if (foundIdx != -1) {
                pick[foundIdx] = true; 
                pick[K-1] = false; 
            } else {
                ansNegative = true;
                for (int i = N-1; i >= 0; i--) {
                    if (i >= N-K) {
                        pick[i] = true;
                    } else {
                        pick[i] = false;
                    }
                }
            }
        }

        long ans = 1;
        for (int i = 0; i < N; i++) {
            if (pick[i]) {
                ans *= A.get(i).absA;
                ans %= MOD;
            }
        }
        if (ansNegative) {
            ans *= -1;
            ans += MOD;
        }

        System.out.println(ans);
    }

    private static class Pair {
        private final int absA;
        private final boolean positive;
        Pair(int A){
            absA = Math.abs(A);
            positive = A >= 0;
        }
    }
}
