import java.util.*;

public class Main {
    static int INF = 1001001009;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        
        int sx = sc.nextInt() - 1;
        int sy = sc.nextInt() - 1;
        int gx = sc.nextInt() - 1;
        int gy = sc.nextInt() - 1;
        
        // board[i][j]: 迷路
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        int[][] dist = new int[h][w];
        for (int[] d : dist) {
            Arrays.fill(d, INF);
        }
        
        // 上下左右
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        
        // steps = BFS((0, 0)→(h, w)までの最短経路の深さ)
        int steps = -1;
        Queue<int[]> que = new ArrayDeque<int[]>();
        que.add(new int[]{sx, sy, 0});
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int depth = cur[2];
            
            // 移動可能ならそのマスに深さ+1を配ってキューに入れる
            for (int i = 0; i < 4;i++) {
                for (int j = 1; j <= k; j++) {
                    int nx = x + dx[i] * j;
                    int ny = y + dy[i] * j;
                    int ndepth = depth + 1;
                    
                    // System.out.println(nx + " " + ny + " " + ndepth);
                    
                    if (!(0 <= nx && nx < h && 0 <= ny && ny < w)) break;
                    if (board[nx][ny] != '.') break;
                    if (dist[nx][ny] < ndepth) break;
                    que.add(new int[]{nx, ny, ndepth});
                    dist[nx][ny] = ndepth;
                    
                    if (nx == gx && ny == gy) {
                        System.out.println(ndepth);
                        return;
                    }
                }
            }
        }
        
        if (dist[gx][gy] == INF) {
            dist[gx][gy] = -1;
        }
        System.out.println(dist[gx][gy]);
    }
}