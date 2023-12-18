import java.util.*;

public class Main {
    static long INF = 100100100100100118L;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // to: 隣接リスト(有向)
        List<long[]>[] to = new List[n];
        for (int i = 0; i < n; i++) {
            to[i] = new ArrayList<long[]>();
        }
        for (int i = 0; i < n-1; i++) {
            long p = sc.nextInt() - 1;
            long q = sc.nextInt() - 1;
            long dis = sc.nextInt();
            to[(int)p].add(new long[]{q, dis});
            to[(int)q].add(new long[]{p, dis});
        }
        
        int query = sc.nextInt();
        int start = sc.nextInt() - 1;
        
        // dist: startからの最短距離
        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        
        // ダイクストラ法: BFSで距離を配る。
        // (キューの先頭の点はそう来る他最短経路がないので最短距離が確定する)
        PriorityQueue<Point> que = new PriorityQueue<>();
        que.add(new Point(start, 0));
        while (!que.isEmpty()) {
            Point cur = que.poll();
            long p = cur.name;
            long dis = cur.dist;
            
            // distより大きいdisを持つ点からは配らせない
            if (dis > dist[(int)p]) continue;
            
            // // 確定したpとdis
            // System.out.println(p + " " + dis);
            
            // 子に「自分の距離 + p→qの距離」を配る
            for (long[] qData : to[(int)p]) {
                long q = qData[0];
                long PtoQ = qData[1];
                
                // 最短距離が更新される場合だけキューに入れる
                if (dis + PtoQ < dist[(int)q]) {
                    dist[(int)q] = dis + PtoQ;
                    que.add(new Point(q, dist[(int)q]));
                }
            }
        }
        // System.out.println(dist[0]);
        
        while (query-- > 0) {
            System.out.println(dist[sc.nextInt()-1] + dist[sc.nextInt()-1]);
        }
    }
}
    
class Point implements Comparable<Point> {
    long name;
    long dist;
     
    Point(long name, long dist) {
        this.name = name;
        this.dist = dist;
    }
    
    @Override
    public int compareTo(Point o) { // longでもint
        //重みの小さい順
        if (this.dist < o.dist) {
            return -1;
        } 
        return 1;
    }
}