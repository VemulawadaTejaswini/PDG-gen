import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    char[][] field;
    boolean[][] visited;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    Queue<Integer[]> q = new ArrayDeque<>();

    void run() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        field = new char[h][w];
        visited = new boolean[h][w];
        int bCount = 0;

        for (int i = 0; i < h; i++) {
            char[] chars = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                field[i][j] = chars[j];
                if (chars[j] == '#') bCount++;
            }
        }
        q.add(new Integer[]{0, 0, 0});
        visited[0][0] = true;

        int count = 0;
        while (!q.isEmpty()) {
            Integer[] next = q.remove();
            int depth = next[2];
            if (next[0] == h - 1 && next[1] == w - 1) {
                count = depth;
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = next[0] + dx[i];
                int ny = next[1] + dy[i];
                if (0 <= nx && nx < h && 0 <= ny && ny < w && !visited[nx][ny] && field[nx][ny] != '#') {
                    visited[nx][ny] = true;
                    q.add(new Integer[]{nx, ny, depth + 1});
                }
            }
        }

        System.out.println(h * w - 1 - bCount - count);


    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
