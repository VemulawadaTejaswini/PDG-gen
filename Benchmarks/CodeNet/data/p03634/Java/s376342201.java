import java.util.*;

public class Main {
    static long INF = 1001001001001001001L;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // dist[i][j] = 点i→jの直接距離
        long[][] dist = new long[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }
        for (int i = 0; i < n - 1; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            long dis = sc.nextLong();
            dist[p][q] = dis;
            dist[q][p] = dis;
        }
        
        // 「ワーシャルフロイド法」
        // 3つの頂点i, j, kを選んで、
        // i→k→jという道がi→jという道より短ければi→jの距離を更新する
        for (int k = 0; k < n; k++) {  // 経由点kは必ず一番外側のループ
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        
        // 点i, jの最短距離を
        int query = sc.nextInt();
        int k = sc.nextInt() - 1;
        while (query-- > 0) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            
            System.out.println(dist[i][k] + dist[k][j]);
        }
    }
}