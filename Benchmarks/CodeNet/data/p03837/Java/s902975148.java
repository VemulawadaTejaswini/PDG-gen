import java.util.*;
import java.io.*;
class Main {
    static HashSet<String> hs;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, List<Edge>> hm = new HashMap();
        hs = new HashSet();
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;
            int wt = Integer.parseInt(st.nextToken());
            List<Edge> lst = hm.getOrDefault(start, new LinkedList());
            lst.add(new Edge(start, end,wt));
            hm.put(start, lst);
            lst = hm.getOrDefault(end, new LinkedList());
            lst.add(new Edge(end, start,wt));
            hm.put(end, lst);
        }
        for(int i=0; i<N; i++){
            dijkstra(hm, i, N);
        }
        System.out.println(M-hs.size());

    }
    public static class Edge{
        int src,dest,weight;
        Edge(int s, int x, int y){
            src=s;
            dest=x;
            weight=y;
        }
    }

    private static void dijkstra(HashMap<Integer, List<Edge>> graph, 
                                        int startVertex, int n) 
    { 
        int[] shortestDist = new int[n];

        PriorityQueue<Edge> pq = new PriorityQueue<>(new Comparator<Edge>(){
            public int compare(Edge a, Edge b){
                return a.weight-b.weight;
            }
        });

        for(int i=0; i<n; i++)
            shortestDist[i]=Integer.MAX_VALUE;

        shortestDist[startVertex]=0;
        HashSet<Integer> visited = new HashSet();
        
        int curVertex = startVertex;

        for(Edge e: graph.get(curVertex)){
            pq.offer(e);
        }
        visited.add(curVertex);
        while(visited.size()!=n){
            
            Edge curEdge = pq.poll();
            if(visited.contains(curEdge.dest))
                continue;

            visited.add(curEdge.dest);
            shortestDist[curEdge.dest]=shortestDist[curVertex]+curEdge.weight;
            curVertex = curEdge.dest;
            hs.add(Math.min(curEdge.src,curEdge.dest)+","+Math.max(curEdge.src,curEdge.dest));
            for(Edge e: graph.get(curVertex)){
                pq.offer(e);
            }
        }

    }
}
