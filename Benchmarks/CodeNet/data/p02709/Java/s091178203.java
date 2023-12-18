import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];

        ArrayList<PairInt> p = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            p.add(new PairInt(A[i], i));
        }

        Collections.sort(p, (p1, p2) -> {
            return -Long.compare(p1.x, p2.x);
        });
        int[] rank = new int[N];
        for (int i = 0; i < N; i++) {
            rank[i] = p.get(i).y;
        }

        long[][] dp = new long[N+1][N+1];
        for (int k = 1; k <= N; k++) {
            for (int x = 0; x <= k; x++) {
                int y = k - x;
                if (y > N) {
                    continue;
                }
                long px = A[rank[k-1]] * (N - y - rank[k-1]);
                long py = A[rank[k-1]] * (rank[k-1] - x + 1);
                if (x == 0) {
                    dp[x][y] = dp[x][y - 1] + px;
                } else if (y == 0) {
                    dp[x][y] = dp[x - 1][y] + py;
                } else {
                    dp[x][y] = Math.max(dp[x - 1][y] + py, dp[x][y - 1] + px);
                }
            }
        }

        long ans = 0;
        for(int x = 0 ; x <= N ; x++){
            ans = Math.max(ans, dp[x][N-x]);
        }

        System.out.println(ans);
    }
}

class PairInt {
    long x;
    int y;

    PairInt(long a, int b) {
        x = a;
        y = b;
    }
}