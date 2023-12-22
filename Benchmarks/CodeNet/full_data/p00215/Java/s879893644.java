import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // 読み込んでフィールドを作る
        final Scanner sc = new Scanner(System.in);

        while (true) {
            final int x = sc.nextInt();
            final int y = sc.nextInt();

            if (x == 0 && y == 0) {
                break;
            }

            int[][] pachimon = new int[5][1000];
            int[] pachimonLength = new int[] {0, 0, 0, 0, 0};
            int s = 0;
            int g = 0;

            for (int fy = 0; fy < y; fy++) {
                final char[] in = sc.next().toCharArray();

                for (int fx = 0; fx < x; fx++) {
                    final char c = in[fx];

                    switch (c) {
                    case 'S':
                        s = pos(fx, fy);
                        break;
                    case 'G':
                        g = pos(fx, fy);
                        break;
                    case '.':
                        break;
                    default:
                        final int num = Character.getNumericValue(c) - 1;
                        pachimon[num][pachimonLength[num]] = pos(fx, fy);
                        pachimonLength[num]++;
                        break;
                    }
                }
            }

            int start = -1;
            int dist = INF;

            // 属性ごとにループ
            for (int i = 0; i < 5; i++) {
                // DPの初期化 DP[属性][同じ属性内の連番]
                int[][] dp = new int[5][1000];
                for (int h = 0; h < 5; h++) {
                    Arrays.fill(dp[h], INF);
                }

                // 最初に選んだパチモンから次に捕まえられる属性番号
                int first = (i + 1) % 5;

                for (int j = 0; j < pachimonLength[first]; j++) {
                    // s→e1を計算
                    dp[first][j] = dist(s, pachimon[first][j]);
                }

                // s->1->2->3->4->g
                // なので、ループは間の-> * 3分まわす
                for (int e = 0; e < 3; e++) {
                    // ex->e(x+1)
                    int now = (first + e) % 5;
                    int next = (now + 1) % 5;
                    for (int j = 0; j < pachimonLength[now]; j++) {
                        for (int k = 0; k < pachimonLength[next]; k++) {
                            dp[next][k] = Math.min(
                                    dp[next][k],
                                    add(dp[now][j],
                                            dist(pachimon[now][j],
                                                    pachimon[next][k])));
                        }
                    }
                }

                int last = (first + 3) % 5;
                for (int j = 0; j < pachimonLength[last]; j++) {
                    // e4->g
                    int d = add(dp[last][j], dist(pachimon[last][j], g));

                    if (d < dist) {
                        dist = d;
                        start = i;
                    }

                }

            }
            if (dist == INF) {
                System.out.println("NA");
            } else {
                System.out.println((start + 1) + " " + dist);
            }

        }
    }

    private static final int pos(final int x, final int y) {
        return (x << 11) + y;
    }

    private static final int dist(final int from, final int to) {
        return abs((from >> 11) - (to >> 11))
                + abs((from & 2047) - (to & 2047));
    }

    private static final int abs(final int a) {
        final int t = a >> 31;
        return (a ^ t) - t;// これも
    }

    private static int add(int x, int y) {
        if (x == INF || y == INF) {
            return INF;
        }
        return x + y;
    }
}