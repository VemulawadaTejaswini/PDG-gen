import java.util.*;

public class Main {
    static int INF = 200000;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        // board[i][j]: 迷路
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        // 上下左右
        // int[] dx = new int[]{1, 0, -1, 0};
        // int[] dy = new int[]{0, 1, 0, -1};
        // 下右
        int[] dx = new int[]{1, 0};
        int[] dy = new int[]{0, 1};
        
        int ans = 0;
        
        for (int i = h-1; i >= 0; i--) {
            for (int j = w-1; j >= 0; j--) {
                if (board[i][j] != 'o') continue;
                
                // visited[i][j]: 当該マスを既に通ったか否か
                boolean[][] visited = new boolean[h][w];
                
                int[][] dist = new int[h][w];
                for (int[] dista : dist) {
                    Arrays.fill(dista, INF);
                }
                dist[i][j] = 0;
                visited[i][j] = true;
                
                int[] goal = new int[]{i, j, 0};
                
                // steps = BFS((0, 0)→(h, w)までの最短経路の深さ)
                Queue<int[]> que = new ArrayDeque<int[]>();
                que.add(new int[]{i, j, 0});
                while (!que.isEmpty()) {
                    int[] cur = que.poll();
                    int x = cur[0];
                    int y = cur[1];
                    int depth = cur[2];
                    
                    // 移動可能ならそのマスに深さ+1を配ってキューに入れる
                    for (int k = 0; k < 2; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];
                        int ndepth = depth + 1;
                        
                        if (0 <= nx && nx < h && 0 <= ny && ny < w &&
                            board[nx][ny] == '.' && !visited[nx][ny]) {
                            que.add(new int[]{nx, ny, ndepth});
                            visited[nx][ny] = true;
                            
                            if (ndepth > goal[2]) {
                                goal[0] = nx;
                                goal[1] = ny;
                                goal[2] = ndepth;
                            } else if (ndepth == goal[2]) {
                                if (nx < goal[0]) {
                                    goal[0] = nx;
                                    goal[1] = ny;
                                    goal[2] = ndepth;
                                }
                            }
                        }
                    }
                }
                
                ans += goal[2];
                board[i][j] = '.';
                board[goal[0]][goal[1]] = 'o';
                // System.out.println(i + " " + j + " " + goal[2] + " " + goal[0] + " " + goal[1]);
            }
        }
        System.out.println(ans);
    }
}