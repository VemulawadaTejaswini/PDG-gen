
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static final int[] cornersX = { -1, 0, 1, 0 };
    private static final int[] cornersY = { 0, 1, 0, -1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();

        Character[][] s = new Character[H][W];

        for (int i = 0; i < H; i++) {
            char[] line = sc.nextLine().toCharArray();
            for (int j = 0; j < line.length; j++) {
                s[i][j] = line[j];
            }
        }

        int maxDistance = 0;
        for (int i = 0; i < W; i++) {
            int startX = i;
            for (int j = 0; j < H; j++) {
                if (s[j][i] == '#') { continue; }

                int[][] distances = new int[W][H];
                Queue<Pair> queue = new ArrayDeque<>();

                int startY = j;
                update(i, j, distances, queue, 0);

                while (!queue.isEmpty()) {
                    int x = queue.peek().getFirst();
                    int y = queue.peek().getSecound();
                    queue.remove();
                    maxDistance = Math.max(maxDistance, distances[x][y]);

                    for (int k = 0; k < 4; k++) {
                        int xx = x + cornersX[k];
                        int yy = y + cornersY[k];

                        if (xx < 0 || xx >= W || yy < 0 || yy >= H) {
                            continue;
                        }
                        if (distances[xx][yy] != 0 || xx == startX && yy == startY) {
                            continue;
                        }
                        if (s[yy][xx] == '#') {
                            continue;
                        }
                        update(xx, yy, distances, queue, distances[x][y] + 1);
                    }
                }
            }
        }
        System.out.println(maxDistance);

    }

    public static void update(final int i, final int j, int[][] array, Queue<Pair> queue, final int x) {
        array[i][j] = x;
        queue.add(new Pair(i, j));
    }

    static class Pair<F, S> {
        public final F first;
        public final S secound;

        Pair(F first, S secound) {
            this.first = first;
            this.secound = secound;
        }

        public int getFirst() {
            return Integer.valueOf(String.valueOf(first));
        }

        public int getSecound() {
            return Integer.valueOf(String.valueOf(secound));
        }
    }

}