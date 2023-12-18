import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // 上下左右
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        int max = 0;
        // スタート地点の全探索(BFS)
        for (int i = 0; i < h; i++) {
            // 毎回初期化
            boolean[][] visited = new boolean[h][w];
            
            for (int j = 0; j < w; j++) {
                if (board[i][j] != '.') continue;
                
                // [x, y]型のキューを作成しスタート地点を挿入
                Queue<int[]> que = new ArrayDeque<int[]>();
                que.add(new int[]{i, j, 0});
                
                visited[i][j] = true;
                
                // スタート地点からの各点までの最短距離を計算
                int[][] dist = new int[h][w];
                while (!que.isEmpty()) {
                    int[] cur = que.poll();
                    int x = cur[0];
                    int y = cur[1];
                    
                    // 移動可能なら現在地までの距離+1を代入
                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];
                        
                        if (0 <= nx && nx < h && 0 <= ny && ny < w &&
                            board[nx][ny] == '.' && !visited[nx][ny]) {
                            que.add(new int[]{nx, ny, cur[2]+1});
                            visited[nx][ny] = true;
                            
                            dist[nx][ny] = cur[2]+1;
                        }
                    }
                }
                
                // スタート地点から最も遠い点との距離を更新する
                for (int[] di : dist) {
                    for (int d : di) {
                        max = Math.max(max, d);
                    }
                }
            }
        }
        
        System.out.println(max);
    }
}
