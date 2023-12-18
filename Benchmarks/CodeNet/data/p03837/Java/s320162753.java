import java.util.*;
import java.io.*;
class Main {
    static HashSet<String> hs;
    static int[] shortestDist;
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
        int ans=0;
        for(int i=0; i<N; i++){
            dijkstra(hm, i, N);
            for(Edge e: hm.get(i)){
                // System.out.println(e.dest+": "+shortestDist[e.dest]+"vs"+e.weight);
                if(e.weight>shortestDist[e.dest]){
                    hs.add(Math.min(e.src, e.dest)+","+Math.max(e.src,e.dest));
                }
            }
        }
        System.out.println(hs.size());

    }
    public static class Edge{
        int src,dest,weight;
        Edge(int s, int x, int y){
            src=s;
            dest=x;
            weight=y;
        }
    }
    public static class Node{
        int u, weight;
        Node(int x, int y){
            u=x;
            weight=y;
        }
    }

    private static void dijkstra(HashMap<Integer, List<Edge>> graph, 
                                        int startVertex, int n) 
    { 
        shortestDist = new int[n];

        PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>(){
            public int compare(Node a, Node b){
                return a.weight-b.weight;
            }
        });

        for(int i=0; i<n; i++)
            shortestDist[i]=Integer.MAX_VALUE;

        shortestDist[startVertex]=0;
        HashSet<Integer> visited = new HashSet();
        

        pq.offer(new Node(startVertex, 0));
        visited.add(startVertex);

        while(!pq.isEmpty()){
            
            Node curNode = pq.poll();

            visited.add(curNode.u);

            for(Edge e: graph.get(curNode.u)){
                int neigh = e.dest;
                if(!visited.contains(neigh)){
                    int newDist = shortestDist[curNode.u]+e.weight;
                    if(newDist<shortestDist[neigh]){

                        shortestDist[neigh]=newDist;
                    }

                    pq.offer(new Node(neigh, newDist));
                }
            }


        }

    }
}
