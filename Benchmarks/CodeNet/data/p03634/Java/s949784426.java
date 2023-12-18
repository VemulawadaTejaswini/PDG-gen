import java.util.*;

public class Main {
    static List<long[]>[] to; // 頂点iの隣接リスト
    static long[] dist;
    static int n;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        // 隣接リストの作成
        to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<long[]>();
        }
        for (int i = 0; i < n - 1; i++) {
            long p = sc.nextInt() - 1;
            long q = sc.nextInt() - 1;
            long dis = sc.nextLong();
            to[(int)p].add(new long[]{q, dis});
            to[(int)q].add(new long[]{p, dis});
        }
        
        // 点kから各点までの距離を計算
        int query = sc.nextInt();
        int k = sc.nextInt() - 1;
        long[] distK = calcDist(k);
        
        // p→k→qの最短距離を出力
        while (query-- > 0) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            
            System.out.println(distK[p] + distK[q]);
        }
    }
    
    public static long[] calcDist(int p) {
        dist = new long[n];
        dfs(p, 0, 0);
        return dist;
    }
    
    // 頂点pと隣接する点に自分の値+1を配ることで距離を与える
    public static void dfs(int p, long d, int par) {
        dist[p] = d;
        
        for (long[] q : to[p]) {
            if (q[0] == par) continue;
            
            dfs((int)q[0], d + q[1], p);
        }
    }
}