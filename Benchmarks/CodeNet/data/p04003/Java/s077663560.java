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
        PriorityQueue<int[]> pq = new PriorityQueue<>(10,new myComparator());
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE/2);
        dist[1] = 0;
        // int[] = {current_position, dist[current_position],company that comes from}
        for(Edge e:map[1]) {
            pq.offer(new int[]{e.to,1,e.com});
            dist[e.to]=1;
        }
        while(pq.size()>0){
            int[] cur = pq.poll();
            if(dist[cur[0]]<cur[1]) continue;
            for(Edge e:map[cur[0]]){
                int dx = e.com==cur[2]?0:1;
                if(dist[e.to]>dist[cur[0]]+dx){
                    dist[e.to] = dist[cur[0]]+dx;
                    pq.offer(new int[]{e.to,dist[e.to],e.com});
                }
            }
        }
        int ans = dist[n]==Integer.MAX_VALUE/2?-1:dist[n];
        System.out.println(ans);
    }
    static class Edge{
        int to,com;
        public Edge(int t, int c){
            this.to = t;
            this.com = c;
        }
    }
    static class myComparator implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            return a[1]-b[1];
        }
    }
}
