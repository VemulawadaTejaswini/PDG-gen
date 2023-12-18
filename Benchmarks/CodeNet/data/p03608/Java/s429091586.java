import java.util.*;

public class Main {

    private static final int INF = 1_000_000_000;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();

        int[] r = new int[R];
        for (int i = 0; i < R; i++) {
            r[i] = sc.nextInt()-1;
        }

        int[][] cost = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    cost[i][j] = 0;
                } else {
                    cost[i][j] = INF;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            int C = sc.nextInt();
            cost[A][B] = C;
            cost[B][A] = C;
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int c = Math.min(cost[i][j],cost[i][k]+cost[k][j]);
                    cost[i][j] = c;
                    cost[j][i] = c;
                }
            }
        }

        List<Integer> now = new ArrayList<>();
        List<Integer> remain = new ArrayList<>();
        for (int i = 0; i < r.length; i++) {
            remain.add(r[i]);
        }
        int ans = calc(now,remain,cost);

        System.out.println(ans);
    }

    private static int calc(List<Integer> now, List<Integer> remain, int[][] cost) {
        if (remain.size() == 0) {
            int tmp = 0;
            for (int i = 1; i < now.size(); i++) {
                tmp += cost[now.get(i-1)][now.get(i)];
            }
            return tmp;
        }

        int min = INF;
        for (int r : remain) {
            now.add(r);
            List<Integer> nextRemain = new ArrayList<>();
            for (int rr : remain) {
                if (rr == r) continue;
                nextRemain.add(rr);
            }
            int tmp = calc(now,nextRemain,cost);
            min = Math.min(min,tmp);
            now.remove(now.size()-1);
        }

        return min;
    }
}
