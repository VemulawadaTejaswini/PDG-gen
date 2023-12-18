import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Edge>[] map = new ArrayList[n+1];
        for(int i=0;i<=n;i++) map[i] = new ArrayList<>();
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int c = sc.nextInt();
            map[p].add(new Edge(q,c));
            map[q].add(new Edge(p,c));
        }
        PriorityQueue<long[]> pq = new PriorityQueue<>(10,new myComparator());
        long[] dist = new long[n+1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[1] = 0;
        // int[] = {current_position, dist[current_position],company that comes from}
        for(Edge e:map[1]) {
            pq.offer(new long[]{e.to,1,e.com});
            dist[e.to]=1;
        }
        while(pq.size()>0){
            long[] cur = pq.poll();
            int now = (int) cur[0];
            if(dist[now]<cur[1]) continue;
            for(Edge e:map[now]){
                int dx = e.com==cur[2]?0:1;
                if(dist[e.to]>dist[now]+dx){
                    dist[e.to] = dist[now]+dx;
                    pq.offer(new long[]{e.to,dist[e.to],e.com});
                }
            }
        }
        long ans = dist[n]==Long.MAX_VALUE?-1:dist[n];
        System.out.println(ans);
    }
    static class Edge{
        int to,com;
        public Edge(int t, int c){
            this.to = t;
            this.com = c;
        }
    }
    static class myComparator implements Comparator<long[]>{
        public int compare(long[] a, long[] b){
            if(a[1]==b[1]) return 0;
            else if(a[1]>b[1])return 1;
            else return -1;
        }
    }
}
