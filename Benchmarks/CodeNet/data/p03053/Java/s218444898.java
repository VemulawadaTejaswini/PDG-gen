import java.util.ArrayDeque;
import java.util.Scanner;

class A {
    static final int[] di = {-1, 0, 1, 0};
    static final int[] dj = {0, -1, 0, 1};

    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final char[][] map = new char[H][];
        for (int i = 0; i < H; i++)
            map[i] = sc.next().toCharArray();
        final int[][] dist = new int[H][W];
        final ArrayDeque<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < H; i++)
            for (int j = 0; j < W; j++)
                if (map[i][j] == '#')
                    que.offer(i * W + j);
                else
                    dist[i][j] = Integer.MAX_VALUE;
        while (!que.isEmpty()) {
            final int p = que.poll();
            final int i = p / W;
            final int j = p % W;
            for (int d = 0; d < 4; d++) {
                final int ni = i + di[d];
                final int nj = j + dj[d];
                if (0 <= ni && ni < H && 0 <= nj && nj < W && dist[ni][nj] == Integer.MAX_VALUE) {
                    dist[ni][nj] = dist[i][j] + 1;
                    que.offer(ni * W + nj);
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < H; i++)
            for (int j = 0; j < W; j++)
                ans = Math.max(ans, dist[i][j]);
        System.out.println(ans);
    }
}

public class Main {
    public static void main(String...args) {
        A.main();
    }
}
