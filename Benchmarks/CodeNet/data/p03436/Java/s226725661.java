import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char[][] s = IntStream.range(0, h).mapToObj(i -> scanner.next().toCharArray()).toArray(char[][]::new);
        int[][] dist = new int[h][w];
        Arrays.stream(dist).forEach(array -> Arrays.fill(array, 10000));
        dist[0][0] = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        while (!deque.isEmpty()) {
            int i = deque.poll();
            int x = i % w;
            int y = i / w;

            if (y > 0 && dist[y - 1][x] > dist[y][x] + 1 && s[y - 1][x] == '.') {
                dist[y - 1][x] = dist[y][x] + 1;
                deque.addFirst(i - w);
            }
            if (y < h - 1 && dist[y + 1][x] > dist[y][x] + 1 && s[y + 1][x] == '.') {
                dist[y + 1][x] = dist[y][x] + 1;
                deque.addFirst(i + w);
            }
            if (x > 0 && dist[y][x - 1] > dist[y][x] + 1 && s[y][x - 1] == '.') {
                dist[y][x - 1] = dist[y][x] + 1;
                deque.addFirst(i - 1);
            }
            if (x < w - 1 && dist[y][x + 1] > dist[y][x] + 1 && s[y][x + 1] == '.') {
                dist[y][x + 1] = dist[y][x] + 1;
                deque.addFirst(i + 1);
            }
        }

        if (dist[h - 1][w - 1] == 10000) {
            System.out.println(-1);
        } else {
            int ans = -dist[h - 1][w - 1] - 1;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (s[i][j] == '.') {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}