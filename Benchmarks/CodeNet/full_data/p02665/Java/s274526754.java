import java.util.*;

public class Main {
    private static final long INF =  1_000_000_000_000_000_000L;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N+1];
        for (int i = 0; i <= N; i++) {
            A[i] = sc.nextInt();
        }

        long[] pow = new long[Math.max(N+1,32)];
        for (int i = 0; i < N+1; i++) {
            pow[i] = INF;
        }
        pow[0] = 1;
        for (int i = 1; i <= 30; i++) {
            pow[i] = 2*pow[i-1];
        }
        // pow[30] 1_000_000_000;

        long[] PMax = new long[N+1];
        for (int i = 0; i < N+1; i++) {
            PMax[i] = INF;
        }

        PMax[0] = 1;
        for (int i = 1; i <= N; i++) {
            PMax[i] = Math.min(2*PMax[i-1]-A[i],INF);
            if (PMax[i] == INF) {
                break;
            }
            if (i < N && PMax[i] <= 0) {
                System.out.println(-1);
                return;
            }
            if (i == N && PMax[i] < 0) {
                System.out.println(-1);
                return;
            }
        }

        if (A[N] > pow[N]) {
            System.out.println(-1);
            return;
        }
        long ans = A[N];
        long pre = A[N];
        for (int i = N-1; i >= 0; i--) {
            long PMax2 = Math.min(PMax[i],pre);
            long now = PMax2+A[i];
            if (now > pow[i]) {
                System.out.println(-1);
                return;
            }
            ans += now;
            pre = now;
        }

        System.out.println(ans);
    }
}
