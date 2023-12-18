import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int[] dx = {1, 0};
    int[] dy = {0, 1};
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] arr = new char[h][w];


    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<h; i++) arr[i] = sc.next().toCharArray();

//        int res = Integer.MAX_VALUE;

//        bfs(new Pair(0, 0));

        int[][] dp = new int[h+1][w+1];

        for (int i=0; i<w+1; i++) {
            dp[0][i] = (int)1e9;
        }

        for (int i=0; i<h+1; i++) {
            dp[i][0] = (int)1e9;
        }

        if (arr[0][0] == '#') dp[1][1] = 1;

        for (int i=1; i<=h; i++) {
            for (int j=1; j<=w; j++) {
                if (i == 1 && j == 1) continue;
                if (arr[i-1][j-1] == '.') {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
                } else {
                    if (2 <= i && arr[i-2][j-1] == '.') {
                        if (2 <= j && arr[i-1][j-2] == '.') {
                            dp[i][j] = Math.min(dp[i-1][j]+1, dp[i][j-1]+1);
                        } else {
                            dp[i][j] = dp[i-1][j]+1;
                        }
                    } else {
                        if (2 <= j && arr[i-1][j-2] == '.') {
                            dp[i][j] = dp[i][j-1]+1;
                        } else {
                            dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]);
                        }
                    }
                }
            }
        }

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

            }
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
