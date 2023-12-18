import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int[] dx = {1, 0};
    int[] dy = {0, 1};
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] arr = new char[h][w];
    int[][] dp = new int[h+1][w+1];

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) arr[i] = sc.next().toCharArray();

//        int res = Integer.MAX_VALUE;


        for (int i=0; i<w+1; i++) {
            dp[0][i] = (int)1e5;
        }

        for (int i=0; i<h+1; i++) {
            dp[i][0] = (int)1e5;
        }

        if (arr[0][0] == '#') dp[1][1] = 1;

        bfs(new Pair(0, 0));

        for (int i=0; i<=h; i++) {
            for (int j=0; j<=w-1; j++) {
//                System.out.print(dp[i][j] + " ");
            }
//            System.out.println(dp[i][w]);
        }

        System.out.println(dp[h][w]);

    }

    void bfs(Pair pair) {
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(pair);
        while (!queue.isEmpty()) {
            Pair p = queue.peek();
            for (int i=0; i<dx.length; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (h <= nx || w <= ny) continue;
                if (dp[nx+1][ny+1] != 0) continue;
                if (arr[nx][ny] == '.') {
                    dp[nx+1][ny+1] = Math.min(dp[nx][ny+1], dp[nx+1][ny]);
                } else {
                    if (1 <= nx && arr[nx-1][ny] == '.') {
                        if (1 <= ny && arr[nx][ny-1] == '.') {
                            dp[nx+1][ny+1] = Math.min(dp[nx][ny+1]+1, dp[nx+1][ny]+1);
                        } else {
                            dp[nx+1][ny+1] = Math.min(dp[nx][ny+1]+1, dp[nx+1][ny]);
                        }
                    } else {
                        if (1 <= ny && arr[nx][ny-1] == '.') {
                            dp[nx+1][ny+1] = Math.min(dp[nx][ny+1], dp[nx+1][ny]+1);
                        } else {
                            dp[nx+1][ny+1] = Math.min(dp[nx][ny+1], dp[nx+1][ny]);
                        }
                    }
                }
                queue.add(new Pair(nx, ny));
            }
            queue.poll();
        }
    }


    class Pair {
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}
