import java.util.*;
import java.text.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] arr = new char[h][w];
    int[][] d = new int[h][w];
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1, 0, -1};

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) {
            arr[i] = sc.next().toCharArray();
        }

        int wallCnt = 0;

        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                d[i][j] = Integer.MAX_VALUE;
                if (arr[i][j] == '#') wallCnt++;
            }
        }
        d[0][0] = 0;

        dfs(new Pair(0, 0));

        System.out.println(h * w - wallCnt - d[h-1][w-1] - 1);

    }

    void dfs(Pair pair) {

        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(pair);
        while (!queue.isEmpty()) {
            Pair tmp = queue.peek();
            for (int i=0; i<4; i++) {
                int ny = tmp.y + dy[i];
                int nx = tmp.x + dx[i];
                if (ny<0 || h<=ny || nx<0 || w<=nx) continue;
                if (arr[ny][nx] == '#') continue;
                if (d[ny][nx] != Integer.MAX_VALUE) continue;
                d[ny][nx] = Math.min(d[ny][nx], d[tmp.y][tmp.x]+1);
                queue.add(new Pair(ny, nx));
            }
            queue.poll();
        }

    }

    class Pair {
        int y;
        int x;
        public Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

}