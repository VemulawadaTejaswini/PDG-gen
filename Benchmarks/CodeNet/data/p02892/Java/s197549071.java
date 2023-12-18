import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n;
        int w = n;
        
        // board[i][j]: 迷路
        char[][] board = new char[h][w];
        for (int i = 0; i < h; i++) {
            String str = sc.next();
            for (int j = 0; j < w; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        // to: 隣接リスト
        List<Integer>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '1') {
                    to[i].add(j);
                    to[j].add(i);
                }
            }
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            // visited: 当該点を既に通ったか否か
            boolean[] visited = new boolean[n];
            visited[i] = true;
            
            // max: iから最も遠い点との距離
            int max = 0;
            int[] dist = new int[n];
            // 頂点0から順に、親から子へ初期値を配り最終値を求める
            Queue<int[]> que = new ArrayDeque<int[]>();
            que.add(new int[]{i, 0});
            while (!que.isEmpty()) {
                int[] cur = que.poll();
                int p = cur[0];
                int dis = cur[1];
                
                visited[p] = true;
                for (Integer q : to[p]) {
                    if (visited[q]) continue;
                    
                    if (dist[q] != 0 && dist[q] != dis + 1) {
                        System.out.println(-1);
                        return;
                    }
                    
                    dist[q] = dis + 1;
                    que.add(new int[]{q, dist[q]});
                    max = Math.max(max, dist[q]);
                }
            }
            
            ans = Math.max(ans, max);
        }
        
        System.out.println(ans+1);
    }
}
