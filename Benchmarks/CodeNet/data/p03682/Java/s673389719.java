import java.util.*;

class Main{
    static PriorityQueue<Edge> pq;
    static HashSet<Edge>[] G;
    static boolean[] visited;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        G = new HashSet[N+1];
        visited = new boolean[N+1];
        for(int i=0;i<=N;i++) G[i] = new HashSet<>();
        int[][] IdXY = new int[N][3];
        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            IdXY[i] = new int[]{i,x,y};
        }
        // Prim
        pq = new PriorityQueue<>();
        myComparator1 mc1 = new myComparator1();
        Arrays.sort(IdXY,mc1);
        for(int i=0;i<N-1;i++){ // sort by x-axis
            int a = Math.min(IdXY[i][0],IdXY[i+1][0]);
            int b = Math.max(IdXY[i][0],IdXY[i+1][0]);
            G[a].add(new Edge(b,IdXY[i+1][1]-IdXY[i][1]));
            G[b].add(new Edge(a,IdXY[i+1][1]-IdXY[i][1]));

        }
        myComparator2 mc2 = new myComparator2();
        Arrays.sort(IdXY,mc2);
        for(int i=0;i<N-1;i++){ // sort by x-axis
            int a = Math.min(IdXY[i][0],IdXY[i+1][0]);
            int b = Math.max(IdXY[i][0],IdXY[i+1][0]);
            G[a].add(new Edge(b,IdXY[i+1][2]-IdXY[i][2]));
            G[b].add(new Edge(a,IdXY[i+1][2]-IdXY[i][2]));
        }
        long ans = 0;
        visit(0);
        while(pq.size()>0){
            Edge cur = pq.poll();
            if(!visited[cur.to]){
                ans += cur.length;
                visit(cur.to);
            }
        }
        System.out.println(ans);
    }
    static void visit(int i){
        visited[i]=true;
        for(Edge e:G[i]){
            if(!visited[e.to]) pq.add(e);
        }
    }
    static class Edge implements Comparable<Edge>{
        int to;
        int length;
        @Override
        public int compareTo(Edge e){
            return this.length-e.length;
        }
        Edge(int to, int cost){
            this.to=to;
            this.length=cost;
        }
    }
    static class myComparator1 implements Comparator<int[]>{
        public int compare(int[] o1, int[] o2){
            return o1[1]-o2[1];
        }
    }
    static class myComparator2 implements Comparator<int[]>{
        public int compare(int[] o1, int[] o2){
            return o1[2]-o2[2];
        }
    }
}
